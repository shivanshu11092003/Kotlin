

import kotlin.properties.Delegates
class studentheavy{
    init{
        println("Student heavy ")

    }
}
class student{
    // when we want lazy load to instance we use lazy keyword 
    val heavy by lazy { studentheavy() }


    // when i want to observe change in variable i will use  Delegates.observable

    var marks : Int by Delegates.observable(50){ property,oldValue,newValue ->
        println("old value $oldValue")
        println("new value $newValue")

    }
    // if  i want to intersecpt the assignment then i will use vetoable 
    var age : Int by Delegates.vetoable(14) { property,oldValue,newValue ->
        println("old value $oldValue")
        println("new value $newValue")
        newValue>=14

    
    }
}
fun  main() {
    val student = student()
    // student.heavy
    // student.marks = 70
    // student.marks= 100
    student.age =13
    println(student.age)
    student.age =14
    println(student.age)
    student.age =15
    println(student.age)


    
}