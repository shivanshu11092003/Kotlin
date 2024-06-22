// during calling data we get succes  or error in this we use sealed classes
sealed class Data{
    data class success(val data: String):Data()
    data class failure(val data: String):Data()
    object loading : Data()
}
fun getdata():Data {
    return Data.failure((100..1000).random().toString())
}
fun main(){
    val data = getdata()
    when(data){
        is Data.success -> {
            println(data)

        }
        is Data.failure -> {
            println(data)

            
        }
        is Data.loading -> {
            println(data)
            
        }
    }
}