import indigoplugin._

lazy val helloindigo =
  (project in file("."))
    .enablePlugins(ScalaJSPlugin, SbtIndigo)
    .settings( // Normal SBT settings
      name         := "helloindigo",
      version      := "0.0.1",
      scalaVersion := "3.3.1",
      organization := "helloindigo",
      libraryDependencies ++= Seq(
        "org.scalameta" %%% "munit" % "0.7.29" % Test
      ),
      testFrameworks += new TestFramework("munit.Framework")
    )
    .settings( // Indigo specific settings
      indigoOptions :=
        IndigoOptions.defaults
          .withTitle("Hello, Indigo! - Made with Indigo")
          .withBackgroundColor("black"),
      libraryDependencies ++= Seq(
        "io.indigoengine" %%% "indigo-json-circe" % "0.15.1",
        "io.indigoengine" %%% "indigo"            % "0.15.1",
        "io.indigoengine" %%% "indigo-extras"     % "0.15.1"
      )
    )

addCommandAlias("buildGame", ";compile;fastOptJS;indigoBuild")
addCommandAlias("runGame", ";compile;fastOptJS;indigoRun")
