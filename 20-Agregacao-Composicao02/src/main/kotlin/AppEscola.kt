import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main() {
    val aluno1 = Aluno("Simone", "03231049")
    val aluno2 = Aluno("Ruan", "03231016")
    val aluno3 = Aluno("Livilinda", "03231003")
    val aluno4 = Aluno("Guilherme", "03231002")
    val aluno5 = Aluno("Paola", "03231012")

    val turmaSis2023 = Turma("1SIS 2023" +
            "", mutableListOf(aluno1, aluno2, aluno3, aluno4, aluno5 ))

    showMessageDialog(null, """
        Nome da turma: ${turmaSis2023.nome}
        Quantidade de alunos: ${turmaSis2023.alunos.size}
    """.trimIndent()
    )

    for (aluno in turmaSis2023.alunos) {
        showMessageDialog(null, """
        Nome da Turma: ${turmaSis2023.nome}
        Nome do aluno: ${aluno.nome}
        Matrícula: ${aluno.matricula}
    """.trimIndent()
        )
    }
}