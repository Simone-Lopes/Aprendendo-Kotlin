import java.lang.Exception
import javax.swing.JOptionPane
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val imcUsuario = 60.0

    try{
    val calcular = IMC.getAvaliarIMC(imcUsuario)
    println("A classe social de estagiario é ${calcular?.resultado}, melhor ${calcular?.acao}")

    }catch (excecao: Exception){
        JOptionPane.showMessageDialog(null, "Inválido")
    }
}