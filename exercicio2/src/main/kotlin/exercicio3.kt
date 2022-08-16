fun main() {
    print("digite sua idade: ")
    val idade = readln().toInt()
    when(idade){
        in 10..14 -> print("você está na categoria: infantil")
        in 15 .. 17 -> print("você está na categoria: juvenil")
        in 18 .. 25 -> print("você está na categoria: adulto")
        else -> print("você não se encaixa em nenhuma categoria")
    }
}