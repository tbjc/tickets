package controllers;

import models.Grupo;
import models.Usuario;
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

    public static Result update(Long id){
        return ok("Grupos.update");
    }

    public static Result delete(Long id){
        return ok("Grupos.delete");
    }

    public static Result list(){
        return ok(Grupo.getAllGroups_JSON());
    }

    public static Result userListByGroupId(Long id){
        Grupo grupo=Grupo.findById(id);
        return ok(Usuario.findUsersByGroup_JSON(grupo));
    }

}
