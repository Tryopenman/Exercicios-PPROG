package org.example;

/**
 * @author Francisco Osório
 * Representa um contador de Eletricidade.
 */
public abstract class ContadorEletrecidade extends Contador{

    /**
     * O prefixo do id para o Contador Eletricidade
     */
    private static final String PREF_CONTADOR_ELETRICIDADE ="ELET-";
    /**
     * Contador para contar o número de instâncias de Contadores Eletricidades forma inicilizadas.
     */
    private static int contarContadorEletricidade = 0;

    /**
     * Constrói uma instância de um Contador Eletricidade com identificador, cliente, consumo.
     * @param id
     * @param cliente
     * @param consumo
     */
    public ContadorEletrecidade(String id, String cliente, int consumo) {
        super(id, cliente, consumo);
        contarContadorEletricidade++;
        setId(String.format("%s %d",PREF_CONTADOR_ELETRICIDADE,contarContadorEletricidade));
    }

    /**
     * Constrói uma instÂncia de um Contador Eletricidade com identificador,cliente e consumo, por omissão.
     */
    public ContadorEletrecidade() {
        super();
        contarContadorEletricidade++;
        setId(String.format("%s %d",PREF_CONTADOR_ELETRICIDADE,contarContadorEletricidade));
    }

    /**
     * Devolve o número de instâncias Contador Eletricidade criadas.
     * @return número de instâncias criadas Contador Eletricidade
     */
    public static int getContarContadorEletricidade() {
        return contarContadorEletricidade;
    }

    /**
     * Descrição textual de um Contador Eletricidade.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("ContadorEletrecidade: %s", super.toString());
    }

    /**
     * Permite calcular o custo do Consumo.
     * @return custo do Consumo
     */
    @Override
    public abstract double calcularCustoConsumo();
}
