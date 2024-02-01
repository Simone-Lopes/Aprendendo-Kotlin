class CarroPobre: Carro() {

    override fun getReacaoPessoas(): String {
        return "Nossa, esse $fabricante $modelo é mó paia"
    }

    override fun getVelocidadeAceleracao(): Double {
        return 2.3
    }

    override fun getVelocidadeFrear(): Double {
        return 5.4
    }

    override fun getMaiorVelocidade(): Double {
        return 100.0
    }
}