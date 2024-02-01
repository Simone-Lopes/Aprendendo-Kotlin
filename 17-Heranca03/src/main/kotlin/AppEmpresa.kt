import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {

    val gerente1 = Gerente()
    gerente1.nome = showInputDialog(null, "Digite o nome do gerente:")
    gerente1.departamento = showInputDialog(null, "Digite o departamento do gerente:")
    gerente1.salario = showInputDialog(null, "Digite o salário do gerente:").toDouble()

    showMessageDialog(null, gerente1.exibirDados())

    val atendente1 = Atendente()
    atendente1.nome = showInputDialog(null, "Digite o nome do atendente:")
    atendente1.setor = showInputDialog(null, "Digite o setor do atendente:")
    atendente1.salario = showInputDialog(null, "Digite o salário do atendente:").toDouble()

    showMessageDialog(null, atendente1.exibirDados())

    atendente1.salario += 1000
    showMessageDialog(null, atendente1.exibirDados())



}