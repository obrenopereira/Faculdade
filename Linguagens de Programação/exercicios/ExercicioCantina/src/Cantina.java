import javax.swing.*;
import java.util.ArrayList;

public class Cantina {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(JOptionPane.showInputDialog("Informe o nome do cliente:"));

        String tipoMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));

        Massa massa = new Massa(tipoMassa, valorMassa);


        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n"
                    + "1-Bacon\n"
                    + "2-Mussarela\n"
                    + "3-Tomate\n"
                    + "4-Queijo\n"
                    + "5-Sair"));
            switch (opcao) {
                case 1:
                    ingredientes.add(new Ingrediente("Bacon", 2.0));
                    break;
                case 2:
                    ingredientes.add(new Ingrediente("Mussarela", 2.0));
                    break;
                case 3:
                    ingredientes.add(new Ingrediente("Tomate", 2.0));
                    break;
                case 4:
                    ingredientes.add(new Ingrediente("Queijo", 2.0));
                    break;
                default:
                    break;
            }
        } while (opcao != 5);


        Pedido pedido = new Pedido(cliente, massa, ingredientes);
        double valorPedido = pedido.calcularValorPedido();

        String mensagem = "Pedido feito para " + cliente.getNome() + "\n"
                + massa.getTipoMassa() + " com ";
        for (Ingrediente ingrediente : ingredientes) {
            mensagem += ingrediente.getNomeIngridente() + " e ";
        }
        mensagem = mensagem.substring(0, mensagem.length() - 3); // remove o último " e "
        mensagem += "\nValor: " + String.format("%.2f", valorPedido);
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
