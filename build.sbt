name := "phouka"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.1.7",
    "com.typesafe" % "config" % "1.3.4",
    "org.scala-lang.modules" %% "scala-collection-contrib" % "0.2.1",
    "com.intellij" % "forms_rt" % "7.0.3",
    "org.jfree" % "jfreechart" % "1.5.0",
    "org.json4s" %% "json4s-native" % "3.6.9",
    "org.scalatest" %% "scalatest" % "3.2.3" % Test,
    "org.apache.commons" % "commons-math3" % "3.6.1",
    "org.swinglabs" % "swingx-core" % "1.6.2-2"
  )
}
fork:=true
javaOptions += "-Xms1g"
//JAVA_OPTS="-Xmx2g"
