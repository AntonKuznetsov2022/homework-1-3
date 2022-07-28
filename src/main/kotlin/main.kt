fun main() {
    val itemPrice: Int = 100
    val itemCount: Int = 9
    val discount: Int = 100
    val discountStart: Int = 1000
    val discountFinish: Int = 10000
    var result: Double = 0.00
    val meloman: Boolean = true

    val totalPrice = (itemPrice * itemCount).toDouble()

    if (totalPrice > discountStart && totalPrice < discountFinish) {
        result = if (meloman) (totalPrice - discount) * 0.99 else (totalPrice - discount)
    } else {
        result = if (meloman) totalPrice * 0.95 * 0.99 else totalPrice * 0.95
    }

    val sumDiscount = totalPrice - result

    println("Окончательная цена: ${result.toInt()} руб. ${Math.round((result - (result).toInt()) * 100)} коп.")
    println("Скидка составила: ${sumDiscount.toInt()} руб. ${Math.round((sumDiscount - (sumDiscount).toInt()) * 100)} коп.")
}