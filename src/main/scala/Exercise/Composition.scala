package Exercise

@main
def Composition():Unit=
  def compose(f: Int => Int, g:Int=> Int): Int => Int = x => f(g(x))
  println(compose(_ - 1, _ * 2)(5))
  def composeGeneric[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))
  def composeThree[A,B,C,D](f: C => D, g: B => C, h: A => B): A => D= x => f(g(h(x)))
  val addExclamation: String => String = _ + "!"
  val toStringFn: Int => String = _.toString
  val double: Int => Int = _ * 2
  val composed= composeThree(addExclamation, toStringFn,double)
  println(composed(3))
