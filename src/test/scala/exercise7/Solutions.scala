package exercise7

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import scala.io.Source


class Solutions extends FlatSpec with ShouldMatchers{

  "(1) package com.horstmann.impatient" should """ not be the same as

       package com
       package horstmann
       package impatient

   """ in {
    import com.horstmann.impatient.FlatPackaged
    import com.horstmann.impatient.MultilinePackaged
    null
  }

  "(3) A package 'random'" should """contain the functions :

       nextInt():Int
       nextDouble():Double
       setSeed(seed:Int):Unit

   Using the linear congruential generator :

      next = previous * (a + (b mod 2^n))

   where a = 1664525, b = 1013904223 and n = 32 """ in {
    random.setSeed(1)
    random.nextDouble() should be(1.015568748E9)
    random.nextInt() should be (2147483647)
  }

  // (4) Why did the Scala designers provide the package object syntax instead of simply allowing
  //     you to add functions and variables to a package?

  /**
   * Functions directly under the package is not supported by the JVM
   */

  // (5) What is the meaning of :
  //
  //       private[com] def giveRaise(rate:Double)?
  //
  //     Is it useful?

  /**
   * The function is private within the com package.
   * This is useful for stronger encapsulation.
   */

  "(6) The functin 'jcopy'" should "copy all elements from a Java hashmap into a Scala hashmap using imports to rename both classes" in {
    import java.util.{HashMap => JMap}
    import scala.collection.immutable.{HashMap => SMap}
    def jcopy[K,V](j:JMap[K,V]):SMap[K,V] = {
      import scala.collection.JavaConversions.asScalaSet
      j.keySet().foldLeft(SMap[K,V]()) { (s,k) =>
        s + (k -> j.get(k))
      }
    }
    val jm = new JMap[String,Int]()
    jm.put("one", 1)
    jm.put("two", 2)
    jm.put("three", 3)
    jcopy(jm) should be (SMap("one" -> 1, "two" -> 2, "three" -> 3))
  }

  "(7) For (6) all imports" should "be moved to the innermost scope possible" in {
    // See above
  }

  // (8) What is the effect of :
  //
  //  import java._
  //  import javax._
  //
  // Is this a good idea?

  /**
   * Imports everything under java and javax packages so that you make make references such as
   *
   *    >> util.Map
   *
   * Not a good idea as it makes it less obvious what has been imported and where entities are coming from.
   */

  "(9) The app 'greeter'" should """

       - import the java.lang.System class
       - Read the user.name from the system properties
       - Read a password from the console
       - Print a message to stderr if the password is not 'secret'
       - Print a greeting to stdout otherwise.
  """ in {
    import java.lang.System
    val user = System.getProperty("user.name")
    val password = Console.readLine("Enter password : ")
    if (password != "secret") {
      Console.err.println("Invalid password!")
      System.exit(1)
    }
    Console.out.println(s"Greeting $user")
  }

  // (10) Apart from StringBuilder, what other members of java.lang does the scala package override?

  /**
   * ... :)
   */

}
