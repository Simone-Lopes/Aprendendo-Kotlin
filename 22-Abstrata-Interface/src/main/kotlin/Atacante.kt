import java.lang.RuntimeException

class Atacante: JogadorFutebol {
    override fun chutar() {
        println("Atacante chutando para o gol adversário")
    }

    override fun correr() {
        println("Atacante correndo rápido")
    }

    override fun defenderComMao() {
        throw RuntimeException("Só o goleiro pode meter a mão na bola!!")
    }
}