/* Scala.js example code
 * Public domain
 * @author  Sébastien Doeraene
 */

package helloworld

import scala.scalajs.js
import js.annotation.JSName

trait T { val x = 0 } // has an $init$ method
class C extends T   // calls T.$init$(C.this)

object HelloWorld extends js.JSApp {
  def main() {
    new C
  }
}
