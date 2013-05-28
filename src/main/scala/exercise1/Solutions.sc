// 1) In the Scala REPL, type 3, followed by the Tab key. What methods can be applied?

/**
 *  !=             ##             %              &              *
 *  +              -              /              <              <<
 *  <=             ==             >              >=             >>
 *  >>>            ^              asInstanceOf   equals         getClass
 *  hashCode       isInstanceOf   toByte         toChar         toDouble
 *  toFloat        toInt          toLong         toShort        toString
 *  unary_+        unary_-        unary_~        |
 */

// 2) In the Scala REPL, compute the square root of 3, and then the square of that value.
//    By how much does the result differ from 3? (HInt: The res variables are friend)

/**
 * scala> math.sqrt(3)
 * res0: Double = 1.7320508075688772
 *
 * scala> math.sqrt(res0)
 * res1: Double = 1.3160740129524924
 *
 * scala> 3 - res1
 * res2: Double = 1.6839259870475076
 */

// 3) Are the res variables val or var?

/**
 * scala> res2 = 10
 * <console>:10: error: reassignment to val
 *     res2 = 10
 */

// 4) Scala lets you multiply a string with a number - try out "crazy" * 3
//    in the REPL. What does this operation do? Where can you find it in Scaladoc?

/**
 * scala> "crazy"*3
 * res3: String = crazycrazycrazy
 */

// 5) What does 10 max 2 mean? In which class is the max method defined?

/**
 * scala> 10 max 2
 * res9: Int = 10
 *
 * max is defined on the Integer class
 */

// 6) Using BigInt, compute 2^1024

/**
 * scala> BigInt(2).pow(1024)
 * res14: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
 */


// 7) What do you need to import so that you can get a random prime as probablePrime(100, Random), without any
//    qualifiers before probablePrime and Random?

import scala.math.BigInt._
import scala.util.Random

// 8) One way to create random file or directory names is to produce a random BigInt and convert it to base 36 yielding
//    a string such as "qnaljf9499aefa". Poke around Scaladoc to find a way of doing this in Scala.

imoprt scala.util.Random
BigInt(100, Random).toString(36)

// 9) How do you get the first character of a string in Scala? The last character?

"hello".first
"hello".last

// 10) What do the take, drop, takeRight and dropRight string functions do? What advantage or disadvantage do they
//     have over using substring?

/**
  Take and take right grab the first n elements of a sequence from front and end respectively.
  Drop does the same but removes rather than deletes elements of the sequence.
 */