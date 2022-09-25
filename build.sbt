lazy val helloindigo =
  (project in file("."))
    .enablePlugins(ScalaJSPlugin, SbtIndigo)
    .settings( // Normal SBT settings
      name         := "helloindigo",
      version      := "0.0.1",
      scalaVersion := "3.2.0",
      organization := "helloindigo",
      libraryDependencies ++= Seq(
        "org.scalameta" %%% "munit" % "0.7.29" % Test
      ),
      testFrameworks += new TestFramework("munit.Framework")
    )
    .settings( // Indigo specific settings
      showCursor            := true,
      title                 := "Hello, Indigo! - Made with Indigo",
      gameAssetsDirectory   := "assets",
      windowStartWidth      := 550,
      windowStartHeight     := 400,
      disableFrameRateLimit := false,
      backgroundColor       := "black",
      electronInstall       := indigoplugin.ElectronInstall.Latest,
      libraryDependencies ++= Seq(
        "io.indigoengine" %%% "indigo-json-circe" % "0.14.0",
        "io.indigoengine" %%% "indigo"            % "0.14.0",
        "io.indigoengine" %%% "indigo-extras"     % "0.14.0"
      )
    )

addCommandAlias("buildGame", ";compile;fastOptJS;indigoBuild")
addCommandAlias("runGame", ";compile;fastOptJS;indigoRun")
