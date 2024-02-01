import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

class Conexao{
    fun conectar(): JdbcTemplate{
        val dataSource = BasicDataSource()
        dataSource.driverClassName = "org.h2.Driver"
        dataSource.url = "jdbc:h2:mem:filme"
        dataSource.username = "sa"
        dataSource.password = ""
        return JdbcTemplate(dataSource)
    }
}