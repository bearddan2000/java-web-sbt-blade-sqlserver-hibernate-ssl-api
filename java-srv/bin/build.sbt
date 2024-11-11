lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "SQL Server Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    
"org.postgresql" % "postgresql" % "42.2.18.jre7",
    "com.google.code.gson" % "gson" % "2.9.0",
    "org.hibernate" % "hibernate-core" % "5.3.7.Final",
    "javax.persistence" % "javax.persistence-api" % "2.2",
    "jakarta.xml.bind" % "jakarta.xml.bind-api" % "2.3.3",
    "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.3",
    "org.apache.commons" % "commons-lang3" % "3.14.0",
    "org.webjars" % "bootstrap" % "4.2.1",
    "com.bladejava" % "blade-mvc" % "2.0.14.RELEASE"
   ),

  mainClass := Some("example.Main")
)