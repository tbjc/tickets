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

public class Departamentos extends Controller {

    public static Result index()
    {
    	return ok(views.html.departamento.index.render());
    }

    public static Result list()
    {
	    return ok(Departamento.list() );
    }

    public static Result show(Long id)
    {
    	Departamento departamento = Departamento.find.byId(id);
	    return departamento == null ? notFound() : ok(Json.toJson(departamento));
    }

	public static Result create()
	{
	    play.Logger.debug("REQUEST: "+request().body());
		Departamento departamento = Json.fromJson(request().body().asJson(), Departamento.class);
        departamento.save();
        return ok(Json.toJson(departamento));
	}

	public static Result update(Long id)
	{
		play.Logger.info("REQUEST: "+request().body().asJson());
		Departamento departamento = Json.fromJson(request().body().asJson(), Departamento.class);
		departamento.id = id;
	    departamento.update();
	    return ok(Json.toJson(departamento));
	}

	public static Result delete(Long id)
	{
		Departamento toDelete = Departamento.find.byId(id);
	    toDelete.delete();
	    return noContent();
	}
}