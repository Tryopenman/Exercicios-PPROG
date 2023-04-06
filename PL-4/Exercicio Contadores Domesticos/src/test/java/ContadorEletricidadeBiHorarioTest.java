import org.example.ContadorEletricidadeBiHorario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorEletricidadeBiHorarioTest {

    @Test
    public void calcularCustoConsumo(){
        double consumo  = 15;
        double consumo2 = 10;
        double tarifarioHorasVazio = 0.066;
        double tarifarioHorasForaVazio = 0.14;
        ContadorEletricidadeBiHorario c1 = new ContadorEletricidadeBiHorario("123456","António",15,10);
        assertEquals(consumo*tarifarioHorasForaVazio + consumo2*tarifarioHorasVazio,c1.getConsumo()*ContadorEletricidadeBiHorario.getTarifarioHorasForaVazio()+ c1.getConsumo2()*ContadorEletricidadeBiHorario.getTarifarioHorasVazio());
    }
}
