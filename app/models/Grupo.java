package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Cristhian on 17/09/2015.
 */
@Entity
public class Grupo extends Model{
    @Id
    private Long id;

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //endregion

    public static final Finder<Long, Grupo> find = new Finder<Long, Grupo>(Long.class, Grupo.class);

    public static void setDefaultGroup() {
        HashMap<String, String> grupos = new HashMap<String, String>();
        grupos.put("Default", "Grupo por defecto");

        for (Map.Entry<String, String> entry : grupos.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (findGroupByName(key) == null) {
                Grupo g=new Grupo();
                g.setNombre(key);
                g.setDescripcion(value);
                g.save();
            }
        }
    }

    public static Grupo findById(Long id){
        return find.byId(id);
    }

    public static Grupo findGroupByName(String nombreGrupo) {
        return find.where().eq("nombre", nombreGrupo).findUnique();
    }

    public static ArrayList<Grupo> getAllGroups() {
        ArrayList<Grupo> grupos = new ArrayList<Grupo>();

            List<Grupo> us = find.all();
            if (us != null && us.size() > 0) {
                grupos = new ArrayList<Grupo>(us);
                return grupos;
            } else {
                return grupos;
            }
    }

    public JsonNode toJSON() {
        return Json.toJson(this);
    }
}

