package br.com.newton.poo.carnaval;

public class VIP extends Ingresso{

    public Double valorAdicional;

    public VIP(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional + getValor();
    }

    public String imprimeIngresso(){
        return "Valor do ingresso:"
                        + this.valorAdicional +
                        " IngressoVIP";
    }

}
