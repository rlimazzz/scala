@main def test(args: String) : Unit = {
    var i : Int = 0
    while (i < args.length) {
        println(args(i))
        i += 1
    }
}