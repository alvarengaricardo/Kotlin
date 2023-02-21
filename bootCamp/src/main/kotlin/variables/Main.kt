package variables

/*

    Type    Size
    ----    ----
    Long    64
    Int     32
    Short   16
    Byte    8
    Double  64
    Flat    32

 */

fun main(){

    var userName = "Ricardo"
    var age = 51
    val country = "Brazil"

    println(message = "Hello $userName, from $country!")

    userName = "Alvarenga"
    println(message = "Hello $userName, $age years old!")

    val int = 123
    val long = int.toLong()
    println("int = $int")
    println("long = $long")

    val float = 12.34f
    val double = float.toDouble()
    val otherDouble = int.toDouble()
    println("float = $float")
    println("double = $double")
    println("double = $otherDouble")
}