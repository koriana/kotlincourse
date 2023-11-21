class practica6 {
   /**
   //
   // Estructura de control: When
   //
   val colorName = "White"
   when (colorName) {
   "Yellow" -> { // No simplificado, con {}
   println("Is the color of the sun")
   }
   "Blue", "White" -> println("Is the color of the sky") // Simplificado, sin {} + al colocar "," se agrupan opciones
   else -> println("IDK")
   }

   val code = 500
   when (code){
   in 200..299 -> println("Status code: OK") // in var1..var2 is for indicate a range
   in 400..499 -> println("Status code: User error")
   else -> println("No info")
   }

   val shoesSize = 35
   val message = when (shoesSize){ // Assign a condition (when) to a variable
   29,30,31,32,33 -> println("Kids size, available")
   34,35,35,36 -> println("Small feet size, available")
   37,38,39,40 -> println("Big feet size, not available")
   else -> println("No inventory, not available")
   }
   println(message)

   println("Write a number between 1 to 10")
   val chosenNumber = Integer.valueOf(readLine()) // User input + chance value from string to integer
   when (chosenNumber){
   4 -> println("WINNER!")
   else -> println("Not a winner! You loooose")
   }
   println("You chose $chosenNumber!")
   }
    **/
}