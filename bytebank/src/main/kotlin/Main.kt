import java.rmi.AlreadyBoundException

fun main() {
    println("Welcome to ByteBank!")

    val conta = Conta()
    conta.titular = "Alex"

    
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0

}