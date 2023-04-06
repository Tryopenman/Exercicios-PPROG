import org.example.ContadorEletricidadeTarifaSimples;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorEletricidadeTarifaSimplesTest {
    @Test
    public void calcularCustoConsumo(){
        double potenciaContratadaLim  = 6.9;
        double potenciaContratada = 10;
        double consumo = 10;
        double precoKWH1 = 0.13;
        double precoKWH2 = 0.16;
        ContadorEletricidadeTarifaSimples C1 = new ContadorEletricidadeTarifaSimples("123","Jonas",10,10);
        ContadorEletricidadeTarifaSimples C2 = new ContadorEletricidadeTarifaSimples("123","Jonas",10,5);
        if (potenciaContratada > potenciaContratadaLim)
            assertEquals(consumo * precoKWH2,C1.getConsumo() * ContadorEletricidadeTarifaSimples.getPrecoKWH2());
        assertEquals(consumo*precoKWH1, C2.getConsumo() * ContadorEletricidadeTarifaSimples.getPrecoKWH1());
    }
}
