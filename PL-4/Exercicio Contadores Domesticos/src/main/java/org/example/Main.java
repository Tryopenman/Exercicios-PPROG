package org.example;

public class Main {
    public static void main(String[] args) {

        ContadorGas contadorGas1 = new ContadorGas("12345678","Francisco", 20);
        ContadorEletricidadeTarifaSimples contadorEletricidadeTarifaSimples1 = new ContadorEletricidadeTarifaSimples("1234567","Miguel",30,10);
        ContadorEletricidadeBiHorario contadorEletricidadeBiHorario1 = new ContadorEletricidadeBiHorario("987654","André",5,10);

        Contador[] contentor = new Contador[5];
        contentor[0] = contadorGas1;
        contentor[1] = contadorEletricidadeTarifaSimples1;
        contentor[2] = contadorEletricidadeBiHorario1;


        for(int i = 0 ; i < contentor.length; i++){
            if (contentor[i] instanceof Contador)
                System.out.printf("Identificador: %s%n Cliente: %s", contentor[i].getId(),contentor[i].getCliente());
            System.out.println();
        }
        System.out.println("Quantidade de contandores a Eletricidade: " + ContadorEletrecidade.getContarContadorEletricidade());
        System.out.println();

        System.out.println("###Identificadores dos contadores de eletricidade com tarifário bi-horário###");
        for (int i = 0; i < contentor.length; i++){
            if (contentor[i] instanceof ContadorEletricidadeBiHorario) {
                System.out.printf("Identificador: %s", contentor[i].getId());
                System.out.println();
            }
        }
        for (int i = 0; i < contentor.length; i++){
            if (contentor[i] instanceof Contador) {
                System.out.printf("Identificador: %s%n Custo: %.2f",contentor[i].getId(),contentor[i].calcularCustoConsumo());
                System.out.println();
            }
        }
        System.out.println();
        double max = 0;
        for (int i = 0; i < contentor.length; i++){
            if (contentor[i] instanceof ContadorGas && contentor[i].calcularCustoConsumo()> max)
                max = contentor[i].calcularCustoConsumo();
        }
        System.out.println(max);


        String nome[] = new String[contentor.length];
        int contador = 0;

        for (int i = 0; i < nome.length; i++) {
            if (contentor[i] instanceof Contador) {
                nome[i] = contentor[i].getCliente();
                contador++;
            }
        }
        for (int i = 0; i < contador;i++){
            for (int j = i + 1; j < contador - 1;i++){
                if (contentor[j] instanceof Contador && !nome[i].equals(nome[j]))
                    System.out.println(nome[i]);
            }
        }
    }
}