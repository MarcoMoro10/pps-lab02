package Exercise

import scala.annotation.tailrec

@main
def Recursion():Unit=
  def power(base:Double, exponent:Int ):Double = {
    @tailrec
    def pow(base: Double, expo: Int, acc: Double): Double = expo match {
      case 0 => 1
      case 1 => base
      case _ => pow(base, expo - 1, acc * base)
    }

    pow(base, exponent, 1)
  }

  println(power(2,3))

  def power2(base:Double, exponent:Int):Double ={
    require(exponent >=0, "Exponent must be positive")
    if (exponent ==0) 1.0
    else base * power2(base, exponent-1)
  }
  println(power2(2, 3))
