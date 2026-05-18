class Parametrization(text: String*) {
    def teste() : Unit = {
        // Interesting thing to notice is that if your element that youre running through is a String the arg needs to be a Char
        text.foreach((arg : String) => println(arg))
    }
}

@main def testez() : Unit = {
    // Other interesting thing is that the Scala compiler will transform the sentences into invocations of methods
    val valor = Parametrization("Hello World I'm Ryan")
    val greetStrings = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!\n"

    // What we are doing here is basically, calling a factory method named apply, which creates and return the array
    val numsNames = Array("zero", "one", "two")
    // This is the same as
    val numsNames2 = Array.apply("zero", "one", "two")

    for(i <- 0 to 2) 
        // To more complex outputs, it's recommended to use {} to output your string or etc
        println(s"${numsNames(i)} : ${numsNames2(i)}")

    val listz : List[Int] = List(1, 2, 3)

    listz.foreach(arg => if (arg == listz.last) print(arg + "\n") else print(arg + ", "))

    for(i <- 0 to 2) 
        print(greetStrings(i))

    valor.teste()
}