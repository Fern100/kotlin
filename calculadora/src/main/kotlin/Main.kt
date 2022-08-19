fun main(args: Array<String>) {
print("digite um número: ")
    val num1= readln().toDouble()
    print("digite um número: ")
    val num2= readln().toDouble()
    print("qual operação você deseja realizar? (1-Adição/2-Subtração/3-multiplicação/4-divisão)")
    val opcao = readln().toInt()
    if (opcao == 1){
    var soma = soma(num1, num2)
    println("O resultado é: $soma")}
    else if (opcao == 2){
        var sub = subtracao(num1, num2)
        println("O resultado é: $sub")}
    else if (opcao == 3){
        var mul = multplicacao(num1, num2)
        println("O resultado é: $mul")}
    else if (opcao == 4){
        var div = divisao(num1, num2)
        println("O resultado é: $div")}
}