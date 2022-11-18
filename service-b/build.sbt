import Dependencies._

scalaVersion := "2.13.8"
version := "0.2.0"
organizationName := "janikdotzel"
organization := "io.github.janikdotzel" // used as `groupId`
name := "service-b" // used as `artifactId`
semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision
licenses := Seq("APL2" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))
description := "An example service for a showcase"
scalacOptions += "-Ywarn-unused"


// Import Libraries from Local Ivy Repository
resolvers += Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)

lazy val root = (project in file("."))
  .settings(
        name := "service-b",
        libraryDependencies ++= Seq(
              scalaTest % Test,
              "io.github.janikdotzel" % "library_2.13" % "0.2.9"
        )
  )
  .enablePlugins(ScalafmtPlugin, ScalafixPlugin)