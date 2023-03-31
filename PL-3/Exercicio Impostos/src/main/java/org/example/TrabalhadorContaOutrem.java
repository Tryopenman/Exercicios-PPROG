package org.example;

/**
 * Representa um trabalhador por conta de outrem
 */
public class TrabalhadorContaOutrem extends ContribuinteComRendimentosTrabalho
{

    /**
     * Nome da empresa
     */
    private String nomeEmpresa;

    /**
     * Nome da empresa por omissão
     */
    public static final String NOME_EMPRESA_POR_OMISSAO = "Sem nome";

    /**
     * Valor da taxa de nível 1 aplicável sobre o rendimento do trabalho
     */
    private static double taxaRendimentosTrabalhoNivel1 = 0.01;

    /**
     * Valor da taxa de nível 2 aplicável sobre o rendimento do trabalho
     */
    private static double taxaRendimentosTrabalhoNivel2 = 0.02;

    /**
     * Valor da taxa aplicável sobre outros rendimentos
     */
    private static double taxaOutrosRendimentos = 0.02;

    /**
     * Valor limite de rendimentos a partir do qual se aplica a taxa de nível 2
     */
    public static final double LIMITE_RENDIMENTOS_TRABALHO = 30000;

    /**
     * Constrói uma instância de um TrabalhadorOutrem usando os valores por omissão
     */
    public TrabalhadorContaOutrem() {
        super();
        this.nomeEmpresa = NOME_EMPRESA_POR_OMISSAO;
    }

    /**
     * Constrói uma instância de um TrabalhadorOutrem com o nome, morada e valores dos
     * rendimentos do trabalho e outros rendimentos fornecidos pelo utilizador
     *
     * @param nome  nome do trabalhador
     * @param morada  morada do trabalhador
     * @param rendimentosTrabalho  valor dos rendimentos do trabalho
     * @param outrosRendimentos  valor dos outros rendimentos
     */
    public TrabalhadorContaOutrem(String nome, String morada, double rendimentosTrabalho, double outrosRendimentos, String nomeEmpresa) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.nomeEmpresa = nomeEmpresa;
    }


    /**
     * Devolve o valor da taxa aplicável aos rendimentos do trabalho
     *
     * @return  taxa aplicável aos rendimentos do trabalho
     */
    public double getTaxaRendimentosTrabalho() {
        return (super.getRendimentosTrabalho() <= LIMITE_RENDIMENTOS_TRABALHO) ? taxaRendimentosTrabalhoNivel1 : taxaRendimentosTrabalhoNivel2;
    }

    /**
     * Devolve o valor da taxa aplicável aos outros rendimentos
     *
     * @return  taxa aplicável aos outros rendimentos
     */
    public double getTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    /**
     * Modifica o valor da taxa de nível 1 aplicável aos rendimentos do trabalho
     *
     * @param taxaRendimentosTrabalhoNivel1  novo valor da taxa de nível 1
     */
    public static void setTaxaRendimentosTrabalhoNivel1(double taxaRendimentosTrabalhoNivel1) {
        TrabalhadorContaOutrem.taxaRendimentosTrabalhoNivel1 = taxaRendimentosTrabalhoNivel1;
    }

    /**
     * Modifica o valor da taxa de nível 2 aplicável aos rendimentos do trabalho
     *
     * @param taxaRendimentosTrabalhoNivel2  novo valor da taxa de nível 2
     */
    public static void setTaxaRendimentosTrabalhoNivel2(double taxaRendimentosTrabalhoNivel2) {
        TrabalhadorContaOutrem.taxaRendimentosTrabalhoNivel2 = taxaRendimentosTrabalhoNivel2;
    }

    /**
     * Modifica o valor da taxa aplicável aos outros rendimentos
     *
     * @param taxaOutrosRendimentos  novo valor da taxa aplicável aos outros rendimentos
     */
    public static void setTaxaOutrosRendimentos(double taxaOutrosRendimentos) {
        TrabalhadorContaOutrem.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }

    /**
     * Devolve a descrição textual do trabalhado por conta de outrem
     *
     * @return características do trabalhador por conta de outrem
     */
    @Override
    public String toString() {
        return String.format("%s%nTrabalhador por conta de outrem:%n  - Empresa: %s%n   -%.2f€ (RT)%n   -%.2f€ (OR)", super.toString(), nomeEmpresa, super.getRendimentosTrabalho(), super.getOutrosRendimentos());
    }
}
