package code
package snippet

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import code.lib._
import Helpers._

import net.liftweb.http.SHtml._
import net.liftweb.json._
import net.liftweb.http.js.JsCmd
import net.liftweb.http.js.JsCmds._
import net.liftweb.http.js.JE.JsRaw


class HelloWorld extends Loggable {

	def render = { 
		
		def handleClick(s: String): JsCmd = {
			logger.info("Recevied: "+s)
			Alert("Got "+s)
		}

		"button [onclick]" #> ajaxCall(JsRaw("$('#valueField').val()"), handleClick _) 

	}

}

