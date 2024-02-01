import java.time.format.DateTimeFormatter
import javax.swing.JOptionPane
import java.time.LocalDate

fun main() {

    val repositorio = MusicaRepository()
    repositorio.iniciar()
    repositorio.criarTabela()

    while (true){

        var opcao = JOptionPane.showInputDialog(null,"Bem-vindo à gravadora SIS!\n\r" +
                "1- Adicionar nova música\n\r" +
                "2- Buscar música por id\n\r" +
                "3- Excluir música por id\n\r" +
                "4- Sair").toInt()

        when(opcao){
            1 ->{
                val novaMusica = Musica()
                novaMusica.titulo = JOptionPane.showInputDialog(null, "Digite o titulo da música:")
                novaMusica.artista = JOptionPane.showInputDialog(null, "Digite o nome do artista:")

                novaMusica.dataCriacao = LocalDate.now()

                repositorio.cadastrar(novaMusica)
            }
            2 ->{
                var codigoMusica = JOptionPane.showInputDialog(null, "Digite o código da música:").toInt()
                var musicaRecuperada = repositorio.buscar(codigoMusica)

                if (musicaRecuperada != null) {

                   // var dataBrasil = musicaRecuperada.dataCriacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    // data não está retornando formatada!!!


                    JOptionPane.showMessageDialog(
                        null, "" +
                                "Música com o id: ${musicaRecuperada.id}\n" +
                                "Titulo: ${musicaRecuperada.titulo}\n" +
                                "Artista: ${musicaRecuperada.artista}\n" +
                                "Data de Criação: ${musicaRecuperada.dataCriacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}"
                    )
                } else {
                    JOptionPane.showMessageDialog(null, "Música não encontrada...")
                }

            }
            3 ->{
                val codigoMusica = JOptionPane.showInputDialog("Digite o código da Musica a ser excluida: ").toInt()
                val musicaRecuperada = repositorio.buscar(codigoMusica)
                val linhas = repositorio.excluir(codigoMusica)

                if (musicaRecuperada != null && linhas > 0) {
                    JOptionPane.showMessageDialog(null, "A música ${musicaRecuperada.titulo} foi excluida!")
                } else {
                    JOptionPane.showMessageDialog(null, "Música não encontrada...")
                }
            }

            4 ->{
                break
            }
        }
    }
}
