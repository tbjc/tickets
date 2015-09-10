
package views.html.departamento

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href=""""),_display_(/*5.32*/routes/*5.38*/.Assets.versioned("css/gumby.css")),format.raw/*5.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*6.32*/routes/*6.38*/.Assets.versioned("css/style.css")),format.raw/*6.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*7.32*/routes/*7.38*/.Assets.versioned("css/rev.css")),format.raw/*7.70*/("""" media="screen">
	<link rel="stylesheet" href=""""),_display_(/*8.32*/routes/*8.38*/.Assets.versioned("css/sidebar.css")),format.raw/*8.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*9.32*/routes/*9.38*/.Assets.versioned("css/icons.css")),format.raw/*9.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*10.32*/routes/*10.38*/.Assets.versioned("css/sweetalert.css")),format.raw/*10.77*/("""">
	<link rel="stylesheet" href=""""),_display_(/*11.32*/routes/*11.38*/.Assets.versioned("css/jquery.dataTables.css")),format.raw/*11.84*/("""">
	<link rel="stylesheet" href=""""),_display_(/*12.32*/routes/*12.38*/.Assets.versioned("css/dataTables.responsive.css")),format.raw/*12.88*/("""">
	<link rel="stylesheet" href=""""),_display_(/*13.32*/routes/*13.38*/.Assets.versioned("css/style-tabs.css")),format.raw/*13.77*/("""">
	<link rel="stylesheet" href=""""),_display_(/*14.32*/routes/*14.38*/.Assets.versioned("css/classic.css")),format.raw/*14.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*15.32*/routes/*15.38*/.Assets.versioned("css/classic.date.css")),format.raw/*15.79*/("""">
	<link rel="stylesheet" href=""""),_display_(/*16.32*/routes/*16.38*/.Assets.versioned("css/token-input.css")),format.raw/*16.78*/("""">
	<!-- <link href=""""),_display_(/*17.20*/routes/*17.26*/.Assets.versioned("css/ionicons.css")),format.raw/*17.63*/("""" rel="stylesheet" type="text/css" /> -->
	<!-- <link href=""""),_display_(/*18.20*/routes/*18.26*/.Assets.versioned("css/gridstack.min.css")),format.raw/*18.68*/("""" rel="stylesheet" type="text/css" /> -->

	<!-- Grab Google CDN's jQuery, fall back to local if offline -->
	<!-- 2.0 for modern browsers, 1.10 for .oldie -->
	<script type="text/javascript">
	var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className.match(/\soldie\s/g));
	if(!oldieCheck) """),format.raw/*24.18*/("""{"""),format.raw/*24.19*/("""
	"""),format.raw/*25.2*/("""document.write('<script src=""""),_display_(/*25.32*/routes/*25.38*/.Assets.versioned("js/jquery-2.0.2.min.js")),format.raw/*25.81*/(""""><\/script>');
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/(""" """),format.raw/*26.4*/("""else """),format.raw/*26.9*/("""{"""),format.raw/*26.10*/("""
	"""),format.raw/*27.2*/("""document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/("""
	"""),format.raw/*29.2*/("""</script>
	<script>
	if(!window.jQuery) """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""
	"""),format.raw/*32.2*/("""if(!oldieCheck) """),format.raw/*32.18*/("""{"""),format.raw/*32.19*/("""
	  """),format.raw/*33.4*/("""document.write('<script src=""""),_display_(/*33.34*/routes/*33.40*/.Assets.versioned("js/jquery-2.1.3.min.js")),format.raw/*33.83*/(""""><\/script>');
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/(""" """),format.raw/*34.4*/("""else """),format.raw/*34.9*/("""{"""),format.raw/*34.10*/("""
	  """),format.raw/*35.4*/("""document.write('<script src=""""),_display_(/*35.34*/routes/*35.40*/.Assets.versioned("js/libs/jquery-1.10.1.min.js")),format.raw/*35.89*/(""""><\/script>');
	"""),format.raw/*36.2*/("""}"""),format.raw/*36.3*/("""
	"""),format.raw/*37.2*/("""}"""),format.raw/*37.3*/("""
	"""),format.raw/*38.2*/("""</script>

	<script src=""""),_display_(/*40.16*/routes/*40.22*/.Assets.versioned("js/jquery-ui.min.js")),format.raw/*40.62*/(""""></script>
	<script src=""""),_display_(/*41.16*/routes/*41.22*/.Assets.versioned("js/libs/modernizr-2.6.2.min.js")),format.raw/*41.73*/(""""></script>
	<script src=""""),_display_(/*42.16*/routes/*42.22*/.Assets.versioned("js/jquery.dataTables.min.js")),format.raw/*42.70*/(""""></script>
	<script src=""""),_display_(/*43.16*/routes/*43.22*/.Assets.versioned("js/dataTables.responsive.js")),format.raw/*43.70*/(""""></script>
	<script>
		var config = """),format.raw/*45.16*/("""{"""),format.raw/*45.17*/("""
			"""),format.raw/*46.4*/("""environment: '"""),_display_(/*46.19*/play/*46.23*/.Play.application().configuration().getString("Evomatik.Logger.js")),format.raw/*46.90*/("""',
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
	"""),format.raw/*48.2*/("""</script>
	<script src=""""),_display_(/*49.16*/routes/*49.22*/.Assets.versioned("js/utilerias.js")),format.raw/*49.58*/(""""></script>
</head>
<body>



<div class="row">
	   	<div class="six columns">
	   		 <h2>Departamentos</h2>
	   	</div>
	   	<div class="six columns text-right">
	   		  <div class="medium primary btn">
			 	<a href="#" class="switch newAction" gumby-trigger="#newModal"><i class="icon ion-plus"></i> Nuevo</a>
			 </div>
	   	</div>

	   	</div>
	   	<div class="row">
		<div class="twelve columns">
	   		<table class="contentTable list-table display responsive no-wrap" width="100%" id="distritoTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nombre</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody class="construct-content list-table display responsive no-wrap" width="100%" id="distritooBody">
					
				</tbody>
			</table>
			<div class="text-center">
				<div class="pagination"></div>
			</div>
	   	</div>
	   </div>
	</div>

<div class="modal" id="newModal">
	  <div class="content">
	    <a class="close switch" gumby-trigger="|#newModal"><i class="icon-cancel" /></i></a>
	    <div class="row">
	      <div class="ten centered columns">
	        """),_display_(/*92.11*/form("newModal", "createForm")),format.raw/*92.41*/("""
	      """),format.raw/*93.8*/("""</div>
	    </div>
	  </div>
	</div>

	<div class="modal" id="editModal">
	  <div class="content">
	    <a class="close switch" gumby-trigger="|#editModal"><i class="icon-cancel" /></i></a>
	    <div class="row">
	      <div class="ten centered columns">
	        """),_display_(/*103.11*/form("editModal", "editForm")),format.raw/*103.40*/("""
	      """),format.raw/*104.8*/("""</div>
	    </div>
	  </div>
	</div>
<script type="text/template" id="object-Template">
	<% _.each(Objects, function(object)"""),format.raw/*109.37*/("""{"""),format.raw/*109.38*/(""" """),format.raw/*109.39*/("""%>
		<tr class="object" data-row="_<%= object.id %>">
			<td><span id="_<%= object.id %>"><%= object.id %></td>
			<td><span id="dis_<%= object.id %>"><%= object.nombre %></span></td>
			<td>
	     <div class="medium warning btn icon-right icon-pencil"><a href="#" id="editActionbtn" data-id="<%= object.id %>"> Editar</a></div>
	     <div class="medium danger btn icon-right icon-cancel-circled"><a href="#" id="deleteAction" data-id="<%= object.id %>"> Eliminar</a></div> 
	   </td>
		</tr>
	<% """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""); %>
</script>
<script src=""""),_display_(/*120.15*/routes/*120.21*/.Assets.versioned("js/underscore.js")),format.raw/*120.58*/(""""></script>
	<script gumby-touch=""""),_display_(/*121.24*/routes/*121.30*/.Assets.versioned("js/libs")),format.raw/*121.58*/("""" src=""""),_display_(/*121.66*/routes/*121.72*/.Assets.versioned("js/libs/gumby.min.js")),format.raw/*121.113*/(""""></script>
	<script src=""""),_display_(/*122.16*/routes/*122.22*/.Assets.versioned("js/libs/ui/jquery.validation.js")),format.raw/*122.74*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*123.16*/routes/*123.22*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*123.63*/(""""></script>
	<script src=""""),_display_(/*124.16*/routes/*124.22*/.Assets.versioned("js/modernizr.custom.js")),format.raw/*124.65*/(""""></script>
	<script src=""""),_display_(/*125.16*/routes/*125.22*/.Assets.versioned("js/plugins.js")),format.raw/*125.56*/(""""></script>
	<script src=""""),_display_(/*126.16*/routes/*126.22*/.Assets.versioned("js/main.js")),format.raw/*126.53*/(""""></script>
	<script src=""""),_display_(/*127.16*/routes/*127.22*/.Assets.versioned("js/classie.js")),format.raw/*127.56*/(""""></script>
	<script src=""""),_display_(/*128.16*/routes/*128.22*/.Assets.versioned("js/sidebarEffects.js")),format.raw/*128.63*/(""""></script>
	<script src=""""),_display_(/*129.16*/routes/*129.22*/.Assets.versioned("js/resetForm.js")),format.raw/*129.58*/(""""></script>
	<script src=""""),_display_(/*130.16*/routes/*130.22*/.Assets.versioned("js/tabs-responsive.js")),format.raw/*130.64*/(""""></script>
	<script src=""""),_display_(/*131.16*/routes/*131.22*/.Assets.versioned("js/modernizr.js")),format.raw/*131.58*/(""""></script>
	
	<script src=""""),_display_(/*133.16*/routes/*133.22*/.Assets.versioned("js/jquery.slimscroll.min.js")),format.raw/*133.70*/(""""></script>
	<!-- <script src=""""),_display_(/*134.21*/routes/*134.27*/.Assets.versioned("javascripts/main/mainLayoutController.js")),format.raw/*134.88*/(""""></script> -->
	<script src=""""),_display_(/*135.16*/routes/*135.22*/.Assets.versioned("js/jquery.cookie.js")),format.raw/*135.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*136.16*/routes/*136.22*/.Assets.versioned("js/picker.js")),format.raw/*136.55*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*137.16*/routes/*137.22*/.Assets.versioned("js/picker.date.js")),format.raw/*137.60*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*138.16*/routes/*138.22*/.Assets.versioned("js/jquery.inputmask.js")),format.raw/*138.65*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*139.16*/routes/*139.22*/.Assets.versioned("js/jquery.maskMoney.js")),format.raw/*139.65*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*140.16*/routes/*140.22*/.Assets.versioned("js/jquery.inputmask.date.extensions.js")),format.raw/*140.81*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*141.16*/routes/*141.22*/.Assets.versioned("js/jquery.tokeninput.js")),format.raw/*141.66*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*143.15*/routes/*143.21*/.Assets.versioned("javascripts/departamento.js")),format.raw/*143.69*/(""""></script>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Sep 10 11:00:48 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/departamento/index.scala.html
                  HASH: b194fb42db73d815ecb60b75af5fbccb7fd0e203
                  MATRIX: 840->0|948->82|962->88|1016->122|1077->157|1091->163|1145->197|1206->232|1220->238|1272->270|1348->320|1362->326|1418->362|1479->397|1493->403|1547->437|1609->472|1624->478|1684->517|1746->552|1761->558|1828->604|1890->639|1905->645|1976->695|2038->730|2053->736|2113->775|2175->810|2190->816|2247->852|2309->887|2324->893|2386->934|2448->969|2463->975|2524->1015|2574->1038|2589->1044|2647->1081|2736->1143|2751->1149|2814->1191|3157->1506|3186->1507|3216->1510|3273->1540|3288->1546|3352->1589|3397->1607|3425->1608|3453->1609|3485->1614|3514->1615|3544->1618|3683->1730|3711->1731|3741->1734|3811->1776|3840->1777|3870->1780|3914->1796|3943->1797|3975->1802|4032->1832|4047->1838|4111->1881|4156->1899|4184->1900|4212->1901|4244->1906|4273->1907|4305->1912|4362->1942|4377->1948|4447->1997|4492->2015|4520->2016|4550->2019|4578->2020|4608->2023|4663->2051|4678->2057|4739->2097|4794->2125|4809->2131|4881->2182|4936->2210|4951->2216|5020->2264|5075->2292|5090->2298|5159->2346|5226->2385|5255->2386|5287->2391|5329->2406|5342->2410|5430->2477|5463->2483|5491->2484|5521->2487|5574->2513|5589->2519|5646->2555|6802->3684|6853->3714|6889->3723|7192->3998|7243->4027|7280->4036|7438->4165|7468->4166|7498->4167|8032->4673|8061->4674|8121->4706|8137->4712|8196->4749|8260->4785|8276->4791|8326->4819|8362->4827|8378->4833|8442->4874|8498->4902|8514->4908|8588->4960|8667->5011|8683->5017|8746->5058|8802->5086|8818->5092|8883->5135|8939->5163|8955->5169|9011->5203|9067->5231|9083->5237|9136->5268|9192->5296|9208->5302|9264->5336|9320->5364|9336->5370|9399->5411|9455->5439|9471->5445|9529->5481|9585->5509|9601->5515|9665->5557|9721->5585|9737->5591|9795->5627|9854->5658|9870->5664|9940->5712|10001->5745|10017->5751|10100->5812|10160->5844|10176->5850|10238->5890|10317->5941|10333->5947|10388->5980|10467->6031|10483->6037|10543->6075|10622->6126|10638->6132|10703->6175|10782->6226|10798->6232|10863->6275|10942->6326|10958->6332|11039->6391|11118->6442|11134->6448|11200->6492|11280->6544|11296->6550|11366->6598
                  LINES: 32->1|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|68->37|68->37|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|79->48|80->49|80->49|80->49|123->92|123->92|124->93|134->103|134->103|135->104|140->109|140->109|140->109|149->118|149->118|151->120|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|162->131|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|172->141|172->141|172->141|174->143|174->143|174->143
                  -- GENERATED --
              */
          