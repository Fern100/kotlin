class ContaBancaria (
    var nome:String,
    var cpf:String,
    var Rg:String,
    var agencia:Int,
    var banco:String,
    var saldo:Double,
    var valor:Double
        ){
    fun visualizarSaldo(){
        println("$saldo")
    }
    fun sacar(){
        println("digite o valor a sacar:")
        valor=readln().toDouble()
        if(saldo > 0 && valor <= saldo) {
        println("valor sacado com sucesso!")
        }else{
            println("Não foi possível sacar o valor desejado")
        }
    }
    fun guardar(){
        println("digite o valor a guardar:")
        valor= readln().toDouble()
        if(valor >=0){
            saldo += valor
            println("Digite onde deseja depositar o valor:(1-conta corrente/2-poupança)")
            when(readln().toInt()){
                1->print("Depositado na conta-corrente com sucesso!")
                2->print("Depositado na poupança com sucesso!")}
        }
    }
}