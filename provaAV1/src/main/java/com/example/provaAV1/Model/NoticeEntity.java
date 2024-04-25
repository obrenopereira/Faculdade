package com.example.provaAV1.Model;

public class NoticeEntity {

    private String Tipo;
    private int qtd;
    private int page;
    private String de;
    private  String ate;
    private  int introSize;
    private int destaque;
    private String busca;
    private String produto;


    public NoticeEntity(String tipo, int qtd, int page, String de, String ate, int introSize, int destaque, String busca, String produto) {
        Tipo = tipo;
        this.qtd = qtd;
        this.page = page;
        this.de = de;
        this.ate = ate;
        this.introSize = introSize;
        this.destaque = destaque;
        this.busca = busca;
        this.produto = produto;
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAte() {
        return ate;
    }

    public void setAte(String ate) {
        this.ate = ate;
    }

    public int getIntroSize() {
        return introSize;
    }

    public void setIntroSize(int introSize) {
        this.introSize = introSize;
    }

    public int getDestaque() {
        return destaque;
    }

    public void setDestaque(int destaque) {
        this.destaque = destaque;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}

