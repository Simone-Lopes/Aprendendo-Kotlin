class Carro {

    //Atributos de instância
    var modelo: String = ""
    var potencia: Double = 0.0
    var Km: Int = 0
    var marcha: Int = 0
    var ligado: Boolean = false

    //Métodos sem parâmetros e retorno
    fun ligar() {
        ligado = true
    }

    fun desligar() {
        ligado = false
    }

    fun aumentarMarcha() {
        if (marcha < 6) {
            marcha = marcha + 1
        } else {
            println("Você já está na maior marcha disponível")
        }
    }

    fun diminuirMarcha() {
        if (marcha >= -1) {
            marcha = marcha - 1
        } else {
            println("Você já está na menor marcha disponível")
        }
    }

    fun fazerViagemCurta() {
        if (marcha in 1..2) {
            Km = Km + 10
        } else if (marcha in 3..5) {
            Km = Km + 20
        } else if (marcha == 6) {
            Km = Km + 30
        } else if (marcha in -1..0 || ligado == false) {
            Km = Km
        }
    }
}
