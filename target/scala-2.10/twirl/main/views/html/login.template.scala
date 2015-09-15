
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
import helper._

Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*3.2*/loginLayout("Iniciar sesión")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

	"""),format.raw/*5.2*/("""<div class="row">
		<div class="six centered columns text-center">
			<h1 class="six centered columns logo" style="margin-top:20%;">
				<a href="#">
					<img src="""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("images/Logo.png")),format.raw/*9.58*/(""" """),format.raw/*9.59*/("""gumby-retina />
				</a>
			</h1>
		</div>
	</div>			
	<div class="row">
		<div class="six centered columns text-center">
			<div class="panel">
				<h2>Iniciar sesión</h2>
				<form action="""),_display_(/*18.19*/routes/*18.25*/.Application.authenticate()),format.raw/*18.52*/(""" """),format.raw/*18.53*/("""method="POST" class="text-left" id="loginForm">
				"""),format.raw/*19.23*/("""
					"""),format.raw/*20.6*/("""<div class="field">
						<label for="nombreUsuario">Usuario: </label>
					  <input class="input usuario" id="nombreUsuario" name="nombreUsuario" type="text" placeholder="Usuario" value="""),_display_(/*22.118*/loginForm("nombreUsuario")/*22.144*/.value),format.raw/*22.150*/(""" """),format.raw/*22.151*/("""/>
					</div>
					<div class="field">
						<label for="password">Contraseña: </label>
					  <input class="input contrasenia" id="password" name="password" type="password" placeholder="Contraseña" value="""),_display_(/*26.119*/loginForm("password")/*26.140*/.value),format.raw/*26.146*/(""" """),format.raw/*26.147*/("""/>
					</div>
					<!--<div class="field">
                      <label for="codigoSeguridad">Código de seguridad:</label>
                      <input class="contrasenia input" name="codigoSeguridad" id="codigoSeguridad" type="password" placeholder="Código de seguridad" value="""),_display_(/*30.157*/loginForm("codigoSeguridad")/*30.185*/.value),format.raw/*30.191*/(""" """),format.raw/*30.192*/("""/>
                    </div>-->
					"""),_display_(/*32.7*/if(loginForm.hasGlobalErrors)/*32.36*/{_display_(Seq[Any](format.raw/*32.37*/("""
			             """),_display_(/*33.18*/for(validationError <- loginForm.globalErrors) yield /*33.64*/{_display_(Seq[Any](format.raw/*33.65*/("""  
			                """),format.raw/*34.20*/("""<span class="row danger label errorLabel"><i class="icon ion-alert-circled"></i> """),_display_(/*34.102*/validationError/*34.117*/.message),format.raw/*34.125*/("""</span>
			             """)))}),format.raw/*35.18*/("""
			          """)))}),format.raw/*36.15*/("""
					"""),format.raw/*37.6*/("""<div class="medium secondary btn btnSubmit">
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
	$(document).ready(function() """),format.raw/*52.31*/("""{"""),format.raw/*52.32*/("""
		"""),format.raw/*53.3*/("""if ($(".usuario").val() == "") """),format.raw/*53.34*/("""{"""),format.raw/*53.35*/("""
			"""),format.raw/*54.4*/("""$(".usuario").focus();
		"""),format.raw/*55.3*/("""}"""),format.raw/*55.4*/("""else"""),format.raw/*55.8*/("""{"""),format.raw/*55.9*/("""
			"""),format.raw/*56.4*/("""$(".contrasenia").focus();
		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""	
		"""),format.raw/*58.3*/("""$('#loginForm').keypress(function(e)"""),format.raw/*58.39*/("""{"""),format.raw/*58.40*/("""   
		    """),format.raw/*59.7*/("""if(e == 13)"""),format.raw/*59.18*/("""{"""),format.raw/*59.19*/("""
		      """),format.raw/*60.9*/("""$('#loginForm').submit();
		      return false;
		    """),format.raw/*62.7*/("""}"""),format.raw/*62.8*/("""
		  """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""");

		  $('.contrasenia').keypress(function(e)"""),format.raw/*65.43*/("""{"""),format.raw/*65.44*/("""
		    """),format.raw/*66.7*/("""if(e.which == 13)"""),format.raw/*66.24*/("""{"""),format.raw/*66.25*/("""
		      """),format.raw/*67.9*/("""$('#loginForm').submit();
		    """),format.raw/*68.7*/("""}"""),format.raw/*68.8*/("""
		  """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""");

		  $('#loginForm').submit(function(event) """),format.raw/*71.44*/("""{"""),format.raw/*71.45*/("""
		  	"""),format.raw/*72.6*/("""/* Act on the event */
		  	// alert("Hola");
		  	return;
		  """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""");

		  $(document).on('click', '.btnSubmit', function(event) """),format.raw/*77.59*/("""{"""),format.raw/*77.60*/("""
		  	"""),format.raw/*78.6*/("""event.preventDefault();
		  	/* Act on the event */
		  	$('#loginForm').submit();
		  """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");

		  $(document).on('click', '.btnClear', function(event) """),format.raw/*83.58*/("""{"""),format.raw/*83.59*/("""
		  	"""),format.raw/*84.6*/("""event.preventDefault();
		  	/* Act on the event */
		  	$(".errorLabel").remove();
		  	$('#loginForm').resetear();
		  """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""");
	"""),format.raw/*89.2*/("""}"""),format.raw/*89.3*/(""");
	</script>
""")))}))
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
                  DATE: Mon Sep 14 10:26:07 CDT 2015
                  SOURCE: C:/Proyectos/Play_Framework/Proyectos/tickets/app/views/login.scala.html
                  HASH: 4891f37c0527ff24c53405a4f75a1823179f865c
                  MATRIX: 762->1|908->37|936->58|973->87|1012->89|1043->94|1238->263|1252->269|1308->305|1336->306|1563->506|1578->512|1626->539|1655->540|1736->611|1770->618|1988->808|2024->834|2052->840|2082->841|2321->1052|2352->1073|2380->1079|2410->1080|2722->1364|2760->1392|2788->1398|2818->1399|2885->1440|2923->1469|2962->1470|3008->1489|3070->1535|3109->1536|3160->1559|3270->1641|3295->1656|3325->1664|3382->1690|3429->1706|3463->1713|3982->2204|4011->2205|4042->2209|4101->2240|4130->2241|4162->2246|4215->2272|4243->2273|4274->2277|4302->2278|4334->2283|4391->2313|4419->2314|4451->2319|4515->2355|4544->2356|4582->2367|4621->2378|4650->2379|4687->2389|4770->2445|4798->2446|4831->2452|4859->2453|4935->2501|4964->2502|4999->2510|5044->2527|5073->2528|5110->2538|5170->2571|5198->2572|5231->2578|5259->2579|5336->2628|5365->2629|5399->2636|5492->2702|5520->2703|5612->2767|5641->2768|5675->2775|5792->2865|5820->2866|5911->2929|5940->2930|5974->2937|6126->3062|6154->3063|6186->3068|6214->3069
                  LINES: 27->1|32->1|33->3|33->3|33->3|35->5|39->9|39->9|39->9|39->9|48->18|48->18|48->18|48->18|49->19|50->20|52->22|52->22|52->22|52->22|56->26|56->26|56->26|56->26|60->30|60->30|60->30|60->30|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|66->36|67->37|82->52|82->52|83->53|83->53|83->53|84->54|85->55|85->55|85->55|85->55|86->56|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59|90->60|92->62|92->62|93->63|93->63|95->65|95->65|96->66|96->66|96->66|97->67|98->68|98->68|99->69|99->69|101->71|101->71|102->72|105->75|105->75|107->77|107->77|108->78|111->81|111->81|113->83|113->83|114->84|118->88|118->88|119->89|119->89
                  -- GENERATED --
              */
          