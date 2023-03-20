package section04


fun main() {
    var list = fizzBuzz(16)
    println(list)
}

private fun fizzBuzz(n: Int): List<String> {

    var list = mutableListOf<String>()
    var element: String

    for (counter in 1..n) {

        element = counter.toString()
        
        if (counter % 3 == 0) element = "Fizz"
        if (counter % 5 == 0) element = "Buzz"
        if (counter % 3 == 0 && counter % 5 == 0) element = "FizzBuzz"

        list.add(element)
    }

    return list
}