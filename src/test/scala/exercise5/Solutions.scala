package exercise5

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 7/29/13
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
class Solutions extends FlatSpec with ShouldMatchers {

  "(1) An improved Counter class (section 5.1)" should "not turn negative at Int.MaxValue" in {
    fail()
  }

  "(2) A class BankAcount" should "have methods 'deposit' and 'withdraw' with a read-only property 'balance'" in {
    fail()
  }

  "(3) A class Time" should "have read-only properties 'hours' and 'minutes'" in {
    fail()
  }

  "(3) A class Time" should "have a method 'before(other:Time):Boolean' that checks whether this time comes before the other" in {
    fail()
  }

  "(3) An instance of Time" should "be constructed as 'new Time(hrs,mins)' where hrs is military time format (between 0 and 23)" in {
    fail()
  }

  "(4) Class Time" should "be reimplemented so that the internal representation is the number of minutes since midnight (0 and 24) * 60, without changing the public interface" in {
    fail()
  }

  "(5) Class Student" should "have read-write JavaBeans properties 'name:String' and 'id:Long'" in {
    // Can you call the getters and setters from Scala
    fail()
  }

  "(6) Class Person (from section 5.1)" should "have a primary constructor that turns negative ages to 0" in {
    fail()
  }

  "(7) Class Person2" should "have a primary constructor such as 'new Person('Fred Smith')' with read only properties firstName and lastNamw" in {
    // Should the primary constructor parameter be a var, val or plain parameter?
    fail()
  }

  "(8) Class Car" should """have read only properties 'make', 'model', 'year' and read-write for 'license plate' with four constructors :

                              new Car(make, model)
                              new Car(make, model, year)
                              new Car(make, model, license)
                              new Car(make, model, year, license)

                            which one should be the primary constructor?
                         """ in {
    fail()
  }

  "(9) Reimplementing (8) in Java" should "look like" in {
    // How much shorter is the Scala version
    fail()
  }

  """(10) Consider the class

            class Employee(val name:String, var salary:Double) {
              def this() { this("John Q. Public", 0.0) }
            }

     Rewriting it to use explicit fields and a default primary constructor""" should "look like" in {
    // Which do you prefer
    fail()
  }



}
