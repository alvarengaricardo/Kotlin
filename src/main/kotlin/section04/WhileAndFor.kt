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

    for (ch in "Ricardo"){
        println(ch)
    }
}