
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

class loginLayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!doctype html>
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

	<title>Sistema de Manifestaciones</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="humans.txt">

	<link rel="shortcut icon" href=""""),_display_(/*21.35*/routes/*21.41*/.Assets.versioned("favicon.png")),format.raw/*21.73*/("""" type="image/x-icon" />

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
	<link rel="stylesheet" href=""""),_display_(/*38.32*/routes/*38.38*/.Assets.versioned("css/gumby.css")),format.raw/*38.72*/("""">
	<!-- <link rel="stylesheet" href="css/style.css"> -->
	<link rel="stylesheet" href=""""),_display_(/*40.32*/routes/*40.38*/.Assets.versioned("css/rev.css")),format.raw/*40.70*/("""" media="screen">
	<link rel="stylesheet" href=""""),_display_(/*41.32*/routes/*41.38*/.Assets.versioned("css/sidebar.css")),format.raw/*41.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*42.32*/routes/*42.38*/.Assets.versioned("css/icons.css")),format.raw/*42.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*43.32*/routes/*43.38*/.Assets.versioned("css/jquery.dataTables.css")),format.raw/*43.84*/("""">
	<link href=""""),_display_(/*44.15*/routes/*44.21*/.Assets.versioned("css/ionicons.css")),format.raw/*44.58*/("""" rel="stylesheet" type="text/css" />
	
	<!-- Grab Google CDN's jQuery, fall back to local if offline -->
	<!-- 2.0 for modern browsers, 1.10 for .oldie -->
	<script type="text/javascript">
	var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className.match(/\soldie\s/g));
	if(!oldieCheck) """),format.raw/*50.18*/("""{"""),format.raw/*50.19*/("""
	"""),format.raw/*51.2*/("""document.write('<script src=""""),_display_(/*51.32*/routes/*51.38*/.Assets.versioned("js/jquery-2.0.2.min.js")),format.raw/*51.81*/(""""><\/script>');
	"""),format.raw/*52.2*/("""}"""),format.raw/*52.3*/(""" """),format.raw/*52.4*/("""else """),format.raw/*52.9*/("""{"""),format.raw/*52.10*/("""
	"""),format.raw/*53.2*/("""document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/("""
	"""),format.raw/*55.2*/("""</script>
	<script>
	if(!window.jQuery) """),format.raw/*57.21*/("""{"""),format.raw/*57.22*/("""
	"""),format.raw/*58.2*/("""if(!oldieCheck) """),format.raw/*58.18*/("""{"""),format.raw/*58.19*/("""
	  """),format.raw/*59.4*/("""document.write('<script src=""""),_display_(/*59.34*/routes/*59.40*/.Assets.versioned("js/jquery-2.1.3.min.js")),format.raw/*59.83*/(""""><\/script>');
	"""),format.raw/*60.2*/("""}"""),format.raw/*60.3*/(""" """),format.raw/*60.4*/("""else """),format.raw/*60.9*/("""{"""),format.raw/*60.10*/("""
	  """),format.raw/*61.4*/("""document.write('<script src=""""),_display_(/*61.34*/routes/*61.40*/.Assets.versioned("js/libs/jquery-1.10.1.min.js")),format.raw/*61.89*/(""""><\/script>');
	"""),format.raw/*62.2*/("""}"""),format.raw/*62.3*/("""
	"""),format.raw/*63.2*/("""}"""),format.raw/*63.3*/("""
	"""),format.raw/*64.2*/("""</script>
	<script src=""""),_display_(/*65.16*/routes/*65.22*/.Assets.versioned("js/libs/modernizr-2.6.2.min.js")),format.raw/*65.73*/(""""></script>
</head>

<style>
	.btn,.drawer """),format.raw/*69.15*/("""{"""),format.raw/*69.16*/(""" """),format.raw/*69.17*/("""margin-bottom:10px; """),format.raw/*69.37*/("""}"""),format.raw/*69.38*/("""
	"""),format.raw/*70.2*/(""".drawer """),format.raw/*70.10*/("""{"""),format.raw/*70.11*/(""" """),format.raw/*70.12*/("""text-align: center; """),format.raw/*70.32*/("""}"""),format.raw/*70.33*/("""
	"""),format.raw/*71.2*/("""h1.lead """),format.raw/*71.10*/("""{"""),format.raw/*71.11*/(""" """),format.raw/*71.12*/("""border-bottom: 1px dotted #ccc; margin-bottom: 30px; """),format.raw/*71.65*/("""}"""),format.raw/*71.66*/("""
	"""),format.raw/*72.2*/("""h4.lead """),format.raw/*72.10*/("""{"""),format.raw/*72.11*/(""" """),format.raw/*72.12*/("""margin-bottom:10px; """),format.raw/*72.32*/("""}"""),format.raw/*72.33*/("""
	"""),format.raw/*73.2*/("""#icon_map ul li """),format.raw/*73.18*/("""{"""),format.raw/*73.19*/(""" """),format.raw/*73.20*/("""font-size: 16px; """),format.raw/*73.37*/("""}"""),format.raw/*73.38*/("""
	"""),format.raw/*74.2*/(""".smallify """),format.raw/*74.12*/("""{"""),format.raw/*74.13*/(""" """),format.raw/*74.14*/("""font-size: 13px; """),format.raw/*74.31*/("""}"""),format.raw/*74.32*/("""
	"""),format.raw/*75.2*/(""".modal h2, .modal .btn """),format.raw/*75.25*/("""{"""),format.raw/*75.26*/(""" """),format.raw/*75.27*/("""margin: 5% 0 20px; """),format.raw/*75.46*/("""}"""),format.raw/*75.47*/("""
	"""),format.raw/*76.2*/(""".ttip.example """),format.raw/*76.16*/("""{"""),format.raw/*76.17*/(""" """),format.raw/*76.18*/("""float: left; background: #eee; border: 1px dotted #ccc; padding: 20px; """),format.raw/*76.89*/("""}"""),format.raw/*76.90*/("""
"""),format.raw/*77.1*/("""</style>

<body>

	"""),_display_(/*81.3*/content),format.raw/*81.10*/("""

	"""),format.raw/*83.2*/("""<script src=""""),_display_(/*83.16*/routes/*83.22*/.Assets.versioned("js/login.js")),format.raw/*83.54*/(""""></script>
	<script src=""""),_display_(/*84.16*/routes/*84.22*/.Assets.versioned("js/resetForm.js")),format.raw/*84.58*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object loginLayout extends loginLayout_Scope0.loginLayout
              /*
                  -- GENERATED --
                  DATE: Wed Sep 09 11:39:46 CDT 2015
                  SOURCE: C:/Users/Wezkell Digital/Desktop/proyecto/app/views/loginLayout.scala.html
                  HASH: c51871cd3097c269755458264d9da9f7875c746a
                  MATRIX: 755->1|865->16|892->17|1884->982|1899->988|1952->1020|2640->1681|2655->1687|2710->1721|2826->1810|2841->1816|2894->1848|2970->1897|2985->1903|3042->1939|3103->1973|3118->1979|3173->2013|3234->2047|3249->2053|3316->2099|3360->2116|3375->2122|3433->2159|3767->2465|3796->2466|3825->2468|3882->2498|3897->2504|3961->2547|4005->2564|4033->2565|4061->2566|4093->2571|4122->2572|4151->2574|4289->2685|4317->2686|4346->2688|4414->2728|4443->2729|4472->2731|4516->2747|4545->2748|4576->2752|4633->2782|4648->2788|4712->2831|4756->2848|4784->2849|4812->2850|4844->2855|4873->2856|4904->2860|4961->2890|4976->2896|5046->2945|5090->2962|5118->2963|5147->2965|5175->2966|5204->2968|5256->2993|5271->2999|5343->3050|5414->3093|5443->3094|5472->3095|5520->3115|5549->3116|5578->3118|5614->3126|5643->3127|5672->3128|5720->3148|5749->3149|5778->3151|5814->3159|5843->3160|5872->3161|5953->3214|5982->3215|6011->3217|6047->3225|6076->3226|6105->3227|6153->3247|6182->3248|6211->3250|6255->3266|6284->3267|6313->3268|6358->3285|6387->3286|6416->3288|6454->3298|6483->3299|6512->3300|6557->3317|6586->3318|6615->3320|6666->3343|6695->3344|6724->3345|6771->3364|6800->3365|6829->3367|6871->3381|6900->3382|6929->3383|7028->3454|7057->3455|7085->3456|7131->3476|7159->3483|7189->3486|7230->3500|7245->3506|7298->3538|7352->3565|7367->3571|7424->3607
                  LINES: 27->1|32->1|33->2|52->21|52->21|52->21|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|84->53|85->54|85->54|86->55|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|94->63|94->63|95->64|96->65|96->65|96->65|100->69|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|108->77|112->81|112->81|114->83|114->83|114->83|114->83|115->84|115->84|115->84
                  -- GENERATED --
              */
          