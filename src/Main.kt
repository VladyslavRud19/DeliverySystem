import java.sql.DriverManager.println

fun main() {
    val deliverySystem = DeliverySystem.getInstance()

    // Додавання клієнтів
    val customer1 = Customer("CUST1", "Іван Іванов", "ivan@example.com", "123456789")
    deliverySystem.addCustomer(customer1)

    // Додавання кур'єрів
    val courier1 = Courier("COUR1", "Петро Петров", "987654321")
    deliverySystem.addCourier(courier1)

    // Створення замовлення
    val items = listOf(
        Item("ITEM1", "Телефон", 1, 300.0),
        Item("ITEM2", "Чохол", 2, 20.0)
    )
    val order = deliverySystem.createOrder(customer1, items, "вул. Центральна, 1")

    // Призначення замовлення кур'єру
    deliverySystem.assignOrderToCourier(order, courier1)

    // Відстеження статусу замовлення
    println("Статус замовлення: ${deliverySystem.trackOrder(order.orderId)}")

    // Оновлення статусу замовлення
    deliverySystem.updateOrderStatus(order.orderId, "Доставлено")
    println("Оновлений статус замовлення: ${deliverySystem.trackOrder(order.orderId)}")

    // Використання адаптера для оплати
    val paymentSystem: PaymentSystem = PaymentAdapter(ExternalPaymentSystem())
    paymentSystem.pay(320.0)
}
