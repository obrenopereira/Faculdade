package Exercicio1;

public class Publicacao {

    public static String dataPublicacao;
    public static String textoPublicacao;
    public String linkMidia;
    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String testoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = testoPublicacao;
        this.linkMidia = linkMidia;
        Publicacao.contadorPublicacao += 1;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public static String getDataPublicacao() {
        return dataPublicacao;
    }

    public static String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }



}
