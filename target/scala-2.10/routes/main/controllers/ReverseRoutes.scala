
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/Play_Framework/Proyectos/tickets/conf/routes
// @DATE:Thu Sep 17 11:46:59 CDT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:25
  class ReverseGrupos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "grupo/delete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:28
    def show(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "grupo/show/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:32
    def userListByGroupId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "grupo/userListByGroupId/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:27
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "grupo/create")
    }
  
    // @LINE:29
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "grupo/update/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:31
    def list(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "grupo/list")
    }
  
    // @LINE:25
    def index(): Call = {
    
      () match {
      
        // @LINE:25
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "grupo")
      
      }
    
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "autenticate")
    }
  
    // @LINE:7
    def main(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "main")
    }
  
    // @LINE:9
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:15
  class ReverseUsuarios(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuario/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def show(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/show/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario/create")
    }
  
    // @LINE:19
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuario/update/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:21
    def listByGroupID(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/listByGroupID/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:22
    def listByRolName(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/listByRolName/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:15
    def index(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "usuario")
      
      }
    
    }
  
  }

  // @LINE:35
  class ReverseRoles(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def list(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rol/list")
    }
  
    // @LINE:35
    def index(): Call = {
    
      () match {
      
        // @LINE:35
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "rol")
      
      }
    
    }
  
    // @LINE:38
    def show(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rol/show/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }


}