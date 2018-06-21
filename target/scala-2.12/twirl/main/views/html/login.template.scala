
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("css/material.css")),format.raw/*7.78*/("""">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("js/material.js")),format.raw/*9.60*/("""" type="text/javascript"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    <title>Home Management Login</title>
</head>
<body>
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <!-- Title -->
            <span class="mdl-layout-title">Home Management System</span>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation. We hide it in small screens. -->
            <nav class="mdl-navigation mdl-layout--large-screen-only">
                <a class="mdl-navigation__link" href="">Sign up</a>
            </nav>
        </div>
    </header>
    <div class="mdl-layout__drawer">
        <span class="mdl-layout-title">Home Management System</span>
        <nav class="mdl-navigation">
            <a class="mdl-navigation__link" href="">Sign up</a>
        </nav>
    </div>
    <main class="mdl-layout__content">
        <div class="mdl-grid">
            <div class="mdl-layout-spacer"></div>
            <div class="mdl-cell">
                <!-- Login Textfields -->
                <form action="LoginAuth" method="POST">
                    <div
                            class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="email" id="email_field"
                               name="email_field" required> <label
                            class="mdl-textfield__label" for="email">Email Address:</label>
                    </div>
                    <div
                            class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="password"
                               id="password_field" name="password_field"> <label
                            class="mdl-textfield__label" for="password_field" required>Password:</label>
                    </div>
                    <button
                            class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent">Login</button>
                </form>
                <!-- End of Login Textfields -->
            </div>
            <div class="mdl-layout-spacer"></div>
        </div>
    </main>
    <div class="mdl-layout-spacer"></div>
    <footer class="mdl-mini-footer">
        <div class="mdl-mini-footer__left-section">
            <div class="mdl-logo">Copyright &copy; 2018 EpicTeamOfAwesome</div>
        </div>
    </footer>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 21 22:54:26 CAT 2018
                  SOURCE: G:/play-java-homemanager-frontend/app/views/login.scala.html
                  HASH: b14c7b6209153821a533b5b55c83a93cfba7585f
                  MATRIX: 948->1|1060->18|1088->20|1271->177|1285->183|1342->220|1484->336|1498->342|1553->377
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|41->9|41->9|41->9
                  -- GENERATED --
              */
          