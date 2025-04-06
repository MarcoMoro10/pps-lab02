package Exercise

@main
def sumTypeExercise():Unit=
  enum Expr:
    case Literal(number:Int)
    case Add(x: Expr, y:Expr)
    case Multiply(x:Expr, y:Expr)

  object ExprOps:
    def operations(exp:Expr):Int= exp match
      case Expr.Literal(value) => value
      case Expr.Add(left,right) => operations(left) + operations(right)
      case Expr.Multiply(left,right) => operations(left) * operations(right)

    def shows(expr: Expr): String = expr match
      case Expr.Literal(value) => value.toString()
      case Expr.Add(left, right) => "(" + shows(left) + "+" + shows(right) + ")"
      case Expr.Multiply(left, right) => "(" + shows(left) + "*" + shows(right) + ")"

  import Expr._
  import ExprOps._
  val exp = Add(Literal(3), Multiply(Literal(9), Literal(5)))
  println(shows(exp))
  println(operations(exp))
  

