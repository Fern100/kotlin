import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ProdutosEletronicosTest {

    val Produto = ProdutosEletronicos(
        "jhu",
        "jeh",
        2011,
        "deiui",
        236,
        20
    )

    @Test
    fun carregarBateria() {
        Produto.porcentagemdeBateria=10
        assertEquals(10, Produto.porcentagemdeBateria)
    }
}