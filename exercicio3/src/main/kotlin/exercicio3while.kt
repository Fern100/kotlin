fun main() {
    /*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
     */
    var idade:Int=0
    var count1 = 0
    var count2 = 0
    while(idade != -99){
        print("digite sua idade: ")
        idade= readln().toInt()
        if(idade in 0 until 21){
            count1++
            }
        if (idade > 50)
        {count2++}
        }
    println("a quantidade de pessoas com menos de 21 é: $count1")
    print("a quantidade de pessoas com mais de 50 é: $count2")
    }