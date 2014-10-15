name := "Ejercicios Scala"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.2.10",
  "org.scalacheck" %% "scalacheck" % "1.11.6" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"
)

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)