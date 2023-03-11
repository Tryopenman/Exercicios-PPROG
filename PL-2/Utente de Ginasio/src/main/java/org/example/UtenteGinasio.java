package org.example;

/**
 * Representa um Utente de um Ginásio.
 * @author Francisco Osório
 */
public class UtenteGinasio {
    /**
     * O nome do Utente do Ginásio.
     */
    private String nome;
    /**
     * O Género do Utente do Ginásio.
     */
    private String genero;
    /**
     * A idade do Utente do Ginásio.
     */
    private int idade;
    /**
     * A altura do Utente do Ginásio.
     */
    private double altura;
    /**
     * O peso do Utente do Ginásio.
     */
    private double peso;
    /**
     * O nome do Utente do Ginásio por omissão.
     */
    private static final String NOME_POR_OMISSAO = "";
    /**
     * O género do Utente do Ginásio por omissão.
     */
    private static final String GENERO_POR_OMISSAO = "";
    /**
     * A idade do Utente do Ginásio por omissão.
     */
    private static final int IDADE_POR_OMISSAO = 0;
    /**
     * A altura do Utente do Ginásio.
     */
    private static final double ALTURA_POR_OMISSAO = 0;
    /**
     * O peso do Utente do Ginásio.
     */
    private static final double PESO_POR_OMISSAO = 0;
    /**
     * O valor de IMC quando a altura ou o peso é 0.
     */
    private static final double INDETERMINADO = 0;
    /**
     * Valor IMC associado ao grau de obesidade magro
     */
    private static double magro = 18;
    /**
     * Valor IMC associado ao grau de obesidade obeso
     */
    private static double obeso = 25;
    /**
     * Contador para contar o números de instâncias Criadas
     */
    private static int contarObjetos =0;

    /**
     * Constrói uma instância de um Utente do Ginásio por omissão do nome, género, idade, altura, peso. Adiciona mais 1 ao contador.
     */
    public UtenteGinasio(){
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        contarObjetos++;
    }

    /**
     * Constrói uma instância de um Utente do Ginásio recebendo o nome, idade e por omissao do género, altura e peso. Adiciona mais 1 ao contador
     * @param nome
     * @param idade
     */
    public UtenteGinasio(String nome, int idade){
        this.nome = nome;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        contarObjetos++;
    }

    /**
     * Constrói uma instância de um Utente do Ginásio recebendo o nome, o género, a idade, a altura e o peso. Adiciona mais 1 ao contador.
     * @param nome nome do Utente do Ginásio
     * @param genero género do Utente do Ginásio
     * @param idade idade do Utente do Ginásio
     * @param altura altura do Utente do Ginásio
     * @param peso peso do Utente do Ginásio
     */
    public UtenteGinasio(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        contarObjetos++;
    }

    /**
     * Modifica o nome do Utente do Ginásio
     * @param nome nome do Utente do Ginásio
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o nome do Utente do Ginásio
     * @return nome do Utente do Ginásio
     */
    public String getNome(){
        return nome;
    }

    /**
     * Modifica o género do Utente do Ginásio
     * @param genero género do Utente do Ginásio
     */
    public void setGenero(String genero){
        this.genero = genero;
    }

    /**
     * Devolve o género do Utente do Ginásio
     * @return género do Utente do Ginásio
     */
    public String getGenero (){
        return genero;
    }

    /**
     * Modifica a idade do Utente do Ginásio
     * @param idade idade do Utente do Ginásio
     */
    public void setIdade(int idade){
        this.idade = idade;
    }

    /**
     * Devolve a idade do Utente do GInásio
     * @return idade do Utente do Ginásio
     */
    public int getIdade(){
        return idade;
    }

    /**
     * Modifica a altura do Utente do Ginásio
     * @param altura do Utente do Ginásio
     */
    public void setAltura(double altura){
        this.altura = altura;
    }

    /**
     * Devolve a altura do Utente do Ginásio
     * @return altura do Utente do Ginásio
     */
    public double getAltura(){
        return altura;
    }

    /**
     * Modifica o peso do Utente do Ginásio
     * @param peso peso do Utente do Ginásio
     */
    public void setPeso(double peso){
        this.peso = peso;
    }

    /**
     * Devolve o peso do Utente do Ginásio
     * @return peso do Utente do Ginásio
     */
    public double getPeso(){
        return peso;
    }
    public static void setValoresIMC(double magro, double obeso){
        UtenteGinasio.magro = magro;
        UtenteGinasio.obeso = obeso;
    }

    /**
     * Devolve a descrição textual do Utente do Ginásio;
     * @return dados do Utente do Ginásio
     */
    public String toString (){
        return String.format("Utente: %s \nGénero: %s \nIdade: %d anos \nAltura: %.2f m \nPeso: %.2f kg",nome,genero,idade,altura,peso );
    }

    /**
     * Devolve o valor diferença de idades entre dois Utentes
     * @param utenteGinasioComparacao Utente que servirá como comparação
     * @return valor absoluto da diferença de idades
     */
    public int diferencaIdades(UtenteGinasio utenteGinasioComparacao){
        int diferencaIdades = this.getIdade() - utenteGinasioComparacao.getIdade();
        int valorAbsolutoDiferenca = Math.abs(diferencaIdades);
        return valorAbsolutoDiferenca;
    }

    /**
     * Devolve o valor de IMC de um Utente do Ginásio
     * @return valor do IMC
     */
    public double calcIMC(){
        if (this.altura!=0 && this.peso !=0 )
            return (this.getPeso()/Math.pow(this.getAltura(),2));
        return INDETERMINADO;
    }

    /**
     * Devolve o grau de Obseidade de um Utente do Ginásio
     * @return grau de Obesidade
     */
    public String grauObesidade(){
        if (this.calcIMC() == 0)
            return "Indeterminado";
        if (this.calcIMC() < magro)
            return "Magro";
        if (this.calcIMC() > obeso)
            return "Obeso";
        return "Saudável";
    }

    /**
     * Devolve em forma textual a comparação da idade entre dois utentes
     * @param utenteGinasioComparacao
     * @return a comparação da idade entre dois utentes
     */
    public String verificarMaisNovo(UtenteGinasio utenteGinasioComparacao){
        if (this.idade > utenteGinasioComparacao.idade){
            return String.format("O utente %s é mais novo que o utente %s.",utenteGinasioComparacao.getNome(),this.getNome());
        }
        if (this.idade == utenteGinasioComparacao.idade ){
            return String.format("O utente %s é mais novo que o utente %s.",this.getNome(),utenteGinasioComparacao.getNome());
        }
        return String.format("O utente %s tem a mesma idade que o utente %s", this.getNome(),utenteGinasioComparacao.getNome());
    }

    /**
     * Devolve o número de instâncias criadas de Utente do Ginásio
     * @return contarObjetos
     */
    public static int getContarObjetos() {
        return contarObjetos;
    }
}
