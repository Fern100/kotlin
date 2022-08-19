var listadeProdutos = mutableListOf<String>()
fun adicionar(produto: String){
    if (produto != "")
    listadeProdutos.add(produto)}
fun remover(produto: String){
    if (listadeProdutos.contains(produto)){
        listadeProdutos.remove(produto)
    }else{
        println("esse produto não está cadastrado")
    }}
fun atualizar(produto: String){
    if (listadeProdutos.contains(produto)){
        val posicao = listadeProdutos.indexOf(produto)
        println("digite o nome do novo produto: ")
        listadeProdutos[posicao] = readln()
    }else{
        println("esse produto não está cadastrado")}}
