package controllers;

import models.Grupo;
import models.Rol;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import static play.data.Form.form;


/**
 * Created by Cristhian on 17/09/2015.
 */
public class Usuarios extends Controller {
    public static Result index() {
        Usuario.crearAdmin();
        return ok("Usuarios.index()");
    }

    public static Result create() {
        return ok("Usuarios.create");
    }

    public static Result show(Long id) {
        Usuario usuario= Usuario.findById(id);
        if (usuario!=null){
            return ok(usuario.toJSON());
        }else{
            return notFound("Usuario no encontrado");
        }
    }

    public static Result update(Long id) {
        return ok("Usuarios.update");
    }

    public static Result delete(Long id){
        return ok("Usuarios.delete");
    }

    public static Result listByGroupID(Long id) {
        Grupo grupo = Grupo.findById(id);
        return ok(Usuario.findUsersByGroup_JSON(grupo));
    }

    public static Result listByRolName(String rolName) {
        Rol rol= Rol.findRolByName(rolName);
        return ok(Usuario.findUsersByRol_JSON(rol));
    }
}
