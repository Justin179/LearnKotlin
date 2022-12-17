fun main() {
    println("ok")
    People().hello()
    val p = People()
    p.hello()
}

class People{
    fun hello(){
        println("okok")
    }
}