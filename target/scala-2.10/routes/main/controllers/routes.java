
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/play_framework/tickets/conf/routes
// @DATE:Thu Sep 10 11:00:45 CDT 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmpleados Empleados = new controllers.ReverseEmpleados(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDepartamentos Departamentos = new controllers.ReverseDepartamentos(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDistritos Distritos = new controllers.ReverseDistritos(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmpleados Empleados = new controllers.javascript.ReverseEmpleados(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDepartamentos Departamentos = new controllers.javascript.ReverseDepartamentos(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDistritos Distritos = new controllers.javascript.ReverseDistritos(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
