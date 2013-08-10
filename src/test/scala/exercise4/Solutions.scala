package exercise4

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import scala.io.BufferedSource
import scala.collection.SortedMap

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) Setting up a map of gizmos -> prices and producing a second map with a 10% discount" should "look like" in {
    val gizmos = Map("xps 13" -> 1000.0, "ps3" -> 350.0, "ipad" -> 500.0)
    val discounted = gizmos.map { case (s:String,d:Double) => (s,d*0.9) }
    discounted should be(Map("xps 13" -> 900.0, "ps3" -> 315.0, "ipad" -> 450.0))
  }

  "(2) Reading words from a file, and using a mutable map to count how often the words appear" should "look like" in {
    // val in = new java.util.Scanner(new java.io.File("myfile.txt")
    // or look at chapter 9 for a Scalaesque way
    // at the end print all words and their counts
    import scala.io.Source
    import scala.collection.mutable.Map
    val source: BufferedSource = Source.fromFile("src/test/scala/exercise4/myfile.txt")
    val words = Map[String, Int]()
    for (line <- source.getLines()) {
      line.split(" ").foreach { word =>
        val i = words.getOrElse(word, 0)
        words.put(word, (i+1))
      }
    }
    words should be(Map("hat" -> 3, "cat" -> 3, "mat" -> 3, "prat" -> 1, "sat" -> 3, "bat" -> 1))
  }

  "(3) Repeating (2) with an immutable map" should "look like" in {
    import scala.io.Source
    val source: BufferedSource = Source.fromFile("src/test/scala/exercise4/myfile.txt")
    val words = source.getLines().flatMap(_.split(" ")).foldLeft(Map[String, Int]()) { (acc, word) =>
      val i = acc.getOrElse(word, 0)
      acc + (word -> (i+1))
    }
    words should be(Map("hat" -> 3, "cat" -> 3, "mat" -> 3, "prat" -> 1, "sat" -> 3, "bat" -> 1))
  }

  "(4) Repeating (2) with a sorted map" should "print in sorted order" in {
    import scala.io.Source
    val source: BufferedSource = Source.fromFile("src/test/scala/exercise4/myfile.txt")
    val words = source.getLines().flatMap(_.split(" ")).foldLeft(SortedMap[String, Int]()) { (acc, word) =>
      val i = acc.getOrElse(word, 0)
      acc + (word -> (i+1))
    }
    words.keys.toList should be(List("bat", "cat", "hat", "mat", "prat", "sat"))
  }

  "(5) Repeating (2) with java.util.TreeMap that is adopted to the Scala API" should "look like" in {
    import scala.io.Source
    import java.util.TreeMap
    import scala.collection.JavaConversions.mapAsScalaMap
    val source: BufferedSource = Source.fromFile("src/test/scala/exercise4/myfile.txt")
    val words = source.getLines().flatMap(_.split(" ")).foldLeft(new TreeMap[String, Int]()) { (acc, word) =>
      val i = acc.getOrElse(word, 0)
      acc.put(word, i+1)
      acc
    }
    words.toMap should be(Map("hat" -> 3, "cat" -> 3, "mat" -> 3, "prat" -> 1, "sat" -> 3, "bat" -> 1))
  }

  "(6) A linked hash  map that maps 'Monday' to java.util.Calender.MONDAY" should "maintain insertion order" in {
    import scala.collection.mutable.LinkedHashMap
    import java.util.Calendar
    val map = LinkedHashMap[String, Int]()
    map.put("Monday",Calendar.MONDAY)
    map.put("Tuesday",Calendar.TUESDAY)
    map.put("Wednesday",Calendar.WEDNESDAY)
    map.put("Thursday",Calendar.THURSDAY)
    map.put("Friday",Calendar.FRIDAY)
    map.put("Saturday",Calendar.SATURDAY)
    map.put("Sunday",Calendar.SUNDAY)
    map.keys.toList should be(List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"))
  }

  "(7) A formatted table of all Java properties" should """ look like :

                                                            java.runtime.name | Java(TM) SE Runtime Environment
                                                            java.vm.version   | 17.0-b16
                                                            java.vm.vendor    | Sun Microsystems Inc.

                                                        """ in {
    import scala.collection.JavaConversions.propertiesAsScalaMap
    val props:scala.collection.Map[String,String] = System.getProperties
    val maxKeySize = props.keys.maxBy(_.length).length
    val maxValueSize = props.values.maxBy(_.length).length
    val pad = (s:String, size:Int) => s + (" " * (size - s.length))
    props.foreach { case (k,v) =>
      println(pad(k, maxKeySize) + " | " + pad(v, maxValueSize))
    }
  }

  "(8) minmax(values:Array[Int])" should "return a pair containing the smallest and largest in the array" in {
    def minmax(values:Array[Int]) = {
      (values.min, values.max)
    }
    minmax(Array(1,2,3,4,5,6,7,8,9,10)) should be ((1, 10))
  }

  "(9) lteqgt(values:Array[Int], v:Int)" should "return a triple containing the counts of values less than, equal to and greater than v" in {
    def lteqgt(values:Array[Int], v:Int) = {
      (values.count(_ < v), values.count(_ == v), values.count(_ > v))
    }
    lteqgt(Array(1,2,3,4,5,6,7,8,9,10), 3) should be((2, 1, 7))
  }

  "(10) Zipping two strings, such as 'Hello'.zip('World')" should "look like" in {
    "Hello".zip("World") should be(List(('H', 'W'), ('e', 'o'), ('l', 'r'), ('l', 'l'), ('o', 'd')))

    // Plausible use case = transpose of matrix
    val table = List(List(1, 2, 3),
                     List(4, 5, 6))
    val transpose = table(0).zip(table(1))
    transpose should be(List((1,4),
                             (2,5),
                             (3,6)))
  }



}
