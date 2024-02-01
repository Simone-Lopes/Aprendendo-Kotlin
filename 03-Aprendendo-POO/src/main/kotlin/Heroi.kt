class Heroi {

    //Aqui nós definimos os atributos de instância (caracteristicas)

    var nome:String = ""
    var poderes:String = ""
    var vida:Double = 100.0
    var aposentado:Boolean = false

    // Funções dentro de uma classe chamamos de métodos
    fun usarPoder(){
        if (nome.isNotBlank() && poderes.isNotBlank()){
            println("Herói usando os poderes de $poderes")
        }else {
            println("Herói sem nome e/ou sem poder")
        }
    }

    fun aposentar(){
        aposentado = true
    }

    fun apanhar(forca: Double){
        vida -= forca
        if(vida < 0){
            vida = 0.0
        }
    }
}