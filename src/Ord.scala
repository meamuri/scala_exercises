object App {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 5, 11, 8)
    val res = isSorted[Int](arr, (a, b) => { a <= b })
    print(res)
  }
  
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int, curr: Boolean): Boolean = {
      if (n == as.length - 1) curr
      else { loop(n + 1, ordered(as(n), as(n+1))) }
    }
    loop(0, curr = true)
  }
}