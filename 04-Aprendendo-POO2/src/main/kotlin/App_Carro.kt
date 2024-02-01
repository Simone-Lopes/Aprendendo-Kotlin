import javax.swing.JOptionPane

fun main() {

    //Instânciando um objeto
    val Carro1 = Carro()
    Carro1.modelo = "Opala"
    JOptionPane.showMessageDialog(null, "O 1º carro é um ${Carro1.modelo} e está na marcha ${Carro1.marcha}")

    if(Carro1.ligado == true){
        JOptionPane.showMessageDialog(null, "O 1º Carro está ligado")
    }
    else {
        JOptionPane.showMessageDialog(null, "O 1º Carro está desligado")
    }
    Carro1.ligar()
    Carro1.aumentarMarcha()
    Carro1.aumentarMarcha()

    JOptionPane.showMessageDialog(null, "O 1º carro é um ${Carro1.modelo} e está na marcha ${Carro1.marcha}")

    if(Carro1.ligado == true){
        JOptionPane.showMessageDialog(null, "O 1º Carro está ligado")
    }
    else {
        JOptionPane.showMessageDialog(null, "O 1º Carro está desligado")
    }

    val Carro2 = Carro()
    Carro2.modelo = JOptionPane.showInputDialog("Qual o modelo do veículo?").toString()
    val quilometragem: Int = JOptionPane.showInputDialog("Quantos km você quer rodar? ").toInt()
    JOptionPane.showMessageDialog(null, "O seu carro é um ${Carro2.modelo}, está na marcha ${Carro2.marcha} e já tem ${Carro2.Km}km rodados")

    Carro2.ligar()
    Carro2.aumentarMarcha()
    Carro2.fazerViagemCurta()

    JOptionPane.showMessageDialog(null, "O seu carro é um ${Carro2.modelo}, está na marcha ${Carro2.marcha} e já tem ${Carro2.Km} de km rodados")

    Carro2.aumentarMarcha()
    Carro2.aumentarMarcha()
    Carro2.fazerViagemCurta()
    Carro2.fazerViagemCurta()

    Carro2.diminuirMarcha()
    Carro2.fazerViagemCurta()

    JOptionPane.showMessageDialog(null, "Voce queria rodar ${quilometragem} km e rodou ${Carro2.Km} km")
    JOptionPane.showMessageDialog(null, "O seu carro é um ${Carro2.modelo}, está na marcha ${Carro2.marcha} e já tem ${Carro2.Km} de km rodados")
}