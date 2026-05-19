@main def arraysTheory() : Unit = {
    // Arrays and Lists are 0 indexed but Tuples no
    val firstArray : Array[Int] = Array(1, 2, 3, 4, 5)

    println(firstArray(1))
    firstArray(1) = 4
    firstArray.foreach(i => if(i == firstArray.last) print(s"$i\n") else print(s"$i,"))

    /* 
    STRUCTURAL SHARING : 
    The thing in functional programming is that creating copies of
    arrays or any other structure is O(1) because it does not create another
    block of memory like in the imperative programming paradigm, it just points the
    new array with the new elements to the old block of memory
     BUT THIS IS NOT APPLIED TO Arrays SINCE ARRAYS ARE MUTABLE AND THIS IS ONLY APPLIED TO IMMUTABLE FUNCTIONAL DATA STRUCUTRES
     */
    val secondArray = firstArray.map(i => i + 1)
    secondArray.foreach(i => if(i == secondArray.last) print(s"$i\n") else print(s"$i,"))

    firstArray.foreach(i => if(i == firstArray.last) print(s"$i\n") else print(s"$i,"))
}