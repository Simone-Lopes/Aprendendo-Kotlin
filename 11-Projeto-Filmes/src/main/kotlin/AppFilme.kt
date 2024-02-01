import javax.swing.JOptionPane

fun main() {
    val repositorio = FilmeRepository()
    repositorio.iniciar()
    repositorio.criarTabela()

    while (true) {

        val opcao = JOptionPane.showInputDialog(
            null,
            "1 - Adicionar Filme.\n" + "2 - Consultar Filme.\n" + "3 - Excluir Filme.\n" + "4 - Sair."
        ).toInt()

        when (opcao) {
            1 -> {
                val novoFilme = Filme()
                novoFilme.nome = JOptionPane.showInputDialog(null, "Digite o nome do filme:")
                novoFilme.diretor = JOptionPane.showInputDialog(null, "Digite o nome do diretor:")
                val indicacao = JOptionPane.showInputDialog("Foi indicado ao oscar? S = sim ou N = não")
                novoFilme.indicadoOscar = indicacao.uppercase() == "S"
                novoFilme.custoProducao = JOptionPane.showInputDialog(null, "Qual o custo de produção?").toDouble()

                repositorio.cadastrar(novoFilme)
            }

            2 -> {
                val codigoFilme = JOptionPane.showInputDialog("Digite o código do filme: ").toInt()
                val filmeRecuperado = repositorio.recuperar(codigoFilme)

                if (filmeRecuperado != null) {
                    JOptionPane.showMessageDialog(
                        null, "" +
                                "Filme com o id: ${filmeRecuperado.id}\n" +
                                "Nome: ${filmeRecuperado.nome}\n" +
                                "Diretor: ${filmeRecuperado.diretor}\n" +
                                "Indicado ao Oscar: ${
                                    if (filmeRecuperado.indicadoOscar) "Sim" else "Não"
                                }\n" +
                                "Custo de produção: R$ ${filmeRecuperado.custoProducao}"
                    )
                } else {
                    JOptionPane.showMessageDialog(null, "Filme não encontrado")
                }
            }

            3 -> {
                val codigoFilme = JOptionPane.showInputDialog("Digite o código do filme a ser excluido: ").toInt()
                val filmeRecuperado = repositorio.recuperar(codigoFilme)
                val linhas = repositorio.excluir(codigoFilme)
                if (filmeRecuperado != null && linhas > 0) {
                    JOptionPane.showMessageDialog(null, "${filmeRecuperado.nome} excluido")
                } else {
                    JOptionPane.showMessageDialog(null, "Filme não encontrado")
                }
            }
            4 ->
                break
        }
    }
}