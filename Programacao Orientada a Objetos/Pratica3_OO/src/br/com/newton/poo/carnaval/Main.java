package br.com.newton.poo.carnaval;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        do {
            int ingresso = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha o ingresso: " +
                            "\n 1. Normal " +
                            "\n 2. VIP " +
                            "\n 3. Camarote"));

            double valorIngresso, valorAdicional;
            String localizacaoCamarote;

            switch (ingresso) {

                case 1:
                    valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso: "));
                    Normal ingressoNormal = new Normal(valorIngresso);
                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso());
                    break;

                case 2:
                    valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do ingresso: "));
                    VIP ingressoVip = new VIP(valorIngresso, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso());
                    break;

                case 3:
                    valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso: "));
                    localizacaoCamarote = JOptionPane.showInputDialog("Digite a localização do camarote: ");
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do ingresso: "));

                    Camarote ingressoCamarote = new Camarote(valorIngresso, localizacaoCamarote, valorAdicional);

                    JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso());
                    break;
            }
        } while (i > 3);
    }
}
