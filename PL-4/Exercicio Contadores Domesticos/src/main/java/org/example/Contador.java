package org.example;
/**
 * @author Francisco Osório
 */

/**
 * Classe que representa um Contador.
 */
public abstract class Contador {

    /**
     * O Identificador do Contador.
     */
    private String id;
    /**
     * O nome do Cliente do Contador.
     */
    private String cliente;
    /**
     * O consumo do contador.
     */
    private int consumo;
    /**
     * O Identificador do Contador por omissão.
     */
    
    private static final String ID_POR_OMISSAO ="1";
    /**
     * O nome do Cliente do Contador por omissão.
     */
    private static final String CLIENTE_POR_OMISSAO = "Sem Cliente";
    /**
     * O consumo do cliente por omissão.
     */
    private static final int CONSUMO_POR_OMISSAO = 10;

    /**
     * Contrói uma instância de um Contador com o identificador, cliente e consumo.
     * @param id identificador do Contador
     * @param cliente cliente do Contador
     * @param consumo consumo do Contador
     */
    public Contador(String id, String cliente, int consumo) {
        this.id = id;
        this.cliente = cliente;
        this.consumo = consumo;
    }

    /**
     * Constrói uma instância de um Contador com o identificador, o cliente e o consumo, por omissão.
     */
    public Contador() {
        this.id = ID_POR_OMISSAO;
        this.cliente = CLIENTE_POR_OMISSAO;
        this.consumo = CONSUMO_POR_OMISSAO;
    }

    /**
     * Devolve o identificador do Contador.
     * @return identificador
     */

    public String getId() {
        return id;
    }

    /**
     * Modifica o identificador do Contador.
     * @param id identificador do Contador
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Devolve o nome do Cliente do Contador.
     * @return cliente
     */

    public String getCliente() {
        return cliente;
    }

    /**
     * Modifica o nome do Cliente do Contador.
     * @param cliente cliente do Contador
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Devolve o consumo do Contador.
     * @return consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * Modifica o consumo do Contador.
     * @param consumo consumo do Contador
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * Descrição textual de um Contador.
     * @return descrição do Contador
     */
    @Override
    public String toString() {
        return String.format("id='" + id + '\'' + ", cliente='" + cliente + '\'' + ", consumo=" + consumo + '}');
    }

    /**
     * Permite calcular o custo do Consumo.
     * @return custo do Consumo
     */
    public abstract double calcularCustoConsumo();
}
