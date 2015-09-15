
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mainLayout_Scope0 {
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

class mainLayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]>
<html class="no-js ie6 oldie" lang="es"> <![endif]-->
<!--[if IE 7]>
<html class="no-js ie7 oldie" lang="es"> <![endif]-->
<!--[if IE 8]>
<html class="no-js ie8 oldie" lang="es"> <![endif]-->
<!--[if IE 9]>
<html class="no-js ie9" lang="es"> <![endif]-->
<!-- Consider adding an manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 9]><!-->
<html class="no-js" lang="en" itemscope itemtype="http://schema.org/Product"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <!-- Use the .htaccess and remove these lines to avoid edge case issues.
             More info: h5bp.com/b/378 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <title>"""),_display_(/*24.13*/title),format.raw/*24.18*/("""</title>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <meta name="author" content="humans.txt">

    <link rel="shortcut icon" href="""),_display_(/*29.37*/routes/*29.43*/.Assets.versioned("img/favicon.ico")),format.raw/*29.79*/(""" """),format.raw/*29.80*/("""type="image/x-icon"/>

    <!-- Facebook Metadata /-->
    <meta property="fb:page_id" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:description" content=""/>
    <meta property="og:title" content=""/>

    <!-- Google+ Metadata /-->
    <meta itemprop="name" content="">
    <meta itemprop="description" content="">
    <meta itemprop="image" content="">

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1">

    <!-- We highly recommend you use SASS and write your custom styles in sass/_custom.scss.
         However, there is a blank style.css in the css directory should you prefer -->
    <link rel="stylesheet" href="""),_display_(/*46.34*/routes/*46.40*/.Assets.versioned("css/gumby.css")),format.raw/*46.74*/(""">
    <link rel="stylesheet" href="""),_display_(/*47.34*/routes/*47.40*/.Assets.versioned("css/style.css")),format.raw/*47.74*/(""">
    <link rel="stylesheet" href="""),_display_(/*48.34*/routes/*48.40*/.Assets.versioned("css/rev.css")),format.raw/*48.72*/(""" """),format.raw/*48.73*/("""media="screen">
    <link rel="stylesheet" href="""),_display_(/*49.34*/routes/*49.40*/.Assets.versioned("css/sidebar.css")),format.raw/*49.76*/(""">
    <link rel="stylesheet" href="""),_display_(/*50.34*/routes/*50.40*/.Assets.versioned("css/icons.css")),format.raw/*50.74*/(""">
    <link rel="stylesheet" href="""),_display_(/*51.34*/routes/*51.40*/.Assets.versioned("css/sweetalert.css")),format.raw/*51.79*/(""">
    <link rel="stylesheet" href="""),_display_(/*52.34*/routes/*52.40*/.Assets.versioned("css/jquery.dataTables.css")),format.raw/*52.86*/(""">
    <link rel="stylesheet" href="""),_display_(/*53.34*/routes/*53.40*/.Assets.versioned("css/dataTables.responsive.css")),format.raw/*53.90*/(""">
    <link rel="stylesheet" href="""),_display_(/*54.34*/routes/*54.40*/.Assets.versioned("css/style-tabs.css")),format.raw/*54.79*/(""">
    <link rel="stylesheet" href="""),_display_(/*55.34*/routes/*55.40*/.Assets.versioned("css/classic.css")),format.raw/*55.76*/(""">
    <link rel="stylesheet" href="""),_display_(/*56.34*/routes/*56.40*/.Assets.versioned("css/classic.date.css")),format.raw/*56.81*/(""">
    <link rel="stylesheet" href="""),_display_(/*57.34*/routes/*57.40*/.Assets.versioned("css/token-input.css")),format.raw/*57.80*/(""">
    <link href="""),_display_(/*58.17*/routes/*58.23*/.Assets.versioned("css/ionicons.css")),format.raw/*58.60*/(""" """),format.raw/*58.61*/("""rel="stylesheet" type="text/css"/>
    <link href="""),_display_(/*59.17*/routes/*59.23*/.Assets.versioned("css/gridstack.min.css")),format.raw/*59.65*/(""" """),format.raw/*59.66*/("""rel="stylesheet" type="text/css"/>

    <!-- Grab Google CDN's jQuery, fall back to local if offline -->
    <!-- 2.0 for modern browsers, 1.10 for .oldie -->
    <script type="text/javascript">
	var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className.match(/\soldie\s/g));
	if(!oldieCheck) """),format.raw/*65.18*/("""{"""),format.raw/*65.19*/("""
	"""),format.raw/*66.2*/("""document.write('<script src="""),_display_(/*66.31*/routes/*66.37*/.Assets.versioned("js/jquery-2.0.2.min.js")),format.raw/*66.80*/("""><\/script>');
	"""),format.raw/*67.2*/("""}"""),format.raw/*67.3*/(""" """),format.raw/*67.4*/("""else """),format.raw/*67.9*/("""{"""),format.raw/*67.10*/("""
	"""),format.raw/*68.2*/("""document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/("""

    """),format.raw/*71.5*/("""</script>
    <script>
	if(!window.jQuery) """),format.raw/*73.21*/("""{"""),format.raw/*73.22*/("""
	"""),format.raw/*74.2*/("""if(!oldieCheck) """),format.raw/*74.18*/("""{"""),format.raw/*74.19*/("""
	  """),format.raw/*75.4*/("""document.write('<script src="""),_display_(/*75.33*/routes/*75.39*/.Assets.versioned("js/jquery-2.1.3.min.js")),format.raw/*75.82*/("""><\/script>');
	"""),format.raw/*76.2*/("""}"""),format.raw/*76.3*/(""" """),format.raw/*76.4*/("""else """),format.raw/*76.9*/("""{"""),format.raw/*76.10*/("""
	  """),format.raw/*77.4*/("""document.write('<script src="""),_display_(/*77.33*/routes/*77.39*/.Assets.versioned("js/libs/jquery-1.10.1.min.js")),format.raw/*77.88*/("""><\/script>');
	"""),format.raw/*78.2*/("""}"""),format.raw/*78.3*/("""
	"""),format.raw/*79.2*/("""}"""),format.raw/*79.3*/("""

    """),format.raw/*81.5*/("""</script>

    <script src="""),_display_(/*83.18*/routes/*83.24*/.Assets.versioned("js/jquery-ui.min.js")),format.raw/*83.64*/("""></script>
    <script src="""),_display_(/*84.18*/routes/*84.24*/.Assets.versioned("js/libs/modernizr-2.6.2.min.js")),format.raw/*84.75*/("""></script>
    <script src="""),_display_(/*85.18*/routes/*85.24*/.Assets.versioned("js/jquery.dataTables.min.js")),format.raw/*85.72*/("""></script>
    <script src="""),_display_(/*86.18*/routes/*86.24*/.Assets.versioned("js/dataTables.responsive.js")),format.raw/*86.72*/("""></script>
    <script src="""),_display_(/*87.18*/routes/*87.24*/.Assets.versioned("javascripts/application.js")),format.raw/*87.71*/("""></script>
    <script>
		var config = """),format.raw/*89.16*/("""{"""),format.raw/*89.17*/("""
			"""),format.raw/*90.4*/("""environment: '"""),_display_(/*90.19*/play/*90.23*/.Play.application().configuration().getString("Evomatik.Logger.js")),format.raw/*90.90*/("""',
		"""),format.raw/*91.3*/("""}"""),format.raw/*91.4*/("""

    """),format.raw/*93.5*/("""</script>
    <script src="""),_display_(/*94.18*/routes/*94.24*/.Assets.versioned("js/utilerias.js")),format.raw/*94.60*/("""></script>
</head>

<style>
    .btn,.drawer """),format.raw/*98.18*/("""{"""),format.raw/*98.19*/(""" """),format.raw/*98.20*/("""margin-bottom:10px; """),format.raw/*98.40*/("""}"""),format.raw/*98.41*/("""
    """),format.raw/*99.5*/(""".drawer """),format.raw/*99.13*/("""{"""),format.raw/*99.14*/(""" """),format.raw/*99.15*/("""text-align: center; """),format.raw/*99.35*/("""}"""),format.raw/*99.36*/("""
    """),format.raw/*100.5*/("""h1.lead """),format.raw/*100.13*/("""{"""),format.raw/*100.14*/(""" """),format.raw/*100.15*/("""border-bottom: 1px dotted #ccc; margin-bottom: 30px; """),format.raw/*100.68*/("""}"""),format.raw/*100.69*/("""
    """),format.raw/*101.5*/("""h4.lead """),format.raw/*101.13*/("""{"""),format.raw/*101.14*/(""" """),format.raw/*101.15*/("""margin-bottom:10px; """),format.raw/*101.35*/("""}"""),format.raw/*101.36*/("""
    """),format.raw/*102.5*/("""#icon_map ul li """),format.raw/*102.21*/("""{"""),format.raw/*102.22*/(""" """),format.raw/*102.23*/("""font-size: 16px; """),format.raw/*102.40*/("""}"""),format.raw/*102.41*/("""
    """),format.raw/*103.5*/(""".smallify """),format.raw/*103.15*/("""{"""),format.raw/*103.16*/(""" """),format.raw/*103.17*/("""font-size: 13px; """),format.raw/*103.34*/("""}"""),format.raw/*103.35*/("""
    """),format.raw/*104.5*/(""".modal h2, .modal .btn """),format.raw/*104.28*/("""{"""),format.raw/*104.29*/(""" """),format.raw/*104.30*/("""margin: 5% 0 20px; """),format.raw/*104.49*/("""}"""),format.raw/*104.50*/("""
    """),format.raw/*105.5*/(""".ttip.example """),format.raw/*105.19*/("""{"""),format.raw/*105.20*/(""" """),format.raw/*105.21*/("""float: left; background: #eee; border: 1px dotted #ccc; padding: 20px; """),format.raw/*105.92*/("""}"""),format.raw/*105.93*/("""
"""),format.raw/*106.1*/("""</style>


<body>
<div id="st-container" class="st-container">
    <nav class="st-menu st-effect-4" id="menu-4">
        <a href="/"><h2 class="ion-ios-home">&emsp;Menú</h2></a>

        <ul id="contentScroll">

            <li class="has-drop">
                <a class="icon icon-world" href="#">Modulos <i class="icon ion-ios-arrow-forward"/></i></a>
                <ul class="drop">
                    <li><a href="/estado">Estados</a></li>
                    <li><a href="/municipio">Municipios</a></li>
                </ul>
            </li>
        </ul>

        <div class="evoLogo">
            <a href="http://evomatik.com">
                <img src="""),_display_(/*127.27*/routes/*127.33*/.Assets.versioned("images/Logo.png")),format.raw/*127.69*/(""" """),format.raw/*127.70*/("""alt="" style="max-width:200px;"/>
            </a>
        </div>
    </nav>


    <div class="st-pusher">
        <div class="st-content"><!-- this is the wrapper for the content -->
            <div class="st-content-inner">
                <div class="navcontain">

                    <div class="navbar" id="nav" gumby-fixed="top">
                        <div class="row">
                            <div id="st-trigger-effects" class="one columns nav-icon-container">
                                <button class="nav-icon size-32" data-effect="st-effect-4" style="color:#fff;"><i
                                        class="ion-navicon size-32"></i></button>
                            </div>
                            <div class="five columns text-left">
                                <h1 class="logo" style="margin-top:10px;">
                                    <a href="/">
                                        <img src="""),_display_(/*147.51*/routes/*147.57*/.Assets.versioned("images/logo_iavd_main.png")),format.raw/*147.103*/(""" """),format.raw/*147.104*/("""gumby-retina/>
                                        <!-- <img src="""),_display_(/*148.56*/routes/*148.62*/.Assets.versioned("images/Logo_white.png")),format.raw/*148.104*/(""" """),format.raw/*148.105*/("""gumby-retina /> -->
                                    </a>
                                </h1>
                            </div>


                            <div class="six columns text-right">
                                <div class="profile">
                                    <img src="""),_display_(/*156.47*/routes/*156.53*/.Assets.versioned("images/user.png")),format.raw/*156.89*/(""" """),format.raw/*156.90*/("""class="image circle"/>
                                    <a href="#" class="profileTrigger">"""),_display_(/*157.73*/session/*157.80*/.get("nameUser")),format.raw/*157.96*/(""" """),format.raw/*157.97*/("""&nbsp;<i
                                            class="icon ion-gear-a"></i></a>

                                    <div class="menu-profile">
                                        <div id="arrow"></div>
                                        <a href="#">Mi Perfil <i id="firstIcon" class="icon ion-person"></i></a>
                                        <a href="#">Configuración <i id="secondIcon" class="icon ion-gear-b"></i></a>
                                        <a href="#">Ayuda <i id="thirdIcon" class="icon ion-help"></i></a>
                                        <a href="#">Salir</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">

                    """),_display_(/*175.22*/content),format.raw/*175.29*/("""


                    """),format.raw/*178.21*/("""<div class="twelve columns text-center">
                        <p class="size-12">Instituto de Atención a Víctimas del Delito - Todos los derechos reservados
                            <a href="http://evomatik.com">Evomatik Software</a>
                        </p>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>

<!--
Include gumby.js followed by UI modules followed by gumby.init.js
Or concatenate and minify into a single file -->
<script gumby-touch="""),_display_(/*193.22*/routes/*193.28*/.Assets.versioned("js/libs")),format.raw/*193.56*/(""" """),format.raw/*193.57*/("""src="""),_display_(/*193.62*/routes/*193.68*/.Assets.versioned("js/libs/gumby.min.js")),format.raw/*193.109*/("""></script>
<script src="""),_display_(/*194.14*/routes/*194.20*/.Assets.versioned("js/libs/ui/jquery.validation.js")),format.raw/*194.72*/(""" """),format.raw/*194.73*/("""type="text/javascript"></script>
<!--
Google's recommended deferred loading of JS
gumby.min.js contains gumby.js, all UI modules and gumby.init.js

Note: If you opt to use this method of defered loading,
ensure that any javascript essential to the initial
display of the page is included separately in a normal
script tag.

<script type="text/javascript">
function downloadJSAtOnload() """),format.raw/*205.31*/("""{"""),format.raw/*205.32*/("""
"""),format.raw/*206.1*/("""var element = document.createElement("script");
element.src = "js/libs/gumby.min.js";
document.body.appendChild(element);
"""),format.raw/*209.1*/("""}"""),format.raw/*209.2*/("""
"""),format.raw/*210.1*/("""if (window.addEventListener)
window.addEventListener("load", downloadJSAtOnload, false);
else if (window.attachEvent)
window.attachEvent("onload", downloadJSAtOnload);
else window.onload = downloadJSAtOnload;
</script> -->
<script src="""),_display_(/*216.14*/routes/*216.20*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*216.61*/("""></script>
<script src="""),_display_(/*217.14*/routes/*217.20*/.Assets.versioned("js/modernizr.custom.js")),format.raw/*217.63*/("""></script>
<script src="""),_display_(/*218.14*/routes/*218.20*/.Assets.versioned("js/plugins.js")),format.raw/*218.54*/("""></script>
<script src="""),_display_(/*219.14*/routes/*219.20*/.Assets.versioned("js/main.js")),format.raw/*219.51*/("""></script>
<script src="""),_display_(/*220.14*/routes/*220.20*/.Assets.versioned("js/classie.js")),format.raw/*220.54*/("""></script>
<script src="""),_display_(/*221.14*/routes/*221.20*/.Assets.versioned("js/sidebarEffects.js")),format.raw/*221.61*/("""></script>
<script src="""),_display_(/*222.14*/routes/*222.20*/.Assets.versioned("js/resetForm.js")),format.raw/*222.56*/("""></script>
<script src="""),_display_(/*223.14*/routes/*223.20*/.Assets.versioned("js/tabs-responsive.js")),format.raw/*223.62*/("""></script>
<script src="""),_display_(/*224.14*/routes/*224.20*/.Assets.versioned("js/modernizr.js")),format.raw/*224.56*/("""></script>

<script src="""),_display_(/*226.14*/routes/*226.20*/.Assets.versioned("js/jquery.slimscroll.min.js")),format.raw/*226.68*/("""></script>
<script src="""),_display_(/*227.14*/routes/*227.20*/.Assets.versioned("javascripts/main/mainLayoutController.js")),format.raw/*227.81*/("""></script>
<script src="""),_display_(/*228.14*/routes/*228.20*/.Assets.versioned("js/jquery.cookie.js")),format.raw/*228.60*/(""" """),format.raw/*228.61*/("""type="text/javascript"></script>
<script src="""),_display_(/*229.14*/routes/*229.20*/.Assets.versioned("js/picker.js")),format.raw/*229.53*/(""" """),format.raw/*229.54*/("""type="text/javascript"></script>
<script src="""),_display_(/*230.14*/routes/*230.20*/.Assets.versioned("js/picker.date.js")),format.raw/*230.58*/(""" """),format.raw/*230.59*/("""type="text/javascript"></script>
<script src="""),_display_(/*231.14*/routes/*231.20*/.Assets.versioned("js/jquery.inputmask.js")),format.raw/*231.63*/(""" """),format.raw/*231.64*/("""type="text/javascript"></script>
<script src="""),_display_(/*232.14*/routes/*232.20*/.Assets.versioned("js/jquery.maskMoney.js")),format.raw/*232.63*/(""" """),format.raw/*232.64*/("""type="text/javascript"></script>
<script src="""),_display_(/*233.14*/routes/*233.20*/.Assets.versioned("js/jquery.inputmask.date.extensions.js")),format.raw/*233.79*/(""" """),format.raw/*233.80*/("""type="text/javascript"></script>
<script src="""),_display_(/*234.14*/routes/*234.20*/.Assets.versioned("js/jquery.tokeninput.js")),format.raw/*234.64*/(""" """),format.raw/*234.65*/("""type="text/javascript"></script>

<script>
	$(document).ready(function() """),format.raw/*237.31*/("""{"""),format.raw/*237.32*/("""
		"""),format.raw/*238.3*/("""$.extend( $.fn.dataTable.defaults, """),format.raw/*238.38*/("""{"""),format.raw/*238.39*/("""
			"""),format.raw/*239.4*/(""""lengthMenu": [ [5 ,10, 25, 50, -1], [5 ,10, 25, 50, "Todos"] ],
			"pageLength": 5,
		    "language": """),format.raw/*241.19*/("""{"""),format.raw/*241.20*/("""
	            """),format.raw/*242.14*/(""""lengthMenu": "Mostrando _MENU_ registros por página",
	            "ZeroRecords": "No se encontraron registros - Lo Sentimos.",
	            "info": "Mostrando página _PAGE_ de _PAGES_",
	            "infoEmpty": "No hay registros disponibles",
	            "emptyTable": "No hay registros disponibles",
	            "search":       	"Buscar: ",
	            "infoFiltered": "(Filtrado:  de _MAX_ total de registros),
	            "paginate": """),format.raw/*249.26*/("""{"""),format.raw/*249.27*/("""
					"""),format.raw/*250.6*/(""""first":    	"Primero",
					"previous": 	"Anterior",
					"next":     	"Siguiente",
					"last":     	"Último"
				"""),format.raw/*254.5*/("""}"""),format.raw/*254.6*/(""",
	        """),format.raw/*255.10*/("""}"""),format.raw/*255.11*/("""
		"""),format.raw/*256.3*/("""}"""),format.raw/*256.4*/(""");

		$.fn.dataTable.Responsive.breakpoints = [
			    """),format.raw/*259.8*/("""{"""),format.raw/*259.9*/(""" """),format.raw/*259.10*/("""name: 'desktop', width: Infinity """),format.raw/*259.43*/("""}"""),format.raw/*259.44*/(""",
			    """),format.raw/*260.8*/("""{"""),format.raw/*260.9*/(""" """),format.raw/*260.10*/("""name: 'tablet',  width: 1024 """),format.raw/*260.39*/("""}"""),format.raw/*260.40*/(""",
			    """),format.raw/*261.8*/("""{"""),format.raw/*261.9*/(""" """),format.raw/*261.10*/("""name: 'fablet',  width: 768 """),format.raw/*261.38*/("""}"""),format.raw/*261.39*/(""",
			    """),format.raw/*262.8*/("""{"""),format.raw/*262.9*/(""" """),format.raw/*262.10*/("""name: 'phone',   width: 480 """),format.raw/*262.38*/("""}"""),format.raw/*262.39*/(""",
			    """),format.raw/*263.8*/("""{"""),format.raw/*263.9*/(""" """),format.raw/*263.10*/("""name: 'oldPhone',   width: 410 """),format.raw/*263.41*/("""}"""),format.raw/*263.42*/("""
			"""),format.raw/*264.4*/("""];

		$('.pickadate').pickadate("""),format.raw/*266.29*/("""{"""),format.raw/*266.30*/("""
	        """),format.raw/*267.10*/("""monthsFull    : [ 'enero', 'febrero', 'marzo', 'abril', 'mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre', 'diciembre' ],
	        monthsShort   : [ 'ene', 'feb', 'mar', 'abr', 'may', 'jun', 'jul', 'ago', 'sep', 'oct', 'nov', 'dic' ],
	        weekdaysFull  : [ 'domingo', 'lunes', 'martes', 'miércoles', 'jueves', 'viernes', 'sábado' ],
	        weekdaysShort : [ 'dom', 'lun', 'mar', 'mié', 'jue', 'vie', 'sáb' ],
	        today         : 'hoy',
	        clear         : 'borrar',
	        firstDay      : 1,
	        format        : 'dddd d !de mmmm !de yyyy',
	        formatSubmit  : 'dd/mm/yyyy',
	        hiddenSuffix  : '_submit',
	        hiddenName    : true
	    """),format.raw/*278.6*/("""}"""),format.raw/*278.7*/(""");

    	$('.time').inputmask( 'h:s' );
	"""),format.raw/*281.2*/("""}"""),format.raw/*281.3*/(""");

</script>

</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object mainLayout extends mainLayout_Scope0.mainLayout
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 10:26:08 CDT 2015
                  SOURCE: C:/Proyectos/Play_Framework/Proyectos/tickets/app/views/mainLayout.scala.html
                  HASH: 549ef7aa076e59829a5735f4a1594a459381f696
                  MATRIX: 760->1|987->31|1015->140|1043->142|1877->949|1903->954|2108->1132|2123->1138|2180->1174|2209->1175|2950->1889|2965->1895|3020->1929|3083->1965|3098->1971|3153->2005|3216->2041|3231->2047|3284->2079|3313->2080|3390->2130|3405->2136|3462->2172|3525->2208|3540->2214|3595->2248|3658->2284|3673->2290|3733->2329|3796->2365|3811->2371|3878->2417|3941->2453|3956->2459|4027->2509|4090->2545|4105->2551|4165->2590|4228->2626|4243->2632|4300->2668|4363->2704|4378->2710|4440->2751|4503->2787|4518->2793|4579->2833|4625->2852|4640->2858|4698->2895|4727->2896|4806->2948|4821->2954|4884->2996|4913->2997|5258->3314|5287->3315|5317->3318|5373->3347|5388->3353|5452->3396|5496->3413|5524->3414|5552->3415|5584->3420|5613->3421|5643->3424|5782->3536|5810->3537|5845->3545|5918->3590|5947->3591|5977->3594|6021->3610|6050->3611|6082->3616|6138->3645|6153->3651|6217->3694|6261->3711|6289->3712|6317->3713|6349->3718|6378->3719|6410->3724|6466->3753|6481->3759|6551->3808|6595->3825|6623->3826|6653->3829|6681->3830|6716->3838|6773->3868|6788->3874|6849->3914|6905->3943|6920->3949|6992->4000|7048->4029|7063->4035|7132->4083|7188->4112|7203->4118|7272->4166|7328->4195|7343->4201|7411->4248|7480->4289|7509->4290|7541->4295|7583->4310|7596->4314|7684->4381|7717->4387|7745->4388|7780->4396|7835->4424|7850->4430|7907->4466|7984->4515|8013->4516|8042->4517|8090->4537|8119->4538|8152->4544|8188->4552|8217->4553|8246->4554|8294->4574|8323->4575|8357->4581|8394->4589|8424->4590|8454->4591|8536->4644|8566->4645|8600->4651|8637->4659|8667->4660|8697->4661|8746->4681|8776->4682|8810->4688|8855->4704|8885->4705|8915->4706|8961->4723|8991->4724|9025->4730|9064->4740|9094->4741|9124->4742|9170->4759|9200->4760|9234->4766|9286->4789|9316->4790|9346->4791|9394->4810|9424->4811|9458->4817|9501->4831|9531->4832|9561->4833|9661->4904|9691->4905|9721->4907|10436->5594|10452->5600|10510->5636|10540->5637|11534->6603|11550->6609|11619->6655|11650->6656|11749->6727|11765->6733|11830->6775|11861->6776|12198->7085|12214->7091|12272->7127|12302->7128|12426->7224|12443->7231|12481->7247|12511->7248|13425->8134|13454->8141|13509->8167|14066->8696|14082->8702|14132->8730|14162->8731|14195->8736|14211->8742|14275->8783|14328->8808|14344->8814|14418->8866|14448->8867|14874->9264|14904->9265|14934->9267|15087->9392|15116->9393|15146->9395|15416->9637|15432->9643|15495->9684|15548->9709|15564->9715|15629->9758|15682->9783|15698->9789|15754->9823|15807->9848|15823->9854|15876->9885|15929->9910|15945->9916|16001->9950|16054->9975|16070->9981|16133->10022|16186->10047|16202->10053|16260->10089|16313->10114|16329->10120|16393->10162|16446->10187|16462->10193|16520->10229|16575->10256|16591->10262|16661->10310|16714->10335|16730->10341|16813->10402|16866->10427|16882->10433|16944->10473|16974->10474|17049->10521|17065->10527|17120->10560|17150->10561|17225->10608|17241->10614|17301->10652|17331->10653|17406->10700|17422->10706|17487->10749|17517->10750|17592->10797|17608->10803|17673->10846|17703->10847|17778->10894|17794->10900|17875->10959|17905->10960|17980->11007|17996->11013|18062->11057|18092->11058|18197->11134|18227->11135|18259->11139|18323->11174|18353->11175|18386->11180|18520->11285|18550->11286|18594->11301|19074->11752|19104->11753|19139->11760|19287->11880|19316->11881|19357->11893|19387->11894|19419->11898|19448->11899|19534->11957|19563->11958|19593->11959|19655->11992|19685->11993|19723->12003|19752->12004|19782->12005|19840->12034|19870->12035|19908->12045|19937->12046|19967->12047|20024->12075|20054->12076|20092->12086|20121->12087|20151->12088|20208->12116|20238->12117|20276->12127|20305->12128|20335->12129|20395->12160|20425->12161|20458->12166|20521->12200|20551->12201|20591->12212|21327->12920|21356->12921|21428->12965|21457->12966
                  LINES: 27->1|33->1|34->4|35->5|54->24|54->24|59->29|59->29|59->29|59->29|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|89->59|89->59|89->59|95->65|95->65|96->66|96->66|96->66|96->66|97->67|97->67|97->67|97->67|97->67|98->68|99->69|99->69|101->71|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|107->77|107->77|107->77|107->77|108->78|108->78|109->79|109->79|111->81|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|116->86|116->86|116->86|117->87|117->87|117->87|119->89|119->89|120->90|120->90|120->90|120->90|121->91|121->91|123->93|124->94|124->94|124->94|128->98|128->98|128->98|128->98|128->98|129->99|129->99|129->99|129->99|129->99|129->99|130->100|130->100|130->100|130->100|130->100|130->100|131->101|131->101|131->101|131->101|131->101|131->101|132->102|132->102|132->102|132->102|132->102|132->102|133->103|133->103|133->103|133->103|133->103|133->103|134->104|134->104|134->104|134->104|134->104|134->104|135->105|135->105|135->105|135->105|135->105|135->105|136->106|157->127|157->127|157->127|157->127|177->147|177->147|177->147|177->147|178->148|178->148|178->148|178->148|186->156|186->156|186->156|186->156|187->157|187->157|187->157|187->157|205->175|205->175|208->178|223->193|223->193|223->193|223->193|223->193|223->193|223->193|224->194|224->194|224->194|224->194|235->205|235->205|236->206|239->209|239->209|240->210|246->216|246->216|246->216|247->217|247->217|247->217|248->218|248->218|248->218|249->219|249->219|249->219|250->220|250->220|250->220|251->221|251->221|251->221|252->222|252->222|252->222|253->223|253->223|253->223|254->224|254->224|254->224|256->226|256->226|256->226|257->227|257->227|257->227|258->228|258->228|258->228|258->228|259->229|259->229|259->229|259->229|260->230|260->230|260->230|260->230|261->231|261->231|261->231|261->231|262->232|262->232|262->232|262->232|263->233|263->233|263->233|263->233|264->234|264->234|264->234|264->234|267->237|267->237|268->238|268->238|268->238|269->239|271->241|271->241|272->242|279->249|279->249|280->250|284->254|284->254|285->255|285->255|286->256|286->256|289->259|289->259|289->259|289->259|289->259|290->260|290->260|290->260|290->260|290->260|291->261|291->261|291->261|291->261|291->261|292->262|292->262|292->262|292->262|292->262|293->263|293->263|293->263|293->263|293->263|294->264|296->266|296->266|297->267|308->278|308->278|311->281|311->281
                  -- GENERATED --
              */
          