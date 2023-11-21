class practica5 {
   /**
   // Lists and arrays

   val listOfNames = listOf<String>("Juan","Alejandro","Oriana","Veronica") // You can omit <String>
   println(listOfNames)

   // listOfNames.remove // Es una lista inmutable, nos se puede modificar

   val emptyList = mutableListOf<String>() // Mutable list, you should indicate the type (string, integer, etc...)
   println(emptyList)

   // add items (one by one) on a list
   emptyList.add("FirstWord") // you can only add one item
   println(emptyList)
   emptyList.add("SecondWord")
   println(emptyList)

   //get items on a list
   val getValueOne = emptyList.get(0)
   println(getValueOne)
   val getValueTwo = emptyList.get(1)
   println(getValueTwo)

   // get value with operator
   val getValueWithOperator = emptyList[0]
   println(getValueWithOperator)

   // get first value (when the first isn't null)
   val getFirstValue = emptyList.first()
   println(getFirstValue)

   // get first value (if you could have a null value as it)
   val getFirstNullValue : String? = emptyList.firstOrNull()
   println(getFirstNullValue)

   // remove value (just for mutable lists)
   emptyList.removeAt(0)
   println(emptyList)

   // remove with condition (if)
   emptyList.add("Third")
   println(emptyList)
   emptyList.removeIf { item -> item.length < 6 }
   println(emptyList)

   // ARRAYS
   val myArray = arrayOf(1,2,3,4)
   println("List of array: $myArray") // the result will be bytecode
   println("List of array: ${myArray.toList()}") // transform the array into a list
   **/
}