package herança
class preguica(nome: String, idade: Int) :animais(nome, idade) {
    override fun emitirSom() {
        super.emitirSom()
        println("aaaaAAAAaaaaAAA")
    }
    fun escalar (){
        println("Preguiça subindo na árvore")
    }
}