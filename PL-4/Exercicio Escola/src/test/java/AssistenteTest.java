import org.example.Assistente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssistenteTest {

    @Test
    public void CalcularPagamento(){
        double salarioBase = 1500;
        double majoracao = 0;
        Assistente assistente1 = new Assistente("Miguel", 987654321);
        assertEquals(salarioBase*majoracao + salarioBase,assistente1.calcularPagamento());
    }
}