/*
fun main(args: Array<String>) {
// High order functions: https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=36&codigo=36&inicio=30
    //val lengthOfInitialValue = superFunction(initialValue = "Hello hello!", block = {value -> value.length})
    val lengthOfInitialValue = superFunction(initialValue = "Hello hello!") { value -> value.length} //simpler
    println(lengthOfInitialValue)
    val lambda = inceptionFunction("Veronica")
    val valueLambada = lambda()
    println(valueLambada)
}

fun superFunction(initialValue : String, block : (String) -> Int) : Int{
    return block(initialValue)
}

fun inceptionFunction (name: String) : () -> String {
    return {"Hello form de lambda $name!"}
}
 */