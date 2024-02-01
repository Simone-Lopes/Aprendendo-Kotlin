class Gerente: Funcionario() {

     var departamento :String = ""

    override fun getDetalheDescricao(): String {
        return """Departamento: $departamento """
    }

    override fun aumentarSalario(aumento: Double): Double {
        return super.aumentarSalario(aumento)
    }

}