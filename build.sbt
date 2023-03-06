name := "service"
scalaVersion := "2.13.10"

lazy val compileDependencies = 
  Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.2.10"
  )

libraryDependencies ++= compileDependencies
