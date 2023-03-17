package section04

fun main(){
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("30 + 40 = ${myMathFunction2(30, 40)}")
    println("50 + 60 = ${myMathFunction3(50, 60)}")
    println("70 + 80 = ${myMathFunction4(70, 80)}")
    println("70 + 80 = ${myMathFunction4(70, 80, "Olá!")}")
    println("90 + 100 = ${myMathFunction5(90, 100)}")
    println("? + ? = ${myMathFunction5(txt ="Olá!")}")
}

fun myMathFunction(number1: Int, number2: Int): Int{
    return number1 + number2
}

fun myMathFunction2(number1: Int, number2: Int): Int = number1 + number2

fun myMathFunction3(number1: Int, number2: Int) = number1 + number2

fun myMathFunction4(n1: Int, n2: Int, txt: String = "Hi!"): Int {
    println(txt)
    return n1 + n2
}

fun myMathFunction5(n1: Int = 1, n2: Int = 2, txt: String = "Hi!"): Int {
    println(txt)
    return n1 + n2
}