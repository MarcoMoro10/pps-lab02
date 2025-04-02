package Exercise

@main
def Currying(): Unit=
  def predCurry(x:Int, y: Int, z:Int):Boolean = x match
    case n if n < y && y== z => true
    case _ => false

  def predCurryMultiple(x:Int)(y:Int)(z:Int):Boolean = x match
    case n if n < y && y==z => true
    case _ => false
  //curried
  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y==z
  //Non-curried function as a val
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

  println(predCurry(4,7,7))
  println(predCurryMultiple(2)(4)(6))
  println(p1(2)(3)(3)) // true
  println(p2(2, 3, 3)) // true
