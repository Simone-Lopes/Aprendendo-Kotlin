import javax.swing.JOptionPane

//Exercicio 01

fun main() {
    var peso = JOptionPane.showInputDialog("Digite seu peso:").toFloat()
    var altura = JOptionPane.showInputDialog("Digite sua altura:").toFloat()
    val alturaQuadrado = altura * altura

    println("Seu IMC é de: ${"%.2f".format(calcularIMC(peso, alturaQuadrado))}")
    exibirIMC("Seu IMC é de: ${"%.2f".format(calcularIMC(peso, alturaQuadrado))}")
}
fun exibirIMC(frase: String){
    JOptionPane.showMessageDialog(null, frase)
}
fun calcularIMC(peso: Float, alturaQuadrado: Float): Float{
    return peso / alturaQuadrado
}