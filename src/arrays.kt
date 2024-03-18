fun main(args: Array<String>) {
    val myarr= arrayOf("banana","oranges","mangoes",76,6)
    myarr[1]="pineapples"
    println("I love eating ${myarr[1]}")
    var myarr2= arrayOf<Int>(5,7,1,-4,12,7,2,6,0)
    println(myarr2.sorted())
    var myarr3= arrayOf<Float>()
    println(myarr3.sorted())
    var myarr4= arrayOf<String>("Kenya,Uganda,Tanzania")

}