//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    intro("Rehema", 20)
}
fun intro(x:String, y:Int){
    var sentence ="Hi, my name is $x and I am $y years old"
    println(sentence)
    takeStr("Nairobi","Kisumu","Mombasa","Nakuru")
    myCities(arrayOf("harare","mumbai","dodoma","jakarta"))
}
//arrays
fun takeStr (name1:String, name2:String, name3:String, name4:String){
    var arr= arrayOf(name1,name2,name3,name4)
   println(arr.contentToString())
}
fun myCities(cities:Array<String>){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach{cit ->
      println(cit.capitalize())
    }
}