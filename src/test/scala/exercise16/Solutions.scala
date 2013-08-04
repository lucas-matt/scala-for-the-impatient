package exercise16

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) You" should "explain what <fred/>(0)?<fred/>(0)(0)? is and why" in {
    fail()
  }


  "(2) You" should """explain what the result of :

      <ul>
        <li>Opening bracket: [</li>
        <li>Closing bracket: ]</li>
        <li>Opening brace: {</li>
        <li>Closing brace: }</li>
      </ul>

      is?

      How do you fix it?

   """ in {
    fail()
  }

  "(3) You" should """contrast the following :

      <li>Fred</li> match {
        case <li>{Text(t)}</li> => t
      }

     and

      <li>{"Fred"}</li> match {
        case <li>{Text(t)}</li> => t
      }

     why do they act differently?

  """ in {
    fail()
  }

  "(4) You" should "read an XHTML file and print all img elements that don't have an alt attribute" in {
    fail()
  }

  "(5) You" should "print the names of all imagines in an XHTML file. That is print all src attribute values inside img elements" in {
    fail()
  }

  "(6) You" should "read an XHTML file and print a table of all hyperlinks in the file together with URLs (child text and href)" in {
    fail()
  }

  "(7) You" should """write a function that has a parameter of type Map[String,String] and returns a dl element with
       a dt for each key and dd for each value, for example :

      Map("A" -> "1", "B" -> "2")

    should yield

      <dl>
        <dt>A</dt>
        <dd>1</dd>
        <dt>B</dt>
        <dd>2</dd>
      </dl>

  """ in {
    fail()
  }

  "(8) You" should "write a function that takes a dl element and turns it into Map[String,String] (inverse of above)" in {
    fail()
  }

  "(9) You" should """transform an XHTML document by adding an alt="TODO" attribute to all img elements without an alt attribute preserving everything else""" in {
    fail()
  }

  "(10) You" should "write a function that reads an XHTML document carries out the transformation of the preceding exercise, and saves the result (preserve DTD and CDATA sections)" in {
    fail()
  }

}
