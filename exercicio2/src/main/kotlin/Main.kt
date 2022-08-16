fun main(args: Array<String>) {
  println("digite um numero: ")
  val numero1 = readLine()!!.toDouble()
  println("digite outro numero: ")
  val numero2 = readLine()!!.toDouble()
  println("digite outro numero: ")
  val numero3 = readLine()!!.toDouble()
  if(numero1 > numero2 && numero1 > numero3){
    println("O número $numero1 é o maior número")}
  else if(numero2 > numero1 && numero2 > numero3){
    println("O número $numero2 é o maior número")}
  else if(numero3 > numero1 && numero3 > numero2){
    println("O número $numero3 é o maior número")}
  else{println("não há um valor maior entre os três numeros")}
}