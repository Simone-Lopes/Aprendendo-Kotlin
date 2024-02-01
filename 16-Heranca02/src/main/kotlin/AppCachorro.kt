import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main() {

    val cachorro1 = Cachorro()
    val cachorro2 = CachorroViraLata()
    val cachorro3 = CachorroRaca()

    val cachorros = listOf(cachorro1, cachorro2, cachorro3)

    cachorros.forEachIndexed{contador, cachorro ->
        val ordem = contador +1
        cachorro.nome = showInputDialog("Digite o nome do Cachorro?")
        cachorro.peso = showInputDialog("Digite o peso do Cachorro:").toDouble()
        cachorro.idade = showInputDialog("Digite a idade do Cachorro:").toInt()
    }

    cachorros.forEach{ cachorro ->
        showMessageDialog(null, cachorro.getDescricao())
        showMessageDialog(null, cachorro.getAcaoQuandoVerMoto())
    }

    cachorros[0].comer("Ração comum", 200.0)
    cachorros[1].comer("Ração premium", 300.0)
    cachorros[2].comer("Resto do almoço", 100.0)

    cachorros.forEach{ cachorro ->
        showMessageDialog(null, cachorro.getDescricao())
    }

}