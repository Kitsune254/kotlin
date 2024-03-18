open class mzazi{
    var dad="He likes watching football"
    var mum="She likes cooking"
    var mumcolor="Light skin"
    var dadcolor="Dark skin"
}
class boy:mzazi(){
  fun mvulana(){
      println("The boy is $dadcolor and he like $dad")

  }

}
class girl:mzazi(){
    fun mschana(){
        println("The girl is $mumcolor and $mum")
    }


}

fun main(args: Array<String>) {
    val obj=boy()
    obj.mvulana()
    val obj1=girl()
    obj1.mschana()

}