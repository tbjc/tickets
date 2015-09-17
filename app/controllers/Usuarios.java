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
        return ok(Usuario.findById(id).toJSON());
    }

    public static Result update() {
        return ok("Usuarios.update");
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
