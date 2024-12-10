data class Order(
    val orderId: String,
    val customer: Customer,
    val items: List<Item>,
    var status: String,
    val deliveryAddress: String
) {
    private val observers = mutableListOf<OrderObserver>()

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update(this)
        }
    }

    fun updateStatus(newStatus: String) {
        status = newStatus
        notifyObservers()
    }
}
