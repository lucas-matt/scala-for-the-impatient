package exercise2

import exercise2.Functions.{signum, countdown, uproduct, rproduct, pow}
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) The signum of a number " should " be 1 if positive, -1 if negative and 0 if zero" in {
    signum(27) should equal (1)
    signum(-27) should equal (-1)
    signum(0) should equal (0)
  }

  "(2) The value of the expression {}" should "be void, it's class is Unit" in {
    {} should equal (())
  }

  "(3) x = y = 1" should "be valid for x as Unit" in {
    var x = ()
    var y = ()
    x = y = 1
    x should be (())
  }

  "(4) A scala equivalent for the Java loop 'for (int i = 10; i >= 0; i--) System.out.println(i)" should " look like" in {
    Range(10,-1,-1).foreach(println(_))
  }

  "(5) A procedure countdown(n:Int) that prints numbers from n to 0" should "look like" in {
    countdown(10)
  }

  "(6) A function to calculate the unicode product" should "look like" in {
    uproduct("Hello") should be (9415087488L)
  }

  // (7) see (6)

  "(8) A product function that does the same as (6)" should "look like" in {
    uproduct("Hello") should be (9415087488L)
  }

  "(9) A recursive product function" should "look like" in {
    rproduct("Hello") should be (9415087488L)
  }

  "(10) A function that computes x^n where n is an integer" should "look like" in {
    pow(10, 2) should be (100)
    pow(10, 0) should be (1)
  }

}
