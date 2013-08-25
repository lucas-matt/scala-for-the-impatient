package exercise8

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) An extension of BankAccount, CheckingAccount" should "charge $1 for every deposit and withdrawl" in {
    class CheckingAccount(initial:Double) extends BankAccount(initial) {
      def applyCharge {
        _balance -= 1
      }
      override def deposit(amount:Double) = {
        applyCharge
        super.deposit(amount)
      }
      override def withdraw(amount:Double) = {
        applyCharge
        super.withdraw(amount)
      }
    }
    val acc = new CheckingAccount(10.0)
    acc.deposit(10.0)
    acc.withdraw(5.0) should be(13.0)
  }

  "(2) An extension of BankAccount, SavingsAccount" should """

       - Earn interest every month when #earnMonthlyInterest is called
       - Has three free deposits or withdrawls a month
       - Reset the transaction count in the earnMonthlyInterest method

  """ in {
    class SavingsAccount(initial:Double, val interestRate:Double) extends BankAccount(initial) {
      private var deposits = 3
      private var withdrawls = 3
      def applyCharge(remainingFree:Int) {
        if (remainingFree > 0) {
          return
        }
        _balance -= 1
      }
      def earnMonthlyInterest {
        _balance *= (interestRate + 1)
        deposits = 3
        withdrawls = 3
      }
      override def deposit(amount:Double) = {
        applyCharge(deposits)
        deposits -= 1
        super.deposit(amount)
      }
      override def withdraw(amount:Double) = {
        applyCharge(withdrawls)
        withdrawls -= 1
        super.withdraw(amount)
      }
    }
    val acc = new SavingsAccount(10.0, 0.1)
    acc.earnMonthlyInterest
    acc.earnMonthlyInterest
    acc.balance should be(12.1  plusOrMinus 0.01)
    acc.withdraw(1.0) should be(11.1 plusOrMinus 0.01)
    acc.withdraw(1.0) should be(10.1 plusOrMinus 0.01)
    acc.withdraw(1.0) should be(9.1 plusOrMinus 0.01)
    acc.withdraw(1.0) should be(7.1 plusOrMinus 0.01)
  }

  "(3) Any Java type hierarchy example" should "be implemented in Scala" in {
    class Bicycle(var cadence:Int, private var _speed:Int, var gear:Int) {
      def applyBrake(dec:Int) {
        _speed -= dec
      }
      def speedUp(inc:Int) {
        _speed -= inc
      }
    }
    class MountainBike(var height:Int, cadence:Int, speed:Int, gear:Int) extends Bicycle(cadence, speed, gear) {}
  }

  "(4) An Items hierachy" should """be defined as follows :

       - Item abstract class with methods price and description
       - SimpleItem whose price and description are set in the constructor (vals can override defs)
       - Bundle - an item that contains other items, with price as the sum of children, and a suitable aggreate description

  """ in {
    abstract class Item {
      def price:Int
      def description:String
    }
    class SimpleItem(val price:Int, val description:String) extends Item {}
    class Bundle(val children:Seq[Item]) extends Item {
      override def price = {
        children.map(_.price).sum
      }
      override def description = {
        children.foldLeft("Bundle : ")((s,x) => s"$s${x.description}(${x.price}), ")
      }
    }
    val bundle = new Bundle(List(new SimpleItem(10,"Hat"), new SimpleItem(12,"Cat"), new SimpleItem(8,"Mat")))
    bundle.price should be(30)
    bundle.description should be("Bundle : Hat(10), Cat(12), Mat(8), ")
  }

  "(5) Given a class Point whose x,y coords can be provided in the constructor we" should """ provide a subclass LabeledPoint
       whose constructor takes a label value and x,y coords such as :

       new LabeledPoint("Black Thursday", 1929, 230.07)
  """ in {
    class Point(val x:Double, val y:Double) {}
    class LabeledPoint(val label:String, override val x:Double, override val y:Double) extends Point(x,y) {}
    val label = new LabeledPoint("Black Thursday", 1929, 230.07)
    label.x should be(1929)
    label.y should be(230.07)
    label.label should be("Black Thursday")
  }

  "(6) An abstract class Shape" should """

       - have an abstract method #centerPoint
       - subclass Rectangle
       - subclass Circle
       - with appropriate constructors for the subclasses and overriden #centerPoint
  """ in {
    abstract class Shape {
      def centerPoint:(Int,Int)
    }
    class Rectangle(val p:(Int,Int), val xs:Int, val ys:Int) extends Shape {
      def centerPoint:(Int,Int) = {
        (p._1 + xs/2, p._2 + ys/2)
      }
    }
    class Circle(val p:(Int,Int), val radius:Int) extends Shape {
      def centerPoint:(Int,Int) = {
        p
      }
    }
    val rec = new Rectangle((1, 1), 2, 4)
    rec.centerPoint should be((2, 3))
    (new Circle((1,1), 2)).centerPoint should be((1,1))
  }

  "(7) A class Square" should """

       - extend java.awt.Rectangle
       - and have three constructors :
           - one that constructs a square with a given corner point and width
           - one that constructs a square with corner (0, 0) and a given width
           - one that constructs a square with corner (0, 0) and a given width 0
  """ in {
    import java.awt.Rectangle
    class Square(private val corner:(Int,Int), width:Int) extends Rectangle {
      super.setLocation(corner._1, corner._2)
      super.setSize(width, width)
      def this(width:Int) { this((0,0), width) }
      def this() { this((0,0), 0) }
    }
    val sq = new Square((1,1), 4)
    sq.getX should be(1.0)
    sq.getY should be(1.0)
    sq.getWidth should be(4.0)
  }

  // (8) Compile the Person and SecretAgent classes from section 8.6 and analyze with javap
  //     - how many fields are there?
  //     - how many getters are there?
  //     - what do they get (use -c and -private options)

  "(9) Given the Creature class from section 8.6 we" should """

       - replace val range with a def
       - what happens when you also use a def in the Ant subclass
       - what happens when you use a val in the subclass, and why?
  """ in {
    class Creature {
      def range = 10
      val env = new Array[Int](range)
    }
    class Ant extends Creature {
      override def range = 2
    }
    (new Ant).range should be(2)

    /**
     * Using a def in the subclass overrides the def in the super
     */

    /**
     * You can't use a def to override a val as val is final
     */
  }

  // (10) The file scala/collection/immutable/Stack.scala
  //      contains the definition :
  //        class Stack[A] protected(protected val elems: List[A])
  //      Explain the meanings of the protected keywords.

  /**
   * The first protected is for a protected constructor, the second for a protected val
   */

}
