import org.example.Adjunto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdjuntoTest {

    @Test
    public void CalcularPagamento(){
        double salarioBase = 1500;
        double majoracao = 0.20;
        Adjunto adjunto1 = new Adjunto("Jorge",123456789);
        assertEquals(salarioBase*majoracao + salarioBase,adjunto1.calcularPagamento());
    }
}
