import javax.swing.JOptionPane

// Exercicio 04

fun main() {
    var quantGols = JOptionPane.showInputDialog("Digite quantos gols o atacante fez:").toInt()

    when (quantGols) {
        0 -> exibirGols("Sem pontaria...")
        in 1..2 -> exibirGols("Pontaria meia boca.")
        in 3..5 -> exibirGols("Dá pro gasto.")
        in 5..Int.MAX_VALUE -> {
            exibirGols("Artilheiro!")
        }
    }
}
fun exibirGols(frase: String) {
    JOptionPane.showMessageDialog(null, frase)
}