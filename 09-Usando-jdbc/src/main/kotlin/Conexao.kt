import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

fun main() {
    // estabelecendo conexão
    val dataSource = BasicDataSource()

    // dados da conexão com o banco

    // classe do Driver de banco
    dataSource.driverClassName = "org.h2.Driver"

    // como chegar ao banco de dados
    // neste exemplo, usamos o banco em memória
    // ele nasce e morre com a aplicação
    dataSource.url = "jdbc:h2:mem:sptech" // banco em memória

    // login (por padrão, no H2, é "sa")
    dataSource.username = "sa"

    // senha
    dataSource.password = ""

    // criando o objeto que permite interagir com o banco
    val jdbcTemplate = JdbcTemplate(dataSource)

    // aqui pedimos para executar uma instrução SQL
    jdbcTemplate.execute("""
        create table musica (
            id int primary key,
            nome varchar(20) not null
        )        
    """)

    // aqui usamos o "update()", que executa uma instrução DML
    // DML -> Insert, delete ou update
    // ao ser executado, ele retorna um número inteiro
    // que é quantas linhas do banco foram afetadas
    val linhasAfetadas = jdbcTemplate.update("""
        insert into musica (id, nome) values
        (1, 'aaa'), (2, 'bbb'), (3, 'ccc')
    """)
    println("$linhasAfetadas linhas inseridas")


    // queryForList() executa uma consulta (select)
    // o resultado é uma lista de objetos
    val musicas = jdbcTemplate.queryForList("select * from musica")
    println(musicas)

    // query() executa uma consulta (select)
    // o resultado é mapeado numa lista de objetos
    // do tipo que informamos no BeanPropertyRowMapper
//    val listaMusicas = jdbcTemplate.query(
    val listaMusicas:List<Musica> = jdbcTemplate.query(
        "select * from musica",
        BeanPropertyRowMapper(Musica::class.java)
    )

    listaMusicas.forEach {
        println("Música ${it.id} - ${it.nome}")
    }

}


