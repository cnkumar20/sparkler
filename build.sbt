name := "sparkler"

version := "0.1"

scalaVersion := "2.12.0"
// Spark Information
val sparkVersion = "2.4.4"

libraryDependencies ++= Seq(
  // spark core
  "org.apache.spark" %% "spark-core" % sparkVersion,

  // logging
  "org.apache.logging.log4j" % "log4j-api" % "2.4.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.4.1"
)

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
