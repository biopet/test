import java.io._
object Bla {
  def main(args: Array[String]): Unit = {
    generateTextFile(documentation,fileName)
  }

  def generateTextFile(
                      text: String,
                      fileName: String
                      ): Unit = {
    val printWriter = new PrintWriter(new File(fileName))
    printWriter.write(text)
    printWriter.close()
  }
  val documentation: String =
    """This is a very long string.
      |It contains newlines.
      |It is Markdown.
      |
      |# YES MARKDOWN
      |
      |Who would have thought that?
      |It also contains
      |```
      |arbitrary code
      |```
      |And some more `stuff` like that. Such as:
      |* This
      |* Stuff
      |* ReST is better
      |
      |Paragraph1
      |
      |Paragraph2.
    """.stripMargin

  val fileName = "README.md"
}
