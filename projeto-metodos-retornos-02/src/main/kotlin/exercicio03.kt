import javax.swing.JOptionPane

// Exercício 03

fun main() {
     var forca = JOptionPane.showInputDialog(null, "Digite a força do Sayajin:").toInt()

    exibirMensagem("Seus kis são em SSJ são ${calcularSSJ(forca)}")
    exibirMensagem("Seus kis são em SSJ2 são ${calcularSSJ2(forca)}")
    exibirMensagem("Seus kis são em SSJ3 são ${calcularSSJ3(forca)}")
    exibirMensagem("Seus kis são em God são ${calcularGod(forca)}")
}

fun calcularSSJ(forca: Int): Int{
    val ssj = forca * 50
    return ssj
}

fun calcularSSJ2(forca: Int): Int{
    val ssj2 = forca * 100
    return ssj2
}

fun calcularSSJ3(forca: Int): Int{
    val ssj3 = forca * 200
    return ssj3
}

fun calcularGod(forca: Int): Int{
    val God = forca * 500
    return God
}