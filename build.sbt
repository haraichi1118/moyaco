name := "moyaco"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "com.typesafe.slick" %% "slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick" % "0.5.0.8",
  "commons-dbcp" % "commons-dbcp" % "1.4",
  "com.github.tototoshi" %% "slick-joda-mapper" % "0.4.0"
)     

play.Project.playScalaSettings
