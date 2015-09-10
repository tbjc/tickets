
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Wezkell Digital/Desktop/proyecto/conf/routes
// @DATE:Wed Sep 09 12:23:03 CDT 2015


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
