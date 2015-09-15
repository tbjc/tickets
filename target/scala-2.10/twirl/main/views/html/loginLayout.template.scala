
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
                  DATE: Mon Sep 14 10:26:07 CDT 2015
                  SOURCE: C:/Proyectos/Play_Framework/Proyectos/tickets/app/views/loginLayout.scala.html
                  HASH: 7c92d99c05a7e35207e2025c80f07605174d8ff1
                  MATRIX: 762->1|989->31|1017->140|1834->930|1860->935|1889->936|2112->1132|2127->1138|2180->1170|2209->1171|2911->1846|2926->1852|2981->1886|3097->1975|3112->1981|3165->2013|3194->2014|3268->2061|3283->2067|3340->2103|3400->2136|3415->2142|3470->2176|3530->2209|3545->2215|3612->2261|3655->2277|3670->2283|3728->2320|3757->2321|4095->2631|4124->2632|4154->2635|4210->2664|4225->2670|4289->2713|4333->2730|4361->2731|4389->2732|4421->2737|4450->2738|4480->2741|4619->2853|4647->2854|4677->2857|4747->2899|4776->2900|4806->2903|4850->2919|4879->2920|4911->2925|4967->2954|4982->2960|5046->3003|5090->3020|5118->3021|5146->3022|5178->3027|5207->3028|5239->3033|5295->3062|5310->3068|5380->3117|5424->3134|5452->3135|5482->3138|5510->3139|5540->3142|5592->3167|5607->3173|5679->3224|5753->3270|5782->3271|5811->3272|5859->3292|5888->3293|5918->3296|5954->3304|5983->3305|6012->3306|6060->3326|6089->3327|6119->3330|6155->3338|6184->3339|6213->3340|6294->3393|6323->3394|6353->3397|6389->3405|6418->3406|6447->3407|6495->3427|6524->3428|6554->3431|6598->3447|6627->3448|6656->3449|6701->3466|6730->3467|6760->3470|6798->3480|6827->3481|6856->3482|6901->3499|6930->3500|6960->3503|7011->3526|7040->3527|7069->3528|7116->3547|7145->3548|7175->3551|7217->3565|7246->3566|7275->3567|7374->3638|7403->3639|7432->3641|7482->3665|7510->3672|7542->3677|7582->3690|7597->3696|7654->3732
                  LINES: 27->1|33->1|34->4|48->18|48->18|48->18|53->23|53->23|53->23|53->23|70->40|70->40|70->40|72->42|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|76->46|82->52|82->52|83->53|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|85->55|86->56|86->56|87->57|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|91->61|92->62|92->62|92->62|92->62|92->62|93->63|93->63|93->63|93->63|94->64|94->64|95->65|95->65|96->66|97->67|97->67|97->67|101->71|101->71|101->71|101->71|101->71|102->72|102->72|102->72|102->72|102->72|102->72|103->73|103->73|103->73|103->73|103->73|103->73|104->74|104->74|104->74|104->74|104->74|104->74|105->75|105->75|105->75|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|106->76|107->77|107->77|107->77|107->77|107->77|107->77|108->78|108->78|108->78|108->78|108->78|108->78|109->79|113->83|113->83|115->85|115->85|115->85|115->85
                  -- GENERATED --
              */
          