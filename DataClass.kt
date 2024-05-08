data class Person( val id : String,
val fname : String,
val lname : String,
val country : String
){
    fun  getname() =  "$fname $lname"
}
// no blank class 
// can't inherit a data class with another data class

// when we use data keyword we cann't use open and abstract keyword
fun main(){
    val person = Person("01", "shivanshu", "Gupta", "India")
    println(person.getname())
    println(person.component3())
    println(person.component1())
}