import org.example.ContadorGas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorGasTest {

    @Test
    public void calcularCustoConsumo() {
        double custo = 0.8;
        int consumo = 20;
        ContadorGas contadorGas1 = new ContadorGas("1","Francisco",20);
        assertEquals(custo*consumo,contadorGas1.calcularCustoConsumo());
    }
}
