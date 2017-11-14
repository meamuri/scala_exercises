object FibEx {
  def main(args: Array[String]): Unit = {    
    print(fin(5))
  }

  def fib(n: Int): Int = {
    @annotation.tailrec
    def rec(n: Int, prev: Int, curr: Int): Int = {
      if (n == 1) curr
      else rec(n-1, curr, curr + prev )
    }
    rec(n, 0, 1)
  }
  
}