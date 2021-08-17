// give the user a nice default project!
ThisBuild / organization := "edlab.eda"
ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file(".")).settings(
  name := "frecept"
)

resolvers += Resolver.mavenLocal

libraryDependencies += "edlab.eda" % "characterization" % "0.0.1"
