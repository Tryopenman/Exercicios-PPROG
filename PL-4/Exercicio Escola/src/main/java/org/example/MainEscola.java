package org.example;

import java.lang.reflect.Array;

public class MainEscola {
    public static void main(String[] args) {
        AlunoBolseiro alunoBolseiro1  = new AlunoBolseiro("Miguel",123456789, 12276,500);
        AlunoNaoBolseiro alunoNaoBolseiro1 = new AlunoNaoBolseiro("Francisco", 123456780,12289);
        Adjunto adjunto1 = new Adjunto("Fábio", 467855931);
        Assistente assistente1 = new Assistente("José",122343211);
        Coordenador coordenador1 = new Coordenador("Manuel",555555551);

        Pessoa[] pessoas = new Pessoa[10];
        pessoas[0] = alunoBolseiro1;
        pessoas[1] = alunoNaoBolseiro1;
        pessoas[2] = adjunto1;
        pessoas[3] = assistente1;
        pessoas[4] = coordenador1;

        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] instanceof Professor){
                System.out.printf("Nome: %s, Categoria: %s" , pessoas[i].getNome(),pessoas[i].toString());
                System.out.println();
            }
        }
        System.out.println();
        for (int i=0; i < pessoas.length; i++){
            if (pessoas[i] instanceof AlunoNaoBolseiro){
                System.out.printf("Número Mecanográfico: %d", ((AlunoNaoBolseiro) pessoas[i]).getNumMecanografico());
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i< pessoas.length; i++){
            if (pessoas[i] instanceof Professor || pessoas[i] instanceof Aluno){
                System.out.printf("Nome: %s, %s" , pessoas[i].getNome(),pessoas[i].toString());
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] instanceof Professor){
                System.out.printf("Nome: %s, Salário: %.2f",pessoas[i].getNome(), ((Pagamento) pessoas[i]).calcularPagamento());
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] instanceof AlunoBolseiro){
                System.out.printf("Nome: %s, Bolsa: %.2f", pessoas[i].getNome(),((AlunoBolseiro) pessoas[i]).getBolsa());
                System.out.println();
            }
        }
        int encargosTotal = 0;
        int encargos = 0;
        for (int i  = 0;i < pessoas.length;i++) {
            if (pessoas[i] instanceof Professor || pessoas[i] instanceof AlunoBolseiro) {
                encargos++;
                encargosTotal++;
            } else if (pessoas[i] != null) {
                encargosTotal++;
            }
        }
        System.out.println("Total: " + encargosTotal);
        System.out.println(encargos);
    }
}