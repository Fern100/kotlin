class ProdutosEletronicos(
    var nome:String,
    var modelo:String,
    var ano:Int,
    var sistema:String,
    var bateria:Int,
    var porcentagemdeBateria:Int,
    ){
    fun carregarBateria(){
        println("quanto de bateria está o aparelho?")
        porcentagemdeBateria = readln().toInt()
        if(porcentagemdeBateria <= 20){
            println("Carregue seu dispositivo")
        }
    }
    }