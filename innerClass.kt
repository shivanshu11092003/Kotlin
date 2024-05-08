class Box(val len : Int,val brea :Int,val hei : Int){

    inner class content(val content : String){
        fun printBoxInfo(){
            println("$len,$brea,$hei")
        }
        fun printContent(){
            println(content)
        }
    }
}
fun main(){
    val box = Box(10,5,9)
    val content = box.content("This is Content")
    content.printContent()
    content.printBoxInfo()
}