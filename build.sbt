ThisBuild / version := "0.1.0-SNAPSHOT"

// ここを指定します
ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "HelloWorld"
  )