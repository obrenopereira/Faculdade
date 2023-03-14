import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o investimento inicial: ");
        double investimentoInicial = read.nextDouble();;

        System.out.println("Digite a taxa de rendimento: ");
        double taxaRendimento = read.nextDouble();

        System.out.println("Digite a quantidade de meses: ");
        int numeroMeses = read.nextInt();

        Rendimento rendimento = new Rendimento(investimentoInicial, taxaRendimento, numeroMeses);

        rendimento.calcularRendimento();
        rendimento.mostrarRendimento();



    }
}
