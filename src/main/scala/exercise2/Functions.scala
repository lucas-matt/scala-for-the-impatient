package exercise2

object Functions {

  def signum(i:Int) = {
    i match {
      case 0 => 0
      case x if x > 0 => 1
      case _ => -1
    }
  }

  def countdown(n:Int) {
    Range(n,-1,-1).foreach(println(_))
  }

  def uproduct(s:String) = {
    s.map(_.toLong).product
  }

  def rproduct(s:String):Long = {
    s match {
      case "" => 1
      case s:String => s.head.toLong * rproduct(s.drop(1))
    }
  }

  def pow(x:Int, n:Int):Int = {
    (x,n) match {
      case (x,0) => 1
      case (x,n) if (n > 0) && (n % 2 == 0) => {
        val y = pow(x, n / 2)
        y * y
      }
      case (x,n) if (n > 0) && (n % 2 == 1) => x * (pow(x,n-1))
      case (x,n) if (n < 0) => 1 / pow(x, -n)
    }
  }

}