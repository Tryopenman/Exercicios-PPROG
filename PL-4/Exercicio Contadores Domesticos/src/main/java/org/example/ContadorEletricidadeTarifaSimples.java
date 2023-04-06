package org.example;

/**
 * @author Francisco Osório
 * Representa um Contador de Eletricidade com Tarifa Simples
 */
public class ContadorEletricidadeTarifaSimples extends ContadorEletrecidade {
    /**
     * Potência Contratada.
     */
    private double potenciaContratada;
    /**
     * Potencia Contratada para distinção.
     */
    private static double potenciaContratadaLim = 6.9;
    /**
     * Preço por KWH para potência contratada < potenciaContratadaLim.
     */
    private static double precoKWH1 = 0.13;
    /**
     * Preço por KWH para potencia contratada > potenciaContratadaLim.
     */
    private static double precoKWH2= 0.16;

    /**
     * Representa uma instância de um Contador Eletricidade Tarifa Simples, recebendo o identificador, o cliente, o consumo e a potencia contratada.
     * @param id identificador do Contador
     * @param cliente nome do Cliente do Contador
     * @param consumo consumo do Contador
     * @param potenciaContratada potência Contratada do Contador
     */

    public ContadorEletricidadeTarifaSimples(String id, String cliente, int consumo, double potenciaContratada) {
        super(id, cliente, consumo);
        this.potenciaContratada = potenciaContratada;
    }

    /**
     * Representa uma instância de um Contador Eletricidade Tarifa Simples, recebendo o identificador, o cliente, o consumo e a potencia contratada, por omissão.
     * @param potenciaContratada potência Contratada do Contador
     */
    public ContadorEletricidadeTarifaSimples(double potenciaContratada) {
        super();
        this.potenciaContratada = potenciaContratada;
    }

    /**
     * Devolve o valor da Potência Contratada do Contador
     * @return Potência Contratada
     */

    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    /**
     * Modifica o valor da Potência Contratada do Contador.
     * @param potenciaContratada
     */

    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }

    /**
     * Devolve o valor da Potência contratada para distinção.
     * @return Potência Contratada para disntinção
     */
    public static double getPotenciaContratadaLim() {
        return potenciaContratadaLim;
    }

    /**
     * Modifica o valor da PotÊncia contratada para distinção.
     * @param potenciaContratadaLim Potência Contratada para distinção
     */
    public static void setPotenciaContratadaLim(double potenciaContratadaLim) {
        ContadorEletricidadeTarifaSimples.potenciaContratadaLim = potenciaContratadaLim;
    }

    /**
     * Devolve o preço por KWH para potência contratada < potenciaContratadaLim.
     * @return preço
     */
    public static double getPrecoKWH1() {
        return precoKWH1;
    }

    /**
     * Modifica o preço por KWH para potência contratada < potenciaContratadaLim.
     * @param precoKWH1
     */

    public static void setPrecoKWH1(double precoKWH1) {
        ContadorEletricidadeTarifaSimples.precoKWH1 = precoKWH1;
    }
    /**
     * Devolve o preço por KWH para potência contratada > potenciaContratadaLim.
     * @return preço
     */
    public static double getPrecoKWH2() {
        return precoKWH2;
    }
    /**
     * Modifica o preço por KWH para potência contratada > potenciaContratadaLim.
     * @param precoKWH2
     */
    public static void setPrecoKWH2(double precoKWH2) {
        ContadorEletricidadeTarifaSimples.precoKWH2 = precoKWH2;
    }

    /**
     * Descrição textual do Contador Eletricidade Tarifa Simples
     * @return descrição
     */
    @Override
    public String toString() {
        return "ContadorEletricidadeTarifaSimples{" +
                "potenciaContratada=" + potenciaContratada +
                '}';
    }

    /**
     * Devolve o valor do Custo do Consumo do Contador
     * @return custo do Consumo
     */
    @Override
    public double calcularCustoConsumo() {
        if (potenciaContratada > potenciaContratadaLim)
            return getConsumo() * precoKWH2;
        return getConsumo() * precoKWH1;
    }
}
