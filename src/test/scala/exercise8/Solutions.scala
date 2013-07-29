package exercise8

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) An extension of BankAccount, CheckingAccount" should "charge $1 for every deposit and withdrawl" in {
    fail()
  }

  "(2) An extension of BankAccount, SavingsAccount" should """

       - Earn interest every month when #earnMonthlyInterest is called
       - Has three free deposits or withdrawls a month
       - Reset the transaction count in the earnMonthlyInterest method

  """ in {
    fail()
  }

  "(3) Any Java type hierarchy example" should "be implemented in Scala" in {
    fail()
  }

  "(4) An Items hierachy" should """be defined as follows :

       - Item abstract class with methods price and description
       - SimpleItem whose price and description are set in the constructor (vals can override defs)
       - Bundle - an item that contains other items, with price as the sum of children, and a suitable aggreate description

  """ in {
    fail()
  }

  "(5) Given a class Point whose x,y coords can be provided in the constructor we" should """ provide a subclass LabeledPoint
       whose constructor takes a label value and x,y coords such as :

       new LabeledPoint("Black Thursday", 1929, 230.07)
  """ in {
    fail()
  }

  "(6) An asbstract class Shape" should """

       - have an abstract method #centerPoint
       - subclass Rectangle
       - subclass Circle
       - with appropriate constructors for the subclasses and overriden #centerPoint
  """ in {
    fail()
  }

  "(7) A class Square" should """

       - extend java.awt.Rectangle
       - and have three constructors :
           - one that constructs a square with a given corner point and width
           - one that constructs a square with corner (0, 0) and a given width
           - one that constructs a square with corner (0, 0) and a given width 0
  """ in {
    fail()
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
    fail()
  }

  // (10) The file scala/collection/immutable/Stack.scala
  //      contains the definition :
  //        class Stack[A] protected(protected val elems: List[A])
  //      Explain the meanings of the protected keywords.

}
