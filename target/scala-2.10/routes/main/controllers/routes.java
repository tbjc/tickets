
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/Play_Framework/Proyectos/tickets/conf/routes
// @DATE:Thu Sep 17 11:46:59 CDT 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGrupos Grupos = new controllers.ReverseGrupos(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsuarios Usuarios = new controllers.ReverseUsuarios(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRoles Roles = new controllers.ReverseRoles(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGrupos Grupos = new controllers.javascript.ReverseGrupos(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsuarios Usuarios = new controllers.javascript.ReverseUsuarios(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRoles Roles = new controllers.javascript.ReverseRoles(RoutesPrefix.byNamePrefix());
  }

}
