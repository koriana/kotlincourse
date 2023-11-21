class practica6 {
   /**
   //
   // Maps: Maps Map<K, V> is not an inheritor of the Collection interface; however, it's a Kotlin collection type as well.
   // A Map stores key-value pairs (or entries); keys are unique, but different keys can be paired with equal values.
   // The Map interface provides specific functions, such as access to value by key, searching keys and values, and so on.

   val superheroesAge = mapOf( // Read-Only map
   "Ironman" to 43,
   "Black Widow" to 30,
   "Hulk" to 35,
   "Gamora" to 30
   )
   println(superheroesAge)

   val superheroesAgeMutable = mutableMapOf( // Mutable map of
   "Batman" to 45,
   "Aquaman" to 28,
   "Wonder woman" to 25,
   "Harley Quinn" to 26
   )
   println(superheroesAgeMutable)

   // Add values to a Mutable collection
   superheroesAgeMutable.put("The Joker", 35) // One way
   println(superheroesAgeMutable)
   superheroesAgeMutable["Robin"] = 21 // Simplify way
   println(superheroesAgeMutable)

   // Get items
   val gamoraAge = superheroesAge["Gamora"]
   println(gamoraAge)
   val robinAge = superheroesAgeMutable["Robin"]
   println(robinAge)

   // Delete items
   superheroesAgeMutable.remove("The Joker")
   println(superheroesAgeMutable)

   // Get all keys
   println(superheroesAge.keys)
   println(superheroesAgeMutable.keys)
   // Get all values
   println(superheroesAge.values)
   println(superheroesAgeMutable.values)

    **/
}