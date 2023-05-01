package Exercicio3;

import java.util.ArrayList;

public class Edicao {

    private int nnumero;
    private int volume;
    private String dataEdicao;
    private int tirage;

    private ArrayList<Artigo>artigos;

    public Edicao(int nnumero, int volume, String dataEdicao, int tirage, ArrayList<Artigo> artigos) {
        this.nnumero = nnumero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tirage = tirage;
        this.artigos = artigos;
    }

    public int getNnumero() {
        return nnumero;
    }

    public void setNnumero(int nnumero) {
        this.nnumero = nnumero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTirage() {
        return tirage;
    }

    public void setTirage(int tirage) {
        this.tirage = tirage;
    }

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<Artigo> artigos) {
        this.artigos = artigos;
    }

    public void adicionaArtigos(){
        Artigo artigo;
    }

}
