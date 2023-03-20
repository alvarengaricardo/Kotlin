package section04


fun main() {
    val list = fizzBuzz(16)
    println(list)
}

fun fizzBuzz(n: Int): List<String> {

    val list = mutableListOf<String>()

    for (counter in 1..n) {
        val element = when {
            counter % 3 == 0 && counter % 5 == 0 -> "FizzBuzz"
            counter % 3 == 0 -> "Fizz"
            counter % 5 == 0 -> "Buzz"
            else -> {
                counter.toString()
            }
        }
        list.add(element)
    }

    return list
}