class practica6 {
   /**
   // Sets (collections): Set<T> stores unique elements; their order is generally undefined.
   // null elements are unique as well: a Set can contain only one null.
   // Two sets are equal if they have the same size, and for each element of a set there is an equal element in the other set.
   // Also, they can be only-read and mutables.

   val setOfVocals = setOf("a","e","i","o","u","a","e","i","o","u",) // only-read and only shows the first value (when are duplicated ones)
   println(setOfVocals)

   val setOfNumbers = mutableSetOf(1,2,3,4) // mutable set
   println(setOfNumbers)
   setOfNumbers.add(5) // adding elements to a mutable set
   println(setOfNumbers)

   setOfNumbers.remove(5) // deleting elements: only apply to a specific item, not according to the position of it
   println(setOfNumbers)

   val selectedNumbers = setOfNumbers.first{item -> item > 2} // to select the first value according a condition
   println(selectedNumbers)

   val selectedNumbersNull: Int? = setOfNumbers.firstOrNull{ item -> item > 2} // to select the first nullable value according a condition
   println(selectedNumbersNull)
    **/
}