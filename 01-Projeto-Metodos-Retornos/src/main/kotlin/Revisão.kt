import javax.swing.JOptionPane

// Aula dia 11/08/2023
//ctrl d = duplica a linha

fun main() {
    //Declarativo
    val n1: Int = JOptionPane.showInputDialog("Digite o primeiro número:").toInt()
    //Inferido
    val n2 = JOptionPane.showInputDialog("Digite o segundo número").toInt()

    //Argumento
    exibeMensagem("A soma é: ${somar(n1, n2)}")
    exibeMensagem("A subtração é: ${subtrair(n1, n2)}")
    exibeMensagem("A multiplicação é: ${multiplicar(n1, n2)}")
    exibeMensagem("A divisão é: ${dividir(n1, n2)}")
}
fun exibeMensagem(frase: String){
    //Parâmetro
    JOptionPane.showMessageDialog(null, frase)
}
fun somar(n1: Int, n2: Int): Int{
    return n1 + n2
}
fun subtrair (n1: Int, n2: Int): Int{
    return n1 - n2
}
fun multiplicar (n1: Int, n2: Int): Int{
    return n1 * n2
}
fun dividir (n1: Int, n2: Int): Int{
    return n1 / n2
}