import java.sql.DriverManager.println

class Courier(
    private val courierId: String,
    private val name: String,
    private val phone: String,
    private var currentRoute: MutableList<Order> = mutableListOf()
) {
    fun assignOrder(order: Order) {
        currentRoute.add(order)
        println("Order ${order.orderId} assigned to courier $name")
    }

    @Suppress("UNUSED") // Додаємо анотацію, щоб подавити попередження
    fun displayCourierInfo() {
        println("Courier ID: $courierId, Name: $name, Phone: $phone")
    }

    @Suppress("UNUSED") // Додаємо анотацію, щоб подавити попередження
    fun getContactInfo(): String {
        return "Courier $name can be reached at $phone"
    }

    // Доданий метод для отримання списку замовлень кур'єра
    @Suppress("UNUSED") // Додаємо анотацію, щоб подавити попередження
    fun getCurrentRoute(): List<Order> {
        return currentRoute.toList()
    }
}
