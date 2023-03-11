package org.example;

public class MainData {
    public static void main(String[] args) {

        Data data1 = new Data(2023,03,01);
        System.out.println(data1.toString());
        Data data2 = new Data(1974, 04,25);
        System.out.println(data2.toAnoMesDiaString());
        System.out.println(data1.isMaior(data2));
        System.out.println(data1.calcularDiferenca(data2));
        System.out.println(data1.calcularDiferenca(2023,12,25));
        System.out.println(data2.determinarDiaDaSemana());
        System.out.println(Data.isAnoBissexto(data2.getAno()));
    }
}