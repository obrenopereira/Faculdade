import javax.swing.*;

public class PontoAcai {

    public static void main(String[] args) {

        String tamanho = JOptionPane.showInputDialog("Ponto do Açai \n Escolha o tamanho: \n P - 300 ml \n M - 500ml \n G - 700ml" );

        String desejaSorvete = JOptionPane.showInputDialog("Deseja sorvete? \n S- Sim \n N - Não");

        Acai acai = new Acai();

        Boolean acrescimoSorvete;

        if(desejaSorvete.equals("S")){
            acrescimoSorvete = true;
        } else{
            acrescimoSorvete = false;
        }

        double valorTotal = acai.CalculoValor(acrescimoSorvete, tamanho);


        JOptionPane.showMessageDialog(null, "O valor é" + valorTotal);

    }
}
