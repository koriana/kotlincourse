class practica8 {
   /**
    // Class: Try ... catch
    var name: String? = null
   // name!!.length // DON'T! It's to force a nullable variable to do something, this could generate a crash!
   //name?.length // If the var is nullable the line won't be executed and an error will be avoided
   //println(name?.length) // This will print 'null'
    try {
       // name!!.length // generate an exception (with the !! and it's a null var)
        throw NullPointerException("Null ref") // To throw an exception object, use the throw expression:
    } catch (exception : NullPointerException){ // this indicates which exception type is going to be catches
        println("ERR was in place")
    } finally {
        println("There's an error, closing the app")
    }

    // Another example with a math expression
    val numberOne = 10
    val numberTwo = 0
    val result = try { numberOne/numberTwo } catch ( exception : Exception ){ 0 }
        println(result)
    **/
}