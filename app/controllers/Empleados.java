package controllers;

import models.*;
import play.*;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.JsonNode;
import views.html.*;
import play.data.*;
import static play.data.Form.*;
import play.mvc.BodyParser;
import java.util.*;
import play.db.*;
import com.avaje.ebean.*;

import play.mvc.Http.RequestBody;

public class Empleados extends Controller {

    public static Result index()
    {
    	return ok(views.html.empleados.index.render());
    }

    public static Result list()
    {
	    return ok(Empleado.list() );
    }

    public static Result show(Long id)
    {
    	Empleado empleado = Empleado.find.byId(id);
	    return empleado == null ? notFound() : ok(Json.toJson(empleado));
    }

	public static Result create()
	{
	    play.Logger.debug("REQUEST: "+request().body());
		Empleado empleado = Json.fromJson(request().body().asJson(), Empleado.class);
        empleado.save();
        return ok(Json.toJson(empleado));
	}

	public static Result update(Long id)
	{
		play.Logger.info("REQUEST: "+request().body().asJson());
		Empleado empleado = Json.fromJson(request().body().asJson(), Empleado.class);
		empleado.id = id;
	    empleado.update();
	    return ok(Json.toJson(empleado));
	}

	public static Result delete(Long id)
	{
		Empleado toDelete = Empleado.find.byId(id);
	    toDelete.delete();
	    return noContent();
	}

	
}