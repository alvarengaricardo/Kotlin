package section04

fun main() {

    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    x = 0
    do {
        println("x = $x")
        x += 3
    } while (x < 10)

    for (item in 1..10) {
        println("item = $item")
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()

    for (ch in "Ricardo") {
        println(ch)
    }

    for (chars in 'a'..'z') {
        print(chars)
    }
    println()
    
}