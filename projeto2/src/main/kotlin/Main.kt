fun main(args: Array<String>) {
   var potencia1:Double =0.00
   var potencia2:Double =0.00
   var potencia3:Double =0.00
   var potencia4:Double =0.00
   println("Digite um número ")
   var num1= readLine()!!.toDouble()
   println("Digite outro número ")
   var num2= readLine()!!.toDouble()
   println("Digite outro número ")
   var num3= readLine()!!.toDouble()
   println("Digite outro número ")
   var num4= readLine()!!.toDouble()
   potencia1= num1 * num1
   potencia2= num2 * num2
   potencia3= num3 * num3
   potencia4= num4 * num4
   if(potencia3 >= 1000){println("O quadrado do número $num3 é $potencia3")}
   else{ println("O quadrado do número $num1 é $potencia1")
          println("O quadrado do número $num2 é $potencia2")
          println("O quadrado do número $num3 é $potencia3")
          println("O quadrado do número $num4 é $potencia4")}
}