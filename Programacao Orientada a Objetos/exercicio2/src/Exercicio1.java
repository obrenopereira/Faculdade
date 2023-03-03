import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Entre com o tempo: ");
        int tempo = read.nextInt();

        System.out.println("Entre com a velocidade média: ");
        int velocidade = read.nextInt();

        System.out.println("Entre com o consumo médio do veículo: ");
        int consumo = read.nextInt();

        int distancia = tempo * velocidade;

        float consumoFinal = distancia/consumo;

        System.out.println("O consumo final foi: " + consumoFinal + " litros");



    }
}
