fun main() {
    // aqui instanciamos (criamos) um Estudante
    // usando seu construtor
    val estudante1 = Estudante("Zé Ruela", 4.5, 60.0)
    println("E1: ${estudante1.nome}, ${estudante1.media}, ${estudante1.frequencia}")

    estudante1.nome = "Zé Buduia"
    println("E1: ${estudante1.nome}, ${estudante1.media}, ${estudante1.frequencia}")

    // a media não pode ser reatribuída (alterada)
    // porque no construtor ela é val
    // estudante1.media = 9.5

    // cadastrando vários estudantes

    // criando uma lista que só aceita estudantes
    /*val estudantes = mutableListOf<Estudante>()

    for (contador in 0..4) {
       val nome = JOptionPane.showInputDialog("Digite o nome")
       val media =
           JOptionPane.showInputDialog("Digite a média").toDouble()
       val freq =
           JOptionPane.showInputDialog("Digite a frequência").toDouble()

       // criando um Estudante com os valores recém coletados
       val novoEstudante = Estudante(nome, media, freq)

        // inserindo o novoEstudante na lista
        estudantes.add(novoEstudante)
    }

    // percorrendo a lista de estudantes
    estudantes.forEach {
        val resultado = if (it.aprovou()) "Passou!" else "Não passou"

        JOptionPane.showMessageDialog(null,
        "${it.nome} - Resultado: $resultado")
    }*/

    val simpaticoEstudante = Estudante("Fulano", 8.0, 70.0)
    simpaticoEstudante.registrarEstudante("teste 1")
    simpaticoEstudante.registrarEstudante("catar coquinho")
    simpaticoEstudante.registrarEstudante("enxugar gelo") // 8.45
    simpaticoEstudante.registrarEstudante("limpar carvão") // 8.60 SQN!
    println("Nova média: ${"%.2f".format(simpaticoEstudante.media)}")
    println("Atividades: ${simpaticoEstudante.listaAtividades}")
}







