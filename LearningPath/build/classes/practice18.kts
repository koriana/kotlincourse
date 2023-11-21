/* fun main(args: Array<String>) {
// Scope functions
    //let -->
    // The context object is available as an argument (it).
    // The return value is the lambda result.
    //val name : String? = null // No se ejecuta porque es null
    var name = "Oriana"
    name.let { value -> println("El nombre no es null, es $name") }
    println("/* --- ---*/")
    /* --- ---*/
    // with -->
    // The context object is available as a receiver (this).
    //The return value is the lambda result.
    // As with is not an extension function: the context object is passed as an argument, but inside the lambda,
    // it's available as a receiver (this).
    //We recommend using with for calling functions on the context object when you don't need to use the returned result.
    // In code, with can be read as "with this object, do the following."

    val listOfColors = listOf("Yellow", "Red", "Blue")
    with(listOfColors){
        println("The list of colores is $this")
        println("The size of the list is $size")
    }
    println("/* --- ---*/")
    /* --- ---*/
    // run -->
    // The context object is available as a receiver (this).
    //The return value is the lambda result.
    //run does the same as with but it is implemented as an extension function. So like let, you can call it on the context object using dot notation.
    //run is useful when your lambda both initializes objects and computes the return value.
    val mobiles = mutableListOf("Google pixel 2xl", "Google pixel 4a", "Huawei redmi 9", "Samsung A50")
        .run {
            removeIf { mobile -> mobile.contains("Google") }
            this
        }
    println(mobiles)
    println("/* --- ---*/")
    /* --- ---*/
    // apply -->
    //The context object is available as a receiver (this)
    //The return value is the object itself.
    //As apply returns the context object itself,
    // we recommend that you use it for code blocks that don't return a value and that mainly operate on the members of the receiver object.
    // The most common use case for apply is for object configuration.
    // Such calls can be read as "apply the following assignments to the object."
    // Another use case for apply is to include apply in multiple call chains for more complex processing.
    val mobiles2 = mutableListOf("Google pixel 2xl", "Google pixel 4a", "Huawei redmi 9", "Samsung A50").apply {
        removeIf { mobile -> mobile.contains("Google") }
    }
    println(mobiles2)

    //val listOfColors2 : MutableList<String>? = null // apply can execute this safely
    val listOfColors2 : MutableList<String>? = mutableListOf("Yellow", "Red", "Blue")
    listOfColors2?.apply {
        println("The list of colores is $this")
        println("The size of the list is $size")
    }
    println("/* --- ---*/")
    /* --- ---*/
    // also -->
    // The context object is available as an argument (it).
    //The return value is the object itself.
    //also is useful for performing some actions that take the context object as an argument.
    // Use also for actions that need a reference to the object rather than its properties and functions,
    // or when you don't want to shadow the this reference from an outer scope.
    //When you see also in code, you can read it as "and also do the following with the object."

    val mobiles3 = mutableListOf("Google pixel 2xl", "Google pixel 4a", "Huawei redmi 9", "Samsung A50").also{
            list -> println("The original value of the list is $list")
    }.asReversed()
    println(mobiles3)
}
*/