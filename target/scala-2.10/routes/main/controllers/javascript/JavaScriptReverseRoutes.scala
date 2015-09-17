
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/Play_Framework/Proyectos/tickets/conf/routes
// @DATE:Thu Sep 17 11:46:59 CDT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseGrupos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.delete",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:28
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.show",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:32
    def userListByGroupId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.userListByGroupId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo/userListByGroupId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:27
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo/create"})
        }
      """
    )
  
    // @LINE:29
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.update",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:31
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo/list"})
        }
      """
    )
  
    // @LINE:25
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Grupos.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grupo"})
          }
        
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autenticate"})
        }
      """
    )
  
    // @LINE:7
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
        }
      """
    )
  
    // @LINE:9
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseUsuarios(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.delete",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:18
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.show",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:17
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/create"})
        }
      """
    )
  
    // @LINE:19
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.update",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:21
    def listByGroupID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.listByGroupID",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/listByGroupID/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:22
    def listByRolName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.listByRolName",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/listByRolName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:15
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
          }
        
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseRoles(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Roles.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rol/list"})
        }
      """
    )
  
    // @LINE:35
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Roles.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rol"})
          }
        
        }
      """
    )
  
    // @LINE:38
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Roles.show",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rol/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }


}