package controllers;

import models.Rol;
import models.Usuario;
import play.api.data.Form;
//import play.api.libs.json.Json;
import play.api.libs.json.Writes;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import scala.util.parsing.json.JSON;
import views.html.login;

import java.util.ArrayList;

import static play.data.Form.form;


public class Application extends Controller {

    // -- Authentication
    public static class Login {
        public String nombreUsuario;
        public String password;

        public String validate() {
            if (Usuario.authenticate(nombreUsuario, password) == null) {
                return "Usuario o contraseña inválida";
            }
            return null;
        }
    }

    public static Result authenticate() {
        play.Logger.debug("Entro a Authenticate....");
        play.data.Form<Login> loginForm;
        loginForm = form(Login.class).bindFromRequest();
        play.Logger.debug("loginForm= " + loginForm);
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session("nameUser", loginForm.get().nombreUsuario);
            return redirect("/main");
        }
    }

    public static Result index() {
        Usuario.crearAdmin();

        return ok(views.html.login.render(form(Login.class)));
    }

    public static Result main() {
        return ok(views.html.mainLayout.render("Página principal", Html.apply("<h1>Contenido</h1>")));
    }

    public static Result main(String nom) {
        return ok(views.html.mainLayout.render("Página principal", Html.apply("<h1>Contenido</h1>")));
    }

    public static Result login() {
        return ok(login.render(form(Login.class)));
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "Sesión cerrada satisfactoriamente");
        return redirect(routes.Application.login());
    }

}
