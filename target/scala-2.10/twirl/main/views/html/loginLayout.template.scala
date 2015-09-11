
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginLayout_Scope0 {
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

class loginLayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*4.1*/("""<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js ie6 oldie" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7 oldie" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 oldie" lang="en"> <![endif]-->
<!--[if IE 9]>    <html class="no-js ie9" lang="en"> <![endif]-->
<!-- Consider adding an manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 9]><!--> <html class="no-js" lang="en" itemscope itemtype="http://schema.org/Product"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<!-- Use the .htaccess and remove these lines to avoid edge case issues.
			 More info: h5bp.com/b/378 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>"""),_display_(/*18.10*/title),format.raw/*18.15*/(""" """),format.raw/*18.16*/("""- Sistema de Manifestaciones</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="humans.txt">

	<link rel="shortcut icon" href="""),_display_(/*23.34*/routes/*23.40*/.Assets.versioned("favicon.png")),format.raw/*23.72*/(""" """),format.raw/*23.73*/("""type="image/x-icon" />

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
	<link rel="stylesheet" href="""),_display_(/*40.31*/routes/*40.37*/.Assets.versioned("css/gumby.css")),format.raw/*40.71*/(""">
	<!-- <link rel="stylesheet" href="css/style.css"> -->
	<link rel="stylesheet" href="""),_display_(/*42.31*/routes/*42.37*/.Assets.versioned("css/rev.css")),format.raw/*42.69*/(""" """),format.raw/*42.70*/("""media="screen">
	<link rel="stylesheet" href="""),_display_(/*43.31*/routes/*43.37*/.Assets.versioned("css/sidebar.css")),format.raw/*43.73*/(""">
	<link rel="stylesheet" href="""),_display_(/*44.31*/routes/*44.37*/.Assets.versioned("css/icons.css")),format.raw/*44.71*/(""">
	<link rel="stylesheet" href="""),_display_(/*45.31*/routes/*45.37*/.Assets.versioned("css/jquery.dataTables.css")),format.raw/*45.83*/(""">
	<link href="""),_display_(/*46.14*/routes/*46.20*/.Assets.versioned("css/ionicons.css")),format.raw/*46.57*/(""" """),format.raw/*46.58*/("""rel="stylesheet" type="text/css" />
	
	<!-- Grab Google CDN's jQuery, fall back to local if offline -->
	<!-- 2.0 for modern browsers, 1.10 for .oldie -->
	<script type="text/javascript">
	var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className.match(/\soldie\s/g));
	if(!oldieCheck) """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""
	"""),format.raw/*53.2*/("""document.write('<script src="""),_display_(/*53.31*/routes/*53.37*/.Assets.versioned("js/jquery-2.0.2.min.js")),format.raw/*53.80*/("""><\/script>');
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/(""" """),format.raw/*54.4*/("""else """),format.raw/*54.9*/("""{"""),format.raw/*54.10*/("""
	"""),format.raw/*55.2*/("""document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
	"""),format.raw/*56.2*/("""}"""),format.raw/*56.3*/("""
	"""),format.raw/*57.2*/("""</script>
	<script>
	if(!window.jQuery) """),format.raw/*59.21*/("""{"""),format.raw/*59.22*/("""
	"""),format.raw/*60.2*/("""if(!oldieCheck) """),format.raw/*60.18*/("""{"""),format.raw/*60.19*/("""
	  """),format.raw/*61.4*/("""document.write('<script src="""),_display_(/*61.33*/routes/*61.39*/.Assets.versioned("js/jquery-2.1.3.min.js")),format.raw/*61.82*/("""><\/script>');
	"""),format.raw/*62.2*/("""}"""),format.raw/*62.3*/(""" """),format.raw/*62.4*/("""else """),format.raw/*62.9*/("""{"""),format.raw/*62.10*/("""
	  """),format.raw/*63.4*/("""document.write('<script src="""),_display_(/*63.33*/routes/*63.39*/.Assets.versioned("js/libs/jquery-1.10.1.min.js")),format.raw/*63.88*/("""><\/script>');
	"""),format.raw/*64.2*/("""}"""),format.raw/*64.3*/("""
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/("""
	"""),format.raw/*66.2*/("""</script>
	<script src="""),_display_(/*67.15*/routes/*67.21*/.Assets.versioned("js/libs/modernizr-2.6.2.min.js")),format.raw/*67.72*/("""></script>
</head>

<style>
	.btn,.drawer """),format.raw/*71.15*/("""{"""),format.raw/*71.16*/(""" """),format.raw/*71.17*/("""margin-bottom:10px; """),format.raw/*71.37*/("""}"""),format.raw/*71.38*/("""
	"""),format.raw/*72.2*/(""".drawer """),format.raw/*72.10*/("""{"""),format.raw/*72.11*/(""" """),format.raw/*72.12*/("""text-align: center; """),format.raw/*72.32*/("""}"""),format.raw/*72.33*/("""
	"""),format.raw/*73.2*/("""h1.lead """),format.raw/*73.10*/("""{"""),format.raw/*73.11*/(""" """),format.raw/*73.12*/("""border-bottom: 1px dotted #ccc; margin-bottom: 30px; """),format.raw/*73.65*/("""}"""),format.raw/*73.66*/("""
	"""),format.raw/*74.2*/("""h4.lead """),format.raw/*74.10*/("""{"""),format.raw/*74.11*/(""" """),format.raw/*74.12*/("""margin-bottom:10px; """),format.raw/*74.32*/("""}"""),format.raw/*74.33*/("""
	"""),format.raw/*75.2*/("""#icon_map ul li """),format.raw/*75.18*/("""{"""),format.raw/*75.19*/(""" """),format.raw/*75.20*/("""font-size: 16px; """),format.raw/*75.37*/("""}"""),format.raw/*75.38*/("""
	"""),format.raw/*76.2*/(""".smallify """),format.raw/*76.12*/("""{"""),format.raw/*76.13*/(""" """),format.raw/*76.14*/("""font-size: 13px; """),format.raw/*76.31*/("""}"""),format.raw/*76.32*/("""
	"""),format.raw/*77.2*/(""".modal h2, .modal .btn """),format.raw/*77.25*/("""{"""),format.raw/*77.26*/(""" """),format.raw/*77.27*/("""margin: 5% 0 20px; """),format.raw/*77.46*/("""}"""),format.raw/*77.47*/("""
	"""),format.raw/*78.2*/(""".ttip.example """),format.raw/*78.16*/("""{"""),format.raw/*78.17*/(""" """),format.raw/*78.18*/("""float: left; background: #eee; border: 1px dotted #ccc; padding: 20px; """),format.raw/*78.89*/("""}"""),format.raw/*78.90*/("""
"""),format.raw/*79.1*/("""</style>

<body>

	"""),_display_(/*83.3*/content),format.raw/*83.10*/("""

	"""),format.raw/*85.2*/("""<script src="""),_display_(/*85.15*/routes/*85.21*/.Assets.versioned("js/resetForm.js")),format.raw/*85.57*/("""></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object loginLayout extends loginLayout_Scope0.loginLayout
              /*
                  -- GENERATED --
                  DATE: Thu Sep 10 19:18:18 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/loginLayout.scala.html
                  HASH: 5f243c3387a8321d98610473f2839e913d85f6d4
                  MATRIX: 762->1|989->31|1016->137|1819->913|1845->918|1874->919|2092->1110|2107->1116|2160->1148|2189->1149|2874->1807|2889->1813|2944->1847|3058->1934|3073->1940|3126->1972|3155->1973|3228->2019|3243->2025|3300->2061|3359->2093|3374->2099|3429->2133|3488->2165|3503->2171|3570->2217|3612->2232|3627->2238|3685->2275|3714->2276|4046->2580|4075->2581|4104->2583|4160->2612|4175->2618|4239->2661|4282->2677|4310->2678|4338->2679|4370->2684|4399->2685|4428->2687|4566->2798|4594->2799|4623->2801|4691->2841|4720->2842|4749->2844|4793->2860|4822->2861|4853->2865|4909->2894|4924->2900|4988->2943|5031->2959|5059->2960|5087->2961|5119->2966|5148->2967|5179->2971|5235->3000|5250->3006|5320->3055|5363->3071|5391->3072|5420->3074|5448->3075|5477->3077|5528->3101|5543->3107|5615->3158|5685->3200|5714->3201|5743->3202|5791->3222|5820->3223|5849->3225|5885->3233|5914->3234|5943->3235|5991->3255|6020->3256|6049->3258|6085->3266|6114->3267|6143->3268|6224->3321|6253->3322|6282->3324|6318->3332|6347->3333|6376->3334|6424->3354|6453->3355|6482->3357|6526->3373|6555->3374|6584->3375|6629->3392|6658->3393|6687->3395|6725->3405|6754->3406|6783->3407|6828->3424|6857->3425|6886->3427|6937->3450|6966->3451|6995->3452|7042->3471|7071->3472|7100->3474|7142->3488|7171->3489|7200->3490|7299->3561|7328->3562|7356->3563|7402->3583|7430->3590|7460->3593|7500->3606|7515->3612|7572->3648
                  LINES: 27->1|33->1|34->4|48->18|48->18|48->18|53->23|53->23|53->23|53->23|70->40|70->40|70->40|72->42|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|76->46|82->52|82->52|83->53|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|85->55|86->56|86->56|87->57|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|91->61|92->62|92->62|92->62|92->62|92->62|93->63|93->63|93->63|93->63|94->64|94->64|95->65|95->65|96->66|97->67|97->67|97->67|101->71|101->71|101->71|101->71|101->71|102->72|102->72|102->72|102->72|102->72|102->72|103->73|103->73|103->73|103->73|103->73|103->73|104->74|104->74|104->74|104->74|104->74|104->74|105->75|105->75|105->75|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|106->76|107->77|107->77|107->77|107->77|107->77|107->77|108->78|108->78|108->78|108->78|108->78|108->78|109->79|113->83|113->83|115->85|115->85|115->85|115->85
                  -- GENERATED --
              */
          