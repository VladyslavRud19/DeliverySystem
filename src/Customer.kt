import java.sql.DriverManager.println
import kotlin.collections.*

data class Customer(
    val customerId: String,
    val name: String,
    val email: String,
    val phone: String
) {
    private val orders = mutableListOf<Order>()

    fun placeOrder(order: Order) {
        orders.add(order)
        println("Order ${order.orderId} placed by $name")
    }
}
