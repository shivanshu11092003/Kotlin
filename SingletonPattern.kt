/*
single pattern means single object
 -- when we will single instance of our class we use this pattern
 {an object which is expensive to create and use of instance is very frquently  then we make single instance then use everywhere<}
  */
  //this object is single class
  object Manager{
    init{
        println(" Manager Object Initialized")

    }
  }
  fun main(){
    println(Manager)
    //every time we get same instance of of this object class
    println(Manager)
  }