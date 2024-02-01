class Disciplina{
    var nome: String = ""
    var anoSemestre: String = ""
    lateinit var professor: Professor
    var alunos = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun detalhes(): String {
        return """
            Nome: $nome
            Ano/Semestre: $anoSemestre
            Professor: ${professor.nome}
            Quantidade de alunos: ${alunos.size}
        """.trimIndent()
    }
}