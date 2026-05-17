def max(x : Int, y : Int) : Int = {
    if(x > y) x
    else y
}

@main def result() : Unit = {
    var val1 : Int = 4
    var val2 : Int = 10

    var result : Int = max(val1, val2)

    print(s"The biggest value is : $result\n")
}