import ch2.ch2_App

object App {
  def main(args: Array[String]): Unit = {
    run(2, 1)
  }

  def run(ch: Int, ex: Int): Unit ={
    ch match {
      case 2 => ch2_App.run(ex)
      case _ => println("I don't now this chapter")
    }
  }
}
