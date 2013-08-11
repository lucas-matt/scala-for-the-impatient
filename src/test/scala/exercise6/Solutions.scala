package exercise6

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) An object Conversions" should """have methods :

         inchesToCentimeters
         gallonsToLitres
         milesToKilometers

  """ in {
    object Conversions {
      def inchesToCentimetres(inches:Double) = { inches * 2.54 }
      def gallonsToLitres(gallons:Double) = { gallons * 4.55 }
      def milesToKilometers(miles:Double) = { miles * 1.61 }
    }
    Conversions.inchesToCentimetres(12.0).toInt should be(30)
    Conversions.gallonsToLitres(12.0).toInt should be(54)
    Conversions.milesToKilometers(12.0).toInt should be(19)
  }

  "(2) An object-orientated version of the above solution" should  """

         Have the following classes :

         UnitConversion

         InchesToCentimetres extends UnitConversion
         GallonsToLitres extends UnitConversion
         MilesToKilometers extend UnitConversion

  """ in {
    trait UnitConversion {
      val factor:Double
      def convert(value:Double):Double = {
        value*factor
      }
    }
    class InchesToCentimetres extends UnitConversion { val factor = 2.54 }
    class GallonsToLitres extends UnitConversion { val factor = 4.55 }
    class MilesToKilometers extends UnitConversion { val factor = 1.61 }
    (new InchesToCentimetres).convert(12.0).toInt should be(30)
    (new GallonsToLitres).convert(12.0).toInt should be(54)
    (new MilesToKilometers).convert(12.0).toInt should be(19)
  }

  "(3) An object Origin" should "extend java.awt.Point" in {
    // Why is this not a good idea? (have a close look at the methods of the Point class)
    import java.awt.Point
    object Origin extends Point(0,0)
    Origin.getX should be(0.0)
    Origin.getY should be(0.0)
    Origin.setLocation(1, 1)
    Origin.getX should be(1.0)
    Origin.getY should be(1.0)
    // Bad idea because you could mutably change the position of the origin for all references
  }

  "(4) A Point class with a companion object" should "be able to construct instances as Point(3,4) without using new" in {
    class Point(val x:Int, val y:Int)
    object Point {
      def apply(x:Int, y:Int) = {
        new Point(x,y)
      }
    }
    val p = Point(1,2)
    p.x should be(1)
    p.y should be(2)
  }

  "(5) A Scala application using the App trait" should "separate command-line arguments in reverse order separated by spaces" in {
    // e.g. scala Reverse Hello World => World Hello
    object Reverse extends App {
      println(args.reverse.reduce(_ + " " + _))
    }
    Reverse.main(Array("Hello", "World"))
  }

  "(6) A card suit enumeration" should "return 'club', 'diamond', 'heart' or 'spade' from a toString" in {
    object Suit extends Enumeration {
      val CLUB = Value("club")
      val DIAMOND = Value("diamond")
      val HEART = Value("heart")
      val SPADE = Value("spade")
    }
    Suit.CLUB.toString should be("club")
    Suit.DIAMOND.toString should be("diamond")
    Suit.HEART.toString should be("heart")
    Suit.SPADE.toString should be("spade")
  }

  "(7) isRed" should "check whether a card suit value from the preceding exercise is red" in {
    object Suit extends Enumeration {
      val CLUB = Value("club")
      val DIAMOND = Value("diamond")
      val HEART = Value("heart")
      val SPADE = Value("spade")
    }
    def isRed(suit:Suit.Value) = {
      (suit == Suit.DIAMOND) || (suit == Suit.HEART)
    }
    isRed(Suit.DIAMOND) should be(true)
    isRed(Suit.HEART) should be(true)
    isRed(Suit.CLUB) should be(false)
    isRed(Suit.SPADE) should be(false)
  }

  "(8) An RGB enumeration" should "describe the eight corners of the color cube. As ID's use the color values for example 0xff0000 for Red" in {
    object RGB extends Enumeration {
      val BLACK = Value(0x000000)
      val WHITE = Value(0xffffff)
      val RED = Value(0xff0000)
      val GREEN = Value(0x00ff00)
      val BLUE = Value(0x0000ff)
      val CYAN = Value(0x00ffff)
      val MAGENTA = Value(0xff00ff)
      val YELLOW = Value(0xffff00)
    }
    RGB.MAGENTA.id should be(0xff00ff)
    RGB.MAGENTA.id should be(16711935)
  }

}
