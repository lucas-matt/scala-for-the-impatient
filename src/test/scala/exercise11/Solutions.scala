package exercise11

import org.scalatest.FlatSpec

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 7/30/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
class Solutions extends FlatSpec {

  "(1) According to the precedence rules 3 + 4 -> 5 and 3 -> 4 + 5" should "be evaluated" in {
    fail()
  }

  // (2) BigInt class has a pow method
  // Why did the library designers not choose ** or ^ for a power operator

  "(3) A Fraction class with operations + - * /" should """normalize fractions for example 15/-6 into -5/3 using GCD

       class Fraction(n:Int, d:Int) {
         private val num:Int = if (d == 0) 1 else n * sign(d) /gcd(n,d);
         private val den:Int = if (d == 0) 0 else d * sign(d) / gcd(n,d);
         override def toString = num + "/" + den
         def sign(a:Int) = if (a > 0) 1 else if (a < 0) -1 else 0
         def gcd(a:Int, b:Int):Int = if (b == 0) abs(a) else gcd(b, a % b)
         ...
       }
  """ in {
    fail()
  }

  "(4) A class Money" should """have fields for dollars and cents with +, - as well as == and < operators, for example :

       Money(1, 75) + Money(0, 50) == Money(2, 25) should be true

       Should you also supply * and / operators - why or why not?
  """ in {
    fail()
  }

  "(5) Operators that construct a HTML table" should """produce, for example :

       Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"

       producing :

       <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td></tr>...

  """ in {
    fail()
  }

  "(6) Operators for combining two ASCIIArt (class) figures horizontally or vertically" should """have appropriate precedence i.e.

        /\_/\
       ( ' ' )
       (  -  )
        | | |
       (__|__)

        /\_/\      -----
       ( ' ' )   / Hello \
       (  -  )  <  Scala |
        | | |    \ Coder /
       (__|__)     -----

  """ in {
    fail()
  }

  "(7) A class BitSequence that stores a sequence of 64 bits packed in a Long value" should
       "supply apply and update operators to get and set an individual bit" in {
    fail()
  }

  "(8) A class Matrix to support m x n matrices" should
       "support operations + and * including scalars (e.g. * 2). A single element should be accesible by mat(row, col)" in {
    fail()
  }

  "(9) RichFile class" should """have an unapply operation that extracts the file path, name and extension, e.g.

          /home/cay/readme.txt has path /home/cay, name readme, and extension .txt

  """ in {
    fail()
  }

  "(10) RichFile class" should """have an unapplySeq that extracts all path segments, e.g.

        /home/cay/readme.txt should produce three segments home, cay and readme.txt

  """ in {
    fail()
  }

}
