package vencimentos;

import java.util.Comparator;

public class ComparatorTrabalhadorPorNome implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador o1, Trabalhador o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
