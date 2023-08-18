import javax.swing.JOptionPane

// Exercício 01

fun main() {
    val nome = JOptionPane.showInputDialog(null, "Digite seu nome:")
    var bairro = JOptionPane.showInputDialog(null, "Digite seu bairro:")

    exibirMensagem("Você se chama ${nome} e mora no bairro ${bairro}")
}