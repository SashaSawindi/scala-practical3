object StringFilter {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputStrings = List("Scala", "programming", "is", "fun", "and", "powerful")
    val filteredStrings = filterLongStrings(inputStrings)
    println("Filtered strings: " + filteredStrings.mkString(", "))
  }
}
