
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

class mainLayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js ie6 oldie" lang="es"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7 oldie" lang="es"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 oldie" lang="es"> <![endif]-->
<!--[if IE 9]>    <html class="no-js ie9" lang="es"> <![endif]-->
<!-- Consider adding an manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 9]><!--> <html class="no-js" lang="en" itemscope itemtype="http://schema.org/Product"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<!-- Use the .htaccess and remove these lines to avoid edge case issues.
			 More info: h5bp.com/b/378 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title></title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="humans.txt">

	<link rel="shortcut icon" href=""""),_display_(/*22.35*/routes/*22.41*/.Assets.versioned("images/favicon.ico")),format.raw/*22.80*/("""" type="image/x-icon" />

	<!-- Facebook Metadata /-->
	<meta property="fb:page_id" content="" />
	<meta property="og:image" content="" />
	<meta property="og:description" content=""/>
	<meta property="og:title" content=""/>

	<!-- Google+ Metadata /-->
	<meta itemprop="name" content="">
	<meta itemprop="description" content="">
	<meta itemprop="image" content="">

	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1">

	<!-- We highly recommend you use SASS and write your custom styles in sass/_custom.scss.
		 However, there is a blank style.css in the css directory should you prefer -->
	<link rel="stylesheet" href=""""),_display_(/*39.32*/routes/*39.38*/.Assets.versioned("css/gumby.css")),format.raw/*39.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*40.32*/routes/*40.38*/.Assets.versioned("css/style.css")),format.raw/*40.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*41.32*/routes/*41.38*/.Assets.versioned("css/rev.css")),format.raw/*41.70*/("""" media="screen">
	<link rel="stylesheet" href=""""),_display_(/*42.32*/routes/*42.38*/.Assets.versioned("css/sidebar.css")),format.raw/*42.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*43.32*/routes/*43.38*/.Assets.versioned("css/icons.css")),format.raw/*43.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*44.32*/routes/*44.38*/.Assets.versioned("css/sweetalert.css")),format.raw/*44.77*/("""">
	<link rel="stylesheet" href=""""),_display_(/*45.32*/routes/*45.38*/.Assets.versioned("css/jquery.dataTables.css")),format.raw/*45.84*/("""">
	<link rel="stylesheet" href=""""),_display_(/*46.32*/routes/*46.38*/.Assets.versioned("css/dataTables.responsive.css")),format.raw/*46.88*/("""">
	<link rel="stylesheet" href=""""),_display_(/*47.32*/routes/*47.38*/.Assets.versioned("css/style-tabs.css")),format.raw/*47.77*/("""">
	<link rel="stylesheet" href=""""),_display_(/*48.32*/routes/*48.38*/.Assets.versioned("css/classic.css")),format.raw/*48.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*49.32*/routes/*49.38*/.Assets.versioned("css/classic.date.css")),format.raw/*49.79*/("""">
	<link rel="stylesheet" href=""""),_display_(/*50.32*/routes/*50.38*/.Assets.versioned("css/token-input.css")),format.raw/*50.78*/("""">
	<!--<link href=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("css/ionicons.css")),format.raw/*51.62*/("""" rel="stylesheet" type="text/css" />-->
	<link href=""""),_display_(/*52.15*/routes/*52.21*/.Assets.versioned("css/ionicons.css")),format.raw/*52.58*/("""" rel="stylesheet" type="text/css" />
	<link href=""""),_display_(/*53.15*/routes/*53.21*/.Assets.versioned("css/gridstack.min.css")),format.raw/*53.63*/("""" rel="stylesheet" type="text/css" />

	<!-- Grab Google CDN's jQuery, fall back to local if offline -->
	<!-- 2.0 for modern browsers, 1.10 for .oldie -->
	<script type="text/javascript">
	var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className.match(/\soldie\s/g));
	if(!oldieCheck) """),format.raw/*59.18*/("""{"""),format.raw/*59.19*/("""
	"""),format.raw/*60.2*/("""document.write('<script src=""""),_display_(/*60.32*/routes/*60.38*/.Assets.versioned("js/jquery-2.0.2.min.js")),format.raw/*60.81*/(""""><\/script>');
	"""),format.raw/*61.2*/("""}"""),format.raw/*61.3*/(""" """),format.raw/*61.4*/("""else """),format.raw/*61.9*/("""{"""),format.raw/*61.10*/("""
	"""),format.raw/*62.2*/("""document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
	"""),format.raw/*63.2*/("""}"""),format.raw/*63.3*/("""
	"""),format.raw/*64.2*/("""</script>
	<script>
	if(!window.jQuery) """),format.raw/*66.21*/("""{"""),format.raw/*66.22*/("""
	"""),format.raw/*67.2*/("""if(!oldieCheck) """),format.raw/*67.18*/("""{"""),format.raw/*67.19*/("""
	  """),format.raw/*68.4*/("""document.write('<script src=""""),_display_(/*68.34*/routes/*68.40*/.Assets.versioned("js/jquery-2.1.3.min.js")),format.raw/*68.83*/(""""><\/script>');
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/(""" """),format.raw/*69.4*/("""else """),format.raw/*69.9*/("""{"""),format.raw/*69.10*/("""
	  """),format.raw/*70.4*/("""document.write('<script src=""""),_display_(/*70.34*/routes/*70.40*/.Assets.versioned("js/libs/jquery-1.10.1.min.js")),format.raw/*70.89*/(""""><\/script>');
	"""),format.raw/*71.2*/("""}"""),format.raw/*71.3*/("""
	"""),format.raw/*72.2*/("""}"""),format.raw/*72.3*/("""
	"""),format.raw/*73.2*/("""</script>

	<script src=""""),_display_(/*75.16*/routes/*75.22*/.Assets.versioned("js/jquery-ui.min.js")),format.raw/*75.62*/(""""></script>
	<script src=""""),_display_(/*76.16*/routes/*76.22*/.Assets.versioned("js/libs/modernizr-2.6.2.min.js")),format.raw/*76.73*/(""""></script>
	<script src=""""),_display_(/*77.16*/routes/*77.22*/.Assets.versioned("js/jquery.dataTables.min.js")),format.raw/*77.70*/(""""></script>
	<script src=""""),_display_(/*78.16*/routes/*78.22*/.Assets.versioned("js/dataTables.responsive.js")),format.raw/*78.70*/(""""></script>
	<script src=""""),_display_(/*79.16*/routes/*79.22*/.Assets.versioned("javascripts/application.js")),format.raw/*79.69*/(""""></script>
	<script>
		var config = """),format.raw/*81.16*/("""{"""),format.raw/*81.17*/("""
			"""),format.raw/*82.4*/("""environment: '"""),_display_(/*82.19*/play/*82.23*/.Play.application().configuration().getString("Evomatik.Logger.js")),format.raw/*82.90*/("""',
		"""),format.raw/*83.3*/("""}"""),format.raw/*83.4*/("""
	"""),format.raw/*84.2*/("""</script>
	<script src=""""),_display_(/*85.16*/routes/*85.22*/.Assets.versioned("js/utilerias.js")),format.raw/*85.58*/(""""></script>
