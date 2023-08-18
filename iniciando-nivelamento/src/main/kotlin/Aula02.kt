import java.util.Scanner
import javax.swing.JOptionPane

//Aula 02 com Professor Reis

fun main() {
    // Captando  inputs de maneira roots

//    val sn = Scanner(System.`in`)
//
//    print("Digite seu nome: ")
//    val texto = sn.next()
//
//    println("\nO seu nome é $texto")

    val nomeUsuario = JOptionPane.showInputDialog("Digite seu nome!")
//    println("Seu nome é: $nomeUsuario")
    JOptionPane.showMessageDialog(null,"É um prazer, $nomeUsuario")

}