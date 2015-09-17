
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/Play_Framework/Proyectos/tickets/conf/routes
// @DATE:Thu Sep 17 11:46:59 CDT 2015

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
    ("""GET""", prefix, """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """main""", """controllers.Application.main()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autenticate""", """controllers.Application.authenticate()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.Usuarios.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/index""", """controllers.Usuarios.index()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/create""", """controllers.Usuarios.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/show/$id<[^/]+>""", """controllers.Usuarios.show(id:Long)"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/update/$id<[^/]+>""", """controllers.Usuarios.update(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/delete/$id<[^/]+>""", """controllers.Usuarios.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/listByGroupID/$id<[^/]+>""", """controllers.Usuarios.listByGroupID(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/listByRolName/$name<[^/]+>""", """controllers.Usuarios.listByRolName(name:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo""", """controllers.Grupos.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/index""", """controllers.Grupos.index()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/create""", """controllers.Grupos.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/show/$id<[^/]+>""", """controllers.Grupos.show(id:Long)"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/update/$id<[^/]+>""", """controllers.Grupos.update(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/delete""", """controllers.Grupos.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/list""", """controllers.Grupos.list()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grupo/userListByGroupId/$id<[^/]+>""", """controllers.Grupos.userListByGroupId(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rol""", """controllers.Roles.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rol/index""", """controllers.Roles.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rol/show/$id<[^/]+>""", """controllers.Roles.show(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rol/list""", """controllers.Roles.list()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_main1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_Application_main1_invoker = createInvoker(
    controllers.Application.main(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "main",
      Nil,
      "GET",
      """""",
      this.prefix + """main"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_authenticate2_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autenticate")))
  )
  private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
    controllers.Application.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """autenticate"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_login3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login3_invoker = createInvoker(
    controllers.Application.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_Usuarios_index5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_Usuarios_index5_invoker = createInvoker(
    controllers.Usuarios.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "index",
      Nil,
      "GET",
      """rutas 'Usuarios'""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Usuarios_index6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/index")))
  )
  private[this] lazy val controllers_Usuarios_index6_invoker = createInvoker(
    controllers.Usuarios.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/index"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Usuarios_create7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/create")))
  )
  private[this] lazy val controllers_Usuarios_create7_invoker = createInvoker(
    controllers.Usuarios.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """usuario/create"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Usuarios_show8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_show8_invoker = createInvoker(
    controllers.Usuarios.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuario/show/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Usuarios_update9_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_update9_invoker = createInvoker(
    controllers.Usuarios.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """usuario/update/$id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Usuarios_delete10_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_delete10_invoker = createInvoker(
    controllers.Usuarios.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """usuario/delete/$id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Usuarios_listByGroupID11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/listByGroupID/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_listByGroupID11_invoker = createInvoker(
    controllers.Usuarios.listByGroupID(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "listByGroupID",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuario/listByGroupID/$id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Usuarios_listByRolName12_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/listByRolName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Usuarios_listByRolName12_invoker = createInvoker(
    controllers.Usuarios.listByRolName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "listByRolName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """usuario/listByRolName/$name<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Grupos_index13_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo")))
  )
  private[this] lazy val controllers_Grupos_index13_invoker = createInvoker(
    controllers.Grupos.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "index",
      Nil,
      "GET",
      """rutas 'grupos'""",
      this.prefix + """grupo"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Grupos_index14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/index")))
  )
  private[this] lazy val controllers_Grupos_index14_invoker = createInvoker(
    controllers.Grupos.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """grupo/index"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Grupos_create15_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/create")))
  )
  private[this] lazy val controllers_Grupos_create15_invoker = createInvoker(
    controllers.Grupos.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """grupo/create"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Grupos_show16_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Grupos_show16_invoker = createInvoker(
    controllers.Grupos.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """grupo/show/$id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Grupos_update17_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Grupos_update17_invoker = createInvoker(
    controllers.Grupos.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """grupo/update/$id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Grupos_delete18_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/delete")))
  )
  private[this] lazy val controllers_Grupos_delete18_invoker = createInvoker(
    controllers.Grupos.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """grupo/delete"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Grupos_list19_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/list")))
  )
  private[this] lazy val controllers_Grupos_list19_invoker = createInvoker(
    controllers.Grupos.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """grupo/list"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Grupos_userListByGroupId20_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grupo/userListByGroupId/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Grupos_userListByGroupId20_invoker = createInvoker(
    controllers.Grupos.userListByGroupId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Grupos",
      "userListByGroupId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """grupo/userListByGroupId/$id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Roles_index21_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rol")))
  )
  private[this] lazy val controllers_Roles_index21_invoker = createInvoker(
    controllers.Roles.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Roles",
      "index",
      Nil,
      "GET",
      """rutas 'roles'""",
      this.prefix + """rol"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Roles_index22_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rol/index")))
  )
  private[this] lazy val controllers_Roles_index22_invoker = createInvoker(
    controllers.Roles.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Roles",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """rol/index"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Roles_show23_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rol/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Roles_show23_invoker = createInvoker(
    controllers.Roles.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Roles",
      "show",
      Seq(classOf[Long]),
      "GET",
      """POST    /rol/create                         controllers.Roles.create()""",
      this.prefix + """rol/show/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Roles_list24_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rol/list")))
  )
  private[this] lazy val controllers_Roles_list24_invoker = createInvoker(
    controllers.Roles.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Roles",
      "list",
      Nil,
      "GET",
      """PUT     /rol/update/:id                     controllers.Roles.update(id: Long)
DELETE  /rol/delete                         controllers.Roles.delete(id: Long)""",
      this.prefix + """rol/list"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
      }
  
    // @LINE:7
    case controllers_Application_main1_route(params) =>
      call { 
        controllers_Application_main1_invoker.call(controllers.Application.main())
      }
  
    // @LINE:8
    case controllers_Application_authenticate2_route(params) =>
      call { 
        controllers_Application_authenticate2_invoker.call(controllers.Application.authenticate())
      }
  
    // @LINE:9
    case controllers_Application_login3_route(params) =>
      call { 
        controllers_Application_login3_invoker.call(controllers.Application.login())
      }
  
    // @LINE:12
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_Usuarios_index5_route(params) =>
      call { 
        controllers_Usuarios_index5_invoker.call(controllers.Usuarios.index())
      }
  
    // @LINE:16
    case controllers_Usuarios_index6_route(params) =>
      call { 
        controllers_Usuarios_index6_invoker.call(controllers.Usuarios.index())
      }
  
    // @LINE:17
    case controllers_Usuarios_create7_route(params) =>
      call { 
        controllers_Usuarios_create7_invoker.call(controllers.Usuarios.create())
      }
  
    // @LINE:18
    case controllers_Usuarios_show8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_show8_invoker.call(controllers.Usuarios.show(id))
      }
  
    // @LINE:19
    case controllers_Usuarios_update9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_update9_invoker.call(controllers.Usuarios.update(id))
      }
  
    // @LINE:20
    case controllers_Usuarios_delete10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_delete10_invoker.call(controllers.Usuarios.delete(id))
      }
  
    // @LINE:21
    case controllers_Usuarios_listByGroupID11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Usuarios_listByGroupID11_invoker.call(controllers.Usuarios.listByGroupID(id))
      }
  
    // @LINE:22
    case controllers_Usuarios_listByRolName12_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Usuarios_listByRolName12_invoker.call(controllers.Usuarios.listByRolName(name))
      }
  
    // @LINE:25
    case controllers_Grupos_index13_route(params) =>
      call { 
        controllers_Grupos_index13_invoker.call(controllers.Grupos.index())
      }
  
    // @LINE:26
    case controllers_Grupos_index14_route(params) =>
      call { 
        controllers_Grupos_index14_invoker.call(controllers.Grupos.index())
      }
  
    // @LINE:27
    case controllers_Grupos_create15_route(params) =>
      call { 
        controllers_Grupos_create15_invoker.call(controllers.Grupos.create())
      }
  
    // @LINE:28
    case controllers_Grupos_show16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Grupos_show16_invoker.call(controllers.Grupos.show(id))
      }
  
    // @LINE:29
    case controllers_Grupos_update17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Grupos_update17_invoker.call(controllers.Grupos.update(id))
      }
  
    // @LINE:30
    case controllers_Grupos_delete18_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Grupos_delete18_invoker.call(controllers.Grupos.delete(id))
      }
  
    // @LINE:31
    case controllers_Grupos_list19_route(params) =>
      call { 
        controllers_Grupos_list19_invoker.call(controllers.Grupos.list())
      }
  
    // @LINE:32
    case controllers_Grupos_userListByGroupId20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Grupos_userListByGroupId20_invoker.call(controllers.Grupos.userListByGroupId(id))
      }
  
    // @LINE:35
    case controllers_Roles_index21_route(params) =>
      call { 
        controllers_Roles_index21_invoker.call(controllers.Roles.index())
      }
  
    // @LINE:36
    case controllers_Roles_index22_route(params) =>
      call { 
        controllers_Roles_index22_invoker.call(controllers.Roles.index())
      }
  
    // @LINE:38
    case controllers_Roles_show23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Roles_show23_invoker.call(controllers.Roles.show(id))
      }
  
    // @LINE:41
    case controllers_Roles_list24_route(params) =>
      call { 
        controllers_Roles_list24_invoker.call(controllers.Roles.list())
      }
  }
}