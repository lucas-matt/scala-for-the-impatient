package exercise12

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) values(fun:(Int)=>Int, low:Int, high:Int)" should """yield a collection of inputs and output in a given range, e.g.

       >> values(x => x*x, -5, 5)
       => List((-5,25),(-4,16),(-3,9),...,(5,25))

  """ in {
    fail()
  }

  "(2) reduceLeft" should "get the largest element of an array" in {
    fail()
  }

  "(3) The factorial function" should "use to and reduceLeft without a loop or recursion" in {
    fail()
  }

  "(4) Using foldLeft we" should "be able to avoid using an n<1 condition as in the previous implementation" in {
    fail()
  }

  "(5) largest(fun:(Int)=>(Int), inputs:Seq[Int])" should """yield the largest value of a function within a given sequence, e.g

       >> largest(x=>10*x-x*x,1 to 10)
       => 25

  """ in {
    fail()
  }

  "(6) largestAt(fun:(Int)=>Int), inputs:Seq[Int])" should "return the input at which the output is the largest" in {
    fail()
  }

  "(7) adjustToPair((Int,Int)=>Int)" should """receive a function such as _*_ that operates on a pair, e.g.

       adjustToPair(_ * _)((6,7)) => 42

     Use this function in conjunction with :

       val pairs = (1 to 10) zip (11 to 20)

     and map to compute the sums of pairs

  """ in {
    fail()
  }

  "(8) corresponds (Section 12.8)" should "check whether the elements in an array of strings have the lengths given in an array of ints" in {
    fail()
  }

  "(9) corresponds" should "be implemented without currying and used with the call from the preceeding - what issue is encountered?" in {
    fail()
  }

  "(10) unless" should "be implemented as a control abstraction that works as the inverse of if" in {
    // Does the first parameter need to be call-by-name? Do you need currying?
    fail()
  }


}
