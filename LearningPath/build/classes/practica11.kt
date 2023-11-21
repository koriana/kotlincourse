class practica123 {

   /**
   // Sort lists
   val loteryNumber = listOf(34,55,66,77,198,10)
   println(loteryNumber)

   val loterySorted = loteryNumber.sorted() // sort by ascending
   println(loterySorted)

   val loterySortedDesc = loteryNumber.sortedDescending() // sort by descending
   println(loterySortedDesc)

   val loterySortedByCondition = loteryNumber.sortedBy { lotery -> lotery < 50 } // sort by a condition
   // this condition is going to eval each position and compare if it's < than 50, if is true is going to place last,
   // so if the number in position 0 is more than 50 is going to be first in line
   println(loterySortedByCondition)

   val loteryShuffled = loteryNumber.shuffled() // sort by shuffled
   println(loteryShuffled)

   val loteryReverse = loteryNumber.reversed() // sort by reversing the position
   println(loteryReverse)

   val numberList = loteryNumber.map { number -> "Your lotery number is: $number" } // transform your list into a message
   println(numberList)

   val filteredList = loteryNumber.filter { number -> number > 50 } // filter according a condition
   println(filteredList)

   val filteredListDiv = loteryNumber.filter { number -> number % 2 == 0 } // filter according a condition
   println(filteredListDiv)

   // You can use several functions
   val allInOne = loteryNumber.shuffled().filter { number -> number % 3 == 0 }.map{ number -> "The winners are: $number"}
   println(allInOne)
    **/
}