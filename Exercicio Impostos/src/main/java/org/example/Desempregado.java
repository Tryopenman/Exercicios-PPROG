package org.example;

/**
 * Representa um contribuinte desempregado através do seu nome morada e outros
 * rendimentos.
 */
public class Desempregado extends Contribuinte
{
    /**
     * Outros rendimentos do contribuinte desempregado
     */
    private double outrosRendimentos;

    /**
     * Meses sem trabalhar
     */
    private int mesesParagem;

    /**
     * Valor dos outros rendimentos por omissao
     */
    public static final double OUTROS_RENDIMENTOS_POR_OMISSAO = 0.0;

    /**
     * Numero de meses de paragem por omissao
     */
    public static final int MESES_PARAGEM_POR_OMISSAO = 0;

    /**
     * Taxa aplicável sobre a categoria de outros rendimentos
     */
    private static double taxaOutrosRendimentos = 0.02;

    /**
     * Constrói uma instância do contribuinte desempregado com o nome, morada,
     * e o valor dos rendimentos por omissão
     */
    public Desempregado()
    {
        super();
        outrosRendimentos = OUTROS_RENDIMENTOS_POR_OMISSAO;
        mesesParagem = MESES_PARAGEM_POR_OMISSAO;
    }


    /**
     * Constrói uma instância do contribuinte desempregado com o nome, morada
     * e valor dos rendimentos fornecido pelo utilizador
     */
    public Desempregado(String nome, String morada, double outrosRendimentos, int mesesParagem)
    {
        super(nome, morada);
        this.outrosRendimentos = outrosRendimentos;
        this.mesesParagem = mesesParagem;
    }

    /**
     * Devolve o valor dos rendimentos do contribuinte desempregado
     *
     * @return  valor dos rendimentos;
     */
    public double getOutrosRendimentos()
    {
        return outrosRendimentos;
    }

    /**
     * Modifica o valor dos rendimentos do contribuinte desempregado
     *
     * @param outrosRendimentos  novo valor dos rendimentos;
     */
    public void setOutrosRendimentos(double outrosRendimentos)
    {
        this.outrosRendimentos = outrosRendimentos;
    }

    public static void setTaxaOutrosRendimentos(double taxaOutrosRendimentos)
    {
        Desempregado.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }

    /**
     * Devolve a descrição textual do contribuinte desempregado
     *
     * @return  descrição;
     */
    @Override
    public String toString()
    {
        return String.format("%s%nDesempregado há %d meses: %.2f€ (OR).", super.toString(), mesesParagem, outrosRendimentos);
    }

    /**
     * Devolve o valor do imposto a pagar pelo desempregado
     *
     * @return  valor do imposto a pagar
     */
    @Override
    public double calcularImposto()
    {
        return outrosRendimentos * taxaOutrosRendimentos;
    }

}