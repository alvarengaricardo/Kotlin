package section04


fun main() {
    val list = fizzBuzz(16)
    println(list)
}

fun fizzBuzz1(n: Int): List<String> {

    val list = mutableListOf<String>()

    for (counter in 1..n) {
        val element = when {
            counter % 3 == 0 && counter % 5 == 0 -> "FizzBuzz"
            counter % 3 == 0 -> "Fizz"
            counter % 5 == 0 -> "Buzz"
            else -> counter.toString()
        }
        list.add(element)
    }
    return list
}

fun fizzBuzz(n: Int): List<String> {

    val list = mutableListOf<String>()

    (1..n).forEach() {
        val element = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(element)
    }

    return list
}