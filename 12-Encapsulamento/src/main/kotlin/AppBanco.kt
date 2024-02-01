fun main() {
    val banco = Banco(nome = "Sisi", saldo = 5.00)

    println("Depositando 10k")
    banco.depositar(10000.00)
    println("Saldo: ${"%.2f".format(banco.getSaldo())}")

    println("Retirando 2k")
    val saldoAposRetirada = banco.retirar(2000.00)
    println("Saldo: ${"%.2f".format(saldoAposRetirada)}")

    //Get pega o atributo privado da classe
    //Get de antes alterava algo, get atual é um método
    //Atributos são itens de uma classe
}