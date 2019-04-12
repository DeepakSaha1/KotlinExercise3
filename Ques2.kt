object SingletonExample {
    val instance = SingletonExample
}

fun main() {
    val singletonExample = SingletonExample.instance
    println(singletonExample)
}
