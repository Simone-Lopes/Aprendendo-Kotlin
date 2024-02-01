fun main() {

    // Criando ou INSTANCIANDO um objeto do tipo heroi
    val heroi1 = Heroi()

    // Colocando atributos na instancia
    heroi1.nome = "Alanzoka"
    heroi1.poderes = "Cabelo de fogo transformando coisas em pipoca!"
    heroi1.vida = 30.5

    // Mostrando heroi
    println(heroi1.nome)
    println(heroi1.poderes)
    println(heroi1.vida)
    println(heroi1.aposentado)

    heroi1.usarPoder()

    // Novo herói = novo objeto!
    val heroi2 = Heroi()
    println(heroi1.nome)
    println(heroi1.poderes)
    heroi2.usarPoder()

    println("O heroi1 está aposentado? ${heroi1.aposentado}")
    heroi1.aposentar()
    println("O heroi1 está aposentado? ${heroi1.aposentado}")

    println("Quanto de vida o 2 tem? ${heroi2.vida}")
    heroi2.apanhar(5.0)
    println("Quanto de vida o 2 tem? ${heroi2.vida}")
    heroi2.apanhar(15.0)
    println("Quanto de vida o 2 tem? ${heroi2.vida}")
    heroi2.apanhar(35.0)
    println("Quanto de vida o 2 tem? ${heroi2.vida}")
}