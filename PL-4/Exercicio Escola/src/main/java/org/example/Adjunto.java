package org.example;

public class Adjunto extends Professor implements Pagamento{
    /**
     * Valor de majoração.
     */
    private static double majoracao = 0.20;

    /**
     * Constrói uma instância de um Professor Adjunto, recebendo por parâmetros o nome e o nif.
     * @param nome nome do Professor Adjunto
     * @param nif número de identificação fiscal do Professor Adjunto
     */

    public Adjunto(String nome, int nif) {
        super(nome, nif );
    }

    /**
     * Constrói uma instância de um Professor Adjunto, por omissão do nome e do nif.
     */

    public Adjunto() {
        super();
    }

    /**
     * Devolve o valor de majoração do Professor Adjunto.
     * @return majoração
     */
    public static double getMajoracao() {
        return majoracao;
    }

    /**
     * Modifica o valor de majoração do Professor Adjunto
     * @param majoracao valor de majoração
     */
    public static void setMajoracao(double majoracao) {
        Adjunto.majoracao = majoracao;
    }

    /**
     * Descrição textual de um Professor Adjunto.
     * @return descrição
     */

    @Override
    public String toString() {
        return String.format("Adjunto! Pagemento: %.2f" ,calcularPagamento());
    }

    /**
     * Método que permite calcular o Salário Mensal do Professor Adunto.
     * @return pagamento (Salário Mensal)
     */
    @Override
    public double calcularPagamento() {
        return getSalarioBase()*majoracao + getSalarioBase();
    }
}
