import org.example.Coordenador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordenadorTest {
    @Test
    public void CalcularPagamento(){
        double salarioBase = 1500;
        double majoracao = 0.50;
        Coordenador coordenador1 = new Coordenador("António", 567894321);
        assertEquals(salarioBase*majoracao + salarioBase, coordenador1.calcularPagamento());
    }
}
