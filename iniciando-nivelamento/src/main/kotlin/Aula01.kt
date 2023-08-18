import kotlin.math.pow

// Aula 01 de Kotlin

// A função main é a única que é executada

fun main() {
    println("Hello world!")
    println()
    println("\r\nOi mundo! \nEstou iniciando Kotlin.")
    // O r quebra a linha no Linux e o n no Windows, usar as duas nessa ordem

    var bairro = "Bela Vista"
    // váriavel String (texto)

    var populacao = 50000
    /*
    váriavel int (número)
    */

    var ligado = false
    // váriavel boolean

    var altura = 1.80
    // váriavel double (número real)

    println("No bairro ${bairro} moram ${populacao} pessoas.")
    println("No bairro $bairro moram $populacao pessoas.")
    //Interpolação (String template) deve ser feita em aspas duplas e não utiliza crase e chaves

    println("No bairro ${bairro.uppercase()} o IDH é ${(10+9)/3}")
    // Usar chaves em casos específicos

    //Operações matemáticas básicas
    val soma = 5 + 4
    val multi = 3 * 3
    val divisao = 90 / 2
    val subtracao = 8 - 2
    val potencia = Math.pow(2.0, 3.0)
    val potencia2 = 2.0.pow(3)

    println("Pôtencia 01: $potencia")
    println("Pôtencia 02: $potencia2")

    var endereco = "rua loka, 10"
    endereco = "rua dahora, 90"

    val cpf = "1234567812"
    // Val não pode ser alterada, ou seja, é uma váriavel imutável

    var idade = 12

    /*
    As estruturas if, if-else, if-else-if funcionam como no JS
    Todos os operadores de comparação númerica também são iguais
    */
    if (idade >= 18){
        println("Maior de idade!")
    }else{
        println("Vai jogar PS!")
    }

    var contador = 0
    while (contador < 4){
        println("100 querer 20 amar")
        contador ++ // ++ e -- funcionam igual ao JS
    }

    idade = 8
    when (idade) {
        in 0..6 -> println("bebê")
        in 7..10-> {
            println("criancinha")
            println("cuide muito bem.")
        }
        in 11..18 ->{
            println("adolescente")
            println("ensine sobre dst")
        }
        in 19..22 -> println("adulto")
        65 -> println("melhor idade")
        in 66..Int.MAX_VALUE -> println("Matusálem")
        else -> println("idade inválida!")
    }

    var salario = 2500
    var classeSocial = when (salario){
        in 0..500 -> "D"
        in 501..1500 -> "C"
        in 1501..5000 -> "B"
        in 5001..50000 -> "A"
        else -> "Inválido"
    }

}
