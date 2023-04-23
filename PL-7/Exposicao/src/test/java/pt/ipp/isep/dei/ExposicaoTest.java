package pt.ipp.isep.dei;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExposicaoTest {

    private Exposicao exposicao;

    @BeforeEach
    void setUp() {
        exposicao = new Exposicao("Exposicao Teste", "2023");
    }

    @Test
    void testGetDesignacao() {
        assertEquals("Exposicao Teste", exposicao.getDesignacao());
    }

    @Test
    void testSetDesignacao() {
        exposicao.setDesignacao("Nova Designacao");
        assertEquals("Nova Designacao", exposicao.getDesignacao());
    }

    @Test
    void testGetAnoRealizacao() {
        assertEquals("2023", exposicao.getAnoRealizacao());
    }

    @Test
    void testSetAnoRealizacao() {
        exposicao.setAnoRealizacao("2024");
        assertEquals("2024", exposicao.getAnoRealizacao());
    }

    @Test
    void testAddQuadro() {
        Quadro quadro = new Quadro("Quadro Teste", "Artista Teste");
        assertTrue(exposicao.addQuadro(quadro));
        assertTrue(exposicao.getQuadrosExibidos().contains(quadro));
    }

    @Test
    void testRemoveQuadro() {
        Quadro quadro = new Quadro("Quadro Teste", "Artista Teste");
        exposicao.addQuadro(quadro);
        assertTrue(exposicao.removeQuadro(quadro));
        assertFalse(exposicao.getQuadrosExibidos().contains(quadro));
    }

    @Test
    void testToString() {
        Quadro quadro1 = new Quadro("Quadro 1", "Artista 1","2020");
        Quadro quadro2 = new Quadro("Quadro 2", "Artista 2","2020");
        exposicao.addQuadro(quadro1);
        exposicao.addQuadro(quadro2);
        String expectedString = quadro1.toString() + "\n" + quadro2.toString() + "\n";
        assertEquals(expectedString, exposicao.toString());
    }
}

