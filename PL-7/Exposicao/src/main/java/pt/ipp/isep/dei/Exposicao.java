package pt.ipp.isep.dei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exposicao implements Comparable <Exposicao> {

    private String designacao;
    private String anoRealizacao;
    private List<Quadro> quadrosExibidos = new ArrayList<>();

    public Exposicao(String designacao, String anoRealizacao) {
        this.designacao = designacao;
        this.anoRealizacao = anoRealizacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getAnoRealizacao() {
        return anoRealizacao;
    }

    public void setAnoRealizacao(String anoRealizacao) {
        this.anoRealizacao = anoRealizacao;
    }

    @Override
    public int compareTo(Exposicao o) {
        return anoRealizacao.compareTo(o.getAnoRealizacao());
    }

    public boolean addQuadro(Quadro adicionar) {
        return quadrosExibidos.add(adicionar);
    }

    public boolean removeQuadro(Quadro remover) {
        return quadrosExibidos.remove(remover);
    }

    @Override
    public String toString() {
        String quadros = "";
        Collections.sort(quadrosExibidos);
        for (Quadro quadro : quadrosExibidos) {
            quadros = quadros + quadro.toString() + "\n";
        }
        return quadros;
    }

    public List<Quadro> getQuadrosExibidos() {
        return quadrosExibidos;
    }
}
