fun main(args: Array<String>) {
    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
    */
    while (true) {
        var produtos: String
        var produto2:String
        println(
            "O que você deseja fazer? (1-adicionar produto/" +
                    "2-remover produto/3-atualizar produto/4- listar produtos)"
        )
        var opc = readln().toInt()
        when (opc) {
            1 -> {println("Digite o produto que você deseja adicionar: ")
                produtos = readln()
                adicionar(produtos)
                println("produto adicionado com sucesso")}

            2 -> {println("Digite o produto que você deseja remover: ")
                produtos = readln()
                remover(produtos)
                println("produto removido com sucesso")}

            3 -> {println("Digite o produto que você deseja atualizar: ")
                produtos = readln()
                atualizar(produtos)
                println("produto atualizado com sucesso")
            }
            4 -> print("$listadeProdutos")
            else -> print("opção invalida")
        }
    }
}