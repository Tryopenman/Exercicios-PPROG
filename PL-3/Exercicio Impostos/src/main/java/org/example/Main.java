package org.example;

public class Main {
    public static void main(String[] args) {
        Desempregado desempregado1 = new Desempregado("João","Rua Maria 1ª",500,2);
        Reformado reformado1 = new Reformado("André","Rua D.Afonso Henriques",1000,500);
        TrabalhadorContaPropria trabalhadorContaPropria1 = new TrabalhadorContaPropria("Francisco", "Rua das Antas", 2000,1000,"Programador");
        TrabalhadorContaOutrem trabalhadorContaOutrem1 = new TrabalhadorContaOutrem("Raquel", "Rua D.Paulo II", 1500 ,500, "Jupiter.LA");

        Contribuinte[] arrContribuinte = new Contribuinte[5];
        arrContribuinte[0] = desempregado1;
        arrContribuinte[1] = reformado1;
        arrContribuinte[2] = trabalhadorContaPropria1;
        arrContribuinte[3] = trabalhadorContaOutrem1;

        for (int i = 0; i < arrContribuinte.length; i++){
            if (arrContribuinte[i] != null)
                System.out.println(arrContribuinte[i].toString());
            System.out.println();
        }
        for (int i = 0; i < arrContribuinte.length; i++){
            if (arrContribuinte[i] != null){
                System.out.println(arrContribuinte[i]);
                System.out.println("Imposto: " + arrContribuinte[i].calcularImposto());
            }
            System.out.println();
        }
        Desempregado.setTaxaOutrosRendimentos(0.03);

        for (int i = 0; i < arrContribuinte.length; i++){
            if (arrContribuinte[i] != null){
                System.out.println(arrContribuinte[i]);
                System.out.println("Imposto: " + arrContribuinte[i].calcularImposto());
            }
            System.out.println();
        }
    }
}