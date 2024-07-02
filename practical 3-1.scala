object q1{
    def stringreverse(s: String):String = s match {
        case x if (x.isEmpty) => ""
        case _ => stringreverse(s.tail) + s.head
    }

    def main(args: Array[String]): Unit = {
        val input = "Hello World!"
        val reversed = stringreverse(input)
        println(stringreverse(input))
    }
}
