package exercise13

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) indexes(s:String):Map[String,Set[Int]]" should """produce a map of the indicies of all characters :

       indexes("Mississippi")
       'M' -> set{0}, 'i' -> set{1,4,7,10}

       Use a mutable map of characters to mutable sets.

       How can you ensure the set is sorted?

  """ in {
    fail()
  }

  "(2) Repeating (1) using immutable map of characters to lists" should "look like" in {
    fail()
  }

  "(3) A function rmZeros" should "remove all zeroes from a linked list of integers" in {
    fail()
  }

  "(4) A function that returns a collection of integers that are values of the map corresponding a string in the collection" should
  """  behave as :

      Array("Tom", "Fred", "Harry"), with Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

      should return

      Array(3,5)

    Hint. Use flatmap to combine the Option values returned by get""" in {
    fail()
  }

  "(5) A function like mkString" should "use reduceLeft" in {
    fail()
  }

  """(6) (lst :\ List[Int]())(_ :: _) and (List[Int]() /: lst(_ :+ _)""" should "given a list of integers behave as" in {
    // How can one be modified to reverse the list?
    fail()
  }

  "(7) Applying tupled to the multiplucation function" should "allow us to map it over a list of pairs" in {
    fail()
  }

  "(8) A function" should """turn an array of Double values into a two-dimensional array, e.g.

      Passing the number of columns as a parameter we should have :

      Array(1,2,3,4,5,6)

      Array(Array(1,2,3), Array(4,5,6))

      Use the grouped method.

  """ in {
    fail()
  }

  """(9) Harry Hacker writes a program that accepts a sequence of file names on the command line.
         For each he starts a new thread that reads the file and updates a letter frequency map, declared as :

        val frequencies = new scala.collection.mutable.HashMap[Char, Int] with
          scala.collection.mutable.SynchronizedMap[Char, Int]

      when reading a letter he calls

        frequencies(c) = frequencies.getOrElse(c,0) + 1

      Why won't this work?                                                                   ermin

      Will it work if he instead uses :

        import scala.collection.JavaConverters.asScalaConcurrentMap
        val frequencies : scala.collection.mutable.ConcurrentMap[Char, Int]
          = new java.util.concurrent.ConcurrentHashMap[Char,Int]""" should "be answered" in {
    fail()
  }

  """(10) Harry Hacker reads a file into a string and wants to use a parellel collection to update the letter frequencies
          concurrently on portions of the string. He uses the following code :

        val frequencies = new scala.collection.mutable.HashMap[Char,Int]
        for (c <- str.par)
          frequencies(c) = frequencies.getOrElse(c,0) + 1

      Why is this a terrible idea?

      How can he really parellelize the computation (Hint. use aggregate)""" should "be answered" in {
    fail()
  }


}
