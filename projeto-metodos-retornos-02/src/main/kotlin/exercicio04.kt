import javax.swing.JOptionPane

// Exercício 04

fun main() {
    var altura = JOptionPane.showInputDialog(null, "Digite sua altura:").toFloat()
    exibirMensagem(avaliarAltura(altura))

}

fun avaliarAltura(altura: Float): String{
    return if (altura >= 1.8){
        "Você pode jogar basquete!"
    }else
        "Você não pode jogar basquete..."
}
