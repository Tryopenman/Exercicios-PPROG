package pt.ipp.isep.dei;


public class Quadro implements Comparable<Quadro>{

    private String designacao;
    private String nomeAutor;
    private String anoCriacao;
    private final String DESIGNACAO_POR_OMISSAO = "Mona Lisa";
    private final String NOME_POR_OMISSAO = "Leonardo da Vinci";
    private final String ANO_CRIACAO_POR_OMISSAO = "1503";

    public Quadro(String designacao ,String nomeAutor, String anoCriacao){
        this.designacao = designacao;
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
    }
    public Quadro(String s, String s1){
        this.designacao = DESIGNACAO_POR_OMISSAO;
        this.nomeAutor = NOME_POR_OMISSAO;
        this.anoCriacao = ANO_CRIACAO_POR_OMISSAO;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(String anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public String toString() {
        return String.format("Quadro: \nDesignação: %s \n Nome Autor: %s \n Ano Criação: %s",designacao,nomeAutor,anoCriacao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quadro quadro = (Quadro) o;

        return designacao.equals(quadro.designacao);
    }

    @Override
    public int compareTo(Quadro o) {
        return this.nomeAutor.compareTo(o.getNomeAutor());
    }
}