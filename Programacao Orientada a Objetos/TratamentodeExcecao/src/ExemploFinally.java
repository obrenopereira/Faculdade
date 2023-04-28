import java.util.Scanner;

public class ExemploFinally {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try{
            int dividendo, divisor;
            System.out.println("Digite o valor do dividendo: ");
            dividendo = read.nextInt();

            System.out.println("Digite o valor do divisor: ");
            divisor = read.nextInt();

            if(divisor ==0){
                throw new Exception("Não é permitido fazer uma divisao por zero!");
            }

            System.out.println(dividendo + " / " + divisor + (dividendo/divisor));
        } catch ( Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            System.out.println("Bloco Finally.");
        }
    }

}
