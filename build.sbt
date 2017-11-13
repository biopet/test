name := "test"

version := "0.1"

import LaikaKeys._
import org.apache.xalan.xsltc.cmdline

scalaVersion := "2.11.11"

enablePlugins(LaikaSitePlugin)
enablePlugins(SiteScaladocPlugin)
enablePlugins(GhpagesPlugin)
enablePlugins(PreprocessPlugin)

//def createMarkdownDocs(docsDir: File): Seq[File] = {
//List(new File("bla")) }

preprocessVars in Preprocess := Map("VERSION" -> version.value)

val docsDir: String="target/markdown/"

sourceDirectory in LaikaSite := file(docsDir)
sourceDirectories in Laika := Seq((sourceDirectory in LaikaSite).value)


git.remoteRepo := "git@github.com:biopet/test.git"
ghpagesRepository := file("target/gh")

// Puts Scaladoc output in `target/site/api/latest`
siteSubdirName in SiteScaladoc := s"${version.value}/api"

excludeFilter in ghpagesCleanSite := new FileFilter{
    def accept(f: File) = true
  }

lazy val generateDocs = taskKey[Unit]("Generate documentation files")

fullRunTask(generateDocs, Test , "Documentation", docsDir)

makeSite <<= makeSite.triggeredBy(generateDocs)
