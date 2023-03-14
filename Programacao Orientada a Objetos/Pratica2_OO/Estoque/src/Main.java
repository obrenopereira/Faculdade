import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int qtdMinima = 20;
        int qtdAtual = 80;

        System.out.println("Digite o nome");
        String nome = read.nextLine();

        System.out.println("Digite a quantidade desejada: ");
        int qtde = read.nextInt();

        Estoque estoque = new Estoque(nome,qtdAtual, qtdMinima);

        estoque.mostra();


    }

}
