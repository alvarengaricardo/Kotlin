package section04

import kotlin.math.abs

fun main(){

    val pizzasOrdered = 4

    when(pizzasOrdered){
        0 -> println("Not hungry.")
        1, 2 -> println("Hungry.")
        in 3.. 5 -> println("Very hungry.")
        else -> println("Are you sure?")
    }

    when{
        pizzasOrdered <= 0 -> println("None ordered.")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered.")
        pizzasOrdered % 2 == 0 -> println("Even number ordered.")
    }

}