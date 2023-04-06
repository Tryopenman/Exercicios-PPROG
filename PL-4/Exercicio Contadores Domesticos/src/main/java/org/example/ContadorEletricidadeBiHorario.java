package org.example;

/**
 * @author Francisco Osório
 * Representa um Contador Eletricidade Bi-Horário.
 */
public class ContadorEletricidadeBiHorario extends ContadorEletrecidade{
    /**
     * Consumo Horas Fora Vazio.
     */
    private double consumo2;
    /**
     * Tarifário Horas Vazio.
     */
    private static double tarifarioHorasVazio = 0.066;
    /**
     * Tarifário Horas Fora Vazio.
     */
    private static double tarifarioHorasForaVazio = 0.14;

    /**
     * Representa uma instância do Contador Eletricidade Bi Horário, com o identificador,cliente, consumo e consumo2.
     * @param id identificador
     * @param cliente nome do Cliente
     * @param consumo consumo do Contador Eletricidade horas vazio
     * @param consumo2 consumo do Contador Eletricidade horas fora vazio
     */
    public ContadorEletricidadeBiHorario(String id, String cliente, int consumo, double consumo2) {
        super(id, cliente, consumo);
        this.consumo2 = consumo2;
    }

    /**
     * Representa uma instância do Contador Eletricidade Bi Horário, com o identificador, cliente, consumo,por omissão, recebendo apenas o consumo2.
     * @param consumo2 consumo do Contador horas fora vazio
     */

    public ContadorEletricidadeBiHorario(double consumo2) {
        this.consumo2 = consumo2;
    }

    /**
     * Devolve o valor do consumo2.
     * @return consumo2
     */
    public double getConsumo2() {
        return consumo2;
    }

    /**
     * Modifica o valor do consumo2.
     * @param consumo2 consumo do Contador horas fora vazio
     */

    public void setConsumo2(double consumo2) {
        this.consumo2 = consumo2;
    }

    /**
     * Devolve o valor do tarifario horas vazio.
     * @return tarifario horas vazio
     */
    public static double getTarifarioHorasVazio() {
        return tarifarioHorasVazio;
    }

    /**
     * Modifica o valor do tarifário horas vazio.
     * @param tarifarioHorasVazio valor do tarifario horas vazio
     */
    public static void setTarifarioHorasVazio(double tarifarioHorasVazio) {
        ContadorEletricidadeBiHorario.tarifarioHorasVazio = tarifarioHorasVazio;
    }

    /**
     * Devolve o valor tarifário horas fora vazio.
     * @return tarifário horas fora vazio
     */
    public static double getTarifarioHorasForaVazio() {
        return tarifarioHorasForaVazio;
    }

    /**
     * Modifica o valor do tarifário horas fora vazio.
     * @param tarifarioHorasForaVazio valor do tarifário horas fora vazio
     */

    public static void setTarifarioHorasForaVazio(double tarifarioHorasForaVazio) {
        ContadorEletricidadeBiHorario.tarifarioHorasForaVazio = tarifarioHorasForaVazio;
    }

    /**
     * Descrição textual de um Contador Eletricidade Bi Horário.
     * @return descrição
     */
    @Override
    public String toString() {
        return "ContadorEletricidadeiHorario{}";
    }

    /**
     * Devolve o valor do custo do Consumo.
     * @return custo do Consumo.
     */
    @Override
    public double calcularCustoConsumo() {
        return getConsumo() * tarifarioHorasVazio + consumo2 * tarifarioHorasForaVazio;
    }
}
