package org.example;

/**
 * Representa um trabalhador por conta própria
 */
public class TrabalhadorContaPropria extends ContribuinteComRendimentosTrabalho {

    /**
     * Profissão do trabalhador por conta propria
     */
    private String profissao;

    /**
     * Profissão por omissão do trabalhador por conta propria
     */
    private static final String PROFISSAO_POR_OMISSAO = "N/A";

    /**
     * Valor da taxa aplicável sobre o rendimento do trabalho
     */
    private static double taxaRendimentosTrabalho = 0.03;

    /**
     * Valor da taxa de nível 1 aplicável aos outros rendimentos
     */
    private static double taxaOutrosRendimentosNivel1 = 0.02;

    /**
     * Valor da taxa de nível 2 aplicável aos outros rendimentos
     */
    private static double taxaOutrosRendimentosNivel2 = 0.05;

    /**
     * Valor limite de outros rendimentos a partir de qual se aplica a taxa de nível 2
     */
    public static final double LIMITE_OUTROS_RENDIMENTOS = 50000;

    /**
     * Constrói uma instância de TrabalhadorPropria com os parâmetros por omissão
     */
    public TrabalhadorContaPropria() {
        super();
    }

    /**
     * Constrói uma instância de TrabalhadorPropria com o nome, morada e valores dos
     * rendimentos do trabalho e outros rendimentos fornecidos pelo utilizador
     *
     * @param nome  nome do trabalhador
     * @param morada  morada do trabalhador
     * @param rendimentosTrabalho  valor dos rendimentos do trabalho
     * @param outrosRendimentos  valor de outros rendimentos
     */
    public TrabalhadorContaPropria(String nome, String morada, double rendimentosTrabalho, double outrosRendimentos, String profissao) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.profissao = profissao;
    }


    /**
     * Devolve o valor da taxa aplicável aos rendimentos do trabalho
     *
     * @return  taxa aplicável aos rendimentos do trabalho
     */
    public double getTaxaRendimentosTrabalho() {
        return taxaRendimentosTrabalho;
    }

    /**
     * Devolve o valor da taxa aplicável a outros rendimentos
     *
     * @return  taxa aplicável a outros rendimentos
     */
    public double getTaxaOutrosRendimentos() {
        return (super.getOutrosRendimentos() <= LIMITE_OUTROS_RENDIMENTOS) ? taxaOutrosRendimentosNivel1 : taxaOutrosRendimentosNivel2;
    }

    /**
     * Modifica o valor da taxa aplicável aos rendimentos do trabalho
     *
     * @param taxaRendimentosTrabalho  novo valor da taxa aplicável aos rendimentos do trabalho
     */
    public static void setTaxaRendimentosTrabalho(double taxaRendimentosTrabalho) {
        TrabalhadorContaPropria.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
    }

    /**
     * Modifica o valor da taxa de nível 1 aplicável a outros rendimentos
     *
     * @param taxaOutrosRendimentos1  novo valor da taxa de nível 1
     */
    public static void setTaxaOutrosRendimentosNivel1(double taxaOutrosRendimentos1) {
        TrabalhadorContaPropria.taxaOutrosRendimentosNivel1 = taxaOutrosRendimentos1;
    }

    /**
     * Modifica o valor da taxa de nível 2 aplicável a outros rendimentos
     *
     * @param taxaOutrosRendimentos2 novo valor da taxa de nível 2
     */
    public static void setTaxaOutrosRendimentosNivel2(double taxaOutrosRendimentos2) {
        TrabalhadorContaPropria.taxaOutrosRendimentosNivel2 = taxaOutrosRendimentos2;
    }

    /**
     * Devolve a descrição textual do trabalhado por conta propria
     *
     * @return características do trabalhador por conta propria
     */
    @Override
    public String toString() {
        return String.format("%s%nTrabalhador por conta própria:%n  - Profissao: %s%n   -%.2f€ (RT)%n   -%.2f€ (OR)", super.toString(), profissao, super.getRendimentosTrabalho(), super.getOutrosRendimentos());
    }

}