package exercise5

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import scala.beans.BeanProperty

class Solutions extends FlatSpec with ShouldMatchers {

  "(1) An improved Counter class (section 5.1)" should "not turn negative at Int.MaxValue" in {
    class Counter(private var value:BigInt=0) {
      def increment() { value += 1}
      def current() = value
    }
    val c = new Counter(Int.MaxValue)
    c.increment()
    c.current() should be(Int.MaxValue.toLong + 1)
  }

  "(2) A class BankAcount" should "have methods 'deposit' and 'withdraw' with a read-only property 'balance'" in {
    class BankAccount(private var value:Int=0) {
      def deposit(amount:Int) { value += amount }
      def withdraw(amount:Int) { value -= amount }
      def balance:Int = value
    }
    val acc = new BankAccount()
    acc.deposit(10)
    acc.withdraw(4)
    acc.balance should be(6)

  }

  "(3) A class Time" should "have read-only properties 'hours' and 'minutes'" in {
    class Time(val hours:Int, val minutes:Int) {}
    val t = new Time(23,01)
    t.hours should be(23)
    t.minutes should be(01)
  }

  "(3) A class Time" should "have a method 'before(other:Time):Boolean' that checks whether this time comes before the other" in {
    class Time(val hours:Int, val minutes:Int) {
      def before(other:Time):Boolean = {
        (hours*60 + minutes) < (other.hours*60 + other.minutes)
      }
    }
    val t1 = new Time(22,45)
    val t2 = new Time(23,23)
    t1.before(t2) should be(true)
    t2.before(t1) should be(false)
  }

  "(4) Class Time" should "be reimplemented so that the internal representation is the number of minutes since midnight (0 and 24) * 60, without changing the public interface" in {
    class Time(h:Int, m:Int) {
      val minutes = h*60 + m
      def before(other:Time):Boolean = {
        minutes < other.minutes
      }
    }
    val t1 = new Time(22,45)
    val t2 = new Time(23,23)
    t1.before(t2) should be(true)
    t2.before(t1) should be(false)
  }

  "(5) Class Student" should "have read-write JavaBeans properties 'name:String' and 'id:Long'" in {
    // Can you call the getters and setters from Scala
    class Student(@BeanProperty var name:String, @BeanProperty var id:Long) {}
    val stu = new Student("Stu", 10239481)
    stu.getName should be("Stu")
    stu.getId should be (10239481)
  }

  "(6) Class Person (from section 5.2)" should "have a primary constructor that turns negative ages to 0" in {
    class Person(a:Int = 0) {
      val age = if (a > 0) a else 0
    }
    val p = new Person(-10)
    p.age should be(0)
  }

  "(7) Class Person2" should "have a primary constructor such as 'new Person('Fred Smith')' with read only properties firstName and lastName" in {
    class Person2(name:String) {
      val firstName = name.split(" ")(0)
      val lastName = name.split(" ")(1)
    }
    val p = new Person2("Fred Smith")
    p.firstName should be("Fred")
    p.lastName should be("Smith")
  }

  "(8) Class Car" should """have read only properties 'make', 'model', 'year' and read-write for 'license plate' with four constructors :

                              new Car(make, model)
                              new Car(make, model, year)
                              new Car(make, model, license)
                              new Car(make, model, year, license)

                            which one should be the primary constructor?
                         """ in {
    class Car(val make:String, val model:String, val year:Int=0, var license:String="") {
      def this(make:String, model:String, license:String) { this(make, model, 0, license) }
    }
    new Car("Honda", "Jazz")
    new Car("Honda", "Jazz", 2009)
    new Car("Honda", "Jazz", "ABCDEF")
    new Car("Honda", "Jazz", 2009, "ABCDEF")
  }

  "(9) Reimplementing (8) in Java" should "look like" in {
    // How much shorter is the Scala version
    """
      public class Car {

        private final String make;
        private final String model;
        private final int year;
        private String license;

        public Car(String make, String model, int year, String license) {
          this.make = make
          this.model = model
          this.year = year
          this.license = license
        }

        public Car(String make, String model) {
          this(make, model, 0, "")
        }

        public Car(String make, String model, int year) {
          this(make, model, year, "")
        }

        public Car(String make, String model, String license) {
          this(make, model, 0, license)
        }

        public getMake() {
          return make;
        }

        public getModel() {
          return model;
        }

        public getYear() {
          return year
        }

        public getLicense() {
          return license
        }

        public setLicense(String lic) {
          this.license = lic
        }

      }
      """
  }

    """(10) Consider the class

            class Employee(val name:String, var salary:Double) {
              def this() { this("John Q. Public", 0.0) }
            }

     Rewriting it to use explicit fields and a default primary constructor""" should "look like" in {
      class Employee(n:String="", s:Double=0.0) {
        val name = n
        var salary = s
      }
      val bart = new Employee("Bart", 10000.0)
      bart.name should be("Bart")
      bart.salary should be(10000.0)
      bart.salary = 12000.0
      bart.salary should be(12000.0)
  }

}
