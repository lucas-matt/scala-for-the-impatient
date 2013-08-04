package exercise17

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 8/4/13
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */
class Solutions extends FlatSpec with ShouldMatchers {

  "(1) You" should "define an immutable class Pair[T,S] with a method swap that returns a new pair with the components swapped" in {
    fail()
  }

  "(2) You" should "define a mutable class Pair[T, S] with a method swap that swaps the components of the pair" in {
    fail()
  }

  "(3) Given a class Pair[T, S] you" should "write a generic method swap that takes a pair as its argument and returns a new pair with the components swapped" in {
    fail()
  }

  "(4) You" should "explain why we don't need a lower bound on 'replaceFirst' method if we want to replace the first component of a Pair[Person] with a Student?" in {
    fail()
  }

  "(5) You" should "explain why RichInt implements Comparable[Int] and not Comparable[RichInt]" in {
    fail()
  }

  "(6) You" should "write a generic method 'middle' that returns the middle element from any Iterable[T], e.g. middle('World') is 'r'" in {
    fail()
  }

  "(7) You" should "look through the methods of the Iterable[+A] trait. Which methods use the type parameters A? Why is it in a covarient position in these methods?" in {
    fail()
  }

  "(8) You" should "explain why given replaceFirst has a type bound you can't define an equivalent method on a mutable Pair[T" in {
    fail()
  }

  """(9) It may seem strange to restrict method parameters in an immutable class Pair[+T] however suppose you could define

        def replaceFirst(newFirst:T)

      in a Pair[T]. The problemis that this method can ve overridden in an unsound way.replaceFirst(

      You""" should """construct an example of this problem. Define a subclass NastyDoublePair of Pair[Double] that overrides
      replaceFirst so that it makes a pair with the square root of newFirst. Then construct the call replaceFirst("Hello") on a
      Pair[Any] that is actually a NastyDoublePair""" in {
    fail()
  }

  "(10) Given a mutable Pair[S, T] class, you" should "use a type constraint to define a swap method that can be called if the type parameters are the same" in {
    fail()
  }

}
