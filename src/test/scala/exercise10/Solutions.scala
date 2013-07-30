package exercise10

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) A trait RectangleLike" should """have methods :

        - translate
        - grow

       providing any abstract methods needed for the implementation to make it possible to mix in the trait like :

          val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
          egg.translate(10, -10)
          egg.grow(10, 20)

  """ in {
    fail()
  }

  "(2) A class OrderedPoint" should """mix scala.math.OrderedPoint[Point] into java.awt.Point
       using lexicographic ordering i.e.

       (x,y) < (x',y') if x < x' or x = x' and y < y'

  """ in {
    fail()
  }

  // (3) Look at the BitSet class, and make a diagram of all its superclasses and traits.
  //     Ignore the type parameters (everything inside the [...]).
  //     Then give linearization of the traits.

  "(4) A CryptoLogger class" should "should encrypt log messages with the Caeser cipher" in {
    // The key should be 3 by default, but should be overridable - provide examples with the default and -3
    fail()
  }

  "(5) PropertyChangeSupport trait" should "support the behavior of the original PropertyChangeSupport and be mixed into java.awt.Point" in {
    fail()
  }

  // (6) Given the class diagram in the book, why is it not possible in Java?
  //     How could we execute it with Scala traits

  // (7) Make your own silly trait hierarchy example that demonstrates layered traits, concrete and abstract methods and concrete and abstract fields

  "(8) The BufferedInputStream decorator" should "be reimplemented as a trait - for simplicity override the read method" in {
    fail()
  }

  "(9) Using the logger traits from the chapter logging" should "be added to the preceding buffer implementation" in {
    fail()
  }

  "(10) A class IterableInputStream" should "extend java.io.InputStream with the trait Iterable[Byte]" in {
    fail()
  }

}
