fun main() {
    val dog:Animal = Cachorro ()

    dog.nascer()
    dog.respirar()
    dog.nome = "Rogério Alberto"

    val pato:Animal = Pato()

    pato.nascer()
    pato.respirar()
    pato.nome = "Quack Donald"

    val peixe:Animal = Peixe()

    peixe.nascer()
    peixe.respirar()
    peixe.nome = "Nemovaldo"

    println("Cachorro engordou ${dog.comer("ração", 120.2)}kg após comer")
    println("Pato engordou ${pato.comer("milho", 10.2)}kg após comer")
    println("Peixe engordou ${peixe.comer("minhoca", 1.2)}kg após comer")
}