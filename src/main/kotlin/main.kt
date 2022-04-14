import jdk.jfr.Category
import java.time.temporal.TemporalAmount

fun main(){
    var waceke=currentAccount("234556","grace",90000.00)
    waceke.deposit(500.00)
   println( waceke.balance)
    waceke.withdrawal(4000.00)
    println( waceke.balance)
    fruit("banana")

}
class currentAccount(var accountNumber:String, var accName:String, var balance:Double){

    fun deposit(amount:Double){
        var increase=balance
        balance+=amount
        println(amount)

    }
    fun withdrawal(amount: Double){
        var decrease=balance
        balance-=amount
        println(amount)

    }
}

//     var sum=amount
//      //var increament= amount+ deposit
//     println(sum)
// }
// fun withdraw(amount: Double){
//
// }
fun fruit(sweet:String):String{
    var tunda=""
    sweet.forEachIndexed { index, c ->
        if (index%2==0){
            tunda+=c
        }
        println(tunda)
    }
return tunda
}

data class big(var name:String, var weight:Double, var price:Int, var category: String)
fun product(num:Int):Boolean {
    return (num % 2 == 0)
    if ((num % 2 == 0)) {
    }
    return true
}




