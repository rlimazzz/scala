@main def structures() : Unit = {
    val twoThree = List(2, 3)
    // cons :: usage 
    val oneTwoThree = 1 :: twoThree
    val lista = 1 :: 2 :: 3 :: 1 :: Nil
    // To create a list on this way the end need to be always a Nil value
    // Nil represents a empty list, so in the scala order of operands we are adding the values from right to left in an initial empty Nil List
    // The Standart List is immutable and is implemented like a singly linked list
    val fruits = "Orange" :: "Apple" :: "Grapes" :: "Pineapple" :: Nil
    println(lista(2))
    // Take care : .length returns the size of an array
    val resultCountOnes = lista.count(numOnes => numOnes == 1)

    // To add a new element into a List you need to create another List because in Scala Lists are immutable
    println(s"List without some first n elements from left to right : ${fruits.drop(1)}")
    println(s"List without n elements from right to left : ${fruits.dropRight(1)}")
    println(s"Finding with exists some specified String(Grapes) in our List :${fruits.exists(output => output == "Grapes")}")
    val fruits2 = "Strawberry" +: fruits
    println(s"Finding the ones that has the same specified size(4): ${fruits2.filter(s => s.length == 6)}")
    println(s"Counting Ones : $resultCountOnes")
    println(lista)
    println(oneTwoThree)
}