fun main(){
    var titular:String = "Carlos"
    val numAccount = 100200300
    var amount:Double = 0.00

//    amount=(100.00+2)
//    amount+=200

    amount=0.00

    println("Titular: $titular")
    println("Account Number: $numAccount")
    checkValue(amount)


}

fun checkValue(amount:Double){
    when{
        amount > 0.00->println("Negative value")
        amount == 0.00 -> println("Empty acct")
        else -> println("Positive")
    }
}
