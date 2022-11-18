package hello

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say goodbye" in {
    Hello.greeting shouldEqual "Library says goodbye"
  }
}
