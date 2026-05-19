@main def tuplesTheory() : Unit = {
    // Unlike Lists, Tuples can contain elements of different types
    val firstTuple = (99, "Ryan", true)
    println(firstTuple._1)
    println(firstTuple._2)

    /* 
    You may be wondering why you can’t access the elements of a tuple
    like the elements of a list, for example, with “pair(0)”. The reason
    is that a list’s apply method always returns the same type, but each
    element of a tuple may be a different type: _1 can have one result type,
    _2 another, and so on. These _N numbers are one-based, instead of zero-
    based, because starting with 1 is a tradition set by other languages with
    statically typed tuples, such as Haskell and ML.
     */
}