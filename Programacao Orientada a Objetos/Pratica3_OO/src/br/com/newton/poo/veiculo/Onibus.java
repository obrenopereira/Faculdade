package br.com.newton.poo.veiculo;

import javax.swing.*;

public class Onibus extends Veiculo{

    public int assentos;

    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null,
                "Dados do veículo:\n \n Placa: " +
                        this.placa +
                        "\n Ano: " +
                        this.ano +
                        "\n Assentos: " +
                        this.assentos
        );
    }
}
