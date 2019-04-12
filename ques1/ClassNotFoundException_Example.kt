package ques1

fun main() {
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver")
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
    }
}