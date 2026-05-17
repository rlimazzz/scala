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

    // you can also specify the type of the variable (Int, String, Boolean, Float, Double)
    var op1 : Int = 5
    var op2 : Int = 10
    var op3 : Float = 3.4
    var result : Int = op1 * op2
    var result2 : Float = op3 * op2
    println(s"$result , $result2")