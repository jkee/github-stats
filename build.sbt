name := "github-stats"

version := "0.1"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "com.ning" % "async-http-client" % "1.7.12",
    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.12",
    "org.slf4j" % "slf4j-api" % "1.7.5",
    "org.slf4j" % "slf4j-log4j12" % "1.7.5",
    "log4j" % "log4j" % "1.2.17",
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.1.3",
    "org.eclipse.mylyn.github" % "org.eclipse.egit.github.core" % "2.1.3"
)
