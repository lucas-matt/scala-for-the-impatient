package exercise7

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Solutions extends FlatSpec with ShouldMatchers{

  "(1) package com.horstmann.impatient" should """ not be the same as

       package com
       package horstmann
       package impatient

   """ in {
    fail()
  }

  "(2) The puzzler" should "be that we can use a package 'com' that isn't at the top level" in {
    fail()
  }

  "(3) A package 'random'" should """contain the functions :

       nextInt():Int
       nextDouble():Double
       setSeed(seed:Int):Unit

   Using the linear congruential generator :

      next = previous * (a + (b mod 2^n))

   where a = 1664525, b = 1013904223 and n = 32 """ in {
    fail()
  }

  // (4) Why did the Scala designers provide the package object syntax instead of simply allowing
  //     you to add functions and variables to a package?

  // (5) What is the meaning of :
  //
  //       private[com] def giveRaise(rate:Double)?
  //
  //     Is it useful?

  "(6) The functin 'jcopy'" should "copy all elements from a Java hashmap into a Scala hashmap using imports to rename both classes" in {
    fail()
  }

  "(7) For (6) all imports" should "be moved to the innermost scope possible" in {
    fail()
  }

  // (8) What is the effect of :
  //
  //  import java._
  //  import javax._
  //
  // Is this a good idea?

  "(9) The app 'greeter'" should """

       - import the java.lang.System class
       - Read the user.name from the system properties
       - Read a password from the console
       - Print a message to stderr if the password is not 'secret'
       - Print a greeting to stdout otherwise.
  """ in {
    fail()
  }

  // (10) Apart from StringBuilder, what other members of java.lang does the scala package override?

}
