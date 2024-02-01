import java.time.LocalDate
import javax.swing.JOptionPane.showMessageDialog

fun main() {

    val professor1 = Professor()
    professor1.nome = "Reis"
    professor1.email = "reis@sptech.school"
    professor1.dataNascimento = LocalDate.of(1995, 11, 27)
    professor1.especialidade = "Linguagem de Programação"

    val aluno1 = Aluno()
    aluno1.nome = "Simone Lopes"
    aluno1.email = "simone@sptech.school"
    aluno1.dataNascimento = LocalDate.of(2004, 7,27 )
    aluno1.matricula = "03231049"

    val aluno2 = Aluno()
    aluno2.nome = "Jorginho"
    aluno2.email = "jorginho@sptech.school"
    aluno2.dataNascimento = LocalDate.of(2004, 1, 1)
    aluno2.matricula = "03231050"

    showMessageDialog(null, professor1.exibirInformacoes())
    showMessageDialog(null, aluno1.exibirInformacoes())
    showMessageDialog(null, aluno2.exibirInformacoes())

    val disciplina = Disciplina()
    disciplina.nome = "Linguagem de Programação"
    disciplina.anoSemestre = "2/2023"
    disciplina.professor = professor1

    disciplina.adicionarAluno(aluno1)
    disciplina.adicionarAluno(aluno2)

    showMessageDialog(null, disciplina.detalhes())
}