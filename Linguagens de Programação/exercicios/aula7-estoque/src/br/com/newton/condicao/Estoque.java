package br.com.newton.condicao;

import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite a quantidade do produto");
        int estoque = read.nextInt();

        if(estoque >= 100){
            System.out.println("Produto com quantidade suficiente!");
        } else if(estoque < 100 && estoque > 50 ){
            System.out.println("Alerta: Avaliar possibilidade de novo pedido");
        }else{
            System.out.println("ATENÇÃO! Faça um novo pedido");
        }

    }

}

