import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val hoje = LocalDate.now() //Fornece a data atual
    println(hoje)

    val agora = LocalDateTime.now() // Fornece a data e hora atual
    println(agora)

    val nascimentoTexto = "2004-07-27"
    //Convertendo texto em data
    var dataNascimento = LocalDate.parse(nascimentoTexto)
    println(dataNascimento)

    val hojeBrasil = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    println(hojeBrasil)

    val nascimentoBrasil = dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    println(nascimentoBrasil)

    val dataDoUsuario = "31/12/2000"
    val dataConvertida = LocalDate.parse(dataDoUsuario, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    println(dataConvertida)

    //Operações com datas

    //Adicionando dias
    val amanha = hoje.plusDays(1)
    println(amanha)
    println(hoje)

    //Diminuindo dias
    val ontem = hoje.minusDays(1)
    println(ontem)

    // Anos no passado
    val ha5anos = hoje.minusYears(5)
    println(ha5anos)

    val daquiMeiaHora = agora.plusMinutes(30)
    println(daquiMeiaHora)

    val ha15segundos = agora.minusSeconds(15)
    println(ha15segundos)
    
}