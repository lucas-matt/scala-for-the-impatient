package exercise22

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) In the example in section 22.1 suppose these is no file myfile.txt. You" should """set the filename to another nonexistant file and call cont

       What happens?

       Set filename to a file that exists and call cont again. What happens?

       Call cont one more time. What happens?

       First think through the control flow then run a program to verify""" in {
    fail()
  }

  "(2) You" should "improve the example in section 22.1 so that the continuation function passes the name of the next file to try as a parameter" in {
    fail()
  }

  "(3) You" should "make the example in section 22.7 into an iterator. The constructor should contain the reset and next should invoke the continuation" in {
    fail()
  }

  "(4) The example in 22.8 is unsightly - the application programmer sees the reset statement. You" should """move
       the run method to the button listener. Is the application programmer now blissfully aware of continuations?""" in {
    fail()
  }

  """(5) Consider this sample program that uses a continuation to turn an iteration into an iterator :

         object Main extends App {
           var cont: Unit => String = null
           val a = "Mary was a little lamb".split(" ")
           reset {
             var i = 0
             while (i < a.length) {
               shift {
                 k: (Unit => String) => {
                   cont = k
                   a(i)
                 }
               }
               i += 1
             }
             ""
           }
           println(cont())
           println(cont())
         }

      Compile with the -Xprint:selectivecps flag, you""" should "look at the generated code. How is the while statement treated when transformed to CPS?" in {
    fail()
  }


}
