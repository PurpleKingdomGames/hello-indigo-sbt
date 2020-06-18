# "Hello, Indigo!"

![Screen grab of "Hello, Indigo!"](screenshot.png)

This is a small "hello, world"-like project to help people get started with indigo. There is a [write up](https://indigoengine.io/docs/quickstart/hello-indigo) if you'd like to follow along with how the this little demo was made.

> Note: The Mill version was built first, and it's [commit history](https://github.com/PurpleKingdomGames/hello-indigo) shows how the demo was built up.

This demo has been built using SBT, but you can use Mill, please see the [set up guide](https://indigoengine.io/docs/quickstart/setup-and-configuration).

Assuming you have [SBT](https://www.scala-sbt.org/) and http-server set up as the guide suggests, to run the demo, do the following from your command line:

```bash
sbt buildGame
```

Which will generate output similar to:

```bash
> sbt buildGame
(...)
/Users/(...)/hello-indigo-sbt/target/scala-2.13/helloindigo
dirPath: /Users/(...)/hello-indigo-sbt/target/indigo-js
Copying assets...
/Users/(...)/hello-indigo-sbt/target/indigo-js/index.html
```

Then:

1. `cd /Users/(...)/hello-indigo-sbt/target/indigo-js/`
2. `http-server -c-1`
3. Navigate to [http://127.0.0.1:8080/](http://127.0.0.1:8080/) in your browser of choice.

If you're running from a fresh checkout, make sure you click on the screen to see the dots! :-)
