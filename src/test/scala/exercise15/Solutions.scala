package exercise15

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 8/4/13
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */
class Solutions extends FlatSpec with ShouldMatchers {

  "(1) Four unit tests" should "use the @Test annotation with and without each of it's arguments" in {
    fail()
  }

  "(2) An example class" should "show every possible position of an annotation (using @deprecated)" in {
    fail()
  }

  "(3) You" should "explain which of the Scala libary use one of the meta-params @param, @field, @getter, @setter, @beanGetter and @beanSetter " in {
    fail()
  }

  "(4) sum" should "take variable arguments that return their sum, and can be called from Java" in {
    fail()
  }

  "(5) flines" should "return a string containing all lines of a file, callable from Java" in {
    fail()
  }

  "(6) An object" should """have a volatile Boolean field such that you :

      * Have one thread sleep for some time
      * Set the field to true
      * Print the message and exit
      * Another thread will keep checking whether the field is true
      * If so it prints a message and exits
      * If not it sleeps for a short time and tries again

      What happens if the variable is not volatile?

  """ in {
    fail()
  }

  "(7) You" should "show that tail recursion optimization is not valid when a method can be overridden" in {
    fail()
  }

  "(8) The allDifferent method" should "be added to an object. Looking at the bytecode what does the @specialized annoation do" in {
    fail()
  }

  "(9) Range.foreach is annotated as @specialized(Unit). You" should "explain why" in {
    fail()
  }


  "(10) Adding assert(n >= 0) to a factorial method with assertions compiled" should "verify that factorial(-1) throws an exception" in {
    fail()
  }

}
