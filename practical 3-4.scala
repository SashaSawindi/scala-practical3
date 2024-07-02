object EvenSum {
  def sumEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val inputNumbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEvens = sumEvenNumbers(inputNumbers)
    println(s"The sum of all even numbers in the list is $sumOfEvens")
  }
}
