class Peixe : Animal(){

    override fun nascer() {
        println("Peixinho nascendo de uma ovas")
    }

    override fun respirar() {
        println("Peixe tirando o ar da água para, então...")
        super.respirar()
    }

    override fun comer(alimento: String, quantidade: Double): Double {
        println("Peixe beliscando $alimento enquanto nada")
        return quantidade * 0.99
    }
}