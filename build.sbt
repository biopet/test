name := "test"

version := "0.1"

scalaVersion := "2.11.11"

enablePlugins(SiteScaladocPlugin)

enablePlugins(GhpagesPlugin)

git.remoteRepo := "git@github.com:biopet/test.git"

// Puts Scaladoc output in `target/site/api/latest`
siteSubdirName in SiteScaladoc := s"${name.value}/api/${version.value}"

