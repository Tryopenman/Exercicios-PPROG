package org.example;

public class Assistente extends Professor implements Pagamento{
    /**
     * Valor majoração do Professor Assistente.
     */
    private static double majoracao=0;

    /**
     * Constrói uma instância do Professor Assistente, recebendo o nome e o nif por parâmetros.
     * @param nome nome do Professor Assistente
     * @param nif número de identificação fiscal do Professor Assistente
     */

    public Assistente(String nome, int nif) {
        super(nome, nif);
    }

    /**
     * Constrói uma instância do Professor Assistente, por omissão do nome e do nif.
     */

    public Assistente() {
        super();
    }

    /**
     * Devolve o valor de majoração do Professor Assistente.
     * @return majoração
     */

    public static double getMajoracao() {
        return majoracao;
    }

    /**
     * Modifica o valor de majoração do Professor Assistente.
     * @param majoracao valor de majoração
     */
    public static void setMajoracao(double majoracao) {
        Assistente.majoracao = majoracao;
    }

    /**
     * Descrição textual do Professor Assistente.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("ASSISTENTE! Pagamento: %.2f",calcularPagamento());
    }

    /**
     * Método que permite calcular o Salário Mensal do Professor Assistente.
     * @return pagamento (Salário Mensal)
     */
    @Override
    public double calcularPagamento() {
        return getSalarioBase() * majoracao + getSalarioBase();
    }
}
