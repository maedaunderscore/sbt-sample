scalaVersion := "2.11.4"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"


credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

publishTo := {
  val nexus = "http://127.0.0.1:8081/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "content/repositories/releases")
}
