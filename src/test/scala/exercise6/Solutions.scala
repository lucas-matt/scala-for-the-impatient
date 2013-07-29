package exercise6

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) An object Conversions" should """have methods :

         inchesToCentimeters
         gallonsToLitres
         milesToKilometers

  """ in {
    fail()
  }

  "(2) An object-orientated version of the above solution" should  """

         Have the following classes :

         UnitConversion

         InchesToCentimetres extends UnitConversion
         GallonsToLitres extends UnitConversion
         MilesToKilometers extend UnitConversion

  """ in {
    fail()
  }

  "(3) An object Origin" should "extend java.awt.Point" in {
    // Why is this not a good idea? (have a close look at the methods of the Point class)
    fail()
  }

  "(4) A Point class with a companion object" should "be able to construct instances as Point(3,4) without using new" in {
    fail()
  }

  "(5) A Scala application using the App trait" should "separate command-line arguments in reverse order separated by spaces" in {
    // e.g. scala Reverse Hello World => World Hello
    fail()
  }

  "(6) A card suit enumeration" should "return 'club', 'diamond', 'heart' or 'spade' from a toString" in {
    fail()
  }

  "(7) isRed" should "check whether a card suit value from the preceding exercise is red" in {
    fail()
  }

  "(8) An RGB enumeration" should "describe the eight corners of the color cube. As ID's use the color values for example 0xff0000 for Red" in {
    fail()
  }

}
