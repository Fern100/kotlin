import herança.cachorro
import herança.cavalo
import herança.preguica

fun main(args: Array<String>) {
var Cachorro = cachorro("bob",
    1)
    Cachorro.correr()
    Cachorro.emitirSom()
val Cavalo = cavalo("spirit",
    5)
    Cavalo.correr()
    Cavalo.emitirSom()
val Preguica = preguica("flash",
    20)
    Preguica.escalar()
    Preguica.emitirSom()
}