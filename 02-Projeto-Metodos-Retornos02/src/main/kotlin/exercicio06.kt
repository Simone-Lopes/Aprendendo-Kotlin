import javax.swing.JOptionPane

// Exercício 06

fun main() {
    var frasePositiva = JOptionPane.showInputDialog(null, "Digite uma frase motivadora:").toString()
    var quantVezes = JOptionPane.showInputDialog(null, "Quantas vezes você precisa dessa motivação?").toInt()

    for (n in 1..quantVezes) {
        exibirMensagem("${n} - ${frasePositiva}")
    }
}

