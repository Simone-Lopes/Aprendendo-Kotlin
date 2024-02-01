fun main() {
    /*
MultiLine String -> basta usar """ no início e no final
     */
    val sql = """
    select * from tabela
    where campo = "teste"
    order by campo2 desc
    """.trimIndent()
    /*
O .trimIndent() elimina a 1a quebra de linha
e todos os espaços antes de cada linha.
Execute o código com e sem ele para verificar a diferença
     */

    println(sql)
}