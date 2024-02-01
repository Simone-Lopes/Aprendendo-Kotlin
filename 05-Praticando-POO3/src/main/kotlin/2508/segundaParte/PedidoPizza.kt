package `2508`.segundaParte

class PedidoPizza {
    var sabor: String = ""
    var preco: Double = 0.0
    var quantidadeAmigos: Int = 0

    fun descrever(): String{
        return "Pedido de pizza de $sabor, que custa R$$preco"
    }

    fun validarCupom(cupom:String){
        if (cupom == "#amopizza"){
            preco = preco * 0.9
        }
    }
    fun obterValorPorAmigo():Double{
        var dividirEntreAmigos = preco / quantidadeAmigos
        return dividirEntreAmigos
    }
}