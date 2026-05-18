@main def test2(args : String*) : Unit = {
    // String* means not constant quantity of arguments
    args.foreach(arg => println(arg))
}