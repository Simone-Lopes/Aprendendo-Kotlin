class Banco (
    val nome: String,
    private var saldo: Double
) {

    fun getSaldo(): Double {
        return saldo
    }

    fun depositar(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
        }
    }

    fun retirar(valor: Double): Double {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
        return saldo
    }

}