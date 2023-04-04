package org.example;

/**
 * Esta classe permite a construção de uma hierarquia de classes para representar
 * constribuintes distintos.
 */
public abstract class Contribuinte
{
    /**
     * Nome do contribuinte
     */
    private String nome;

    /**
     * Morada do contribuinte
     */
    private String morada;

    /**
     * Nome por omissão ao contribuinte
     */
    private static String NOME_POR_OMISSAO = "N/A";

    /**
     * Morada por omissão do contribuinte
     */
    private static String MORADA_POR_OMISSAO = "N/A";


    /**
     * Constrói uma instância de um contribuinte com o nome e morada por omissão
     */
    public Contribuinte() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
    }

    /**
     * Constrói uma instância de um contribuinte com o nome e morada.
     *
     * @param nome  nome do contribuinte;
     * @param morada  morada do contribuinte;
     */
    public Contribuinte(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    /**
     * Devolve o nome do contribuinte.
     *
     * @return  nome do contribuinte;
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve a morada do contribuinte
     *
     * @return  morada do contribuinte;
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Modifica o nome do contribuinte.
     *
     * @param nome  novo nome do contribuinte;
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica a morada do contribuinte.
     *
     * @param morada  nova morada do contribuinte;
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Devolve uma descrição textual do contribuinte.
     *
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("O contribuinte chama-se %s e mora na rua %s", nome, morada);
    }

    public abstract double calcularImposto();
}