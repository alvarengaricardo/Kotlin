package section05

fun main(){

    val location = object{
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")

    val location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt(){
            println("Coordinatres = ($xCoordinate, $yCoordinate)")
        }
    }
    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000
    location2.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Temperature = $temperature")
}

object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}