package org.example;

public class MainGinasio {
    public static void main(String[] args) {
        UtenteGinasio u1 = new UtenteGinasio();
        UtenteGinasio u2 = new UtenteGinasio();
        UtenteGinasio u3 = new UtenteGinasio("Francisco",18);
        UtenteGinasio u4 = new UtenteGinasio("Joana" , 25);
        UtenteGinasio u5 = new UtenteGinasio("Raquel","Feminino",18,1.60,55);
        UtenteGinasio u6 = new UtenteGinasio("Rui","Masculino",20,1.70,65);

        UtenteGinasio[] utente = new UtenteGinasio[10];
        utente[0] = u1;
        utente[1] = u2;
        utente[2] = u3;
        utente[3] = u4;
        utente[4] = u5;
        utente[5] = u6;

        System.out.println("###Listagem da Representação Textual e Legível de cada Utente###");
        for (int i  = 0; i < utente.length;i++){
           if (utente[i]!= null){
               System.out.println(utente[i].toString());
               System.out.println();
           }
        }
        System.out.println("###Listagem do nome, valor do IMC e grau de obesidade de cada Utente###");
        for (int i = 0; i < utente.length;i++){
            if (utente[i]!=null){
                System.out.println("Nome: " + utente[i].getNome());
                System.out.println("IMC: " + utente[i].calcIMC());
                System.out.println("Grau Obesidade: " + utente[i].grauObesidade());
                System.out.println();
            }
        }
        System.out.println("###Listagem do nome e do grau de obesidade que não tenha a classificação Saudável###");
        for (int i = 0 ; i < utente.length; i++){
            if (utente[i]!= null && !utente[i].grauObesidade().equals("Saudável")){
                System.out.println("Nome: " + utente[i].getNome());
                System.out.println("Grau Obesidade: " + utente[i].grauObesidade());
            }
        }
        UtenteGinasio.setValoresIMC(60,100);
        System.out.println("### Listagem com os valores de IMC alterados###");
        for (int  i = 0; i < utente.length ;i++){
            if (utente[i] != null){
                System.out.println("Nome: "+ utente[i].getNome());
                System.out.println("IMC: " + utente[i].calcIMC());
                System.out.println("Grau de Obesidade: " + utente[i].grauObesidade());
                System.out.println();
            }
        }
        u4.setIdade(u6.getIdade());
        System.out.println(u4.getIdade());
        System.out.println();
        System.out.println(u4.verificarMaisNovo(u1));
    }
}