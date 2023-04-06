package org.example;

public class AlunoBolseiro extends Aluno implements Pagamento {
    /**
     * Bolsa do Aluno Bolseiro.
     */
    private double bolsa;
    /**
     * Bolsa por omissão do Aluno Bolseiro.
     */
    private static final double BOLSA_POR_OMISSAO = 100;

    /**
     * Cria uma instância do Aluno Bolseiro, recebendo o nome,o nif, o numMecanográfico e a bolsa por parâmetros.
     * @param nome nome do Aluno Bolseiro
     * @param nif número de identificação fiscal do Aluno Bolseiro
     * @param numMecanografico número mecanográfico do Aluno Bolseiro
     * @param bolsa bolsa do Aluno Bolseiro
     */
    public AlunoBolseiro(String nome, int nif, int numMecanografico, double bolsa) {
        super(nome,nif,numMecanografico);
        this.bolsa = bolsa;
    }

    /**
     * Cria uma instância do Aluno Bolseiro, por omisssão do nome, nif, numMecanográfico e bolsa.
     */
    public AlunoBolseiro() {
        super();
        this.bolsa = BOLSA_POR_OMISSAO;
    }

    /**
     * Devolve o valor da bolsa do Aluno Bolseiro.
     * @return bolsa
     */
    public double getBolsa() {
        return bolsa;
    }

    /**
     * Modifica o valor da bolsa do Aluno Bolseiro.
     * @param bolsa bolsa do Aluno Bolseiro
     */
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    /**
     * Método que permite calcular o Salário Mensal do Aluno Bolseiro.
     * @return pagamento (Salário Mensal)
     */
    @Override
    public double calcularPagamento() {
        return getBolsa();
    }

    /**
     * Descrição textual do Aluno Bolseiro.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("Aluno bolseiro " + super.toString() + "bolsa: %.2f",calcularPagamento());
    }
}
