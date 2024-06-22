interface Interface{
    fun Fnction()
}

fun main() {
    var objectExpression = object:Interface {
        override fun Fnction(){
            println("Shivanshu")
        }

    }
    objectExpression.Fnction()
}
