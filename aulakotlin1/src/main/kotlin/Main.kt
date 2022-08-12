fun main() {
    println("Escreva o peso")
    var P = readLine()!!. toDouble()
    var M:Double=0.00
    var E:Double=0.00
    if(P <= 50){println("E=0 M=0")}
    else{E=P - 50; M=E * 4
        println("O peso é $P o excesso é $E a multa é de R$$M")}
    }