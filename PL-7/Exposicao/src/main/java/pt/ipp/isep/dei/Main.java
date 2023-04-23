package pt.ipp.isep.dei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quadro q1= new Quadro("A lei da vida!", "Francisco", "2005");
        Quadro q2 = new Quadro("É lida irmão!", "Diogo", "2020");
        Quadro q3 = new Quadro("Quadro 1", "Artista 1");
        Quadro q4 = new Quadro("Yes Sr!", "Simão", "2015");

        List<Quadro> quadros = new ArrayList<>();
        quadros.add(q1);
        quadros.add(q2);
        quadros.add(q3);
        quadros.add(q4);

        listar(quadros);

        Exposicao e1 = new Exposicao("Exposição 1", "2020");
        Exposicao e2 = new Exposicao("Exposição 2", "2021");
        Exposicao e3 = new Exposicao("Exposição 3", "2022");

        e1.addQuadro(q1);
        e1.addQuadro(q3);
        e2.addQuadro(q2);
        e2.addQuadro(q3);
        e3.addQuadro(q4);
        e3.addQuadro(q3);

        List <Exposicao> exposicoes = new ArrayList<>();
        exposicoes.add(e1);
        exposicoes.add(e2);
        exposicoes.add(e3);

        listar(exposicoes);

        q3.setAnoCriacao("2030");

        listar(exposicoes);

        Collections.sort(exposicoes, new Comparator<Exposicao>() {
            @Override
            public int compare(Exposicao o1, Exposicao o2) {
                return - (o1.getAnoRealizacao().compareTo(o2.getAnoRealizacao()));
            }
        });
    }
    public static void listar(List lista){
        for(int i = 0; i< lista.size(); i++){
            System.out.println(lista.get(i));
            System.out.println();
        }
    }
}