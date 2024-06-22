// where we have lots of constant we use enum class
interface Docolor{
    fun docolor()
}
enum class Color(val colorName : String,val colorvalue: Int): Docolor {
    RED("Red",234){
        override fun docolor() {
            println("Colored With Red")
        }
    } // this red is object
}
fun  main(){
    println(Color.RED.colorName)
}