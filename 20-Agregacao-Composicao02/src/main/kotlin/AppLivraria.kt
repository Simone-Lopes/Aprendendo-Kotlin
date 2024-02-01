import javax.swing.JOptionPane

fun main() {

    val autor1 = Autor("J.K. Rowling", 56)
    val autor2 = Autor("Coleen Hoover", 43)


    val livros = listOf(
        Livro("É Assim que Acaba", 2016, autor1),
        Livro("É Assim que Começa", 2022, autor1),
        Livro("Harry Potter e a Pedra Filosofal", 2001, autor2),
        Livro("Harry Potter e o Prisioneiro de Askaban", 2004, autor2)
    )

    for (livro in livros) {
        JOptionPane.showMessageDialog(
            null, """
           Título do livro: ${livro.titulo}
           Ano: ${livro.anoPublicacao}
           Nome do autor: ${livro.autor.nome} 
       """.trimIndent()
        )
    }
}