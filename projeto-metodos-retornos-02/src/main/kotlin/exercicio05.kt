import javax.swing.JOptionPane

// Exercício 05

fun main() {
    var salario = JOptionPane.showInputDialog(null, "Digite seu salário:").toDouble()

    when (salario) {
        0.00 -> exibirMensagem("Salário inválido")
        in 0.01..1000.00 -> exibirMensagem("Classe C")
        in 1000.01..2000.00-> exibirMensagem("Classe B")
        in 2000.01..5000.00 -> exibirMensagem("Classe A")
        in 5000.01..Double.MAX_VALUE -> {
            exibirMensagem("Classe AA")
        }
    }
}

