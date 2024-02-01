package `2508`.segundaParte

import javax.swing.JOptionPane

fun main() {
    val pizza1 = PedidoPizza()
    JOptionPane.showMessageDialog(null,"Bem-vindo a pizzaria da Sisi. Anote seu pedido!")
    pizza1.sabor = JOptionPane.showInputDialog("Digite o sabor que deseja:").toString()
    pizza1.preco = JOptionPane.showInputDialog("Digite o preço da pizza:").toDouble()
    pizza1.quantidadeAmigos = JOptionPane.showInputDialog("Digite quantos amigos vão dividir a conta:").toInt()
    var cupom = JOptionPane.showInputDialog("Digite um cupom:").toString()
    pizza1.validarCupom(cupom)

    JOptionPane.showMessageDialog(null, "Seu pedido: \n Sabor: ${pizza1.sabor} \n Preço: R$${"%.2f".format(pizza1.preco)} \n Amigos que vão dividir: ${pizza1.quantidadeAmigos}")

    JOptionPane.showMessageDialog(null, "Cada amigo vai pagar R$${"%.2f".format(pizza1.obterValorPorAmigo())}")
}