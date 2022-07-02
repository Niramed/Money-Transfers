fun main() {
    val amount = 467_700 // копеек
    val min = 3500
    val commis = amount * 75 / 10000
    println(if (commis <= min) "Комиссия $min копеек" else "Комиссия $commis копеек")
}