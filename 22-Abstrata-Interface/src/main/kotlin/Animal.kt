//Classes abstratas não devem ser open, pois já são por padrão

abstract class Animal {

    var nome: String = ""

    open fun respirar(){
        println("Animal está ficando com oxigênio e liberando gás carbonico")
    }

    abstract fun nascer()

    abstract fun comer(alimento:String, quantidade:Double):Double
}