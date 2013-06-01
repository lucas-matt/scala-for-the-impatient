package exercise3

import exercise2.Functions.{signum, countdown, uproduct, rproduct, pow}
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import scala.collection.immutable.Range
import scala.collection.mutable.ArrayBuffer
import java.util
import scala.collection.mutable

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) Setting a to an array of n random integers between 0 (inclusive) and n (exclusive)" should "look like" in {
    import scala.util.Random
    val random = new Random()
    val rands = for (i <- 0 to 10) {
      random.nextInt()
    }
  }

  "(2) A loop that swaps adjecent elemetns of an array of integers" should "be able to" in {
    // Array(1,2,3,4,5) => Array(2,1,4,3,5)
    val arr = Array(1,2,3,4,5)
    for (idx <- 0 to arr.length) {
      if (idx % 2 == 0 && idx != arr.length-1) {
        val x = arr(idx)
        val y = arr(idx+1)
        arr(idx) = y
        arr(idx+1) = x
      }
    }
    arr should equal(Array(2,1,4,3,5))
  }

  "(3) Achieving (2) by producing a new array using for/yield" should "look like" in {
    val arr = Array(1,2,3,4,5)
    val arr2 = for (idx <- 0 until arr.length) yield {
      idx match {
        case x if (x % 2 == 0) && (x != arr.length-1) => arr(idx+1)
        case x if x % 2 == 1 => arr(idx-1)
        case _ => arr(idx)
      }
    }
    arr2.toArray should equal(Array(2,1,4,3,5))
  }

  "(4) Given an array of integers then we" should "produce a new array that contains all positive values of the original array in order, followed by zero or negatives" in {
    val arr = Array(1,2,5,4,-1,0, 2,3,0,-1)
    val pos = arr.filter(_ > 0)
    val zero = arr.filter(_ == 0)
    val neg = arr.filter(_ < 0)
    val res = pos ++ zero ++ neg
    res should equal(Array(1,2,5,4,2,3,0,0,-1,-1))

  }

  "(5) Computing the average of an Array[Double]" should "look like" in {
    val arr = Array(1.0,2.0,3.0,4.0,5.0)
    val avg = arr.sum / arr.length
    avg should equal (3.0)
  }

  "(6) Rearranging the elements of an Array[Int] and ArrayBuffer[Int] so that they appear in reverse sorted order" should "look like" in {
    val a = Array(1,2,3,4,5)
    val ab = ArrayBuffer(1,2,3,4,5)
    a.reverse should equal(Array(5,4,3,2,1))
    ab.reverse should equal(ArrayBuffer(5,4,3,2,1))
  }

  "(7) Removing all duplicates from an array" should "look like" in {
    val a:Array[Int] = Array(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,5)
    var arr = Array[Int]()
    for (x <- a) {
      if (!arr.contains(x)) {
        arr = arr :+ x
      }
    }
    arr should equal(Array(1,2,3,4,5))
  }

  "(8) Collect indexes of the negative elements, reverse the sequence, drop the last index and call a.remove(i) for each index" should "look like" in {
    var arr = Array(1,-1,2,-2,3,-3)
    val idxs = arr.zipWithIndex.filter(x => x._1 < 0).map(x => x._2).reverse.dropRight(1)
    val act = arr.zipWithIndex.filter(x => !idxs.contains(x._2)).map(_._1)
    act should equal (Array(1,-1,2,3))
  }

  "(9) A collection of all timezones returned by java.util.TimeZone.getAvailableIDs that are in America" should "have the America/ stripped off an sorted" in {
    val tzs = java.util.TimeZone.getAvailableIDs.filter(_.startsWith("America")).map(_.replaceAll("America/", "")).sortWith(_<_)
    tzs.foreach(println(_))
  }

  "(10) Return the value of a java.util.List as a Scala buffer" should "look like" in {
    import java.awt.datatransfer._
    import scala.collection.JavaConversions.asScalaBuffer
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    val b:scala.collection.mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  }

}
