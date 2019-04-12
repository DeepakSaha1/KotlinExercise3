sealed class Vehicle {
    open var tyres = 0
}

class Bike : Vehicle() {
    override var tyres = 2
}

class Car : Vehicle() {
    override var tyres = 4
}

class Truck : Vehicle() {
    override var tyres = 8
}

fun main() {
    println(showClassName(Bike()))
    println(showClassName(Car()))
    println(showClassName(Truck()))
}

fun showClassName(v: Vehicle): String {
    return when (v) {
        is Bike -> "Bike Class"
        is Car -> "Car Class"
        is Truck -> "Truck Class"
    }
}