package exercise20

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 8/5/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
class Solutions extends FlatSpec with ShouldMatchers {

  "(1) You" should """write a program that generates an array of n random numbers (where n is a large value such as 1,000,000)
       and then computes the teh average of those numbers by distributing work over multiple actors each of which
       composes the sum of of a subrange of the values, sending the result to an actor that combines the results.

       On a dual core machine what is the speed-up over a single threaded application?""" in {
    fail()
  }

  "(2) You" should """write a program that reads in a large image into a BufferedImage using javax.imageio.IOImage.read.

       Use multiple actors, each of which inverts the colors in a strip of the image.

       When all strips have been reverted, write the result.""" in {
    fail()
  }

  "(3) You" should """Write a program that counts how many words match a given regular expression in all files of all subdirectories
       of a given directory.

       Have one actor per file, one actor that traverses subdirectories, and one to accumulate the results""" in {
    fail()
  }

  "(4) You" should "modify the program of the preceding exercise to display all matching words" in {
    fail()
  }

  "(5) You" should "modify the program of the preceding exercise to display all matching words, each with a list of files containing it" in {
    fail()
  }

  "(6) You" should """write a program that constructs 100 actors that use a while(true)/recieve loop calling println(Thread.currentThread)
       when they recieve a 'Hello' message and 100 actors that do the same with loop/react.

       Start them all and send them all a message. How many threads are occupied by the first kind, and how many by the second kind?

  """ in {
    fail()
  }

  "(7) You" should """add a supervisor to the program of exercise 3 that monitors the file reading actors and logs any exit with an IOException.

       Try triggering the exception by removing files that have been scheduled for processing

  """ in {
    fail()
  }

  "(8) You" should "show how an actor based program can deadlock when one sends synchronous messages" in {
    fail()
  }

  "(9) You" should "produce a faulty implementation of the program in exercise 3 in which the actos update a shared counter. Demonstrate the the program acts incorrectly" in {
    fail()
  }

  "(10) You" should "rewrite the program of exercise 1 by using channels for communication" in {
    fail()
  }


}
