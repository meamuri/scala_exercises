package ch2

object ex2_Ord {
  /**
   *  SomeDocString
   */
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int, curr: Boolean): Boolean = {
      if (n == as.length - 1) curr
      else { loop(n + 1, ordered(as(n), as(n+1))) }
    }
    loop(0, curr = true)
  }

}