package org.example;

import org.example.Empregado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.Data;
import pt.ipp.isep.dei.Tempo;

public class EmpregadoTest {
    @Test
    public void testGetSetPrimeiroNome() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        empregado.setPrimeiroNome("Beltrano");
        Assertions.assertEquals("Beltrano", empregado.getPrimeiroNome());
    }

    @Test
    public void testGetSetUltimoNome() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        empregado.setUltimoNome("Souza");
        Assertions.assertEquals("Souza", empregado.getUltimoNome());
    }

    @Test
    public void testGetSetDataContrato() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        empregado.setDataContrato(new Data(2021, 1, 1));
        Assertions.assertEquals(new Data(2021, 1, 1), empregado.getDataContrato());
    }

    @Test
    public void testGetSetHoraEntrada() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        empregado.setHoraEntrada(new Tempo(9, 0));
        Assertions.assertEquals(new Tempo(9, 0), empregado.getHoraEntrada());
    }

    @Test
    public void testGetSetHoraSaida() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        empregado.setHoraSaida(new Tempo(17, 0));
        Assertions.assertEquals(new Tempo(17, 0), empregado.getHoraSaida());
    }

    @Test
    public void testHorasSemanais() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        Assertions.assertEquals(50, empregado.horasSemanais());
    }

    @Test
    public void testTempoContratado() {
        Empregado empregado = new Empregado("Fulano", "Silva", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(18, 0));
        Assertions.assertEquals(472, empregado.tempoContratado());
    }

    @Test
    public void testEquals() {
        Empregado empregado1 = new Empregado("José", "Fernandes", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(17, 0));
        Empregado empregado2 = new Empregado("José", "Fernandes", new Data(2022, 1, 1), new Tempo(8, 0), new Tempo(17, 0));
        Empregado empregado3 = new Empregado("João", "Silva", new Data(2022, 4, 18), new Tempo(9, 0), new Tempo(18, 0));

        Assertions.assertEquals(empregado1, empregado2);
        Assertions.assertNotEquals(empregado1, empregado3);
    }
}
