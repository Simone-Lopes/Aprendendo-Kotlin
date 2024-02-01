//Toda classe que não é abstrata é uma classe CONCRETA

class Cachorro : Animal(){

    override fun nascer() {
     println("Cachorro nascendo do ventre de sua mãe")
    }

    override fun comer(alimento: String, quantidade: Double): Double {
        println("Cão mastigando $alimento sentado")
        return quantidade * 0.90
    }

}