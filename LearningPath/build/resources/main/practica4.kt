class practica4 {
   /** //-----
    // Variable condicional if
    //-----
    val name = "Maria"
    if (name.isNotEmpty()) {
        println("El nombre es de longitud: ${name.length}")
    } else {
        println("¡El nombre está vacio!")
    }
    // Versión simplificada
    /** if (nombre.isNotEmpty()) println("El nombre es de longitud: ${nombre.length}") else println("¡El nombre está vacio!}") **/
    val message : String
    if (name.length > 4){
        message = "¡El nombre es largo!"
    } else if (name.isEmpty()) {
        message = "¡No tienes nombre!"
    }
    else {
        message = "¡El nombre es corto!"
    }
    println(message)
    // Versión simplificada
    /**
     *     val message : String
     *     if (name.length > 4) message = "¡El nombre es largo!" else if (name.isEmpty()) message = "¡No tienes nombre!"
     *     else message = "¡El nombre es corto!"
     *     println(message)
    } **/
   **/
}