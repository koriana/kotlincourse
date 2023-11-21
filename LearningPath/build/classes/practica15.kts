/**
 *     // option #1
 *     // fullName("Oriana", "Veronica", "Acosta") // Not a good practice (not assign the param)
 *     // option #2
 *     fullName(name= "Oriana", lastname = "Acosta")
 * }
 * // Params types in a function: Normals and by defect
 *
 * fun fullName (name: String, secondname: String = "", lastname: String) { //secondname is type -> by defect
 *     // option #1
 *     // println("My name is: $name, my second name is: $secondname and my last name is: $lastname")
 *     // option #2
 *     println("My fullname is: $name $secondname $lastname")
 */