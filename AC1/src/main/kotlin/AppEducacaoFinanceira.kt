// Feito por Simone Lopes dos Santos

//Minha maior dificuldade foi armazenar esses valores capturados dentro de listas e conseguir puxar os valores em seguida


import javax.swing.JOptionPane

fun main() {

    var cofres = mutableListOf<Cofrinho>()

    var objetivo1 = JOptionPane.showInputDialog(null,"Digite o objetivo do cofre 01: ")
    var valorMeta1 = JOptionPane.showInputDialog(null,"Digite o valor meta do cofre 01:").toDouble()

    val cofre1 = Cofrinho(objetivo1,valorMeta1)

    cofres.add(cofre1)

    var objetivo2 = JOptionPane.showInputDialog(null,"Digite o objetivo do cofre 02: ")
    var valorMeta2 = JOptionPane.showInputDialog(null,"Digite o valor meta do cofre 02:").toDouble()

    val cofre2 = Cofrinho(objetivo2,valorMeta2)
    cofres.add(cofre2)

    var objetivo3 = JOptionPane.showInputDialog(null,"Digite o objetivo do cofre 03: ")
    var valorMeta3 = JOptionPane.showInputDialog(null,"Digite o valor meta do cofre 03").toDouble()

    val cofre3 = Cofrinho(objetivo3,valorMeta3)
    cofres.add(cofre3)

    //O rodada foi criado diante da lógica de manter o fluxo em loop ao alterar os bancos
    var rodada = 1
    while(rodada == 1){
        var resposta = JOptionPane.showInputDialog(
            "Qual banco você deseja mexer?\r\n" +
                    "Banco 1\r\n" +
                    "Banco 2\r\n" +
                    "Banco 3\r\n"
        ).toInt()

        if (resposta == 1) {
            var valorDeposito =
                JOptionPane.showInputDialog(null, "Informe quanto vai depositar no cofre 01: ").toDouble()
            cofre1.depositar(valorDeposito)
            var valorRetirada =
                JOptionPane.showInputDialog(null, "Informe quanto vai retirar no cofre 01: ").toDouble()
            cofre1.retirar(valorRetirada)
            JOptionPane.showMessageDialog(null, cofre1.descrever()) //Função descrever aparece vazia
        } else{
            rodada = 1
        }

        if (resposta == 2) {
            var valorDeposito =
                JOptionPane.showInputDialog(null, "Informe quanto vai depositar no cofre 02: ").toDouble()
            cofre2.depositar(valorDeposito)
            var valorRetirada =
                JOptionPane.showInputDialog(null, "Informe quanto vai retirar no cofre 02: ").toDouble()
            cofre2.retirar(valorRetirada)
            JOptionPane.showMessageDialog(null, cofre2.descrever()) //Função descrever aparece vazia
        }else{
            rodada = 1
        }

        if (resposta == 3) {
            var valorDeposito =
                JOptionPane.showInputDialog(null, "Informe quanto vai depositar no cofre 03: ").toDouble()
            cofre3.depositar(valorDeposito)
            var valorRetirada =
                JOptionPane.showInputDialog(null, "Informe quanto vai retirar no cofre 03: ").toDouble()
            cofre3.retirar(valorRetirada)
            JOptionPane.showMessageDialog(null, cofre3.descrever()) //Função descrever aparece vazia

        }else{
            rodada = 1
        }
    }
}

