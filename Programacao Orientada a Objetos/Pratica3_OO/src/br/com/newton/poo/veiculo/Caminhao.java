package br.com.newton.poo.veiculo;

import javax.swing.*;

public class Caminhao extends Veiculo{

    public int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null,
                "Dados do veículo:\n \n Placa: " +
                        this.placa +
                        "\n Ano: " +
                        this.ano +
                        "\n Eixos: " +
                        this.eixos
        );
    }
}
