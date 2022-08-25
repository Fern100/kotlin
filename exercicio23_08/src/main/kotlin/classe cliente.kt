class Cliente (
        var nome:String,
        var endereco:String,
        var telefone:String)
    {private var listaDeCompras = mutableListOf<String>()

        init {verificarNome()}
    fun adicionar(){
    println("Digite o objeto a ser adicionado a lista: ")
            listaDeCompras.add(readln())
            println("item adicionado com sucesso")
        }
    fun remover(){
        println("Digite o objeto a ser removido da lista: ")
            listaDeCompras.remove(readln())
            println("Item removido com sucesso")
    }
    fun listar(){
        println(listaDeCompras)
    }
        private fun verificarNome(){
            if (nome.isBlank()){
                throw Exception("Nome invalido")
            }
        }
}