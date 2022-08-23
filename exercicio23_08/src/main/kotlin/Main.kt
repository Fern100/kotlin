import java.lang.Exception

fun main(args: Array<String>) {
try {
    var cliente1 = Cliente(
        "Fernanda",
        "bolinho",
        "999999999"
    )
    while (true) {
        println("O que você deseja fazer?(1-Adicionar objetos/2-Remover Objetos/3-Listar objetos)")
        when (readln().toInt()) {
            1 -> cliente1.adicionar()
            2 -> cliente1.remover()
            3 -> cliente1.listar()
            else -> println("Opção inválida")
        }
    }
}catch (erro:Exception){
    println("Digite um nome valido $erro")
}
}