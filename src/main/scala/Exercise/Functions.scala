package Exercise

@main
def Functions():Unit=
  def functionPositiveOrNot(x: Int): String = x match
    case n if n > 0 => "positive"
    case 0 => "zero"
    case _ => "negativo"
  println(functionPositiveOrNot(8))

  def neg(pred: String => Boolean) =
    (s: String) => !pred(s)
  val negLambda: (String => Boolean) =>(String => Boolean) =
    pred => s => !pred(s)
  val isShort: String => Boolean = _.length <5
  val isNotShort = neg(isShort)
  val isNotSort2= negLambda(isShort)
  println(isNotShort("hello"))