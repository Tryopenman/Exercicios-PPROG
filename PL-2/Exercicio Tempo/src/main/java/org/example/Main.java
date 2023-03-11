package org.example;

public class Main {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(5,30,12);
        System.out.println(t1.getEstadoTempo());
        t1.acrescentarSegundo();
        System.out.println(t1.getEstadoTempo());
        Tempo t2 = new Tempo(18,5,20);
        System.out.println(t2.getEstadoTempo());
        System.out.println(t1.verifyMaiorTempo(t2));
        System.out.println(t1.verifyMaiorTempo(23,7,4));
        System.out.println(Tempo.diferencaTempoSegundos(t1,t2) + "s");
        System.out.println(Tempo.diferencaTempoString(t1,t2));
    }
}