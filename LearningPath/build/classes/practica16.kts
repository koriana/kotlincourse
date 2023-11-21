/*
 * // Lambdas: https://kotlinlang.org/docs/lambdas.html#destructuring-in-lambdas
 *
 *    // val myLambda: (String) -> Int = {// You could use it to refer the value of the lambda, but if you have another
 *         // lambda inside of it could get confusing, so is better not to use it
 *        // it.length
 *    // }
 *
 *     val myLambda: (String) -> Int = {value -> value.length}
 *    // println(myLambda) // Here, you're just trying to print a function
 *     val executedLambda = myLambda("Hola qlq el mía?") // calling the lambda and putting the required parameter
 *     println(executedLambda)
 *
 *     // Is possible to pass a lambda as param of another function
 *     val waveList = listOf("Hello","Hola","Hallo","Ciao","Annyeong")
 *     val lenghtWaves = waveList.map(myLambda) // This is very useful is you want to do a couple operations to several lists
 *     // it's same this way -->
 *     val lenghtWaves2 = waveList.map { value -> value.length }
 *     println(lenghtWaves)
 *     println("____")
 *     println(lenghtWaves2)
 */