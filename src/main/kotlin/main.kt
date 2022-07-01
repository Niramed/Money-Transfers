fun main () {
    val amount = 4665 // копеек
    val commis = amount * 75 / 100
    println(if (commis < 3500) "Комиссия 35 рублей" else "Комиссия $commis копеек")
}