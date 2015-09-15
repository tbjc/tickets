
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/Play_Framework/Proyectos/tickets/conf/routes
// @DATE:Tue Sep 15 11:18:25 CDT 2015

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
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show/$id<[^/]+>""", """controllers.Application.showUser(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showrol/$id<[^/]+>""", """controllers.Application.showRol(id:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usersbyrol/$id<[^/]+>""", """controllers.Application.getUsersByRol(id:String)"""),
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
  private[this] lazy val controllers_Application_showUser5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_showUser5_invoker = createInvoker(
    controllers.Application.showUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showUser",
      Seq(classOf[Long]),
      "GET",
      """rutas para controlador usuarios""",
      this.prefix + """show/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_showRol6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showrol/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_showRol6_invoker = createInvoker(
    controllers.Application.showRol(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showRol",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """showrol/$id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_getUsersByRol7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersbyrol/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getUsersByRol7_invoker = createInvoker(
    controllers.Application.getUsersByRol(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUsersByRol",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """usersbyrol/$id<[^/]+>"""
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
    case controllers_Application_showUser5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_showUser5_invoker.call(controllers.Application.showUser(id))
      }
  
    // @LINE:16
    case controllers_Application_showRol6_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_showRol6_invoker.call(controllers.Application.showRol(id))
      }
  
    // @LINE:17
    case controllers_Application_getUsersByRol7_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_getUsersByRol7_invoker.call(controllers.Application.getUsersByRol(id))
      }
  }
}