class Atendente: Funcionario() {

    var setor :String = ""

    override fun getDetalheDescricao(): String {
        return """Setor: $setor """
    }

}