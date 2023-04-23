package pt.ipp.isep.dei;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuadroTest {

    private Quadro quadro;

    @BeforeEach
    public void setUp() {
        quadro = new Quadro("Mona Lisa", "Leonardo da Vinci", "1503");
    }

    @Test
    public void testGetDesignacao() {
        String expected = "Mona Lisa";
        Assertions.assertEquals(expected, quadro.getDesignacao());
    }

    @Test
    public void testSetDesignacao() {
        String expected = "A Noite Estrelada";
        quadro.setDesignacao(expected);
        Assertions.assertEquals(expected, quadro.getDesignacao());
    }

    @Test
    public void testGetNomeAutor() {
        String expected = "Leonardo da Vinci";
        Assertions.assertEquals(expected, quadro.getNomeAutor());
    }

    @Test
    public void testSetNomeAutor() {
        String expected = "Vincent van Gogh";
        quadro.setNomeAutor(expected);
        Assertions.assertEquals(expected, quadro.getNomeAutor());
    }

    @Test
    public void testGetAnoCriacao() {
        String expected = "1503";
        Assertions.assertEquals(expected, quadro.getAnoCriacao());
    }

    @Test
    public void testSetAnoCriacao() {
        String expected = "1889";
        quadro.setAnoCriacao(expected);
        Assertions.assertEquals(expected, quadro.getAnoCriacao());
    }

    @Test
    public void testToString() {
        String expected = "Quadro: \nDesignação: Mona Lisa \n Nome Autor: Leonardo da Vinci \n Ano Criação: 1503";
        Assertions.assertEquals(expected, quadro.toString());
    }

    @Test
    public void testEquals() {
        Quadro quadro2 = new Quadro("Mona Lisa", "Leonardo da Vinci", "1503");
        Assertions.assertTrue(quadro.equals(quadro2));
    }

    @Test
    public void testNotEquals() {
        Quadro quadro2 = new Quadro("A Noite Estrelada", "Vincent van Gogh", "1889");
        Assertions.assertFalse(quadro.equals(quadro2));
    }

    @Test
    public void testCompareToLessThan() {
        Quadro quadro2 = new Quadro("A Noite Estrelada", "Vincent van Gogh", "1889");
        Assertions.assertTrue(quadro.compareTo(quadro2) < 0);
    }

    @Test
    public void testCompareToGreaterThan() {
        Quadro quadro2 = new Quadro("A Persistência da Memória", "Salvador Dalí", "1931");
        Assertions.assertTrue(quadro2.compareTo(quadro) > 0);
    }

    @Test
    public void testCompareToEquals() {
        Quadro quadro2 = new Quadro("Mona Lisa", "Leonardo da Vinci", "1503");
        Assertions.assertEquals(0, quadro.compareTo(quadro2));
    }

}
