import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite suas notas: ");
        double nota1 = read.nextDouble();
        double nota2 = read.nextDouble();

        double media = (nota1 + nota2)/2;

        if(media >= 7){
            System.out.println("A média de suas notas foram: " + media + ". Você foi aprovado!");
        }else{
            System.out.println("A média de suas notas foram: " + media + ". Você foi reprovado!");
        }
    }
}
