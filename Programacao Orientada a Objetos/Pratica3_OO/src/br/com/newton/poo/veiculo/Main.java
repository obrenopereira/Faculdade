package br.com.newton.poo.veiculo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

            int escolhaVeiculo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual o seu veículo: \n 1. Onibus \n 2. Caminhão"));

            String placa;
            int ano, assentos, eixos;


            if(escolhaVeiculo == 1){
                placa = JOptionPane.showInputDialog("Digite a placa do veículo: ");
                ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo: "));
                assentos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos: "));

                Onibus novoOnibus = new Onibus(placa,ano,assentos);

                novoOnibus.exibirDados();

            }else if(escolhaVeiculo == 2){
                placa = JOptionPane.showInputDialog("Digite a placa do veículo: ");
                ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo: "));
                eixos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de eixos: "));

                Caminhao novoCaminhao = new Caminhao(placa,ano,eixos);

                novoCaminhao.exibirDados();

            }else{
                JOptionPane.showMessageDialog(null, "Erro! \n Opção não existente!");
            }


    }
}
