package exercise19

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 8/4/13
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */
class Solutions extends FlatSpec with ShouldMatchers {

  "(1) You" should "add / and % operators to the arithmetic expression evaluator" in {
    fail()
  }

  "(2) You" should "add a ^ operator to the arithmetic expression evaluator. It should have migher precedence as than multiplucation and be right associative" in {
    // 4^2^3 should be 4^(2^(3)) or 65536
    fail()
  }

  "(3) You" should "write a parse that parses a list of integers (such as (1, 23, -79) into a List[Int]" in {
    fail()
  }

  "(4) You" should "write a parser that can parse date and time expressions in ISO8601 which returns a java.util.Date object" in {
    fail()
  }

  "(5) You" should """write a parser that parses a subset of XML. Handle tags of the form <ident>...</ident> or <ident/>.
       Tags can be nested, handle attributes inside tags, attribute values can be delimited by single or double quotes.???
       You don't need to deal with CDATA.
       Your parse should return a Scala XML Elm value.
       The challenge is to reject mismatched tags (Hint. into, accept)
  """ in {
    fail()
  }

  """(6) Assume that the parser (section 19.5) is completed with :

         class ExprParser extends RegexParsers {
           def expr: Parser[Expr] = (term - opt(("+" | "-") - expr)) ^^ {
             case a - None => a
             case a - Some(op - b) => Operator(op, a, b)
           }
         }

      Unfortunately this parser computes an incorrect expression tree - operators with same precedence evaluated right to left.???
      You""" should """"modify the parser so that the expression is correct
      For example :

          3-4-5 should yield an Operator("-", Operator("-",3,4),5)
      """ in {
    fail()
  }

  """(7) Suppose in section 19.6 we first parse the expr into a list of - with operations and values.

         def expr: Parser[Int] = term - rep(("+" | "-") - term) ^^ {...}

         To evaluate the result we need to compute ((t0 +/- t1) +/- ) +/- ...

         You""" should "implement this as a fold" in {
    fail()
  }

  "(8) You" should "add variables and assignment to the calculator program. Variables are created when first used, unintialized vars are 0, to print a value assign it to out" in {
    fail()
  }

  "(9) You" should "extend the preceeding exercise into a parser for a programming language that has var assignments, boolean expressions and if/else, while statements" in {
    fail()
  }

  "(10) You" should "add function definitions to the preceeding exercise" in {
    fail()
  }

}
