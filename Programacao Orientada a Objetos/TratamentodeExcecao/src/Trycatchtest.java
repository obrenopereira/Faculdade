import java.util.Scanner;

public class Trycatchtest {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        try{
            System.out.println("Digite um valor inteiro..");
            int numero1 = read.nextInt();

            System.out.println("Digite um valor inteiro..");
            int numero2 = read.nextInt();

            System.out.println(numero1 +  "+" + numero2 + (numero1 + numero2));
        }catch(Exception ex){
            System.out.println("ERRO - Valor digitado não é um número inteiro!");

        }
    }
}
