import javax.swing.JOptionPane

// Exercício 02

fun main() {
    val linhaOnibus = JOptionPane.showInputDialog(null, "Digite a linha do ônibus:")
    var menorTempo = JOptionPane.showInputDialog(null, "Digite o menor tempo do trajeto (em minutos):").toInt()
    var maiorTempo = JOptionPane.showInputDialog(null, "Digite o maior tempo do trajeto (em minutos):").toInt()

    exibirMensagem("A linha ${linhaOnibus} leva em média ${mediaTempoOnibus(menorTempo, maiorTempo)} minutos/volta.")
}

fun mediaTempoOnibus(menorTempo: Int, maiorTempo: Int): Int{
        return (menorTempo + maiorTempo) / 2
    }
