package org.example;

/**
 * Representa uma Pessoa.
 * @author Francisco Osório
 */

public class Pessoa {

    /**
     * O nome da Pessoa.
     */
    private String name;
    /**
     * A idade da Pessoa.
     */
    private int age;

    /**
     * O Nome da Pessoa por omissão.
     */
    private static final String NAME_OMISSAO = "Sem Nome";
    /**
     * A idade da Pessoa por omissão.
     */
    private static final int IDADE_OMISSAO = 0;

    /**
     * Constrói uma Pessoa por omissão.
     */
    public Pessoa() {
        this.name= NAME_OMISSAO;
        this.age = IDADE_OMISSAO;
    }

    /**
     * Constrói uma Pesssoa com um dado nome.
     * @param name nome da Pessoa
     */
    public Pessoa(String name){
        this.name = name;
        this.age=IDADE_OMISSAO;
    }

    /**
     * Constrói uma Pessoa com um dado nome e uma dada idade .
     * @param name nome da Pessoa
     * @param age idade da Pessoa
     */
    public Pessoa(String name, int age){
        this.name= name;
        this.age = age;
    }

    /**
     * Modifica o nome da Pessoa.
     * @param name nome da Pessoa
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devolve o nome da Pessoa.
     * @return name
     */
    public String getNome(){
        return this.name;
    }

    /**
     * Devolve a descrição da Pessoa , através do nome e idade
     * @return característica da pessoa
     */
    public String toString(){
        return (this.name + " tem " + this.age + " anos.");
    }

    /**
     * Modifica a idade da Pessoa.
     * @param age idade da Pessoa
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Devolve a idade da Pessoa
     * @return age
     */
    public int getAge(){
        return this.age;
    }
}
