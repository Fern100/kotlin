fun main() {
    var conta = ContaBancaria(
        "Fer",
        "111.111.111-11",
        "11.111.111-1",
        1234,
        "Santo André aquele vermelho",
        1500.00,
        20.00
    )
    conta.visualizarSaldo()
    conta.sacar()
    conta.guardar()
}