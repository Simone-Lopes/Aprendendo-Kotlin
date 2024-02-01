import javax.swing.JOptionPane

// Exercicio 02

fun main() {
    var idade = JOptionPane.showInputDialog("Digite sua idade:").toInt()

    if (idade > 16) {
        exibirIdade("Você já pode votar!")
    }else{
            exibirIdade("Ainda não pode votar...")
        }

    }

fun exibirIdade(frase: String){
    JOptionPane.showMessageDialog(null, frase)
}

