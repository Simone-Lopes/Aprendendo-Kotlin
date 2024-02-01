//Super classe
// Recebe herdeiros

open class Carro {

    lateinit var fabricante:String
    lateinit var modelo:String
    protected var ligado:Boolean = false
    protected var velocidade:Double = 0.0

    //Abstrair ou encapsular

    fun ligar(){
        ligado = true
    }

    fun desligar(){
        ligado = false
        velocidade = 0.0
    }

    open fun getDescricao():String{
        return """
            Fabricante: $fabricante. Modelo: $modelo. Está ligado? ${if (ligado) "Sim" else "Não"}
            Velocidade atual: $velocidade km/h
        """.trimIndent()
    }

    open fun getReacaoPessoas():String{
        return "Olha só, um carro $fabricante $modelo"
    }

    open fun getVelocidadeAceleracao():Double{
        return 7.5
    }

    fun acelerar(){
        if (!ligado){
            return
        }
        velocidade += getVelocidadeAceleracao()
        normalizarVelocidade()
    }

    open fun getVelocidadeFrear():Double{
        return 10.00
    }

    fun frear(){
        if (!ligado){
            return //interrompe a função, chamamos de curto-circuíto
        }
        velocidade -= getVelocidadeFrear()
        normalizarVelocidade()
    }


    open fun getMaiorVelocidade():Double{
        return 240.0
    }

    fun normalizarVelocidade(){
        if (velocidade < 0.0){
            velocidade = 0.0
        }
        if(velocidade > getMaiorVelocidade()){
            velocidade = getMaiorVelocidade()
        }
    }


}