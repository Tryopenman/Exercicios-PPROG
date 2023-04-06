package org.example;

public class AlunoNaoBolseiro extends Aluno implements Pagamento{
    /**
     * Cria uma instância do Aluno não Bolseiro, recebendo o nome, o nif e o numMecanografico por parâmetros.
     * @param nome nome do Aluno não Bolseiro
     * @param nif número de identificação fiscal do Aluno não Bolseiro
     * @param numMecanografico número mecanográfico do Aluno Não Bolseiro
     */

    public AlunoNaoBolseiro(String nome, int nif, int numMecanografico) {
        super(nome, nif, numMecanografico);
    }

    /**
     * Cria uma instância do Aluno não Bolseiro, por omissão do nome, nif e numMecanografico.
     */
    public AlunoNaoBolseiro() {
        super();
    }

    /**
     * Descrição textual de um Aluno não Bolseiro
     * @return descrição
     */
    @Override
    public String toString() {
        return "AlunoNaoBolseiro! " + super.toString();
    }
    /**
     * Método que permite calcular o Salário Mensal do Aluno não Bolseiro.
     * @return pagamento (Salário Mensal)
     */
    @Override
    public double calcularPagamento() {
        return 0;
    }
}
