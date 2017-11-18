package ch2

object ex3_Curry {
  def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
    (a: A) => f(a, _: B)
  }
}
