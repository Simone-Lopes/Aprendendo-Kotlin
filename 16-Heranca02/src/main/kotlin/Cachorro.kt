open class Cachorro {

    var nome :String = ""
    var peso :Double = 0.0
    var idade :Int = 0

    open fun getGramas():Double{
        return 1.0
    }

    fun comer(comida:String, quantidadeGramas:Double):String{
        peso += (quantidadeGramas / 1000) * getGramas()
        return "Cachorro comendo $comida, peso: $peso"
    }

    open fun correAoVerMoto():Boolean{
        return false
    }

    fun getAcaoQuandoVerMoto(): String{
        val acao = if(correAoVerMoto()) "corre" else "não corre"
        return "O cachorro $nome $acao ao ver moto"
    }

    open fun getPrecoMedio():Double{
        return 100.0
    }

    fun getDescricao():String{
        return "O cachorro $nome tem $idade anos e pesa ${peso}kg"
    }



}