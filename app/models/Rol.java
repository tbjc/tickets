package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Cristhian on 14/09/2015.
 */
@Entity

public class Rol extends Model {
    @Id
    public Long id;

    @Column(unique = true)
    private String nombre;

    private String descripcion;

    //region gets y sets
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //endregion

    public static final Finder<Long, Rol> find = new Finder<Long, Rol>(Long.class, Rol.class);

    public static void setDefaultRol() {
        HashMap<String, String> roles = new HashMap<String, String>();
        roles.put("Administrador", "Usuario con privilegios para modificar catalogos");
        roles.put("Soporte", "Persona encargada de atender problemas de los usuarios finales");
        roles.put("Usuario final", "Usuario que puede realizar solicitudes de apoyo");

        for (Map.Entry<String, String> entry : roles.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (findRolByName(key) == null) {
                Rol r = new Rol();
                r.setNombre(key);
                r.setDescripcion(value);
                r.save();
            }
        }
    }

    public static Rol findRolByName(String nombreRol) {
        return find.where().eq("nombre", nombreRol).findUnique();
    }

    public static Rol findRolByID(Long id){
        return find.byId(id);
    }

    public static ArrayList<Rol> getAllGroups() {
        ArrayList<Rol> roles = new ArrayList<Rol>();

        List<Rol> us = find.all();
        if (us != null && us.size() > 0) {
            roles = new ArrayList<Rol>(us);
            return roles;
        } else {
            return roles;
        }
    }

    public static JsonNode getAllGroups_JSON(){
        return Json.toJson(getAllGroups());
    }

    public JsonNode toJSON(){
        return Json.toJson(this);
    }

    public ArrayList<Usuario> findUsers(){
        return Usuario.findUsersByRol(this);
    }

    public JsonNode findUsers_JSON(){
        return Usuario.findUsersByRol_JSON(this);
    }



}
