import javax.swing.JOptionPane

// Exercício 04
//Solicite a altura do usuário. Com base nela, exiba...
//"Você pode jogar basquete" (caso a altura for pelo menos 1.8)
//"Não pode jogar basquete" (caso a altura for menor que 1.8)

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
