import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

lazy val root = (project in file("."))
  .settings(
    name := "service-a",
    libraryDependencies += scalaTest % Test)
  .enablePlugins(ScalafmtPlugin, ScalafixPlugin)

scalacOptions += "-Ywarn-unused"