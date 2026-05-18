class Parametrization(text: String*) {
    def teste() : Unit = {
        // Interesting thing to notice is that if your element that youre running through is a String the arg needs to be a Char
        text.foreach((arg : String) => println(arg))
    }
}

@main def testez() : Unit = {
    val valor = Parametrization("Hello World I'm Ryan")
    val greetStrings = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!\n"
    
    for(i <- 0 to 2) 
        print(greetStrings(i))
        
    valor.teste()
}