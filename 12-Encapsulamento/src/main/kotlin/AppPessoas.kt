fun main() {
    val pessoa1 = Pessoa("Simoninha", 20)

    pessoa1.nome = "Sisi"

    println(
        """
            Seu nome é ${pessoa1.nome}
            e você tem ${pessoa1.getIdade()}
        """.trimIndent()
    )

    pessoa1.fazerAniversario()
    println("Feliz aniversário!")

    println(
        """
            Seu nome é ${pessoa1.nome}
            e você tem ${pessoa1.getIdade()}
        """.trimIndent()
    )
}