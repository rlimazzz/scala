@main
def variables() : Unit = 
    // vals are constants and cannot be reassured any other value after the first assure
    val test1 = "Hello World!"
    println(s"World?? $test1")

    // with vars can modify the values inside of it
    var test2 = "Ryan"
    println(s"Hello $test2")
    test2 = "Ryan Gabryel"    
    println(s"Hello $test2")
