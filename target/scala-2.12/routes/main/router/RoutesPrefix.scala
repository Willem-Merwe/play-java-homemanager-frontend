// @GENERATOR:play-routes-compiler
// @SOURCE:G:/play-java-homemanager-frontend/conf/routes
// @DATE:Thu Jun 21 22:59:44 CAT 2018


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
