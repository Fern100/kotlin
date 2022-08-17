fun main() {
    var count = 0
    var count1 = 0
    var count2 = 0
    for(count in 0 until 10){
        println("digite um numero: ")
        val numero = readln().toDouble()
        if (numero % 2 == 0.0){count1++}
        else{count2++}
         var count = count1 + count2}
    print("A quantidade de numeros pares é $count1 e a quantidade de numeros impares é $count2")
}