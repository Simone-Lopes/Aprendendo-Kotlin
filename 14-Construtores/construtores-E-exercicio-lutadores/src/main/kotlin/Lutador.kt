class Lutador {
    var nome:String = ""
    var forcaAtaque:Double = 0.0
    var forcaDefesa:Double = 0.0
    var vidaAtual:Double = 100.0
    val golpesSofridos = mutableListOf<Double>()

    fun concentrar():Double {
        val aumento = 0.05 * vidaAtual
        vidaAtual += aumento
        return aumento
    }

    fun treinarLeve(semanas:Int) {
        forcaAtaque += semanas
    }

    fun treinarForte(semanas:Int) {
        forcaAtaque += (semanas * 3)
    }

    fun apanhar(quemBate: Lutador) {
        if (quemBate.forcaAtaque > forcaDefesa) {
            vidaAtual -= quemBate.forcaAtaque - forcaDefesa
            if (vidaAtual < 0.0) {
                vidaAtual = 0.0
            }
            golpesSofridos.add(quemBate.forcaAtaque)
        }
    }
    fun descrever():String { // é só 1 linha
        return "Lutador $nome tem $vidaAtual de vida e já" +
                " recebeu ${golpesSofridos.size} golpes"
    }
}

