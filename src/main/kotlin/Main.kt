open class Parent(override val name: String, override val surname: String) : Child1(name,surname), Child2{

    }


open class Child1(open val name: String, open val surname: String){

    fun completeName1(): String{
        return "$name  $surname"
    }
}

interface Child2{
        val name: String
        val surname: String

        fun completeName2(): String {
            return "$name  $surname"
        }

}
fun main() {
    val p1= Parent("gina", "paoloni")
    val p2= Parent("bianca", "paolini")
    println("Children 1: ${p1.completeName1()}")
    println("Children 2: ${p2.completeName2()}")

}