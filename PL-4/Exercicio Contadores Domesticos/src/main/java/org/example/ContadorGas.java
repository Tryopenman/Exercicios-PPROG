package org.example;

/**
 * @author Francisco Osório
 * Representa um Contador de Gás
 */
public class ContadorGas extends Contador {
    /**
     * Contador para contar o número de instâncias de Contadores Gás forma inicilizadas.
     */
    private static int contarContadoresGas =0 ;
    /**
     *  Custo Unitário do Gas
     */
    private static double custoUnitario = 0.8;
    /**
     * O prefixo do id para o Contador Gás
     */
    private static final String PREF_CONTADOR_GAS= "GAS-";

    /**
     * Constrói uma instância do Contador de Gás, recebendo o identificador, o cliente e o consumo.
     * @param id identificador do Contador
     * @param cliente cliente do Contador
     * @param consumo consumo do Contador
     */
    public ContadorGas(String id, String cliente, int consumo) {
        super(id, cliente, consumo);
        contarContadoresGas++;
        setId(String.format("%s %d",PREF_CONTADOR_GAS,contarContadoresGas));
    }

    /**
     * Constrói uma instância do Contador de Gás, com o identificador,o cliente e o consumo, por omissão.
     */
    public ContadorGas() {
        super();
        contarContadoresGas++;
        setId(String.format("%s %d",PREF_CONTADOR_GAS,contarContadoresGas));
    }

    /**
     * Devolve o custo unitário do Contador a Gás.
     * @return custo unitário
     */
    public static double getCustoUnitario() {
        return custoUnitario;
    }

    /**
     * Modifica o custo unitário do Contador a Gás.
     * @param custoUnitario
     */
    public static void setCustoUnitario(double custoUnitario) {
        ContadorGas.custoUnitario = custoUnitario;
    }

    /**
     * Descrição textual do Contador Gás.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("ID: %s, cliente: %s, consumo: %d, Custo: %.2f",getId(),getConsumo(),calcularCustoConsumo());
    }

    /**
     * Devolve o custo do Consumo do Contador Gás.
     * @return custo do Consumo
     */
    @Override
    public double calcularCustoConsumo() {
        return custoUnitario * getConsumo();
    }
}
