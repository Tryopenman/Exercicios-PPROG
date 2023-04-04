package org.example;

public class MainVencimentos {
    public static void main(String[] args) {
        TrabalhadorPeca trablhPeca1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao trabalhComissao1 = new TrabalhadorComissao("Susana Ferreira", 650f, 2731.50f, 4.25f);
        TrabalhadorHora trabalhHora1 = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);

        Trabalhador[] contentor = new Trabalhador[10];
        contentor[1] = trablhPeca1;
        contentor[2] = trabalhComissao1;
        contentor[3] = trabalhHora1;

        System.out.println();
        System.out.println("###Representações textuais dos trabalhadores###");
        for (int i = 0; i < contentor.length; i++) {
            if (contentor[i] != null)
                System.out.println(contentor[i].toString());
        }
        System.out.println();
        System.out.println("###Representações textuais dos trabalahores hora###");
        for (int i = 0; i < contentor.length; i++) {
            if (contentor[i] instanceof TrabalhadorHora && contentor[i] != null)
                System.out.println(contentor[i].toString());
        }
        System.out.println();
        System.out.println("Listagem dos nomes dos trabalhadores existentes,acomapanhadas dos respetivos vendimentos");
        for (int i = 0; i < contentor.length; i++) {
            if (contentor[i] != null) {
                System.out.println(contentor[i].toString());
                System.out.printf("Vencimentos: %.2f", contentor[i].calcularVencimento());
            }
        }
    }
}