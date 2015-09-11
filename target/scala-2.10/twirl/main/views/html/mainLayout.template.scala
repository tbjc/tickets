
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
                  DATE: Thu Sep 10 19:18:20 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/mainLayout.scala.html
                  HASH: b7c64b04eabdcfef35efc6de89abb5a1b06fe1d2
                  MATRIX: 760->1|987->31|1014->137|1041->138|1856->926|1882->931|2082->1104|2097->1110|2154->1146|2183->1147|2907->1844|2922->1850|2977->1884|3039->1919|3054->1925|3109->1959|3171->1994|3186->2000|3239->2032|3268->2033|3344->2082|3359->2088|3416->2124|3478->2159|3493->2165|3548->2199|3610->2234|3625->2240|3685->2279|3747->2314|3762->2320|3829->2366|3891->2401|3906->2407|3977->2457|4039->2492|4054->2498|4114->2537|4176->2572|4191->2578|4248->2614|4310->2649|4325->2655|4387->2696|4449->2731|4464->2737|4525->2777|4570->2795|4585->2801|4643->2838|4672->2839|4750->2890|4765->2896|4828->2938|4857->2939|5196->3250|5225->3251|5254->3253|5310->3282|5325->3288|5389->3331|5432->3347|5460->3348|5488->3349|5520->3354|5549->3355|5578->3357|5716->3468|5744->3469|5777->3475|5848->3518|5877->3519|5906->3521|5950->3537|5979->3538|6010->3542|6066->3571|6081->3577|6145->3620|6188->3636|6216->3637|6244->3638|6276->3643|6305->3644|6336->3648|6392->3677|6407->3683|6477->3732|6520->3748|6548->3749|6577->3751|6605->3752|6638->3758|6693->3786|6708->3792|6769->3832|6824->3860|6839->3866|6911->3917|6966->3945|6981->3951|7050->3999|7105->4027|7120->4033|7189->4081|7244->4109|7259->4115|7327->4162|7394->4201|7423->4202|7454->4206|7496->4221|7509->4225|7597->4292|7629->4297|7657->4298|7690->4304|7744->4331|7759->4337|7816->4373|7889->4418|7918->4419|7947->4420|7995->4440|8024->4441|8056->4446|8092->4454|8121->4455|8150->4456|8198->4476|8227->4477|8260->4482|8297->4490|8327->4491|8357->4492|8439->4545|8469->4546|8502->4551|8539->4559|8569->4560|8599->4561|8648->4581|8678->4582|8711->4587|8756->4603|8786->4604|8816->4605|8862->4622|8892->4623|8925->4628|8964->4638|8994->4639|9024->4640|9070->4657|9100->4658|9133->4663|9185->4686|9215->4687|9245->4688|9293->4707|9323->4708|9356->4713|9399->4727|9429->4728|9459->4729|9559->4800|9589->4801|9618->4802|10312->5468|10328->5474|10386->5510|10416->5511|11390->6457|11406->6463|11475->6509|11506->6510|11604->6580|11620->6586|11685->6628|11716->6629|12045->6930|12061->6936|12119->6972|12149->6973|12272->7068|12289->7075|12327->7091|12357->7092|13253->7960|13282->7967|13334->7990|13876->8504|13892->8510|13942->8538|13972->8539|14005->8544|14021->8550|14085->8591|14137->8615|14153->8621|14227->8673|14257->8674|14672->9060|14702->9061|14731->9062|14881->9184|14910->9185|14939->9186|15203->9422|15219->9428|15282->9469|15334->9493|15350->9499|15415->9542|15467->9566|15483->9572|15539->9606|15591->9630|15607->9636|15660->9667|15712->9691|15728->9697|15784->9731|15836->9755|15852->9761|15915->9802|15967->9826|15983->9832|16041->9868|16093->9892|16109->9898|16173->9940|16225->9964|16241->9970|16299->10006|16352->10031|16368->10037|16438->10085|16490->10109|16506->10115|16589->10176|16641->10200|16657->10206|16719->10246|16749->10247|16823->10293|16839->10299|16894->10332|16924->10333|16998->10379|17014->10385|17074->10423|17104->10424|17178->10470|17194->10476|17259->10519|17289->10520|17363->10566|17379->10572|17444->10615|17474->10616|17548->10662|17564->10668|17645->10727|17675->10728|17749->10774|17765->10780|17831->10824|17861->10825|17963->10898|17993->10899|18024->10902|18088->10937|18118->10938|18150->10942|18282->11045|18312->11046|18355->11060|18828->11504|18858->11505|18892->11511|19036->11627|19065->11628|19105->11639|19135->11640|19166->11643|19195->11644|19278->11699|19307->11700|19337->11701|19399->11734|19429->11735|19466->11744|19495->11745|19525->11746|19583->11775|19613->11776|19650->11785|19679->11786|19709->11787|19766->11815|19796->11816|19833->11825|19862->11826|19892->11827|19949->11855|19979->11856|20016->11865|20045->11866|20075->11867|20135->11898|20165->11899|20197->11903|20258->11935|20288->11936|20327->11946|21052->12643|21081->12644|21150->12685|21179->12686
                  LINES: 27->1|33->1|34->4|35->5|54->24|54->24|59->29|59->29|59->29|59->29|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|89->59|89->59|89->59|95->65|95->65|96->66|96->66|96->66|96->66|97->67|97->67|97->67|97->67|97->67|98->68|99->69|99->69|101->71|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|107->77|107->77|107->77|107->77|108->78|108->78|109->79|109->79|111->81|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|116->86|116->86|116->86|117->87|117->87|117->87|119->89|119->89|120->90|120->90|120->90|120->90|121->91|121->91|123->93|124->94|124->94|124->94|128->98|128->98|128->98|128->98|128->98|129->99|129->99|129->99|129->99|129->99|129->99|130->100|130->100|130->100|130->100|130->100|130->100|131->101|131->101|131->101|131->101|131->101|131->101|132->102|132->102|132->102|132->102|132->102|132->102|133->103|133->103|133->103|133->103|133->103|133->103|134->104|134->104|134->104|134->104|134->104|134->104|135->105|135->105|135->105|135->105|135->105|135->105|136->106|157->127|157->127|157->127|157->127|177->147|177->147|177->147|177->147|178->148|178->148|178->148|178->148|186->156|186->156|186->156|186->156|187->157|187->157|187->157|187->157|205->175|205->175|208->178|223->193|223->193|223->193|223->193|223->193|223->193|223->193|224->194|224->194|224->194|224->194|235->205|235->205|236->206|239->209|239->209|240->210|246->216|246->216|246->216|247->217|247->217|247->217|248->218|248->218|248->218|249->219|249->219|249->219|250->220|250->220|250->220|251->221|251->221|251->221|252->222|252->222|252->222|253->223|253->223|253->223|254->224|254->224|254->224|256->226|256->226|256->226|257->227|257->227|257->227|258->228|258->228|258->228|258->228|259->229|259->229|259->229|259->229|260->230|260->230|260->230|260->230|261->231|261->231|261->231|261->231|262->232|262->232|262->232|262->232|263->233|263->233|263->233|263->233|264->234|264->234|264->234|264->234|267->237|267->237|268->238|268->238|268->238|269->239|271->241|271->241|272->242|279->249|279->249|280->250|284->254|284->254|285->255|285->255|286->256|286->256|289->259|289->259|289->259|289->259|289->259|290->260|290->260|290->260|290->260|290->260|291->261|291->261|291->261|291->261|291->261|292->262|292->262|292->262|292->262|292->262|293->263|293->263|293->263|293->263|293->263|294->264|296->266|296->266|297->267|308->278|308->278|311->281|311->281
                  -- GENERATED --
              */
          