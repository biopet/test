object Documentation {
  def main(args: Array[String]): Unit = {
    val docsDir=args(0)
    Tool.generatePages(docsDir)
  }
}