</head>

<style>
	.btn,.drawer """),format.raw/*89.15*/("""{"""),format.raw/*89.16*/(""" """),format.raw/*89.17*/("""margin-bottom:10px; """),format.raw/*89.37*/("""}"""),format.raw/*89.38*/("""
	"""),format.raw/*90.2*/(""".drawer """),format.raw/*90.10*/("""{"""),format.raw/*90.11*/(""" """),format.raw/*90.12*/("""text-align: center; """),format.raw/*90.32*/("""}"""),format.raw/*90.33*/("""
	"""),format.raw/*91.2*/("""h1.lead """),format.raw/*91.10*/("""{"""),format.raw/*91.11*/(""" """),format.raw/*91.12*/("""border-bottom: 1px dotted #ccc; margin-bottom: 30px; """),format.raw/*91.65*/("""}"""),format.raw/*91.66*/("""
	"""),format.raw/*92.2*/("""h4.lead """),format.raw/*92.10*/("""{"""),format.raw/*92.11*/(""" """),format.raw/*92.12*/("""margin-bottom:10px; """),format.raw/*92.32*/("""}"""),format.raw/*92.33*/("""
	"""),format.raw/*93.2*/("""#icon_map ul li """),format.raw/*93.18*/("""{"""),format.raw/*93.19*/(""" """),format.raw/*93.20*/("""font-size: 16px; """),format.raw/*93.37*/("""}"""),format.raw/*93.38*/("""
	"""),format.raw/*94.2*/(""".smallify """),format.raw/*94.12*/("""{"""),format.raw/*94.13*/(""" """),format.raw/*94.14*/("""font-size: 13px; """),format.raw/*94.31*/("""}"""),format.raw/*94.32*/("""
	"""),format.raw/*95.2*/(""".modal h2, .modal .btn """),format.raw/*95.25*/("""{"""),format.raw/*95.26*/(""" """),format.raw/*95.27*/("""margin: 5% 0 20px; """),format.raw/*95.46*/("""}"""),format.raw/*95.47*/("""
	"""),format.raw/*96.2*/(""".ttip.example """),format.raw/*96.16*/("""{"""),format.raw/*96.17*/(""" """),format.raw/*96.18*/("""float: left; background: #eee; border: 1px dotted #ccc; padding: 20px; """),format.raw/*96.89*/("""}"""),format.raw/*96.90*/("""
"""),format.raw/*97.1*/("""</style>


<body>
<div id="st-container" class="st-container">
	<nav class="st-menu st-effect-4" id="menu-4">
	<a href="/"><h2 class="ion-ios-home">&emsp;Menú</h2></a>

		<ul id="contentScroll">
			
			<li class="has-drop">
				<a class="icon icon-world" href="#">Modulos <i class="icon ion-ios-arrow-forward" /></i></a>
				<ul class="drop">
 					<li><a href=""""),_display_(/*110.21*/routes/*110.27*/.Departamentos.index),format.raw/*110.47*/("""">Paises</a></li>
				   	<li><a href=""""),_display_(/*111.23*/routes/*111.29*/.Empleados.index),format.raw/*111.45*/("""">Estados</a></li>
				   	<li><a href=""""),_display_(/*112.23*/routes/*112.29*/.Distritos.index()),format.raw/*112.47*/("""">Distritos</a></li>
				</ul>
			</li>
			
<!-- 
           
            
			"""),format.raw/*119.94*/("""
				"""),format.raw/*120.5*/("""<!-- <li class="has-drop">
					<a class="icon icon-lab" href="#">Investigaciones <i class="icon ion-ios-arrow-forward" /></i></a>
					<ul class="drop">
						<li><a class="icon ion-ios-medical" href="#">En Trámite</a></li>
						<li><a class="icon ion-ios-infinite" href="#">Concluídos</a></li>
						<li><a class="icon icon-data" href="#">Concluidos Por Convenio</a></li>
						<li><a class="icon icon-data" href="#">En Convenio/ Conciliación</a></li>
						<li><a class="icon icon-data" href="#">Por Atender</a></li>
						<li><a class="icon icon-data" href="#">Sspendido</a></li>
					</ul>
				</li> -->

				<!-- <li class="has-drop">
					<a class="icon icon-lab" href="#">Atención Temprana (Atención Ciudadana) <i class="icon ion-ios-arrow-forward" /></i></a>
					<ul class="drop">
						<li><a class="icon ion-ios-medical" href="#">Solicitud</a></li>
						<li><a class="icon ion-ios-infinite" href="#">Orientación</a></li>
						<li><a class="icon icon-data" href="#">Expedición de Constancias</a></li>
						<li><a class="icon icon-data" href="#">Crear Denuncia</a></li>
						<li><a class="icon icon-data" href="#">Mediación</a></li>
					</ul>
				</li>
				<li><a class="icon icon-photo" href="#">Atención Integral</a></li> -->
			"""),format.raw/*143.10*/("""
			"""),format.raw/*144.42*/("""
				"""),format.raw/*145.5*/("""<!-- <li><a class="icon icon-data" href="#">Apertura de la carpeta de investigación</a></li> -->
			"""),format.raw/*147.45*/("""
				"""),format.raw/*148.5*/("""<li class="has-drop">
					<a class="icon icon-data" href="#">Policias de Investigación <i class="icon ion-ios-arrow-forward" /></i></a>
					<ul class="drop">
				      <li>
				      	<a class="icon icon-data" href="#">Web Design</a>
				      </li>
				      <li><a class="icon icon-data" href="#">Web Development</a></li>
				      <li><a class="icon icon-data" href="#">Illustrations</a></li>
				    </ul>
				</li>
				<li class="has-drop">
					<a class="icon icon-location" href="#">Servicios Periciales <i class="icon ion-ios-arrow-forward" /></i></a>
					<ul class="drop">
				      <li>
				      	<a href="#">Web Design</a>
				      </li>
				      <li><a href="#">Web Development</a></li>
				      <li><a href="#">Illustrations</a></li>
				    </ul>
				</li>
				<li><a class="icon icon-photo" href="#">Administración de Testigos</a></li>
				<li><a class="icon icon-location" href="#">Entrevista Policial del grupo de investigación</a></li>
				<li><a class="icon icon-photo" href="#">Administración de Material Probatorio</a></li>
				<li><a class="icon icon-wallet" href="#">Diligencias Periciales</a></li>
			"""),format.raw/*172.9*/("""
				"""),format.raw/*173.5*/("""<!-- <li class="has-drop">
					<a class="icon icon-user" href="#">Denuncias <i class="icon ion-ios-arrow-forward" /></i></a>
					<ul class="drop">
				    	<li><a href="#">Denuncia Ciudadana</a></li>
				    	<li><a href="#">Consulta de Ministerios Públicos</a></li>
						<li><a href="#">Reporte de Personas desaparecidas</a></li>
						<li><a href="#">Directorio de Números de Emergencia</a></li>
						<li><a href="#">Reporte de Robo de Vehículos</a></li>
						<li><a href="#">Reporte de Extorsión</a></li>
				    </ul>
				</li> --> -->
				

		</ul>

		<div class="evoLogo">
			<a href="http://evomatik.com">
				<img src=""""),_display_(/*190.16*/routes/*190.22*/.Assets.versioned("images/Logo.png")),format.raw/*190.58*/("""" alt="" style="max-width:200px;" />
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
				<button class="nav-icon size-32" data-effect="st-effect-4" style="color:#fff;"><i class="ion-navicon size-32"></i></button class="nav-icon">
			</div>
			<div class="five columns text-left">
				<h1 class="logo" style="margin-top:10px;">
					<a href="/">
						<img src=""""),_display_(/*209.18*/routes/*209.24*/.Assets.versioned("images/logo_iavd_main.png")),format.raw/*209.70*/("""" gumby-retina />
						<!-- <img src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.versioned("images/Logo_white.png")),format.raw/*210.71*/("""" gumby-retina /> -->
					</a>
				</h1>
			</div>


			<div class="six columns text-right">
				<div class="profile">
					<img src=""""),_display_(/*218.17*/routes/*218.23*/.Assets.versioned("images/user.png")),format.raw/*218.59*/("""" class="image circle"/>
				 	<a href="#" class="profileTrigger"><i class="icon ion-gear-a"></i></a>
				 	<div class="menu-profile">
				 		<div id="arrow"></div>
				 		<a href="">Mi Perfil <i id="firstIcon" class="icon ion-person"></i></a>
				 		<a href="#">Configuración <i id="secondIcon" class="icon ion-gear-b"></i></a>
				 		<a href="#">Ayuda <i id="thirdIcon" class="icon ion-help"></i></a>
				 		
				 	</div>
				 </div>
			</div>
		</div>
	</div>
</div>

	<div class="row">

			"""),_display_(/*235.5*/index()),format.raw/*235.12*/("""


		"""),format.raw/*238.3*/("""<div class="twelve columns text-center">
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
	<script gumby-touch=""""),_display_(/*253.24*/routes/*253.30*/.Assets.versioned("js/libs")),format.raw/*253.58*/("""" src=""""),_display_(/*253.66*/routes/*253.72*/.Assets.versioned("js/libs/gumby.min.js")),format.raw/*253.113*/(""""></script>
	<script src=""""),_display_(/*254.16*/routes/*254.22*/.Assets.versioned("js/libs/ui/jquery.validation.js")),format.raw/*254.74*/("""" type="text/javascript"></script>
	<!--
	Google's recommended deferred loading of JS
	gumby.min.js contains gumby.js, all UI modules and gumby.init.js

	Note: If you opt to use this method of defered loading,
	ensure that any javascript essential to the initial
	display of the page is included separately in a normal
	script tag.

	<script type="text/javascript">
	function downloadJSAtOnload() """),format.raw/*265.32*/("""{"""),format.raw/*265.33*/("""
	"""),format.raw/*266.2*/("""var element = document.createElement("script");
	element.src = "js/libs/gumby.min.js";
	document.body.appendChild(element);
	"""),format.raw/*269.2*/("""}"""),format.raw/*269.3*/("""
	"""),format.raw/*270.2*/("""if (window.addEventListener)
	window.addEventListener("load", downloadJSAtOnload, false);
	else if (window.attachEvent)
	window.attachEvent("onload", downloadJSAtOnload);
	else window.onload = downloadJSAtOnload;
	</script> -->
	<script src=""""),_display_(/*276.16*/routes/*276.22*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*276.63*/(""""></script>
	<script src=""""),_display_(/*277.16*/routes/*277.22*/.Assets.versioned("js/modernizr.custom.js")),format.raw/*277.65*/(""""></script>
	<script src=""""),_display_(/*278.16*/routes/*278.22*/.Assets.versioned("js/plugins.js")),format.raw/*278.56*/(""""></script>
	<script src=""""),_display_(/*279.16*/routes/*279.22*/.Assets.versioned("js/main.js")),format.raw/*279.53*/(""""></script>
	<script src=""""),_display_(/*280.16*/routes/*280.22*/.Assets.versioned("js/classie.js")),format.raw/*280.56*/(""""></script>
	<script src=""""),_display_(/*281.16*/routes/*281.22*/.Assets.versioned("js/sidebarEffects.js")),format.raw/*281.63*/(""""></script>
	<script src=""""),_display_(/*282.16*/routes/*282.22*/.Assets.versioned("js/resetForm.js")),format.raw/*282.58*/(""""></script>
	<script src=""""),_display_(/*283.16*/routes/*283.22*/.Assets.versioned("js/tabs-responsive.js")),format.raw/*283.64*/(""""></script>
	<script src=""""),_display_(/*284.16*/routes/*284.22*/.Assets.versioned("js/modernizr.js")),format.raw/*284.58*/(""""></script>
	
	<script src=""""),_display_(/*286.16*/routes/*286.22*/.Assets.versioned("js/jquery.slimscroll.min.js")),format.raw/*286.70*/(""""></script>
	<script src=""""),_display_(/*287.16*/routes/*287.22*/.Assets.versioned("javascripts/main/mainLayoutController.js")),format.raw/*287.83*/(""""></script>
	<script src=""""),_display_(/*288.16*/routes/*288.22*/.Assets.versioned("js/jquery.cookie.js")),format.raw/*288.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*289.16*/routes/*289.22*/.Assets.versioned("js/picker.js")),format.raw/*289.55*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*290.16*/routes/*290.22*/.Assets.versioned("js/picker.date.js")),format.raw/*290.60*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*291.16*/routes/*291.22*/.Assets.versioned("js/jquery.inputmask.js")),format.raw/*291.65*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*292.16*/routes/*292.22*/.Assets.versioned("js/jquery.maskMoney.js")),format.raw/*292.65*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*293.16*/routes/*293.22*/.Assets.versioned("js/jquery.inputmask.date.extensions.js")),format.raw/*293.81*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*294.16*/routes/*294.22*/.Assets.versioned("js/jquery.tokeninput.js")),format.raw/*294.66*/("""" type="text/javascript"></script>

	<script>
	$(document).ready(function() """),format.raw/*297.31*/("""{"""),format.raw/*297.32*/("""
		"""),format.raw/*298.3*/("""$.extend( $.fn.dataTable.defaults, """),format.raw/*298.38*/("""{"""),format.raw/*298.39*/("""
			"""),format.raw/*299.4*/(""""lengthMenu": [ [5 ,10, 25, 50, -1], [5 ,10, 25, 50, "Todos"] ],
			"pageLength": 5,
		    "language": """),format.raw/*301.19*/("""{"""),format.raw/*301.20*/("""
	            """),format.raw/*302.14*/(""""lengthMenu": "Mostrando _MENU_ registros por página",
	            "ZeroRecords": "No se encontraron registros - Lo Sentimos.",
	            "info": "Mostrando página _PAGE_ de _PAGES_",
	            "infoEmpty": "No hay registros disponibles",
	            "emptyTable": "No hay registros disponibles",
	            "search":       	"Buscar: ",
	            "infoFiltered": "(Filtrado:  de _MAX_ total de registros)",
	            "paginate": """),format.raw/*309.26*/("""{"""),format.raw/*309.27*/("""
					"""),format.raw/*310.6*/(""""first":    	"Primero",
					"previous": 	"Anterior",
					"next":     	"Siguiente",
					"last":     	"Último"
				"""),format.raw/*314.5*/("""}"""),format.raw/*314.6*/(""",
	        """),format.raw/*315.10*/("""}"""),format.raw/*315.11*/("""
		"""),format.raw/*316.3*/("""}"""),format.raw/*316.4*/(""");

		$.fn.dataTable.Responsive.breakpoints = [
			    """),format.raw/*319.8*/("""{"""),format.raw/*319.9*/(""" """),format.raw/*319.10*/("""name: 'desktop', width: Infinity """),format.raw/*319.43*/("""}"""),format.raw/*319.44*/(""",
			    """),format.raw/*320.8*/("""{"""),format.raw/*320.9*/(""" """),format.raw/*320.10*/("""name: 'tablet',  width: 1024 """),format.raw/*320.39*/("""}"""),format.raw/*320.40*/(""",
			    """),format.raw/*321.8*/("""{"""),format.raw/*321.9*/(""" """),format.raw/*321.10*/("""name: 'fablet',  width: 768 """),format.raw/*321.38*/("""}"""),format.raw/*321.39*/(""",
			    """),format.raw/*322.8*/("""{"""),format.raw/*322.9*/(""" """),format.raw/*322.10*/("""name: 'phone',   width: 480 """),format.raw/*322.38*/("""}"""),format.raw/*322.39*/(""",
			    """),format.raw/*323.8*/("""{"""),format.raw/*323.9*/(""" """),format.raw/*323.10*/("""name: 'oldPhone',   width: 410 """),format.raw/*323.41*/("""}"""),format.raw/*323.42*/("""
			"""),format.raw/*324.4*/("""];

		$('.pickadate').pickadate("""),format.raw/*326.29*/("""{"""),format.raw/*326.30*/("""
	        """),format.raw/*327.10*/("""monthsFull    : [ 'enero', 'febrero', 'marzo', 'abril', 'mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre', 'diciembre' ],
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
	    """),format.raw/*338.6*/("""}"""),format.raw/*338.7*/(""");

    	$('.time').inputmask( 'h:s' );
	"""),format.raw/*341.2*/("""}"""),format.raw/*341.3*/(""");
	</script>

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
object mainLayout extends mainLayout_Scope0.mainLayout
              /*
                  -- GENERATED --
                  DATE: Thu Sep 10 11:00:47 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/mainLayout.scala.html
                  HASH: b8ed033863ebdc33bbfd140e9f798fe270efa17d
                  MATRIX: 837->4|1822->962|1837->968|1897->1007|2602->1685|2617->1691|2672->1725|2734->1760|2749->1766|2804->1800|2866->1835|2881->1841|2934->1873|3011->1923|3026->1929|3083->1965|3145->2000|3160->2006|3215->2040|3277->2075|3292->2081|3352->2120|3414->2155|3429->2161|3496->2207|3558->2242|3573->2248|3644->2298|3706->2333|3721->2339|3781->2378|3843->2413|3858->2419|3915->2455|3977->2490|3992->2496|4054->2537|4116->2572|4131->2578|4192->2618|4241->2640|4256->2646|4314->2683|4397->2739|4412->2745|4470->2782|4550->2835|4565->2841|4628->2883|4967->3194|4996->3195|5026->3198|5083->3228|5098->3234|5162->3277|5207->3295|5235->3296|5263->3297|5295->3302|5324->3303|5354->3306|5493->3418|5521->3419|5551->3422|5621->3464|5650->3465|5680->3468|5724->3484|5753->3485|5785->3490|5842->3520|5857->3526|5921->3569|5966->3587|5994->3588|6022->3589|6054->3594|6083->3595|6115->3600|6172->3630|6187->3636|6257->3685|6302->3703|6330->3704|6360->3707|6388->3708|6418->3711|6473->3739|6488->3745|6549->3785|6604->3813|6619->3819|6691->3870|6746->3898|6761->3904|6830->3952|6885->3980|6900->3986|6969->4034|7024->4062|7039->4068|7107->4115|7174->4154|7203->4155|7235->4160|7277->4175|7290->4179|7378->4246|7411->4252|7439->4253|7469->4256|7522->4282|7537->4288|7594->4324|7669->4371|7698->4372|7727->4373|7775->4393|7804->4394|7834->4397|7870->4405|7899->4406|7928->4407|7976->4427|8005->4428|8035->4431|8071->4439|8100->4440|8129->4441|8210->4494|8239->4495|8269->4498|8305->4506|8334->4507|8363->4508|8411->4528|8440->4529|8470->4532|8514->4548|8543->4549|8572->4550|8617->4567|8646->4568|8676->4571|8714->4581|8743->4582|8772->4583|8817->4600|8846->4601|8876->4604|8927->4627|8956->4628|8985->4629|9032->4648|9061->4649|9091->4652|9133->4666|9162->4667|9191->4668|9290->4739|9319->4740|9348->4742|9752->5118|9768->5124|9810->5144|9879->5185|9895->5191|9933->5207|10003->5249|10019->5255|10059->5273|10173->5448|10207->5454|11506->6730|11540->6773|11574->6779|11704->6930|11738->6936|12922->8097|12956->8103|13634->8753|13650->8759|13708->8795|14390->9449|14406->9455|14474->9501|14543->9542|14559->9548|14623->9590|14795->9734|14811->9740|14869->9776|15408->10288|15437->10295|15473->10303|15917->10719|15933->10725|15983->10753|16019->10761|16035->10767|16099->10808|16155->10836|16171->10842|16245->10894|16682->11302|16712->11303|16743->11306|16899->11434|16928->11435|16959->11438|17236->11687|17252->11693|17315->11734|17371->11762|17387->11768|17452->11811|17508->11839|17524->11845|17580->11879|17636->11907|17652->11913|17705->11944|17761->11972|17777->11978|17833->12012|17889->12040|17905->12046|17968->12087|18024->12115|18040->12121|18098->12157|18154->12185|18170->12191|18234->12233|18290->12261|18306->12267|18364->12303|18423->12334|18439->12340|18509->12388|18565->12416|18581->12422|18664->12483|18720->12511|18736->12517|18798->12557|18877->12608|18893->12614|18948->12647|19027->12698|19043->12704|19103->12742|19182->12793|19198->12799|19263->12842|19342->12893|19358->12899|19423->12942|19502->12993|19518->12999|19599->13058|19678->13109|19694->13115|19760->13159|19868->13238|19898->13239|19930->13243|19994->13278|20024->13279|20057->13284|20191->13389|20221->13390|20265->13405|20746->13857|20776->13858|20811->13865|20959->13985|20988->13986|21029->13998|21059->13999|21091->14003|21120->14004|21206->14062|21235->14063|21265->14064|21327->14097|21357->14098|21395->14108|21424->14109|21454->14110|21512->14139|21542->14140|21580->14150|21609->14151|21639->14152|21696->14180|21726->14181|21764->14191|21793->14192|21823->14193|21880->14221|21910->14222|21948->14232|21977->14233|22007->14234|22067->14265|22097->14266|22130->14271|22193->14305|22223->14306|22263->14317|22999->15025|23028->15026|23100->15070|23129->15071
                  LINES: 32->3|51->22|51->22|51->22|68->39|68->39|68->39|69->40|69->40|69->40|70->41|70->41|70->41|71->42|71->42|71->42|72->43|72->43|72->43|73->44|73->44|73->44|74->45|74->45|74->45|75->46|75->46|75->46|76->47|76->47|76->47|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|88->59|88->59|89->60|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|91->62|92->63|92->63|93->64|95->66|95->66|96->67|96->67|96->67|97->68|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|99->70|100->71|100->71|101->72|101->72|102->73|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|108->79|108->79|108->79|110->81|110->81|111->82|111->82|111->82|111->82|112->83|112->83|113->84|114->85|114->85|114->85|118->89|118->89|118->89|118->89|118->89|119->90|119->90|119->90|119->90|119->90|119->90|120->91|120->91|120->91|120->91|120->91|120->91|121->92|121->92|121->92|121->92|121->92|121->92|122->93|122->93|122->93|122->93|122->93|122->93|123->94|123->94|123->94|123->94|123->94|123->94|124->95|124->95|124->95|124->95|124->95|124->95|125->96|125->96|125->96|125->96|125->96|125->96|126->97|139->110|139->110|139->110|140->111|140->111|140->111|141->112|141->112|141->112|148->119|149->120|172->143|173->144|174->145|175->147|176->148|200->172|201->173|218->190|218->190|218->190|237->209|237->209|237->209|238->210|238->210|238->210|246->218|246->218|246->218|263->235|263->235|266->238|281->253|281->253|281->253|281->253|281->253|281->253|282->254|282->254|282->254|293->265|293->265|294->266|297->269|297->269|298->270|304->276|304->276|304->276|305->277|305->277|305->277|306->278|306->278|306->278|307->279|307->279|307->279|308->280|308->280|308->280|309->281|309->281|309->281|310->282|310->282|310->282|311->283|311->283|311->283|312->284|312->284|312->284|314->286|314->286|314->286|315->287|315->287|315->287|316->288|316->288|316->288|317->289|317->289|317->289|318->290|318->290|318->290|319->291|319->291|319->291|320->292|320->292|320->292|321->293|321->293|321->293|322->294|322->294|322->294|325->297|325->297|326->298|326->298|326->298|327->299|329->301|329->301|330->302|337->309|337->309|338->310|342->314|342->314|343->315|343->315|344->316|344->316|347->319|347->319|347->319|347->319|347->319|348->320|348->320|348->320|348->320|348->320|349->321|349->321|349->321|349->321|349->321|350->322|350->322|350->322|350->322|350->322|351->323|351->323|351->323|351->323|351->323|352->324|354->326|354->326|355->327|366->338|366->338|369->341|369->341
                  -- GENERATED --
              */
          