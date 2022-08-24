package herança

class cachorro(nome: String, idade: Int
): animais(nome, idade) {
    override fun emitirSom() {
        super.emitirSom()
        println("AuAu")
    }
    fun correr (){
        println("dog correndo")
    }
}