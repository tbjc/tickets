package controllers;

import models.Rol;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Cristhian on 17/09/2015.
 */
public class Roles extends Controller{
    public static Result index() {
        return ok("Roles.index()");
    }

    public static Result create(){
        return ok("Roles.create");
    }

    public static Result show(Long id){
        Rol rol= Rol.findRolByID(id);
        if (rol!=null){
            return ok(rol.toJSON());
        }else{
            return notFound();
        }
    }

    public static Result update(Long id){
        return ok("Roles.update");
    }

    public static Result delete(Long id){
        return ok("Roles.delete");
    }

    public static Result list(){
        return ok(Rol.getAllGroups_JSON());
    }
}
