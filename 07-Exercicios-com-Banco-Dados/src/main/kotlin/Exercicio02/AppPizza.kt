package Exercicio02
import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate
import javax.swing.JOptionPane


fun main() {

    val pizza = Pizza()

    val dataSource = BasicDataSource()

    dataSource.driverClassName = "org.h2.Driver"
    dataSource.url = "jdbc:h2:mem:sptech"
    dataSource.username = "sa"
    dataSource.password = ""

    if (cadastar() == "S"){

        pizza.sabor = JOptionPane.showInputDialog("Digite o sabor da pizza:")
        pizza.preco = JOptionPane.showInputDialog("Digite o preço da pizza:").toDouble()
        pizza.quantidade = JOptionPane.showInputDialog("Digite quantas pizzas há no estoque:").toInt()
        cadastar()
    }
    val jdbcTemplate = JdbcTemplate(dataSource)

    jdbcTemplate.execute("""
        create table pizza(
        codigo INT GENERATED BY DEFAULT AS IDENTITY primary key,
        sabor varchar(20) not null,
        preco varchar(20) not null,
        quantidade varchar(20) not null,
      
        );
        """.trimIndent())

    val linhasAfetadas = jdbcTemplate.update(""" 
        insert into pizza (sabor,preco,quantidade) values
        ('${pizza.sabor}',${pizza.preco},${pizza.quantidade})
        """.trimIndent())
    println("$linhasAfetadas linhas inseridas")

    val venda = JOptionPane.showInputDialog("Qual pizza quer vender?").toInt()

    if (venda == pizza.codigo){
        val selecionar = jdbcTemplate.queryForList("select*from pizza WHERE codigo = ${venda}")
        println(selecionar)
        val vendido = jdbcTemplate.queryForList("update pizza SET quantidade = ${pizza.quantidade - 1} WHERE codigo = ${venda}")
        println(vendido)
        if (pizza.quantidade > 0){
            JOptionPane.showMessageDialog(null,"Quantidade da pizza de ${pizza.sabor} atualizada para ${pizza.quantidade}")
        }else{
            JOptionPane.showMessageDialog(null,"A pizza de ${pizza.sabor} está zerada no estoque")
        }

    }else{
        JOptionPane.showMessageDialog(null,"valor inválido")
    }

}

fun cadastar(): String{
    return  JOptionPane.showInputDialog("Quer cadastrar uma nova pizza?:\n S para sim ou qualquer coisa para não").toString()
}
