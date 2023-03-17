import javax.swing.*;

public class Restaurante {

    public static void main(String[] args) {

        String opcaoMenu = (JOptionPane.showInputDialog(null,"1. Hamburguer \n 2. Pizza \n 3. Sair", "Informe o pedido"));

         if(opcaoMenu.equals("1")) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do Hamburguer: ");

            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));

            String tipoHamburger = JOptionPane.showInputDialog(null, "O hamburguer é artesanal?\n S - sim \n N- Não ");
            boolean hamburguerCalculo;

            if (tipoHamburger.equals("S")){
                hamburguerCalculo = true;
            } else {
                hamburguerCalculo = false;
            }

            Hamburguer hamburguer = new Hamburguer();

            hamburguer.nome = nome;
            hamburguer.valor = valor;

            double valorTotal = hamburguer.valorHamburguer(hamburguerCalculo);

            JOptionPane.showMessageDialog(null, "O seu Hmaburguer é o: " + nome + "\n Valor: " + valorTotal);

        } else if(opcaoMenu.equals("2")){

            String nome = JOptionPane.showInputDialog(null, "Digite o nome da Pizaa: ");

            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));

            String possuiBorda = JOptionPane.showInputDialog(null, "A pizza possui possui borda? \n S - sim \n N- Não " );
            boolean calculoBorda;

            if (possuiBorda.equals("S"))
                calculoBorda = true;
             else
                calculoBorda = false;


            Pizza pizza = new Pizza();
            pizza.nome = nome;
            pizza.valor = valor;

            double valorTotal = pizza.CalcularValor(calculoBorda);
             JOptionPane.showMessageDialog(null, "A sua pizza é a: " + nome + "\n Valor: " + valorTotal);

        }


    }

}
