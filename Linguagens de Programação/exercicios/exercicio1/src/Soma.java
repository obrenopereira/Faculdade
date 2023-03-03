public class Soma {
    public static void main(String []args){
        System.out.println("Hello, World");

        int valorA = 10;
        valorA = 20;

        System.out.println(valorA);

        int valorB = 20;

        int valorC = valorA + valorB;

        System.out.println("O resultado da soma é: " + valorC);

        if(valorA < valorB){
            System.out.println("Valor A é menor que valor de B.");
        }else if (valorA == valorB){
                System.out.println("Valor A é igual a valor B");
        }else{
            System.out.println("Valor A é maior que valor B");
        }

        if(valorC > valorA){
            System.out.println("Valor C é maior que valor de A.");
        }else if (valorC == valorA){
            System.out.println("Valor A é igual a valor C");
        }else{
            System.out.println("Valor C é menor que valor A");
        }
    }
}
