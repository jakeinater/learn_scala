ThisBuild / scalaVersion := "2.12.13"
ThisBuild / organization := "jake.co"

lazy val hello = (project in file("."))
.settings(
name := "Hello",
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.9",
libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1",
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
)


