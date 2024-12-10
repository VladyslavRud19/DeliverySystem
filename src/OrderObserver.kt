import java.sql.DriverManager.println

interface OrderObserver {
    fun update(order: Order)
}

class OrderStatusTracker : OrderObserver {
    override fun update(order: Order) {
        println("Статус замовлення ${order.orderId} змінено на ${order.status}")
    }
}
