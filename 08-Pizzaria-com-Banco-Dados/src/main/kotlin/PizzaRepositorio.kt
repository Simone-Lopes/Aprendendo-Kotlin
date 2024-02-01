import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.queryForObject

//Essa classe irá abstrair os métodos de acesso á tabela pizza (CRUD)

class PizzaRepositorio {

    lateinit var jdbcTemplate:JdbcTemplate

    fun iniciar(){
        //Aqui usamos !! porque está com ? na Conexao
        //Assim aceitamos que pode dar erro por ele ser nulo
        jdbcTemplate = Conexao.jdbcTemplate!!
    }

    fun cadastrar(novaPizza:Pizza){
        jdbcTemplate.update("""
            insert into pizza (sabor,preco,quantidade)
            values
            ('${novaPizza.sabor}', ${novaPizza.preco}, ${novaPizza.quantidade})
        """)
    }

    fun getUltimoCodigo():Int{
        //Quando fazemos a consulta retornamos somente uma linha
        // Int::class.java -> indica que o resultado será convertido num objeto tipo Int
       val ultimocodigo = jdbcTemplate.queryForObject("""
          select max(codigo) from pizza
                """, Int::class.java
        )
        return ultimocodigo
    }

    fun vender(codigo: Int):Boolean{
        val atualizados = jdbcTemplate.update("""
            update pizza set quantidade = quantidade-1
             where 
             codigo = $codigo
             and quantidade > 0
        """)
        return atualizados == 1
    }

    fun recuperar(codigo:Int):Pizza {
        val pizza = jdbcTemplate.queryForObject("""
             select * from pizza where codigo = $codigo 
        """, BeanPropertyRowMapper(Pizza::class.java))

        return pizza
    }

    fun atualizarPreco(codigo: Int, novoPreco:Double):Boolean{
        val atualizados = jdbcTemplate.update("""
            update pizza set preco = $novoPreco
             where 
             codigo = $codigo
        """)
        return atualizados == 1
    }
}