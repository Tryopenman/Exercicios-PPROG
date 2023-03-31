package org.example;

public abstract class ContribuinteComRendimentosTrabalho extends Contribuinte{
    /**
     * Rendimentos do trabalho do reformado
     */
    private double rendimentosTrabalho;

    /**
     * Outros rendimentos do reformado
     */
    private double outrosRendimentos;

    /**
     * Valor dos rendimentos do trabalho por omissão
     */
    public static final double RENDIMENTOS_TRABALHO_POR_OMISSAO = 0.0;

    /**
     * Valor de outros rendimentos por omissao
     */
    public static final double OUTROS_RENDIMENTOS_POR_OMISSAO = 0.0;


    /**
     * Inicializa o estado do ContribuinteComRendimentos com os parâmetros por omissão
     0 */
    public ContribuinteComRendimentosTrabalho() {
        super();
        this.rendimentosTrabalho = RENDIMENTOS_TRABALHO_POR_OMISSAO;
        this.outrosRendimentos = OUTROS_RENDIMENTOS_POR_OMISSAO;
    }

    /**
     * Inicializa o estado do ContribuinteComRendimentos com os parâmetros fornecidos
     * pelo utilizador
     *
     * @param nome  nome do contribuinte
     * @param morada  morada do contribuinte
     * @param rendimentosTrabalho  valor dos rendimentos do trabalho
     * @param outrosRendimentos  valor dos outros rendimentos
     */
    public ContribuinteComRendimentosTrabalho(String nome, String morada, double rendimentosTrabalho, double outrosRendimentos) {
        super(nome, morada);
        this.rendimentosTrabalho = rendimentosTrabalho;
        this.outrosRendimentos = outrosRendimentos;
    }

    /**
     * Devolve o valor dos rendimentos do trabalho
     *
     * @return  rendimentos do trabalho
     */
    public double getRendimentosTrabalho() {
        return rendimentosTrabalho;
    }

    /**
     * Devolve o valor dos outros rendimentos
     *
     * @return  outros rendimentos
     */
    public double getOutrosRendimentos() {
        return outrosRendimentos;
    }

    /**
     * Modifica o valor dos rendimentos do trabalho
     *
     * @param rendimentosTrabalho  novo valor dos rendimentos do trabalho
     */
    public void setRendimentosTrabalho(double rendimentosTrabalho) {
        this.rendimentosTrabalho = rendimentosTrabalho;
    }

    /**
     * Modifica o valor dos outros rendimentos
     *
     * @param outrosRendimentos  novo valor dos outros rendimentos
     */
    public void setOutrosRendimentos(double outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }

    /**
     * Devolve o valor da taxa a aplicar aos rendimentos do trabalho
     *
     * @return  taxa aplicável aos rendimentos do trabalho
     */
    public abstract double getTaxaRendimentosTrabalho();

    /**
     * Devolve o valor da taxa a oplicar aos outros rendimentos
     *
     * @return  taxa aplicável aos outros rendimentos
     */
    public abstract double getTaxaOutrosRendimentos();

    /**
     * Devolve o imposto extraordinario a pagar pelo contribuinte reformado
     *
     * @return valor do imposto extraordinario a pagar
     */
    @Override
    public double calcularImposto() {
        return (rendimentosTrabalho * getTaxaRendimentosTrabalho() + outrosRendimentos * getTaxaOutrosRendimentos());
    }

}

