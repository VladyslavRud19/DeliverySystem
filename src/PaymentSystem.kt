import java.sql.DriverManager.println

interface PaymentSystem {
    fun pay(amount: Double)
}

class ExternalPaymentSystem {
    fun makePayment(amount: Double) {
        println("Платіж на суму $amount здійснено через зовнішню систему")
    }
}

class PaymentAdapter(private val externalPaymentSystem: ExternalPaymentSystem) : PaymentSystem {
    override fun pay(amount: Double) {
        externalPaymentSystem.makePayment(amount)
    }
}
