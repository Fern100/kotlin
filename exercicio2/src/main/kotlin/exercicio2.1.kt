fun main() {
    print("digite um número: ")
    val numero1 = readLine()!!.toDouble()
    print("digite outro número: ")
    val numero2 = readLine()!!.toDouble()
    print("digite outro número: ")
    val numero3 = readLine()!!.toDouble()
    if(numero1 > numero2 && numero2 > numero3){
        println("$numero1, $numero2, $numero3")}
    else if(numero1 > numero3 && numero3 > numero2){
        println("$numero1, $numero3, $numero2")}
    else if(numero2 > numero1 && numero1 > numero3){
        println("$numero2, $numero1, $numero3")}
    else if(numero2 > numero3 && numero3 > numero1){
        println("$numero2, $numero3, $numero1")}
    else if(numero3 > numero1 && numero1 > numero2){
        println("$numero3, $numero1, $numero2")}
    else if(numero3 > numero2 && numero2 > numero1){
        println("$numero3, $numero2, $numero1")}
    else{println("não há como fazer uma ordem crescente")}
}