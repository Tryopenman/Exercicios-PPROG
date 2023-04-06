package org.example;

public abstract class Aluno extends Pessoa{
    /**
     * Número mecanográfico do Aluno.
     */
    private int numMecanografico;
    /**
     * Número mecanográfico do aluno, por omissão.
     */
    static final int NUM_MECANOGRAFICO_POR_OMISSAO = 0;

    /**
     * Iniciliza o nome, o nif e o número mecanográfico do aluno, pelos parâmetros fornecidos.
     * @param nome nome do Aluno
     * @param nif número de identificação fiscal do Aluno
     * @param numMecanografico número mecanográfico do Aluno
     */

    public Aluno(String nome, int nif, int numMecanografico) {
        super(nome, nif);
        this.numMecanografico = numMecanografico;
    }

    /**
     * Iniciliza o nome, o nif e o número mecanográfico do aluno, por omissão.
     */
    public Aluno() {
        super();
        this.numMecanografico = NUM_MECANOGRAFICO_POR_OMISSAO;
    }

    /**
     * Devolve o número mecanográfico do Aluno.
     * @return número mecanográfico
     */
    public int getNumMecanografico() {
        return numMecanografico;
    }

    /**
     * Modifica o número mecanográfico do Aluno.
     * @param numMecanografico número mecanográfico do Aluno
     */
    public void setNumMecanografico(int numMecanografico) {
        this.numMecanografico = numMecanografico;
    }

    /**
     * Descrição textual do Aluno.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format(super.toString() + "Número Mecanografico: %d",numMecanografico);
    }
}
