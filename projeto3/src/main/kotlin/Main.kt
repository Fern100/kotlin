fun main(args: Array<String>) {
println("escreva um número ")
    var numero = readLine()!!.toDouble()
    var area: Double= 0.00
    if(numero > 0){
        numero *= numero
        area= numero/ 2
        println("A área do triangulo é $area")}
}