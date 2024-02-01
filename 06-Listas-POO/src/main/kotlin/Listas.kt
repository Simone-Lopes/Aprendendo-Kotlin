fun main() {

    //Lista "lacrada" mesmo sendo var ou val
    var herois = listOf("Batman", "Thor", "Homem de Ferro", "Mulher Maravilha")
    println(herois)
    println("Primeiro: ${herois[0]}")
    println("Último: ${herois[herois.size-1]}")

    // Facilitando processos
    println("Primeiro: ${herois.first()}")
    println("Segundo: ${herois.last()}")

    //Lista que permite inserir e apagar dados mesmo sendo val
    val paises = mutableListOf("Brasil", "Jamaica", "Chile")

    paises.add("Argentina")//Adicionando conteúdo
    paises.remove("Jamaica") // Remove por nome
    paises.removeAt(0) // Remove pela posição index
    println(paises)

    paises.addAll(listOf("Cuba", "Guiana", "Guiana")) //Inserindo vários elementos de uma vez
    println(paises)
    //As listas permitem elementos repetidos

    //Caso existam repetições, apenas o primeiro é excluido
    paises.remove("Guiana")

    paises.add(2, "Brasil")
    println(paises)

    //Alterando o valor em uma determinada posição
    paises.set(3, "EUA")
    println(paises)

    println("Os países estão vazios? ${paises.isEmpty()}") // -> true se a lista estiver vazia
    println("Há países? ${paises.isNotEmpty()}") // -> true se a lista tiver pelo menos uma elemento

    paises.sort() //Ordem alfabética diante padrão americano
    println(paises)

    val numeros = mutableListOf(22,80,9,1,20,-12)
    numeros.sort() // Ordena a lista em ordem crescente
    println(numeros)

    numeros.reverse() // Ordena a lista ao contrário
    println(numeros)

    numeros.sortDescending() // Ordena a lista ordem decrescente

    println(numeros.sorted()) //Apresenta os valores sorteados mas não altera o index dos elementos originais

    paises.forEach{//Recorre e interage com cada elemento da lista
        println("Já fui no país $it")
    }

    paises.forEachIndexed{ indice, pais -> // //Recorre a lista e tras o indice
        println("O país na posição $indice é $pais")
    }

    val paisesFiltro = paises.filter{ it.contains("a")} //Criando filtro que possui a letra em minúsculo
    println(paisesFiltro)

    val paisesPequenos = paises.filter { it.length < 6 } // Filtrando quandidade de letras
    println(paisesPequenos)
    
}