package exercise14

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) Given /usr/lib/jvm/java-7-oracle/src.zip we" should """

    unzip

    search for case labels (case [^:]+:)

    look for comments starting with // and containing alls? thr to catch comments such as
      // Falls through or
      // just fall thru

    Assuming the JDK programmers follow the java code convention, which requires such a comment,
    what percentage of cases falls through""" in {
    fail()
  }

  "(2) swap (using pattern matching)" should "receive a pair of integers and return the pair with the components swapped" in {
    fail()
  }

  "(3) swap (using pattern matching)" should "swap the first two elements of an array provided its length is two" in {
    fail()
  }

  "(4) case class Multiple that is a subclass of the Item class" should """behave as :

       Multiple(10, Product("Blackwell Toaster", 29.95))

       describes ten toasters

    And should handle any items such as bundles or multiples in the second argument.???

    Extend the price function to handle theis new case

  """ in {
    fail()
  }

  "(5) Using lists we" should """model trees such as :

          o
        / | \
       o  2  o
      / \    |
      3  8   5

    ((3,8) 2 (5))

    In Scala you cannot have hetrogenous lists, but the children need to be Ints or Lists

    Write a function leafSum to compute the sum of all elements in the tree of List[Any] using
    pattern matching to differentiate between Lists and number""" in {
    fail()
  }

  "(6) A better way of modelling such a tree" should """use case classes :

       sealed abstract class BinaryTree
       case class Leaf(value:Int) extends BinaryTree
       case class Node(left:BinaryTree, right:BinaryTree) extends BinaryTree

      Write a function to compute the sum of all leaves""" in {
    fail()
  }

  "(7) The tree in the preceding exercise" should "have an arbitrary number of children and reimplement leafSum" in {
    // Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
    fail()
  }

  "(8) Nodes" should """able to be operators such as :

         +
       / | \
      *  2  -
     / \    |
     3  8   5

    Write a function eval that has value (3*8) + 2 + (-5) = 21""" in {
    fail()
  }

  "(9) A function" should "computes the sum of the non-None values in a List[Option[Int]] without using a match statement" in {
    fail()
  }

  "(10) Composing two functions of type Double -> Option[Double]" should """yield another function of the same type :

        The composition should yield None if either function does, for example:

        def f(x:Double) = if (x >= 0) Some(sqrt(x)) else None
        def g(x:Double) = if (x != 1) Some(1 / (x - 1)) else None
        val h = compose(f,g)

        h(2) is Some(1) and h(1) and h(0) are None""" in {
    fail()
  }

}
