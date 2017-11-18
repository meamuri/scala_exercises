package ch2

object ex1_Fib {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def rec(n: Int, prev: Int, curr: Int): Int = {
      if (n == 1) curr
      else rec(n-1, curr, curr + prev )
    }
    rec(n, 0, 1)
  }
  
}