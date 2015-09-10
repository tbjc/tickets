
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
                  DATE: Thu Sep 10 11:00:47 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/departamento/form.scala.html
                  HASH: dcd01e8a31bfdfef994fff68f8818eb40b5d90e0
                  MATRIX: 763->1|890->33|918->36|956->66|994->67|1023->70|1109->130|1135->136|1169->141|1197->144|1236->175|1274->176|1303->179|1390->240|1416->246|1450->251|1480->255|1515->269|1544->271
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|40->9|41->10|41->10|42->11
                  -- GENERATED --
              */
          