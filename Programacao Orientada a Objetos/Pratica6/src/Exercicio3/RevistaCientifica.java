package Exercicio3;

public class RevistaCientifica {

    private String titulo;
    private long issn;
    private String preiodicidade;
    private Edicao edicoes;

    public RevistaCientifica(String titulo, long issn, String preiodicidade, Edicao edicoes) {
        this.titulo = titulo;
        this.issn = issn;
        this.preiodicidade = preiodicidade;
        this.edicoes = edicoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPreiodicidade() {
        return preiodicidade;
    }

    public void setPreiodicidade(String preiodicidade) {
        this.preiodicidade = preiodicidade;
    }

    public Edicao getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(Edicao edicoes) {
        this.edicoes = edicoes;
    }

    public void adicionaEdicao(){
        Edicao edicao;
    }

}
