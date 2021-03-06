/**
  * With <3 by matej on 09/05/16.
  */
object Meeting1 {
  def main(args: Array[String]) {
    def sumList(lst: List[Int]): Int = {
      if (lst.isEmpty) 0
      else lst.head + sumList(lst.tail)
    }

    def myMap(fn: Int => Int, lst: List[Int]): List[Int] = {
      if (lst.isEmpty) List.empty
      else List(fn (lst.head)) ::: myMap(fn, lst.tail)
    }

    val sampleList = List(1, 2, 3, 4, 5)

    println(sumList(sampleList))
    myMap(_ + 1, sampleList) foreach println
  }
}