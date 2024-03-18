class staff(val name:String,val age:Int, val gender:String){


}

fun main(args: Array<String>) {
    val myob=staff("John",20,"Male")
    println("Staff name is ${myob.name}")
    println("Staff age is ${myob.age}")
    println("Staff gender is ${myob.gender}")
    val myob1=staff("Mary",34,"Female")
    println("Staff name is ${myob1.name}")
    println("Staff age is ${myob1.age}")
    println("Staff gender is ${myob1.gender}")
    val myobj2=staff("Ansy",20,"Female")
    println("Staff name is ${myobj2.name}")
    println("Staff age is ${myobj2.age}")
    println("Staff gender is ${myobj2.gender}")
    val myob3=staff("Jane",20,"Female")
    println("Staff name is ${myob3.name}")
    println("Staff age is ${myob3.age}")
    println("Staff gender is ${myob3.gender}")
    val myob4=staff("Ben",25,"Male")
    println("Staff name is ${myob4.name}")
    println("Staff age is ${myob4.age}")
    println("Staff gender is ${myob4.gender}")

}