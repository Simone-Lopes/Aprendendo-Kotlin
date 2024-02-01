import javax.swing.JOptionPane

fun main() {
    val nome1 = JOptionPane.showInputDialog("Vamos começar a Luta! Nome do 1º lutador")
    val ataque1 = JOptionPane.showInputDialog("Força de ataque do 1º lutador").toDouble()
    val defesa1 = JOptionPane.showInputDialog("Força de defesa do 1º lutador").toDouble()

    val lutador1 = Lutador()
    lutador1.nome = nome1
    lutador1.forcaAtaque = ataque1
    lutador1.forcaDefesa = defesa1

    val nome2 = JOptionPane.showInputDialog("Vamos começar a Luta! Nome do 2º lutador")
    val ataque2 = JOptionPane.showInputDialog("Força de ataque do 2º lutador").toDouble()
    val defesa2 = JOptionPane.showInputDialog("Força de defesa do 2º lutador").toDouble()

    val lutador2 = Lutador()
    lutador2.nome = nome2
    lutador2.forcaAtaque = ataque2
    lutador2.forcaDefesa = defesa2

    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog("""
        1 - Lutador 1 bate no Lutador 2
        2 - Lutador 2 bate no Lutador 1            
        """.trimIndent()).toInt()

        if (batedor == 1) {
            lutador2.apanhar(lutador1)
        } else {
            lutador1.apanhar(lutador2)
        }

        JOptionPane.showMessageDialog(null, lutador1.descrever())
        JOptionPane.showMessageDialog(null, lutador2.descrever())

        val concentrador = JOptionPane.showInputDialog("""
        1 - Lutador 1 se concentra
        2 - Lutador 2 se concentra
        NDA - Nenhum se concentra            
        """.trimIndent()).toInt()

        if (concentrador == 1) {
            lutador1.concentrar()
        } else {
            lutador2.concentrar()
        }
    }

    var vencedor = "NENHUM (empate)"

    if (lutador1.vidaAtual > lutador2.vidaAtual) {
        vencedor = lutador1.nome
    }
    if (lutador2.vidaAtual > lutador1.vidaAtual) {
        vencedor = lutador2.nome
    }

    JOptionPane.showMessageDialog(null, "O vencedor é $vencedor")
}