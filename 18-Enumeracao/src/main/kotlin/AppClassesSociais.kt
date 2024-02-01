fun main() {
    val rendaEstagiario = 2_200.0
    val classeEstagiario = ClasseSocial.aPartirDaRenda(rendaEstagiario)

    println("A classe social de estagiario é ${classeEstagiario?.descricao}")

    val rendax = 12_500.0
    val classex = ClasseSocial.aPartirDaRenda(rendax)

    println("A classe é ${classex?.descricao}")
}