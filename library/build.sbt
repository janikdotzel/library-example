import Dependencies._

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.2.10"
ThisBuild / organizationName := "janikdotzel"
ThisBuild / organization := "io.github.janikdotzel" // used as `groupId`
ThisBuild / name := "library" // used as `artifactId`
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / licenses := Seq("APL2" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / description := "An example library for a showcase"
ThisBuild / scalacOptions += "-Ywarn-unused"

lazy val root = (project in file("."))
  .settings(
      name := "library",
      libraryDependencies += scalaTest % Test)
  .enablePlugins(ScalafmtPlugin, ScalafixPlugin, Sonatype, SbtPgp)

// Cross Publishing
val Scala213 = "2.13.10"
val Scala212 = "2.12.17"
crossScalaVersions := Seq(Scala213, Scala212)
crossVersion := CrossVersion.binary

// Throw error in case of a version conflict
// conflictManager := ConflictManager.strict

// Settings for publishing to sonatype
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("janikdotzel", "library-example", "janikdotzel96@gmail.com"))
sonatypeCredentialHost := "s01.oss.sonatype.org"
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
publishTo := sonatypePublishToBundle.value