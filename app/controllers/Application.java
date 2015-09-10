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

import play.mvc.Http.RequestBody;//cambio realizado

public class Application extends Controller {

    public static class Login {
      public String nombreUsuario;
      public String var;
      public String password;
        public String validate() {
            if (Empleado.authenticate(nombreUsuario, password) == null) {
              return "Usuario o contraseÃ±a invÃ¡lida";
            }
            return null;
        }
    }

    public static Result index() {
        return ok(views.html.mainLayout.render());
    }

    public static Result inicio() {
        return ok(views.html.loginLayout.render(views.html.login.render(form(Login.class))));
        //cambio...
    }

    public static Result entrar() {
        play.Logger.debug("Entro a Authenticate....");
        Form<Application.Login> loginForm = form(Application.Login.class).bindFromRequest();
        play.Logger.debug("loginForm= "+loginForm);
        if (loginForm.hasErrors()) {
          return badRequest(loginLayout.render(login.render(loginForm)));
        } else {
         session("nameUser", loginForm.get().nombreUsuario);
          return redirect(routes.Application.index());
        }
    }

}

