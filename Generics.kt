/*
Generics :- is powerful feature used to define classes and function that can work with different datatypes.




*/
class ArrayUtil<T,X>(private val array:Array<T>){
    fun findElement(element:T , foundElement : (index :Int , element : T?) -> Unit ){
        for (i in array.indices) {
            if(array[i] == element){
                foundElement(i,array[i])
                return
            }
            
        }
        foundElement(-1,null)
        return
    }
}
fun main(){
    val ArrayUtil = ArrayUtil<Int,String>(arrayOf(1,2,3,5,6))
    val ArrayUtil1 = ArrayUtil<String,Int>(arrayOf("1","2","3","5","6"))
    ArrayUtil.findElement(6) { index,element ->
    println(" Index $index") 
    println(" element $element") 
    ArrayUtil1.findElement("4") { index,element ->
        println(" Index $index") 
        println(" element $element") 
    }
}
}