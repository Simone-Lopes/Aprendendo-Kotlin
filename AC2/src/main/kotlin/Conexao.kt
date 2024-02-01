import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

object Conexao {

        var jdbcTemplate: JdbcTemplate? = null
            get() {
                if (field == null){
                    val dataSource = BasicDataSource()
                    dataSource.driverClassName = "org.h2.Driver"
                    dataSource.url = "jdbc:h2:mem:musica"
                    dataSource.username = "sa"
                    dataSource.password = ""
                    return JdbcTemplate(dataSource)
                }
                return field
            }
    }