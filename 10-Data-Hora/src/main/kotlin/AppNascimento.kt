import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import javax.swing.JOptionPane

fun main() {
    val dataNasc = JOptionPane.showInputDialog("Digite sua data de nascimento no formato dd/mm/aaaa")
    val dataConvertida = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"))

    val hoje = LocalDate.now()

    //val anosVida = hoje.year.minus(dataConvertida.year)
    val anosVida = ChronoUnit.YEARS.between(dataConvertida, hoje)
    val diasVida = ChronoUnit.DAYS.between(dataConvertida, hoje)

    JOptionPane.showMessageDialog(null, "Você tem $anosVida anos de vida")
    JOptionPane.showMessageDialog(null, "Você tem $diasVida dias de vida")

}
