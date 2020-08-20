
Global / onChangedBuildSource := ReloadOnSourceChanges

Global / onLoad := {
  (Global / onLoad).value andThen (state => "project exercises" :: state)
}

lazy val `exercises` = (project in file("exercises"))
  .settings(ThisBuild / scalaVersion := Version.scalaVersion)
  .configure(CommonSettings.configure)
   .enablePlugins(PlayScala)
   .settings(libraryDependencies += guice)

