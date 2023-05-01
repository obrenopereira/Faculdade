package Exercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        String nomeUsuario = JOptionPane.showInputDialog("Digite o seu nome de usuário:");
        String dataNascimento = JOptionPane.showInputDialog("Sua data de nascimento:");
        String dataCriacao = JOptionPane.showInputDialog("Data de hoje: ");
        String senha = JOptionPane.showInputDialog("Sua senha");
        ArrayList <Publicacao>publicacoes = new ArrayList<>();

        int numeroPublicacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas publicações deseja fazer  \n 1 \n 2 \n 3"));

        for (int i = 0; i < numeroPublicacoes; i++){

            String textoPublicacao = JOptionPane.showInputDialog("Digite seu texto para publicação");
            String dataPublicacao = JOptionPane.showInputDialog("Data da publicação:");
            String linkMedia = JOptionPane.showInputDialog("Link da pulicação");

            publicacoes.add(new Publicacao(dataPublicacao,textoPublicacao,linkMedia));

        }

        RedeSocial novaRede = new RedeSocial(dataCriacao, nomeUsuario,dataNascimento,senha,publicacoes);

        novaRede.imprimePublicacoes();

    }

}
