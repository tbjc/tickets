package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


import play.libs.Json;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * Project entity managed by Ebean
 */
@Entity
public class Empleado extends Model {

	@Id
	public Long id;

	public String nombre;
    
  public String nomUsuario;

  public String password;
    @ManyToOne
    public Departamento departamento;

    public Long getId(){
      return this.id;
    }

    public String getNombre(){
      return this.nombre;
    }

    public String getNomUsuario(){
      return this.nomUsuario;
    }

    public String getPassword(){
      return this.password;
    }

  //FINDER FOR MODEL EBEAN
  public static Finder<Long, Empleado> find = new Finder<Long, Empleado>(Long.class, Empleado.class);

  public static JsonNode list(){
    List<Empleado> empleados = Empleado.find.all();
    play.Logger.info("Departamentos List: "+empleados);
    play.Logger.info("Departamentos Json: "+Json.toJson(empleados));
    return Json.toJson(empleados);
  }

  public static Empleado authenticate(String nameUser, String password) {
      Empleado user = Empleado.find.where().eq("nomUsuario", nameUser).eq("password",password).findUnique();
      if ((user != null)) {
        return user;
      } else {
        return null;
      }
    }
}