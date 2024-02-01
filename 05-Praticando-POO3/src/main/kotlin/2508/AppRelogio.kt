package `2508`

import javax.swing.JOptionPane

fun main() {
    val relogio1 = Relogio()
    relogio1.modelo = "Redondo"
    relogio1.preco = 25.00
    relogio1.horas = 10
    relogio1.minutos = 20
    relogio1.segundos = 478

    JOptionPane.showMessageDialog(null, "Primeiro relógio: ${relogio1.validar()}")
    JOptionPane.showMessageDialog(null, "Hora atual: ${relogio1.verHora()}")

    val relogio2 = Relogio()
    JOptionPane.showMessageDialog(null,"Vamos criar o segundo relógio...")
    relogio2.modelo = JOptionPane.showInputDialog("Digite o modelo do relógio:").toString()
    relogio2.preco = JOptionPane.showInputDialog("Digite o preço do relógio:").toDouble()
    relogio2.horas = JOptionPane.showInputDialog("Digite as horas:").toInt()
    relogio2.minutos = JOptionPane.showInputDialog("Digite os minutos:").toInt()
    relogio2.segundos = JOptionPane.showInputDialog("Digite os segundos:").toInt()

    JOptionPane.showMessageDialog(null, "Vamos ver as especificações do segundo relógio: \n " +
            "Modelo: ${relogio2.modelo} \n Preço: R$${relogio2.preco} \n Horas: ${relogio2.horas} \n Minutos: ${relogio2.minutos} \n Segundos: ${relogio2.segundos}")

    JOptionPane.showMessageDialog(null, "Segundo relógio: ${relogio2.validar()}")
    JOptionPane.showMessageDialog(null, "Hora atual: ${relogio2.verHora()}")
}