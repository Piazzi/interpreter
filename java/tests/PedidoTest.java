import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Pedido pedido = new Pedido();
        pedido.setPeso(1.0);
        pedido.setDistanciaDeEntrega(1.0);

        assertEquals(0.1, pedido.calcularFrete());
    }

}