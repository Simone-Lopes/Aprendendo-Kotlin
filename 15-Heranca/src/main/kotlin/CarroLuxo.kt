//Subclasse da Classe Carro()

class CarroLuxo : Carro(){

    override fun getDescricao(): String {
        velocidade -= 3.0
        normalizarVelocidade()
        return "Nooossaaaaa! Que carrão esse $fabricante $modelo"
    }

    override fun getVelocidadeAceleracao(): Double {
        return 25.00
    }

    override fun getVelocidadeFrear(): Double {
        return 15.00
    }
}