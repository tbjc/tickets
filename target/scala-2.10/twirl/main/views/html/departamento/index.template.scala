
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
                  DATE: Mon Sep 07 10:37:15 CDT 2015
                  SOURCE: C:/Users/Wezkell Digital/Desktop/proyecto/app/views/departamento/index.scala.html
                  HASH: 4d1947d1b96e4b26893d6d87322df111b304251d
                  MATRIX: 840->0|944->78|958->84|1012->118|1072->152|1086->158|1140->192|1200->226|1214->232|1266->264|1341->313|1355->319|1411->355|1471->389|1485->395|1539->429|1600->463|1615->469|1675->508|1736->542|1751->548|1818->594|1879->628|1894->634|1965->684|2026->718|2041->724|2101->763|2162->797|2177->803|2234->839|2295->873|2310->879|2372->920|2433->954|2448->960|2509->1000|2558->1022|2573->1028|2631->1065|2719->1126|2734->1132|2797->1174|3134->1483|3163->1484|3192->1486|3249->1516|3264->1522|3328->1565|3372->1582|3400->1583|3428->1584|3460->1589|3489->1590|3518->1592|3656->1703|3684->1704|3713->1706|3781->1746|3810->1747|3839->1749|3883->1765|3912->1766|3943->1770|4000->1800|4015->1806|4079->1849|4123->1866|4151->1867|4179->1868|4211->1873|4240->1874|4271->1878|4328->1908|4343->1914|4413->1963|4457->1980|4485->1981|4514->1983|4542->1984|4571->1986|4624->2012|4639->2018|4700->2058|4754->2085|4769->2091|4841->2142|4895->2169|4910->2175|4979->2223|5033->2250|5048->2256|5117->2304|5182->2341|5211->2342|5242->2346|5284->2361|5297->2365|5385->2432|5417->2437|5445->2438|5474->2440|5526->2465|5541->2471|5598->2507|6711->3593|6762->3623|6797->3631|7090->3896|7141->3925|7177->3933|7330->4057|7360->4058|7390->4059|7915->4556|7944->4557|8002->4587|8018->4593|8077->4630|8140->4665|8156->4671|8206->4699|8242->4707|8258->4713|8322->4754|8377->4781|8393->4787|8467->4839|8545->4889|8561->4895|8624->4936|8679->4963|8695->4969|8760->5012|8815->5039|8831->5045|8887->5079|8942->5106|8958->5112|9011->5143|9066->5170|9082->5176|9138->5210|9193->5237|9209->5243|9272->5284|9327->5311|9343->5317|9401->5353|9456->5380|9472->5386|9536->5428|9591->5455|9607->5461|9665->5497|9722->5526|9738->5532|9808->5580|9868->5612|9884->5618|9967->5679|10026->5710|10042->5716|10104->5756|10182->5806|10198->5812|10253->5845|10331->5895|10347->5901|10407->5939|10485->5989|10501->5995|10566->6038|10644->6088|10660->6094|10725->6137|10803->6187|10819->6193|10900->6252|10978->6302|10994->6308|11060->6352|11138->6402|11154->6408|11224->6456
                  LINES: 32->1|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|68->37|68->37|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|79->48|80->49|80->49|80->49|123->92|123->92|124->93|134->103|134->103|135->104|140->109|140->109|140->109|149->118|149->118|151->120|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|162->131|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|172->141|172->141|172->141|174->143|174->143|174->143
                  -- GENERATED --
              */
          