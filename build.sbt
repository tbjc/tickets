name := "Tickets"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  // example version, use the "which version..." tool to determine the correct one
  "be.objectify" %% "deadbolt-java" % "2.4.0"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
// routesGenerator := InjectedRoutesGenerator


fork in run := false