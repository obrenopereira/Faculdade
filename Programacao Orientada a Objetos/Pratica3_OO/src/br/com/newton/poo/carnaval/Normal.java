package br.com.newton.poo.carnaval;

public class Normal extends Ingresso {

    public Normal(Double valor) {
        super(valor);
    }
    public String imprimeIngresso(){
        return "Valor do ingresso:" + getValor() + "\n Ingresso Normal";
    }
}
