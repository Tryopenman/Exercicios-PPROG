package org.example;

/**
 * Representa um contribuinte reformado através dos seus rendimentos do trabalho
 * e outros rendimentos.
 */
public class Reformado extends ContribuinteComRendimentosTrabalho {

    /**
     * Valor da taxa Rendimentos do trabalho
     */
    private static double taxaRendimentosTrabalho = 0.01;

    /**
     * Valor da taxa outros Rendimentos
     */
    private static double taxaOutrosRendimentos = 0.03;

    /**
     * Constrói uma instância de Reformado com rendimentos por omissão.
     */
    public Reformado() {
        super();
    }

    /**
     * Constrói uma instância de Reformado com os nome, morada e valores dos
     * rendimentos do trabalho e outros rendimentos.
     *
     * @param nome
     * @param morada
     * @param rendimentosTrabalho
     * @param outrosRendimentos
     */
    public Reformado(String nome, String morada, double rendimentosTrabalho, double outrosRendimentos) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
    }


    /**
     * Devolve o valor da taxa Rendimentos do trabalho
     *
     * @return  taxa de rendimentos do trabalho
     */
    @Override
    public double getTaxaRendimentosTrabalho() {
        return taxaRendimentosTrabalho;
    }

    /**
     * Devolve o valor da taxa outros Rendimentos
     *
     * @return  taxa de outros rendimentos
     */
    @Override
    public double getTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    /**
     * Modifica o valor da taxa Rendimentos trabalho
     *
     * @param taxaRendimentosTrabalho  novo valor da taxa dos rendimentos do trabalho
     */
    public static void setTaxaRendimentosTrabalho(double taxaRendimentosTrabalho) {
        Reformado.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
    }

    /**
     * Modifica o valor da taxa outros Rendimentos
     *
     * @param taxaOutrosRendimentos  novo valor da taxa de outros rendimentos
     */
    public static void setTaxaOutrosRendimentos(double taxaOutrosRendimentos) {
        Reformado.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }

    /**
     * Descrição textual do Reformado
     *
     * @return  características do contribuinte reformado
     */
    @Override
    public String toString() {
        return String.format("%s/nReformado: %.2f€ (RT) e %.2f€(OR)", super.toString(), super.getRendimentosTrabalho(), super.getOutrosRendimentos());
    }

}
