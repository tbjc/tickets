
package views.html.departamento

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
		  	"""),format.raw/*7.6*/("""<label class="inline" for="departamento">Departamento</label>
		    <input class="input" type="text" id="nombre" name="nombre" """),_display_(/*8.67*/if(element.equals("editModal"))/*8.98*/{_display_(Seq[Any](format.raw/*8.99*/(""" """),format.raw/*8.100*/("""data-edit="true"""")))}),format.raw/*8.117*/(""" """),format.raw/*8.118*/("""placeholder="Departamento" />

		</div>
	</div>
	<div class="twelve columns">
		<div class="six columns text-right">
			<div class="btn secondary medium">
			"""),_display_(/*15.5*/if(element.equals("editModal"))/*15.36*/{_display_(Seq[Any](format.raw/*15.37*/(""" 
				"""),format.raw/*16.5*/("""<a href="#" class="editAction">Editar</a></div>
			""")))}),format.raw/*17.5*/("""
			"""),_display_(/*18.5*/if(element.equals("newModal"))/*18.35*/{_display_(Seq[Any](format.raw/*18.36*/(""" 
				"""),format.raw/*19.5*/("""<a href="#" class="createAction">Crear</a></div>
			""")))}),format.raw/*20.5*/("""
		"""),format.raw/*21.3*/("""</div>
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
                  DATE: Thu Sep 10 11:00:48 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/departamento/_form.scala.html
                  HASH: 3515e98ba17da22012c7cab331c2c8607ac4f33e
                  MATRIX: 758->2|870->19|899->22|981->79|1020->110|1058->111|1091->118|1167->165|1200->172|1355->301|1394->332|1432->333|1461->334|1509->351|1538->352|1730->518|1770->549|1809->550|1843->557|1926->610|1958->616|1997->646|2036->647|2070->654|2154->708|2185->712
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|37->6|38->7|39->8|39->8|39->8|39->8|39->8|39->8|46->15|46->15|46->15|47->16|48->17|49->18|49->18|49->18|50->19|51->20|52->21
                  -- GENERATED --
              */
          