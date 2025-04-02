package Exercise
@main
def WarmUp():Unit=
  def mult(x:Double, y: Double):Double = x*y

  def curriedMult(x:Double)(y:Double) = x*y
  println(mult(3,4))
  println(curriedMult(3)(4))

  def divide(x: Double,y:Double):Double = x/y
  def curriedDivide(x:Double)(y: Double):Double = x / y
  val v = 8
  val s = v match
    case n if n >0 => n
    case 0 => 0
  val c = 0
  val divisore = c match
    case n if n> 0 => n
    case 0 => 1

  val twice: Double => Double = curriedDivide(s)
  println(twice(divisore))

  val triple: Double => Double = curriedMult(3)
  println(triple(10))
