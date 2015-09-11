
package views.html

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


Seq[Any](format.raw/*1.5*/("""<!-- BREADCRUMB -->
    <ul class="breadcrumb">
        <li><a href="#"><i class="ion icon-home"></i> Inicio</a></li>
        <li><a href="#"></a></li>
    </ul>

    
    
    <div class="panel">


        
            
        
        <div class="row">
            <div class="twelve columns">
                <h3 style="text-align:center;"></h3>
                <div class="row">
                    <div class="six columns">
                         <div style="text-align:center;">
                            <div id="LogoMain" style="padding:20px; margin:15px auto;">
                                 <img src=""""),_display_(/*22.45*/routes/*22.51*/.Assets.versioned("images/Logo.png")),format.raw/*22.87*/("""" alt="" style="max-width:240px; width:100%; height:auto; ">
                            </div>
                            </div>
                    </div>
                    <div class="six columns">
                         <div style="text-align:center;">
                        <div id="LogoMain" style="padding:20px; margin:60px auto; vertical-align:middle;">
                            <img src=""""),_display_(/*29.40*/routes/*29.46*/.Assets.versioned("images/Logo.png")),format.raw/*29.82*/("""" alt="" style="max-width:340px; width:100%; height:auto; ">
                        </div>
                        </div>
                    </div>
                </div> 
            </div>
        </div>
        
            
        
    </div>

    <table style="border:none;">
    <tr>
    <td width="40%" style="border:none;">
    <hr style="border:1px solid #900">
    </td>
    <td width="20%" style="border:none;">
    <img src=""""),_display_(/*47.16*/routes/*47.22*/.Assets.versioned("images/Logo.png")),format.raw/*47.58*/("""" alt="">
    </td>
    <td width="40%" style="border:none;">
    <hr style="border:1px solid #900">
    </td>
    </tr>
    </table>






	





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
                  DATE: Thu Sep 10 19:18:17 CDT 2015
                  SOURCE: C:/Proyectos/play_framework/tickets/app/views/index.scala.html
                  HASH: 38d22e990bba16c1507cb53109e0f10c91c94cd6
                  MATRIX: 827->4|1495->645|1510->651|1567->687|2009->1102|2024->1108|2081->1144|2567->1603|2582->1609|2639->1645
                  LINES: 32->1|53->22|53->22|53->22|60->29|60->29|60->29|78->47|78->47|78->47
                  -- GENERATED --
              */
          