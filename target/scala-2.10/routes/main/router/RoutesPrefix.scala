
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/Play_Framework/Proyectos/tickets/conf/routes
// @DATE:Thu Sep 17 11:46:59 CDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
