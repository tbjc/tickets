
package views.html.empleados

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
	"""),format.raw/*3.2*/("""<h2>Crear empleado</h2>
	<form action="#" class="row" id=""""),_display_(/*4.36*/formid),format.raw/*4.42*/("""">
""")))}),format.raw/*5.2*/("""
"""),_display_(/*6.2*/if(element.equals("editModal"))/*6.33*/{_display_(Seq[Any](format.raw/*6.34*/("""
	"""),format.raw/*7.2*/("""<h2>Editar empleado</h2>
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
                  DATE: Thu Sep 10 11:00:48 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/empleados/form.scala.html
                  HASH: 46f8cdfa6b638e017cb8d62b587ce9922851bdfb
                  MATRIX: 760->1|887->33|915->36|953->66|991->67|1020->70|1106->130|1132->136|1166->141|1194->144|1233->175|1271->176|1300->179|1387->240|1413->246|1447->251|1477->255|1512->269|1541->271
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|40->9|41->10|41->10|42->11
                  -- GENERATED --
              */
          