package br.com.newton.poo.veiculo;

import javax.swing.*;

public class Veiculo {

    public String placa;
    public int ano;

    public Veiculo(){};

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null,
                "Dados do veículo:\n \n Placa: " +
                this.placa +
                "\n Ano: "
                + this.ano);
    }

}
