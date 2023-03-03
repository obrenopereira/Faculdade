public class Subtracao {
    public static  void main(String [] args){
        int valorA = 50;
        int valorB = 65;

        int resultadoSubtracao = valorA - valorB;

        if (valorA > valorB){
            System.out.println(resultadoSubtracao);
        }else{
            System.out.println("Operação não pode ser realizado");
        }

        System.out.println("O resultado da subtração é: " + resultadoSubtracao);

    }

}
