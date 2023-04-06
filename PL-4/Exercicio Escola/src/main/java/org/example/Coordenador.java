package org.example;

public class Coordenador extends Professor implements Pagamento {
    /**
     * Valor de majoração do Professor Coordenador
     */
    private static double majoracao = 0.50;

    /**
     * Cria uma instância de um Professor Coordenador, por omissão do nome e do nif.
     */

    public Coordenador() {
        super();
    }

    /**
     * Cria uma instância de um Professor Coordenador, recebendo o nome e o nif por parâmetros.
     * @param nome nome do Professor Coordenador
     * @param nif número de indentificação fiscal do Professor Coordendador
     */
    public Coordenador(String nome, int nif) {
        super(nome, nif);
    }

    /**
     * Devolve o valor de majoração do Professor Coordenador.
     * @return majoração
     */
    public static double getMajoracao() {
        return majoracao;
    }

    /**
     * Modifica o valor de majoraçãop do Professor Coordenador.
     * @param majoracao majoração do Professor Coordenador
     */

    public static void setMajoracao(double majoracao) {
        Coordenador.majoracao = majoracao;
    }

    /**
     * Descrição textual do Professor Coordenador.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("Coordenador! Pagemento: %.2f" ,calcularPagamento());
    }
    /**
     * Método que permite calcular o Salário Mensal do Professor Coordenador.
     * @return pagamento (Salário Mensal)
     */
    @Override
    public double calcularPagamento() {
        return getSalarioBase() * getMajoracao() + getSalarioBase();
    }
}
