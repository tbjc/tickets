
package views.html.empleados

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _form_Scope0 {
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

class _form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(element: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
	"""),format.raw/*2.2*/("""<div class="twelve columns">
		<div class="field">
			"""),_display_(/*4.5*/if(element.equals("editModal"))/*4.36*/{_display_(Seq[Any](format.raw/*4.37*/(""" 
				"""),format.raw/*5.5*/("""<input type="hidden" id="id" name="id" />
			""")))}),format.raw/*6.5*/("""
		  	"""),format.raw/*7.6*/("""<label class="inline" for="distrito">Empleado</label>
		  	"""),_display_(/*8.7*/if(element.equals("editModal"))/*8.38*/{_display_(Seq[Any](format.raw/*8.39*/(""" 
				"""),format.raw/*9.5*/("""<input class="input" type="text" class="nombre" id="nombre" name="nombre" """),_display_(/*9.80*/if(element.equals("editModal"))/*9.111*/{_display_(Seq[Any](format.raw/*9.112*/(""" """),format.raw/*9.113*/("""data-edit="true"""")))}),format.raw/*9.130*/(""" """),format.raw/*9.131*/("""placeholder="nombre" />
			""")))}/*10.5*/else/*10.9*/{_display_(Seq[Any](format.raw/*10.10*/("""
				"""),format.raw/*11.5*/("""<input class="input" type="text" class="nombre" id="nombre2" name="nombre" """),_display_(/*11.81*/if(element.equals("editModal"))/*11.112*/{_display_(Seq[Any](format.raw/*11.113*/(""" """),format.raw/*11.114*/("""data-edit="true"""")))}),format.raw/*11.131*/(""" """),format.raw/*11.132*/("""placeholder="nombre" />
			""")))}),format.raw/*12.5*/("""
		    """),format.raw/*13.7*/("""<select name="departamento" class="depto">
  			</select>
		</div>
	</div>
	<div class="twelve columns">
		<div class="six columns text-right">
			<div class="btn secondary medium">
			"""),_display_(/*20.5*/if(element.equals("editModal"))/*20.36*/{_display_(Seq[Any](format.raw/*20.37*/(""" 
				"""),format.raw/*21.5*/("""<a href="#" class="editAction">Editar</a></div>
			""")))}),format.raw/*22.5*/("""
			"""),_display_(/*23.5*/if(element.equals("newModal"))/*23.35*/{_display_(Seq[Any](format.raw/*23.36*/(""" 
				"""),format.raw/*24.5*/("""<a href="#" class="createAction">Crear</a></div>
			""")))}),format.raw/*25.5*/("""
		"""),format.raw/*26.3*/("""</div>
		<div class="six columns text-left">
			<div class="btn primary medium"><a href="#" class="cancelAction">Cancelar</a></div>
		</div>
	</div>
"""))
      }
    }
  }

  def render(element:String): play.twirl.api.HtmlFormat.Appendable = apply(element)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (element) => apply(element)

  def ref: this.type = this

}


}

/**/
object _form extends _form_Scope0._form
              /*
                  -- GENERATED --
                  DATE: Thu Sep 10 11:00:49 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/empleados/_form.scala.html
                  HASH: 0e53e2f2385ab7b7305be661d44cf0eebdac188d
                  MATRIX: 755->2|867->19|896->22|978->79|1017->110|1055->111|1088->118|1164->165|1197->172|1283->233|1322->264|1360->265|1393->272|1494->347|1534->378|1573->379|1602->380|1650->397|1679->398|1726->427|1738->431|1777->432|1810->438|1913->514|1954->545|1994->546|2024->547|2073->564|2103->565|2162->594|2197->602|2416->795|2456->826|2495->827|2529->834|2612->887|2644->893|2683->923|2722->924|2756->931|2840->985|2871->989
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|42->11|43->12|44->13|51->20|51->20|51->20|52->21|53->22|54->23|54->23|54->23|55->24|56->25|57->26
                  -- GENERATED --
              */
          