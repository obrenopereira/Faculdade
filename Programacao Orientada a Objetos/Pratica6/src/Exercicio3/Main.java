package Exercicio3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Artigo> artigos = new ArrayList<>(10);

        int numero = 10;
        int volume = 355;
        String dataEdicao = "30/04";
        int tiragem = 045;

        Edicao novaEdicao = new Edicao(numero, volume,dataEdicao,tiragem, artigos);

        String titulo = "Tituloteste";
        long issn = 156;
        String preiodicidade = "Mensal";

        RevistaCientifica novaRevista = new RevistaCientifica(titulo, issn,preiodicidade,novaEdicao);

    }

}
