import javax.swing.JOptionPane

fun main() {

    // criamos um objeto do tipo Conexao e invocamos seu metodo de criar tabelas
    Conexao.criarTabelas()

    val repositorio = PizzaRepositorio()
    repositorio.iniciar()

    while (true) {
        val cadastrar =
            JOptionPane.showInputDialog(null, "Quer cadastrar uma nova pizza? S para sim ou qualquer coisa para não")

        if (cadastrar.uppercase() != "S") {
            break //sai do while
        }

        val novaPizza = Pizza()
        novaPizza.sabor = JOptionPane.showInputDialog("Qual o sabor?")
        novaPizza.preco = JOptionPane.showInputDialog("Qual o preço?").toDouble()
        novaPizza.quantidade = JOptionPane.showInputDialog("Qual a quantidade?").toInt()

        repositorio.cadastrar(novaPizza)
    }

    var ultimo = repositorio.getUltimoCodigo()
    var codigo = JOptionPane.showInputDialog("Qual pizza quer vender? Digite de 1 a $ultimo ").toInt()



    if (codigo >= 1 && codigo <= ultimo) {
        val vendeu = repositorio.vender(codigo)
        val pizza = repositorio.recuperar(codigo)
        if (vendeu) {
            JOptionPane.showMessageDialog(
                null,
                "Quantidade de pizza de ${pizza.sabor} atualizada para ${pizza.quantidade}"
            )
        } else {
            JOptionPane.showInputDialog(null, "A pizza de ${pizza.sabor} está zerada no estoque.")
        }


        ultimo = repositorio.getUltimoCodigo()
        codigo = JOptionPane.showInputDialog("Qual pizza terá alteração de valor? Digite de 1 a $ultimo ").toInt()

        val novoPreco = JOptionPane.showInputDialog("Qual o novo valor da pizza?").toDouble()

        val atualizou = repositorio.atualizarPreco(codigo, novoPreco)
        val pizzaComNovoPreco = repositorio.recuperar(codigo)

        val mensagem = if (atualizou)
            "Preço da pizza ${pizzaComNovoPreco.sabor} atualizada para R$${novoPreco}" else "Pizza não encontrada..."

        JOptionPane.showMessageDialog(null, mensagem)
    }
}