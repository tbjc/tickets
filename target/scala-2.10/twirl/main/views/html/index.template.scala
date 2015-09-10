
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
                                 <img src=""""),_display_(/*23.45*/routes/*23.51*/.Assets.versioned("images/Logo.png")),format.raw/*23.87*/("""" alt="" style="max-width:240px; width:100%; height:auto; ">
                            </div>
                            </div>
                    </div>
                    <div class="six columns">
                         <div style="text-align:center;">
                        <div id="LogoMain" style="padding:20px; margin:60px auto; vertical-align:middle;">
                            <img src=""""),_display_(/*30.40*/routes/*30.46*/.Assets.versioned("images/Logo.png")),format.raw/*30.82*/("""" alt="" style="max-width:340px; width:100%; height:auto; ">
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
    <img src=""""),_display_(/*48.16*/routes/*48.22*/.Assets.versioned("images/Logo.png")),format.raw/*48.58*/("""" alt="">
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
                  DATE: Wed Sep 09 10:14:45 CDT 2015
                  SOURCE: C:/Users/Wezkell Digital/Desktop/proyecto/app/views/index.scala.html
                  HASH: fdc00bae5c02f8fb182468b3d9ecb8c573d35c81
                  MATRIX: 827->4|1493->643|1508->649|1565->685|2000->1093|2015->1099|2072->1135|2540->1576|2555->1582|2612->1618
                  LINES: 32->1|54->23|54->23|54->23|61->30|61->30|61->30|79->48|79->48|79->48
                  -- GENERATED --
              */
          