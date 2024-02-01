class Carro (
    val modelo: String,
    private var ligado: Boolean,
    private var velocidade: Double
    ){

    fun ligar(){
        this.ligado = true
    }

    fun desligar(){
        if(this.velocidade == 0.0){
            this.ligado = false
        }
    }

    fun acelerar():Double{
        if(this.ligado){
            if(this.velocidade == 0.0){
                this.velocidade = 10.00
            }else{
                this.velocidade += (this.velocidade * 0.25)
            }

            if(this.velocidade > 180.00){
                this.velocidade = 180.00
            }
        }else{
            println("Pults, o carro está desligado...")
        }
        return getVelocidade()
    }

    fun freiar():Double{
        if(this.ligado) {
            if (this.velocidade > 0.0) {
                this.velocidade -= 3
            }
        }else{
            println("Pults, o carro está desligado...")
        }
        return getVelocidade()
    }

    fun getVelocidade():Double{
        return this.velocidade
    }

}

