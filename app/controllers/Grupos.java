package controllers;

import models.Grupo;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Cristhian on 17/09/2015.
 */
public class Grupos extends Controller {
    public static Result index() {
        return ok("Grupos.index()");
    }

    public static Result create(){
        return ok("Grupos.create");
    }

    public static Result show(Long id){
        Grupo grupo=Grupo.findById(id);
        if (grupo!=null){
            return ok(grupo.toJSON());
        }else{
            return notFound();
        }
    }

    public static Result update(){
        return ok("Grupos.update");
    }

    public static Result list(){
        return ok("Grupos.list");
    }

    public static Result userListByGroupId(Long id){

        return ok("Grupos.userListByGroupId");
    }

}
