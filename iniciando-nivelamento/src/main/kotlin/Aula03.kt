fun main() {
    var xicara = "Café"

    println("Você tem uma xícara com $xicara")
    println(entregarParaAlguem(xicara))
}

fun entregarParaAlguem(xicara: String): String{
    println("Você entregou o seu $xicara para fulano esquentar e ele levou ao microondas")
    return esquentar(xicara)
}

fun esquentar(xicara: String) : String{
    println("Esquentando xícara com $xicara...")
    println("Vrumm Vrumm Vrumm...")
    return "$xicara está quente!"
}