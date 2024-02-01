fun main() {
    val carro = Carro( "BMW", false, 0.00 )

    carro.ligar()
    println("Carro ligado!")

    carro.acelerar()
    carro.acelerar()
    carro.acelerar()
    println("O carro foi acelerado 3x")

    carro.freiar()
    carro.freiar()
    println("O carro freiou 2x")

    println("Você está a ${(carro.getVelocidade())}km/h, acelera mais!")


    for (i in 0..15) {
        carro.acelerar()
    }
    println("Você está a ${(carro.getVelocidade())}km/h, diminui ai doido!")

    for (velocidade in 0..180) {
        carro.freiar()
    }
    println("${(carro.getVelocidade())}km/h, esse é de firma!")

    carro.desligar()
    println("Carro desligado.")
}