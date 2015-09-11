package controllers;

import models.Usuario;
import play.api.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.login;

import static play.data.Form.form;


public class Application extends Controller {

    // -- Authentication
    public static class Login {
        public String nombreUsuario;
        public String password;
        //public String codigoSeguridad;

        public String validate() {
            /*if (Usuario.authenticate(nombreUsuario, password, codigoSeguridad) == null) {
                return "Usuario o contraseña inválida";
            }*/
            if (Usuario.authenticate(nombreUsuario, password) == null) {
                return "Usuario o contraseña inválida";
            }
            return null;
        }
    }

    public static Result authenticate() {
        //return redirect("/main") ;
        play.Logger.debug("Entro a Authenticate....");
        play.data.Form<Login> loginForm;
        loginForm = form(Login.class).bindFromRequest();
        play.Logger.debug("loginForm= " + loginForm);
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session("nameUser", loginForm.get().nombreUsuario);
            //return redirect(routes.Usuarios.inicio());
            return redirect("/main");
            //return redirect();
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
