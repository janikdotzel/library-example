import Dependencies._

scalaVersion := "2.13.8"
version := "0.1.0"
organizationName := "janikdotzel"
organization := "io.github.janikdotzel" // used as `groupId`
name := "library" // used as `artifactId`
semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision
licenses := Seq("APL2" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))
description := "An example library for a showcase"

import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("janikdotzel", "library-example", "janikdotzel96@gmail.com"))

// publish to the sonatype repository
publishTo := sonatypePublishToBundle.value

lazy val root = (project in file("."))
  .settings(
    name := "library",
    libraryDependencies += scalaTest % Test)
  .enablePlugins(ScalafmtPlugin, ScalafixPlugin)

scalacOptions += "-Ywarn-unused"