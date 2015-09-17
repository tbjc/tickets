package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import org.mindrot.jbcrypt.BCrypt;
import play.libs.Json;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import play.api.Logger;
/**
 * Project entity managed by Ebean
 */
@Entity
public class Usuario extends Model {
    @Id
    public Long id;

    @Column(unique = true)
    private String userName;
    @JsonIgnore
    private String password;
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private String email;

    @ManyToOne
    private Rol rol;

    @ManyToOne
    private Grupo grupo;

    //region gets y sets
    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //this.password = password;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    //endregion

    public static final Finder<Long, Usuario> find = new Finder<Long, Usuario>(Long.class, Usuario.class);


    public static Usuario authenticate(String nameUser, String password) {
        Usuario user = Usuario.find.where().eq("userName", nameUser).findUnique();
        System.out.println("[INFO] Usuario.Authenticate nameUser= "+nameUser+" - password= "+password);
        if (user != null) {
            if (BCrypt.checkpw(password, user.getPassword())) {
                return user;
            }
        }else{
            System.out.println("[INFO] Usuario.Authenticate - user == null");
        }
        return null;
    }

    public static void crearAdmin() {
        Rol.setDefaultRol();
        Grupo.setDefaultGroup();
        if (findByUserName("admin") == null) {
            Usuario u = new Usuario();
            u.setNombre("Nombre_admin");
            u.setUserName("admin");
            u.setPassword("admin");
            u.setRol(Rol.findRolByName("Administrador"));
            u.setGrupo(Grupo.findGroupByName("Default"));
            u.save();
        }else{
            System.out.println("[INFO] Admin not null");
        }
    }

    public static Usuario findByName(String nombre) {
        return find.where().eq("nombre", nombre).findUnique();
    }

    public static Usuario findByUserName(String userNombre) {
        return find.where().eq("userName", userNombre).findUnique();
    }

    //no probado
    public static ArrayList<Usuario> findByApPaterno(String apPaterno) {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        List<Usuario> us = find.where().eq("a_paterno", apPaterno).findList();

        if (us != null && us.size() > 0) {
            users = new ArrayList<Usuario>(us);
            return users;
        } else {
            return users;
        }
    }

    //no probado
    public static ArrayList<Usuario> findByApMaterno(String apMaterno) {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        List<Usuario> us = find.where().eq("a_materno", apMaterno).findList();

        if (us != null && us.size() > 0) {
            users = new ArrayList<Usuario>(us);
            return users;
        } else {
            return users;
        }
    }

    public static Usuario findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }

    public JsonNode toJSON() {
        return Json.toJson(this);
    }

    public static ArrayList<Usuario> findUsersByRol(Rol rol) {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        if ( rol!=null){
            List<Usuario> us = find.where().eq("rol_id", rol.getId()).findList();

            if (us != null && us.size() > 0) {
                users = new ArrayList<Usuario>(us);
                return users;
            } else {
                return users;
            }
        }else{
            return users;
        }
    }

    public static ArrayList<Usuario> findUsersByGroup(Grupo grupo) {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        if ( grupo!=null){
            List<Usuario> us = find.where().eq("grupo_id", grupo.getId()).findList();

            if (us != null && us.size() > 0) {
                users = new ArrayList<Usuario>(us);
                return users;
            } else {
                return users;
            }
        }else{
            return users;
        }
    }

    public static JsonNode findUsersByRol_JSON(Rol rol) {
        return Json.toJson(findUsersByRol(rol));
    }

    public static JsonNode findUsersByGroup_JSON(Grupo grupo) {
        return Json.toJson(findUsersByGroup(grupo));
    }


}
