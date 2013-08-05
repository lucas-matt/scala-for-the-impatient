package exercise21

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) You" should """explain how -> works? That is how can "Hello" -> 42 and 42 -> "Hello" be pairs ("Hello", 42) and (42, "Hello")"""" in {
    // Predef.any2ArrowAssoc
    fail()
  }

  "(2) You" should "define an operator +% that adds a given percentage to a value, e.g. 120 +% 10 should be 132" in {
    fail()
  }

  "(3) You" should "explain why a factorial operator 5! won't work? Make it work for ¡ instead" in {
    fail()
  }

  "(4) You" should """create a fluent API for reading integers, fp numbers and strings from the console e.g.

        Obtain aString askingFor "Your name" and anInt askingFor "Your age" and aDouble askingFor "Your weight"

  """ in {
    fail()
  }

  "(5) You" should "provide the machinary needed to compute smaller(Fraction(1,7), Fraction(2,9)). Supply a class RichFraction that extends Ordered[Fraction]" in {
    fail()
  }

  "(6) You" should "compare objects of the class java.awt.Point by lexicographic comparison" in {
    fail()
  }

  "(7) Continue the previous exercise, you" should "compare two points according to their distance to the origin. How can you compare between the two orderings" in {
    fail()
  }

  "(8) You" should "use the implicitly command in the REPL to summon the implicit objects described in section 21.5 and 21.6. What objects do you get?" in {
    fail()
  }

  "(9) You" should "look up the =:= object in Predef.scala. Explain how it works?" in {
    fail()
  }

  """(10) The result of "abc".map(_.toUpper) is a String but the result of "abc".map(_.toInt) is a Vector. You""" should "explain why" in {
    fail()
  }

}
