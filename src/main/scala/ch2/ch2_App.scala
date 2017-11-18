package ch2


object ch2_App {
  def run(n: Int) {
    n match {
      case 1 =>
        println(ex1_Fib.fib(6))
        println(ex1_Fib.fib(3))
      case 2 =>
        val arr = Array(1, 2, 5, 11, 8)
        val res = ex2_Ord.isSorted[Int](arr, (a, b) => { a <= b })
        print(res)
      case 3 =>
        val res = ex3_Curry.curry[Int, Int, Int]((a, b) => a + b)
        val f = res(5)
        println(f(7))
        println(f(9))
        println(f(19))

      case 4 =>
        val f = ex4_Uncurry.uncurry[Int, Int, Int](a => b => a + b)
        println(f(5, 6))
        println(f(1, 2))
        println(f(3, 10))

      case 5 =>
        val f = ex5_Compose.compose[Int, Int, Int]((a) => a + 10, b => b * 4)
        println(f(5))
        println(f(2))
        println(f(9))

      case _ => println("ooops")
    } // .. match
  } // .. def run
  
} // .. obj