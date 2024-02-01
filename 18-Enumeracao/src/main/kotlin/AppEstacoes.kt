import java.lang.IllegalArgumentException
import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {

    //Tratamento de exceção

    println("Estações disponíveis:")
    println(Estacao.values()) // retorna um vetor (array)
    //println(Estacao.entries) // versão mais nova

    //interando nos valores possiveis
    Estacao.values().forEach {
        println(it)
    }

    val menu = """
        Escolha uma das opções:
        VERAO, OUTONO, INVERNO ou PRIMAVERA
    """.trimIndent()

    val escolha = showInputDialog(menu) //alt enter para reduzir JO

    try {
        val escolhaEscolhida: Estacao = Estacao.valueOf(escolha)
        showMessageDialog(null, "Você escolheu $escolhaEscolhida")
    }catch (execao:IllegalArgumentException){
        showMessageDialog(null, "Estação inválida")
    }
    showMessageDialog(null, "Aplicação executou com sucesso!")
}