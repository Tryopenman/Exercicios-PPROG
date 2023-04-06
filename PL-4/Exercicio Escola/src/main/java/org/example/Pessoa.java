package org.example;

public abstract class Pessoa {
    /**
     * Nome da Pessoa.
     */
    private String nome;
    /**
     * Número de Identificação Civil da Pessoa.
     */
    private int nif;
    /**
     * Nome da Pessoa por omissão.
     */
    static final String NOME_POR_OMISSAO = "Sem Nome";
    /**
     * Número de Identificação Civil da Pessoa por omissão.
     */
    static final int NIF_POR_OMISSAO = 0;

    /**
     * Inicializa o nome e o nif da Pessoa, pelos parâmetros fornecidos.
     * @param nome nome da Pessoa
     * @param nif número de identificação civil da Pessoa
     */
    public Pessoa(String nome, int nif){
        this.nome = nome;
        this.nif = nif;
    }

    /**
     * Inicializa o nome e o nif da Pessoa, por omissão.
     */
    public Pessoa(){
        this.nome = NOME_POR_OMISSAO;
        this.nif = NIF_POR_OMISSAO;
    }

    /**
     * Devolve o nome da Pessoa
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome da Pessoa.
     * @param nome nome da Pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o número de Identifcação Civil da Pessoa.
     * @return nif - número de Identificação Civil
     */
    public int getNif() {
        return nif;
    }

    /**
     * Modifica o número de Identifcação Civil da Pessoa.
     * @param nif número de Identificação Civil
     */
    public void setNif(int nif) {
        this.nif = nif;
    }

    /**
     * Descrição textual da Pessoa.
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format("Nome: %s, nif: %d",getNome(),getNif());
    }
}
