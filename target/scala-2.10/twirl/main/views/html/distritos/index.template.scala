
package views.html.distritos

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
	   		 <h2>Distritos</h2>
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
						<th>Distrito</th>
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
			<td><span id="dis_<%= object.id %>"><%= object.distrito %></span></td>
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

<script src=""""),_display_(/*143.15*/routes/*143.21*/.Assets.versioned("javascripts/distrito.js")),format.raw/*143.65*/(""""></script>
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
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/distritos/index.scala.html
                  HASH: 4b7c68972c9bfbb00457a738cdf120df39762e33
                  MATRIX: 837->0|945->82|959->88|1013->122|1074->157|1088->163|1142->197|1203->232|1217->238|1269->270|1345->320|1359->326|1415->362|1476->397|1490->403|1544->437|1606->472|1621->478|1681->517|1743->552|1758->558|1825->604|1887->639|1902->645|1973->695|2035->730|2050->736|2110->775|2172->810|2187->816|2244->852|2306->887|2321->893|2383->934|2445->969|2460->975|2521->1015|2571->1038|2586->1044|2644->1081|2733->1143|2748->1149|2811->1191|3154->1506|3183->1507|3213->1510|3270->1540|3285->1546|3349->1589|3394->1607|3422->1608|3450->1609|3482->1614|3511->1615|3541->1618|3680->1730|3708->1731|3738->1734|3808->1776|3837->1777|3867->1780|3911->1796|3940->1797|3972->1802|4029->1832|4044->1838|4108->1881|4153->1899|4181->1900|4209->1901|4241->1906|4270->1907|4302->1912|4359->1942|4374->1948|4444->1997|4489->2015|4517->2016|4547->2019|4575->2020|4605->2023|4660->2051|4675->2057|4736->2097|4791->2125|4806->2131|4878->2182|4933->2210|4948->2216|5017->2264|5072->2292|5087->2298|5156->2346|5223->2385|5252->2386|5284->2391|5326->2406|5339->2410|5427->2477|5460->2483|5488->2484|5518->2487|5571->2513|5586->2519|5643->2555|6797->3682|6848->3712|6884->3721|7187->3996|7238->4025|7275->4034|7433->4163|7463->4164|7493->4165|8029->4673|8058->4674|8118->4706|8134->4712|8193->4749|8257->4785|8273->4791|8323->4819|8359->4827|8375->4833|8439->4874|8495->4902|8511->4908|8585->4960|8664->5011|8680->5017|8743->5058|8799->5086|8815->5092|8880->5135|8936->5163|8952->5169|9008->5203|9064->5231|9080->5237|9133->5268|9189->5296|9205->5302|9261->5336|9317->5364|9333->5370|9396->5411|9452->5439|9468->5445|9526->5481|9582->5509|9598->5515|9662->5557|9718->5585|9734->5591|9792->5627|9851->5658|9867->5664|9937->5712|9998->5745|10014->5751|10097->5812|10157->5844|10173->5850|10235->5890|10314->5941|10330->5947|10385->5980|10464->6031|10480->6037|10540->6075|10619->6126|10635->6132|10700->6175|10779->6226|10795->6232|10860->6275|10939->6326|10955->6332|11036->6391|11115->6442|11131->6448|11197->6492|11277->6544|11293->6550|11359->6594
                  LINES: 32->1|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|68->37|68->37|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|79->48|80->49|80->49|80->49|123->92|123->92|124->93|134->103|134->103|135->104|140->109|140->109|140->109|149->118|149->118|151->120|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|162->131|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|172->141|172->141|172->141|174->143|174->143|174->143
                  -- GENERATED --
              */
          