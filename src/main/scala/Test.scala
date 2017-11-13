import java.io.{File, PrintWriter}

import Tool.Documentation.getClass

import scala.io.Source

object Test {
  val docsDir="target/"

  def main(args: Array[String]): Unit = {
    val outputFile = new File(docsDir + "default.template.html")
    outputFile.createNewFile()
    val printWriter = new PrintWriter(outputFile)

  val htmlSource = getClass.getResourceAsStream("default.template.html")
  val lines: Iterator[String] = Source.fromInputStream(htmlSource).getLines
  lines.foreach(line => printWriter.println(line))
  printWriter.close()
  }
}

