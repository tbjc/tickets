
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
                  DATE: Thu Sep 10 19:18:18 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/login.scala.html
                  HASH: 5f3136041bdbc92204dd1388e0468f67bd5553d0
                  MATRIX: 762->1|908->37|935->56|972->85|1011->87|1040->90|1231->255|1245->261|1301->297|1329->298|1547->489|1562->495|1610->522|1639->523|1719->593|1752->599|1968->787|2004->813|2032->819|2062->820|2297->1027|2328->1048|2356->1054|2386->1055|2694->1335|2732->1363|2760->1369|2790->1370|2855->1409|2893->1438|2932->1439|2977->1457|3039->1503|3078->1504|3128->1526|3238->1608|3263->1623|3293->1631|3349->1656|3395->1671|3428->1677|3932->2153|3961->2154|3991->2157|4050->2188|4079->2189|4110->2193|4162->2218|4190->2219|4221->2223|4249->2224|4280->2228|4336->2257|4364->2258|4395->2262|4459->2298|4488->2299|4525->2309|4564->2320|4593->2321|4629->2330|4710->2384|4738->2385|4770->2390|4798->2391|4872->2437|4901->2438|4935->2445|4980->2462|5009->2463|5045->2472|5104->2504|5132->2505|5164->2510|5192->2511|5267->2558|5296->2559|5329->2565|5419->2628|5447->2629|5537->2691|5566->2692|5599->2698|5713->2785|5741->2786|5830->2847|5859->2848|5892->2854|6040->2975|6068->2976|6099->2980|6127->2981
                  LINES: 27->1|32->1|33->3|33->3|33->3|35->5|39->9|39->9|39->9|39->9|48->18|48->18|48->18|48->18|49->19|50->20|52->22|52->22|52->22|52->22|56->26|56->26|56->26|56->26|60->30|60->30|60->30|60->30|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|66->36|67->37|82->52|82->52|83->53|83->53|83->53|84->54|85->55|85->55|85->55|85->55|86->56|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59|90->60|92->62|92->62|93->63|93->63|95->65|95->65|96->66|96->66|96->66|97->67|98->68|98->68|99->69|99->69|101->71|101->71|102->72|105->75|105->75|107->77|107->77|108->78|111->81|111->81|113->83|113->83|114->84|118->88|118->88|119->89|119->89
                  -- GENERATED --
              */
          