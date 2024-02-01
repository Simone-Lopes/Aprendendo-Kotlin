import javax.swing.JOptionPane

class Cofrinho(
    var objetivo: String,
    var saldo:Double
    ) {
    var meta:Double = 0.0
    var depositos:Int = 0

    fun depositar(valorDeposito: Double) {
        if (valorDeposito > 0) {
            saldo += valorDeposito
        }
    }

    fun retirar(valorRetirada: Double) {
        if (valorRetirada > 0) {
            saldo -= valorRetirada
        }
    }

    fun porcentagemAteMeta(): Double {
        val porcentagemMeta = (saldo / meta) * 100
        return porcentagemMeta
    }

    fun descrever(): String {
        var resposta = ""

        if (meta > saldo) {
            var resposta =
                "O cofrinho de objetivo $objetivo está com R$$saldo de saldo, estando a ${porcentagemAteMeta()}% da meta de $meta"
        } else if (meta <= saldo) {
            var resposta =
                "O cofrinho de objetivo $objetivo está com R$$saldo de saldo. Já chegou na meta, estando em ${porcentagemAteMeta()}% dela!"
        }
        return resposta
    }

}


