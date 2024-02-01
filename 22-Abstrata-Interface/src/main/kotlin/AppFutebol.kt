fun main() {

    val jogador1:JogadorFutebol = Goleiro()

    jogador1.defenderComMao()
    jogador1.chutar()
    jogador1.correr()

    val jogador2:JogadorFutebol = Atacante()

    jogador2.defenderComMao()
    jogador2.chutar()
    jogador2.correr()
}