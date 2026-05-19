import scala.collection.mutable.Map

@main def setsTheory() : Unit = {
    var jetSet = Set("Boeing", "AirBus")

    /* 
     You can check if there is a specific element by using the following: 
     */
    println(jetSet("Boeing"))
    // or maybe
    println(jetSet.contains("Boeing"))
    //printing elements from a set
    jetSet.foreach(s => if(s != jetSet.last) print(s + ", ") else println(s))

    jetSet += "Nasa"
    jetSet.foreach(s => if(s != jetSet.last) print(s + ", ") else println(s))

    /* 
    Although the default set implementations produced by the mutable and
    immutable Set factory methods shown thus far will likely be sufficient for
    most situations, occasionally you may want an explicit set class. Fortunately,
    the syntax is similar. Simply import that class you need, and use the factory
    method on its companion object. For example, if you need an immutable
    HashSet, you could do this:

        import scala.collection.immutable.HashSet
        val hashSet = HashSet("Tomatoes", "Chilies")
        println(hashSet + "Coriander")
     */

    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    //functional style of a for loop
    for(arg <- treasureMap) {
        println(arg)
    }

}