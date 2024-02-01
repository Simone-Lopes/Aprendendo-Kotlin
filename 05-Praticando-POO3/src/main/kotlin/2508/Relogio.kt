package `2508`

class Relogio {
    var modelo: String = ""
    var preco: Double = 0.0
    var horas: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0

    fun zerar(){
        horas = 0
        minutos = 0
        segundos = 0
    }
    fun validar():String{

        var validacao = true

        if (minutos < 0 || minutos > 59) {
            minutos = 0
            validacao = false
        }

        if (segundos < 0 || segundos > 59) {
            segundos = 0
            validacao = false
        }

        if (horas < 0 || horas > 23){
            horas = 0
            validacao = false
        }

        if (validacao) {
            return "Todos os valores estavam corretos."
        }else{
            return "Valores inválidos identificados. Ajustado!"
        }
    }

    fun verHora():String{
        return "${horas.toString().padStart(2, '0')}:${minutos.toString().padStart(2, '0')}:${segundos.toString().padStart(2, '0')}"
        validar()
    }

}