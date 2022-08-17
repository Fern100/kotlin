fun main() {
    /*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
    var numero = 0.00
    var soma = 0.00
    var count = 0
    do {println("digite um número: ")
        numero = readln().toDouble()
        soma += numero
        print("A soma dos numeros digitados é $soma")
        }while (numero != 0.00)
}