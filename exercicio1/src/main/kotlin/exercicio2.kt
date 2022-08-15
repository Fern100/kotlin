fun main(args: Array<String>) {
    println("digite o diametro do circulo:")
    val diametro = readln().toDouble()
    val π = 3.14
    var raio = 0.00
    raio = diametro / 2
    println("A área do circulo é: ${π * (raio * raio)}")
    println("O perímetro do circulo é: ${2 * π * raio}")
}