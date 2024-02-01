class Pato : Animal(){

    override fun nascer() {
        println("Patinho nascendo do ovo. Quack! Quack!")
    }

    override fun comer(alimento: String, quantidade: Double): Double {
        println("Pato bicando $alimento de pé")
        return quantidade * 0.80
    }

}