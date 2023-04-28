import java.util.Scanner;

public class ExemploTrhrow {
    public static final String SENHASECRETA = "12345";

    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(System.in);
            System.out.println("Digite a senha: ");
            String senha = read.nextLine();
            if(!senha.equals(SENHASECRETA)){
                throw new Exception("Senha Inválida!!!");
            }
            System.out.println("Senha correta!!! \b Bem Vindo(a)!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
