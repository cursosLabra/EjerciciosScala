package es.poo 

import org.scalatest._
import Matchers._


class ParSpec extends FunSpec with Matchers {
 describe("Par") {
   it("debe detectar que 4 es par") {
    Par.par(4) should be (true)
   }
   
   it ("debe detectar que 5 no es par") {
    Par.par(5) should be (false)
   }

 }
}
