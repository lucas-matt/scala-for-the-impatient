package exercise18

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) You" should """implement a Bug class modelling a bug that moves along a horizontal line. The move method moves in the
       current direction the turn method makes the bug turn around, and the show method prints the current position.???
       Make these methods chainable, for example :

         bugsy.move(4).show().move(6).show().turn().move(5).show()

  """ in {
    fail()
  }

  "(2) You" should """provide a fluent interface for the Bug class of the preceding exercise, so that you can write :

       bugsy move 4 and show and then move 6 and show turn around move 5 and show

  """ in {
    fail()
  }

  "(3) You" should """complete the fluent interface in section 18.1 so that you can call :

       book set Title to "Scala for the Impatient" set Author to "Cay Horstmann"

  """ in {
    fail()
  }

  "(4) You" should "implement the equals method for the Member class that is nested inside the Network class (18.2). For two members to be equal they need to be in the same network" in {
    fail()
  }

  "(5) You" should """consider the type alias :

        type NetworkMember = n.Member forSome { val n: Network }

      and the function

        def process(m1: NetworkMember, m2:NetworkMember) = (m1, m2)

      How does this differ from the process function in 18.8""" in {
    fail()
  }

  "(6) The Either type in the Scala library can be used for algorithms that return either a result or some failure information. You" should """
       Write a function that takes two parameters: a sorted array of integers and an integer value. Return either the index of the value
       in the array or the index of the element that is closest to the value. Use an infix type as the return type""" in {
    fail()
  }

  "(7) You" should """implement a method that receives an object of any class that has a method :


         def close(): Unit

       together with a function that processes that object. Call the function and invoke the close method upon completion or when any exception occurs""" in {
    fail()
  }

  "(8) You" should """write a function printValues with three parameters f, from, to that prints all values of f with inputs from the given range.
       Here f should be any object with an apply method that consumes and yields an Int. For example
         printValues((x:Int) => x*x,3,6) // Prints 9, 16, 25, 36
         printValues(Array(1,1,2,3,5,8, 13, 21, 34, 55), 3, 6) // Prints 3 5 8 13
  """ in {
    fail()
  }

  "(9) You" should """consider this class that models a physical dimension:

         abstract class Dim[T](val value:Double, val name:String) {
           protected def create(v:Double): T
           def +(other: Dim[T]) = create(value + other.value)
           override def toString() = value + " " + name
         }

       Here is a concrete subclass :

         class Seconds(v:Double) extends Dim[Seconds](v, "m") {
           override def create(v: Double) = new Seconds(v)
         }

       allowing meters and seconds to be added. Use a self type to prevent that.""" in {
    fail()
  }

  "(10) Self types can usually be replaced with traits that extend classes, but there can be situations where using self types changes the initialization and override others. You" should """
        construct such an example""" in {
    fail()
  }

}
