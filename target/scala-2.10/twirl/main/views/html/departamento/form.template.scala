
package views.html.departamento

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(element: String, formid:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/if(element.equals("newModal"))/*2.32*/{_display_(Seq[Any](format.raw/*2.33*/("""
	"""),format.raw/*3.2*/("""<h2>Crear Empleado</h2>
	<form action="#" class="row" id=""""),_display_(/*4.36*/formid),format.raw/*4.42*/("""">
""")))}),format.raw/*5.2*/("""
"""),_display_(/*6.2*/if(element.equals("editModal"))/*6.33*/{_display_(Seq[Any](format.raw/*6.34*/("""
	"""),format.raw/*7.2*/("""<h2>Editar Empleado</h2>
	<form action="#" class="row" id=""""),_display_(/*8.36*/formid),format.raw/*8.42*/("""">
""")))}),format.raw/*9.2*/("""
	"""),_display_(/*10.3*/_form(element)),format.raw/*10.17*/("""
"""),format.raw/*11.1*/("""</form>
"""))
      }
    }
  }

  def render(element:String,formid:String): play.twirl.api.HtmlFormat.Appendable = apply(element,formid)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (element,formid) => apply(element,formid)

  def ref: this.type = this

}


}

/**/
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Mon Sep 07 10:37:15 CDT 2015
                  SOURCE: C:/Users/Wezkell Digital/Desktop/proyecto/app/views/departamento/form.scala.html
                  HASH: 24199a08a446724aaa1af4f3959b9f8cdc6af5e7
                  MATRIX: 763->1|890->33|917->35|955->65|993->66|1021->68|1106->127|1132->133|1165->137|1192->139|1231->170|1269->171|1297->173|1383->233|1409->239|1442->243|1471->246|1506->260|1534->261
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|40->9|41->10|41->10|42->11
                  -- GENERATED --
              */
          