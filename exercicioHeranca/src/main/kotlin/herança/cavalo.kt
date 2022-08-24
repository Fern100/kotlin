package herança

class cavalo(nome: String, idade: Int) :animais(nome, idade) {
    override fun emitirSom() {
        super.emitirSom()
        println("UUUUrÓÓÓÓÓÓirrinnn")
    }
    fun correr (){
        println("cavalo galopando")
    }
}