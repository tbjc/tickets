
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Wezkell Digital/Desktop/proyecto/conf/routes
// @DATE:Wed Sep 09 12:23:03 CDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.inicio()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """entrar""", """controllers.Application.entrar()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/index""", """controllers.Distritos.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/list""", """controllers.Distritos.list()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/show/$id<[^/]+>""", """controllers.Distritos.show(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """empleado/index""", """controllers.Empleados.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """empleado/list""", """controllers.Empleados.list()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """empleado/show/$id<[^/]+>""", """controllers.Empleados.show(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """departamento/index""", """controllers.Departamentos.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """departamento/list""", """controllers.Departamentos.list()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """departamento/show/$id<[^/]+>""", """controllers.Departamentos.show(id:Long)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito""", """controllers.Distritos.create()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """empleado""", """controllers.Empleados.create()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """departamento""", """controllers.Departamentos.create()"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/$id<[^/]+>""", """controllers.Distritos.update(id:Long)"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """empleado/$id<[^/]+>""", """controllers.Empleados.update(id:Long)"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """departamento/$id<[^/]+>""", """controllers.Departamentos.update(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/$id<[^/]+>""", """controllers.Distritos.delete(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """empleado/$id<[^/]+>""", """controllers.Empleados.delete(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """departamento/$id<[^/]+>""", """controllers.Departamentos.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_inicio0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_inicio0_invoker = createInvoker(
    controllers.Application.inicio(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "inicio",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_index1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_entrar3_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrar")))
  )
  private[this] lazy val controllers_Application_entrar3_invoker = createInvoker(
    controllers.Application.entrar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "entrar",
      Nil,
      "POST",
      """""",
      this.prefix + """entrar"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Distritos_index4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/index")))
  )
  private[this] lazy val controllers_Distritos_index4_invoker = createInvoker(
    controllers.Distritos.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """distrito/index"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Distritos_list5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/list")))
  )
  private[this] lazy val controllers_Distritos_list5_invoker = createInvoker(
    controllers.Distritos.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """distrito/list"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Distritos_show6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Distritos_show6_invoker = createInvoker(
    controllers.Distritos.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """distrito/show/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Empleados_index7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empleado/index")))
  )
  private[this] lazy val controllers_Empleados_index7_invoker = createInvoker(
    controllers.Empleados.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Empleados",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """empleado/index"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Empleados_list8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empleado/list")))
  )
  private[this] lazy val controllers_Empleados_list8_invoker = createInvoker(
    controllers.Empleados.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Empleados",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """empleado/list"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Empleados_show9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empleado/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Empleados_show9_invoker = createInvoker(
    controllers.Empleados.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Empleados",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """empleado/show/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Departamentos_index10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departamento/index")))
  )
  private[this] lazy val controllers_Departamentos_index10_invoker = createInvoker(
    controllers.Departamentos.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Departamentos",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """departamento/index"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Departamentos_list11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departamento/list")))
  )
  private[this] lazy val controllers_Departamentos_list11_invoker = createInvoker(
    controllers.Departamentos.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Departamentos",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """departamento/list"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Departamentos_show12_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departamento/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Departamentos_show12_invoker = createInvoker(
    controllers.Departamentos.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Departamentos",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """departamento/show/$id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Distritos_create13_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito")))
  )
  private[this] lazy val controllers_Distritos_create13_invoker = createInvoker(
    controllers.Distritos.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """distrito"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Empleados_create14_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empleado")))
  )
  private[this] lazy val controllers_Empleados_create14_invoker = createInvoker(
    controllers.Empleados.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Empleados",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """empleado"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Departamentos_create15_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departamento")))
  )
  private[this] lazy val controllers_Departamentos_create15_invoker = createInvoker(
    controllers.Departamentos.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Departamentos",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """departamento"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Distritos_update16_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Distritos_update16_invoker = createInvoker(
    controllers.Distritos.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """distrito/$id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Empleados_update17_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empleado/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Empleados_update17_invoker = createInvoker(
    controllers.Empleados.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Empleados",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """empleado/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Departamentos_update18_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departamento/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Departamentos_update18_invoker = createInvoker(
    controllers.Departamentos.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Departamentos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """departamento/$id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Distritos_delete19_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Distritos_delete19_invoker = createInvoker(
    controllers.Distritos.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """distrito/$id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Empleados_delete20_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empleado/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Empleados_delete20_invoker = createInvoker(
    controllers.Empleados.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Empleados",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """empleado/$id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Departamentos_delete21_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departamento/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Departamentos_delete21_invoker = createInvoker(
    controllers.Departamentos.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Departamentos",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """departamento/$id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_inicio0_route(params) =>
      call { 
        controllers_Application_inicio0_invoker.call(controllers.Application.inicio())
      }
  
    // @LINE:8
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(controllers.Application.index())
      }
  
    // @LINE:11
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_Application_entrar3_route(params) =>
      call { 
        controllers_Application_entrar3_invoker.call(controllers.Application.entrar())
      }
  
    // @LINE:13
    case controllers_Distritos_index4_route(params) =>
      call { 
        controllers_Distritos_index4_invoker.call(controllers.Distritos.index())
      }
  
    // @LINE:14
    case controllers_Distritos_list5_route(params) =>
      call { 
        controllers_Distritos_list5_invoker.call(controllers.Distritos.list())
      }
  
    // @LINE:15
    case controllers_Distritos_show6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Distritos_show6_invoker.call(controllers.Distritos.show(id))
      }
  
    // @LINE:16
    case controllers_Empleados_index7_route(params) =>
      call { 
        controllers_Empleados_index7_invoker.call(controllers.Empleados.index())
      }
  
    // @LINE:17
    case controllers_Empleados_list8_route(params) =>
      call { 
        controllers_Empleados_list8_invoker.call(controllers.Empleados.list())
      }
  
    // @LINE:18
    case controllers_Empleados_show9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Empleados_show9_invoker.call(controllers.Empleados.show(id))
      }
  
    // @LINE:19
    case controllers_Departamentos_index10_route(params) =>
      call { 
        controllers_Departamentos_index10_invoker.call(controllers.Departamentos.index())
      }
  
    // @LINE:20
    case controllers_Departamentos_list11_route(params) =>
      call { 
        controllers_Departamentos_list11_invoker.call(controllers.Departamentos.list())
      }
  
    // @LINE:21
    case controllers_Departamentos_show12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Departamentos_show12_invoker.call(controllers.Departamentos.show(id))
      }
  
    // @LINE:22
    case controllers_Distritos_create13_route(params) =>
      call { 
        controllers_Distritos_create13_invoker.call(controllers.Distritos.create())
      }
  
    // @LINE:23
    case controllers_Empleados_create14_route(params) =>
      call { 
        controllers_Empleados_create14_invoker.call(controllers.Empleados.create())
      }
  
    // @LINE:24
    case controllers_Departamentos_create15_route(params) =>
      call { 
        controllers_Departamentos_create15_invoker.call(controllers.Departamentos.create())
      }
  
    // @LINE:25
    case controllers_Distritos_update16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Distritos_update16_invoker.call(controllers.Distritos.update(id))
      }
  
    // @LINE:26
    case controllers_Empleados_update17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Empleados_update17_invoker.call(controllers.Empleados.update(id))
      }
  
    // @LINE:27
    case controllers_Departamentos_update18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Departamentos_update18_invoker.call(controllers.Departamentos.update(id))
      }
  
    // @LINE:28
    case controllers_Distritos_delete19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Distritos_delete19_invoker.call(controllers.Distritos.delete(id))
      }
  
    // @LINE:29
    case controllers_Empleados_delete20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Empleados_delete20_invoker.call(controllers.Empleados.delete(id))
      }
  
    // @LINE:30
    case controllers_Departamentos_delete21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Departamentos_delete21_invoker.call(controllers.Departamentos.delete(id))
      }
  }
}