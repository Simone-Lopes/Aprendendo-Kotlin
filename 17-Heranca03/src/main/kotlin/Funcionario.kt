open class Funcionario {

    var nome :String = ""
    var idade :Int = 0
    var salario :Double = 0.0

    open fun exibirDados():String{
        return """Nome: $nome 
           |Salário: ${"%.2f".format(salario)}
           |${getDetalheDescricao()}
        """.trimMargin()
    }

    open fun getDetalheDescricao():String{
        return ""
    }

    open fun aumentarSalario(aumento:Double):Double{
        salario += aumento
        return salario
    }
}