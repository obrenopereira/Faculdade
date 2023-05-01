package Exercicio1;

import javax.swing.*;
import java.util.ArrayList;
public class RedeSocial{

    public String dataCriacao;
    public String nomeUsuario;
    public String dataNascimento;
    private String senha;
    public ArrayList<Publicacao>publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha, ArrayList<Publicacao> publicacoes) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = publicacoes;
    }

    public void inserepublicacao(Publicacao publi){
        publicacoes.add(publi);
    }

    public void imprimePublicacoes(){

        JOptionPane.showMessageDialog(null,"Total de publicações: "
                + Publicacao.getContadorPublicacao()
                + "\n Publicações: "
                + "\n " + Publicacao.getDataPublicacao()
                + "\n" + Publicacao.getTextoPublicacao());

    }
}
