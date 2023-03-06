name := "service"
scalaVersion := "2.13.8"

lazy val compileDependencies = 
  Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.4.5"
  )

libraryDependencies ++= compileDependencies
