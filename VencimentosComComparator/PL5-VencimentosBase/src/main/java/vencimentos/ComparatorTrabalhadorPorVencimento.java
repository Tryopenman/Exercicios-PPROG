package vencimentos;

import java.util.Comparator;

public class ComparatorTrabalhadorPorVencimento implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador t1, Trabalhador t2){
        if (t1.calcularVencimento() > t2.calcularVencimento())
            return 1;
        if (t1.calcularVencimento() < t2.calcularVencimento())
            return -1;
        return 0;
    }
}
