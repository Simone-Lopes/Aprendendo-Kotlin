import javax.swing.JOptionPane

// Exercício 07

fun main() {
    var apresentação = JOptionPane.showMessageDialog(null, "Olá, Uber!")
    var valorBase = JOptionPane.showInputDialog(null, "Digite o valor base por km:").toDouble()
    var corrida = JOptionPane.showInputDialog(null, "Qual a distância da corrida em km?").toInt()
    var volumeSoli = JOptionPane.showInputDialog(null, "Qual o volume de solicitações de 0 a 10?").toInt()

    when (volumeSoli) {
        0 -> exibirMensagem("Volume inválido")
        in 0..2 -> exibirMensagem("Valor da corrida ${valorBase * corrida}")
        in 3..7 -> exibirMensagem("Valor da corrida ${(valorBase * corrida) * 1.30}")
        in 8..10 -> exibirMensagem("Valor da corrida ${(valorBase * corrida) * 1.80}")
        in 11..Int.MAX_VALUE -> {
            exibirMensagem("Volume inválido")

        }
    }
}