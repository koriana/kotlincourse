class practica123 {

   /** const val PI = 3.1416 // const are compile in compilation process, this variable is just for lecture, won't change

    fun main(args: Array<String>) {
        //-----
        // Variable class
        //-----
        var money = 10  // minimalist definition + "var" are a read and write variables, var only go inside of functions
        var money2 : Int = 15 // explicit definition
        println(money)
        println(money2)
        money = 20 // var can change in a function
        println("Hello World!")
        println(PI) // You can print const in a function
        val name = "Luisa" // "val" are a write variables, they can't change inside a function
        println(name)
        println("Fin clase practica 1")
        println("-------------------------")
        //-----
        //-----
        // Tipos de variables
        //-----
        val boolean = true // Type boolean, true or false --> explicit: val var_name : Boolean = true
        val long_var = 3L // Type long: Long is a 64-bit number, other example 300000000000000000 --> explicit: val var_name : Long = 3L
        val double_var = 4.566666 // 64-bit decimal number --> val var_name : Double = 4.566666
        val float_var = 5.4F // 32-bit decimal number --> val var_name : Float = 5.444F
        println(boolean)
        println(long_var)
        println(double_var)
        println(float_var)
        val result1 = long_var.plus(double_var)
        val result2 = long_var + double_var
        println(result1)
        println(result2)

        val nameO = "Oriana" // Type string
        val lastname = "Acosta"
        val fullname = nameO + lastname
        val fullname1 = nameO + " " + lastname
        val fullname2 = "Mi nombre es: $nameO $lastname"
        println(fullname)
        println(fullname1)
        println(fullname2)
        println("Fin clase practica 2")
        println("-------------------------")
        //-----
        // Operaciones con los tipos de datos
        //-----
        val numb1 = 1
        val numb2 = 2

        val resultB = numb1.equals(numb2)
        val resultB2 = numb1.equals(numb1)
        println(resultB)
        println(resultB2)

        val resultC1 = numb1.compareTo(numb2) // (-1) numb1 less than numb2
        val resultC2 = numb1.compareTo(numb1) // (0) numb1 equal to numb1
        val resultC3 = numb2.compareTo(numb1) // (1) numb2 more than numb1

        println(resultC1)
        println(resultC2)
        println(resultC3)


        println("Fin clase practica 3")
        println("-------------------------")
        // Try adding program arguments via Run/Debug configuration.
        // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
        println("Program arguments: ${args.joinToString()}")
    } **/
}