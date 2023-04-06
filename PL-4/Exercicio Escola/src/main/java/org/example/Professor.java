package org.example;

public abstract class Professor extends Pessoa{
    /**
     * Salário base de um Professor.
     */
    private static double salarioBase = 1500;

    /**
     * Inicializa o nome e o nif do Professor, recebendo-os por parâmetros.
     * @param nome nome do Professor
     * @param nif número de identificação fiscal do Professor
     */
    public Professor(String nome, int nif) {
        super(nome, nif);
    }

    /**
     * Inicializa o nome e o nif do Professor, por omissão.
     */
    public Professor() {
        super();
    }

    /**
     * Devolve o valor do Salário Base do Professor.
     * @return salário base do Professor
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Modifica o valor do Salário Base do Professor
     * @param salarioBase salário base do Professor
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Descrição textual do Professor
     * @return descrição
     */
    @Override
    public String toString() {
        return String.format(super.toString() + "Salário Base: %f", salarioBase );
    }
}
