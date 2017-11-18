package ch2


object ch2_App {
  def run(n: Int) {
    n match {
      case 1 => println(ex1_Fib.fib(6))
      case 2 =>
            val arr = Array(1, 2, 5, 11, 8)
            val res = ex2_Ord.isSorted[Int](arr, (a, b) => { a <= b })
            print(res)
      case _ => println("ooops")
    } // .. match
  } // .. def run
  
} // .. obj