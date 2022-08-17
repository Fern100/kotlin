fun main() {
    var numero = 0.00
    var media = 0.00
    var multiplos = 0.00
    var count = 0
    do {println("digite um número: ")
        numero = readln().toDouble()
        if(0.00 == numero % 3){
            multiplos = numero
            media+= multiplos}}
    while (numero != 0.00)
    print("A soma dos numeros digitados é $media")
}