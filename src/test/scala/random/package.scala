import scala.math.{pow}

package object random {

  val a = 1664525

  val b = 1013904223

  val n = 32

  var previous = 0.0

  def nextInt():Int = {
    nextDouble().toInt
  }

  def nextDouble():Double = {
    previous = previous * (a + (b % (pow(2,n))))
    previous
  }

  def setSeed(seed:Int) {
    previous = seed
  }

}
