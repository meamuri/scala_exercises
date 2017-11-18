object ch1_App {  
  def run(n: Int): Int = {
    n match {
        1 => ()
        2 => 
            val arr = Array(1, 2, 5, 11, 8)
            val res = isSorted[Int](arr, (a, b) => { a <= b })
            print(res)
        _ => println("ooops")        
    } // .. match
  } // .. def run
  
} // .. obj