
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Proyectos/play_framework/tickets/conf/routes
// @DATE:Thu Sep 10 19:21:52 CDT 2015


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
