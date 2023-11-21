class practica6 {
   /**
   // Extended functions
   // this is to transform your created functions as an extension,
   // like the ones that have kotlin --> ex.: .random()
   val randomSentence = "This is a random sentence".isUpperOrLower()
   printSentence(randomSentence)
   }

   fun printSentence (sentence: String){ // Unit fun
   println("Your sentence is: $sentence")
   }

   fun String.isUpperOrLower() : String {
   val number = 0..6
   val randomNumber = number.random()
   return if (randomNumber % 2 == 0) {
   this.uppercase()
   } else {
   this.lowercase()
   }
   }

   /** Basic function
   fun main(args: Array<String>) {
   // Functions
   val randomSentence = "This is a random sentence"
   printSentence(isUpperOrLower(randomSentence))
   }
   fun printSentence (sentence: String){ // Unit fun
   println("Your sentence is: $sentence")
   }

   fun isUpperOrLower (sentence : String) : String {
   val number = 0..6
   val randomNumber = number.random()
   return if (randomNumber % 2 == 0) {
   sentence.uppercase()
   } else {
   sentence.lowercase()
   }
   }
    **/
    **/
}