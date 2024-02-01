import java.time.LocalDate
import java.time.Period

open class Pessoa{
    var nome: String = ""
    var email: String = ""
    var dataNascimento: LocalDate = LocalDate.now()

    fun getIdade(): Int {
        val periodo = Period.between(dataNascimento, LocalDate.now())
        return periodo.years
    }

    open fun exibirInformacoes(): String {
        return """
            Nome: $nome
            Email: $email
            Idade: ${getIdade()}
        """.trimIndent()
    }
}