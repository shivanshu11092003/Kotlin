class studentheavy{
    init{
        println("Student heavy ")

    }
}
class student{
    val heavy by lazy { studentheavy() }
}
fun  main() {
    val student = student()
    student.heavy

    
}