package section04

fun main() {

    val myInt = 199
    val anInt: Int = 7

    val lowest = if (myInt < anInt) myInt else anInt
    println(lowest)

    val temp = 22
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm.")
        true // return
    } else {
        println("It is not so warm.")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}