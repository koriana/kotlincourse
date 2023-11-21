class practica6 {
   /**
   // Class: For, foreach + map & filter functions

   val fruits = listOf("Peach", "Watermelon", "Banana", "Strawberry", "Passion Fruit")
   for (fruit in fruits) println("The fruit name is: $fruit")
   /*for (fruit in fruits) { //long way
   println("The fruit name is: $fruit")
   }*/
   fruits.forEach { fruit -> println("The new fruit that I'm gonna eat today is: $fruit") } //Simplify way of doing a for, is executed while a item exists in the collection (list)

   //forEach function can be mixed with another functions, like "map()" or "filter()"
   val fruitlength = fruits.map { fruit -> fruit.length }
   println(fruitlength)

   val filteredfruits = fruits.filter { fruit -> fruit.length > 6 }
   println(filteredfruits)

   val filteredfruitsInt = fruitlength.filter { fruit -> fruit > 6 }
   println(filteredfruitsInt)    **/
}