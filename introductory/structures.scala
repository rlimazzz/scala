@main def structures() : Unit = {
    val twoThree = List(2, 3)
    // cons :: usage 
    val oneTwoThree = 1 :: twoThree
    val lista = 1 :: 2 :: 3 :: 1 :: Nil
    // To create a list on this way the end need to be always a Nil value
    // Nil represents a empty list, so in the scala order of operands we are adding the values from right to left in an initial empty Nil List
    val fruits = "Orange" :: "Apple" :: "Grapes" :: "Pineapple" :: Nil
    println(lista(2))

    // Take care : .length returns the size of an array
    val resultCountOnes = lista.count(numOnes => numOnes == 1)

    println(s"Counting Ones : $resultCountOnes")
    println(lista)
    println(oneTwoThree)
}