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
public class Departamento extends Model {

	@Id
	public Long id;

	public String nombre;
    
    @OneToMany(cascade=CascadeType.ALL)
    List<Empleado> empleado;
    

  //FINDER FOR MODEL EBEAN
  public static Finder<Long, Departamento> find = new Finder<Long, Departamento>(Long.class, Departamento.class);

  public static JsonNode list(){
    List<Departamento> departamentos = Departamento.find.all();
    play.Logger.info("Departamentos List: "+departamentos);
    play.Logger.info("Departamentos Json: "+Json.toJson(departamentos));
    return Json.toJson(departamentos);
  }
}
