package Exercise

@main
def RecursiveReverse(): Unit=
  def Reverse(n:Int):Int=
    @annotation.tailrec
    def _Reversion(m:Int, acc:Int ):Int=
      if(m==0) acc
      else _Reversion(m/10, acc*10 + m%10)
    _Reversion(n, 0)

  println(Reverse(12345))
