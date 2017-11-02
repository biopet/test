name := "test"

version := "0.1"

sbt.version := 0.13

scalaVersion := "2.11.11"

libraryDependencies += "org.planet42" %% "laika-core" % "0.7.0"

enablePlugins(LaikaSitePlugin)
enablePlugins(SiteScaladocPlugin)
enablePlugins(GhpagesPlugin)
enablePlugins(PreprocessPlugin)


preprocessVars in Preprocess := Map("VERSION" -> version.value)


git.remoteRepo := "git@github.com:biopet/test.git"
ghpagesRepository := file("target/gh")

// Puts Scaladoc output in `target/site/api/latest`
siteSubdirName in SiteScaladoc := s"${version.value}/api"

excludeFilter in ghpagesCleanSite := new FileFilter{
    def accept(f: File) = true
  }
