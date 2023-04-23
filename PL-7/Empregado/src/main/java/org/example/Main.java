package org.example;

import pt.ipp.isep.dei.Data;
import pt.ipp.isep.dei.Tempo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Data dataAtual = new Data(2010,4,10);

        Tempo t1 = new Tempo(8,30,0);
        Tempo t2 = new Tempo(16,20,20);

        Empregado e1 = new Empregado("Francisco", "Osório",dataAtual,t1,t2);
        Empregado e2 = new Empregado("José", "Maria",dataAtual,t1,t2);

        System.out.println(e1.getDataContrato());
        dataAtual.setData(2011,10,23);
        System.out.println(e1.getDataContrato());
        System.out.println();

        System.out.println(e1.getHoraEntrada());
        t1.setTempo(10,20,20);
        System.out.println(e1.getHoraEntrada());
        System.out.println();

        dataAtual.setData(2020,10,10);
        t1.setTempo(10,10,10);
        t2.setTempo(20,20,20);

        System.out.println(dataAtual);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println();

        e2.setDataContrato(new Data(2021,12,12));
        e2.setHoraEntrada(new Tempo(5,50,50));

        List<Empregado> arrEmpregado = new ArrayList<>();
        arrEmpregado.add(e1);
        arrEmpregado.add(e2);

        for (Empregado empregado : arrEmpregado){
            System.out.println(empregado);
        }
    }
}