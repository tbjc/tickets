
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

	"""),format.raw/*3.2*/("""<div class="row">
		<div class="six centered columns text-center">
			<h1 class="six centered columns logo" style="margin-top:20%;">
				<a href="#">
					<img src=""""),_display_(/*7.17*/routes/*7.23*/.Assets.versioned("images/Logo.png")),format.raw/*7.59*/("""">
				</a>
			</h1>
		</div>
	</div>			
	<div class="row">
		<div class="six centered columns text-center">
			<div class="panel">
				<h2>Iniciar sesión</h2>
				
				<form action=""""),_display_(/*17.20*/routes/*17.26*/.Application.entrar()),format.raw/*17.47*/("""" method="POST" class="text-left" id="loginForm">
				"""),format.raw/*18.23*/("""
					"""),format.raw/*19.6*/("""<div class="field">
						<label for="usuario">Usuario: </label>
					  <input class="input usuario" id="nombreUsuario" name="nombreUsuario" type="text" placeholder="Usuario" value=""""),_display_(/*21.119*/loginForm("nombreUsuario")/*21.145*/.value),format.raw/*21.151*/("""" />
					</div>
					<div class="field">
						<label for="pasword">Contraseña: </label>
					  <input class="input contrasenia" id="password" name="password" type="password" placeholder="Contraseña" value=""""),_display_(/*25.120*/loginForm("password")/*25.141*/.value),format.raw/*25.147*/("""" />
					</div>
					
					"""),_display_(/*28.7*/if(loginForm.hasGlobalErrors)/*28.36*/{_display_(Seq[Any](format.raw/*28.37*/("""
			             """),_display_(/*29.18*/for(validationError <- loginForm.globalErrors) yield /*29.64*/{_display_(Seq[Any](format.raw/*29.65*/("""  
			                """),format.raw/*30.20*/("""<span class="row danger label errorLabel"><i class="icon ion-alert-circled"></i> """),_display_(/*30.102*/validationError/*30.117*/.message),format.raw/*30.125*/("""</span>
			             """)))}),format.raw/*31.18*/("""
			          """)))}),format.raw/*32.15*/("""
					"""),format.raw/*33.6*/("""<div class="medium secondary btn btnSubmit">
					  <a href="#">Iniciar sesión</a>
					</div>
					<div class="medium default btn btnClear">
					  <a href="#">Limpiar</a>
					</div>
				</form>
			</div>
		</div>
		<div class="six centered columns text-center">
			<p class="size-12">Instituto de Atención a Víctimas del Delito - Todos los derechos reservados  <a href="http:evomatik.com">Evomatik Software</a></p>
		</div>
	</div>

	<script>
	$(document).ready(function() """),format.raw/*48.31*/("""{"""),format.raw/*48.32*/("""
		"""),format.raw/*49.3*/("""if ($(".usuario").val() == "") """),format.raw/*49.34*/("""{"""),format.raw/*49.35*/("""
			"""),format.raw/*50.4*/("""$(".usuario").focus();
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""else"""),format.raw/*51.8*/("""{"""),format.raw/*51.9*/("""
			"""),format.raw/*52.4*/("""$(".contrasenia").focus();
		"""),format.raw/*53.3*/("""}"""),format.raw/*53.4*/("""	
		"""),format.raw/*54.3*/("""$('#loginForm').keypress(function(e)"""),format.raw/*54.39*/("""{"""),format.raw/*54.40*/("""   
		    """),format.raw/*55.7*/("""if(e == 13)"""),format.raw/*55.18*/("""{"""),format.raw/*55.19*/("""
		      """),format.raw/*56.9*/("""$('#loginForm').submit();
		      return false;
		    """),format.raw/*58.7*/("""}"""),format.raw/*58.8*/("""
		  """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/(""");

		  $('.contrasenia').keypress(function(e)"""),format.raw/*61.43*/("""{"""),format.raw/*61.44*/("""
		    """),format.raw/*62.7*/("""if(e.which == 13)"""),format.raw/*62.24*/("""{"""),format.raw/*62.25*/("""
		      """),format.raw/*63.9*/("""$('#loginForm').submit();
		    """),format.raw/*64.7*/("""}"""),format.raw/*64.8*/("""
		  """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/(""");

		  $('#loginForm').submit(function(event) """),format.raw/*67.44*/("""{"""),format.raw/*67.45*/("""
		  	"""),format.raw/*68.6*/("""/* Act on the event */
		  	// alert("Hola");
		  	return;
		  """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/(""");

		  $(document).on('click', '.btnSubmit', function(event) """),format.raw/*73.59*/("""{"""),format.raw/*73.60*/("""
		  	"""),format.raw/*74.6*/("""event.preventDefault();
		  	/* Act on the event */
		  	$('#loginForm').submit();
		  """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""");

		  $(document).on('click', '.btnClear', function(event) """),format.raw/*79.58*/("""{"""),format.raw/*79.59*/("""
		  	"""),format.raw/*80.6*/("""event.preventDefault();
		  	/* Act on the event */
		  	$(".errorLabel").remove();
		  	$('#loginForm').resetear();
		  """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/(""");
	"""),format.raw/*85.2*/("""}"""),format.raw/*85.3*/(""");
	</script>
"""))
      }
    }
  }

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Sep 09 11:55:01 CDT 2015
                  SOURCE: C:/Users/Wezkell Digital/Desktop/proyecto/app/views/login.scala.html
                  HASH: 3a7e2625854750a3256ec66c82b812602b557ba6
                  MATRIX: 762->1|893->37|922->40|1114->206|1128->212|1184->248|1395->432|1410->438|1452->459|1534->531|1567->537|1778->720|1814->746|1842->752|2079->961|2110->982|2138->988|2193->1017|2231->1046|2270->1047|2315->1065|2377->1111|2416->1112|2466->1134|2576->1216|2601->1231|2631->1239|2687->1264|2733->1279|2766->1285|3270->1761|3299->1762|3329->1765|3388->1796|3417->1797|3448->1801|3500->1826|3528->1827|3559->1831|3587->1832|3618->1836|3674->1865|3702->1866|3733->1870|3797->1906|3826->1907|3863->1917|3902->1928|3931->1929|3967->1938|4048->1992|4076->1993|4108->1998|4136->1999|4210->2045|4239->2046|4273->2053|4318->2070|4347->2071|4383->2080|4442->2112|4470->2113|4502->2118|4530->2119|4605->2166|4634->2167|4667->2173|4757->2236|4785->2237|4875->2299|4904->2300|4937->2306|5051->2393|5079->2394|5168->2455|5197->2456|5230->2462|5378->2583|5406->2584|5437->2588|5465->2589
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|48->17|48->17|48->17|49->18|50->19|52->21|52->21|52->21|56->25|56->25|56->25|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|63->32|64->33|79->48|79->48|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|83->52|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|89->58|89->58|90->59|90->59|92->61|92->61|93->62|93->62|93->62|94->63|95->64|95->64|96->65|96->65|98->67|98->67|99->68|102->71|102->71|104->73|104->73|105->74|108->77|108->77|110->79|110->79|111->80|115->84|115->84|116->85|116->85
                  -- GENERATED --
              */
          