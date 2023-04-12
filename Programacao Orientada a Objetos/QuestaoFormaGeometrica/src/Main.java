import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4, 4F);
        Triangulo t1 = new Triangulo(3, 4F);

        System.out.println("Área do Quadrado: " + q1.calcularArea());
        System.out.println("Área do Triangulo: " + t1.calcularArea());

        System.out.println("Área do Quadrado: " + q1.calcularPerimetro());
        System.out.println("Área do Triangulo: " + t1.calcularPerimetro());
    }

}
