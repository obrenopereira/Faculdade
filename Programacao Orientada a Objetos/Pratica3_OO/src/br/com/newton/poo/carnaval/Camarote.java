package br.com.newton.poo.carnaval;

public class Camarote extends Ingresso {

    public String localizacao;
    public Double valorAdicional;

    public Camarote(Double valor, String localizacao, Double valorAdicional) {
        super(valor);
        this.localizacao = localizacao;
        this.valorAdicional = valorAdicional + getValor();
    }
    public String imprimeIngresso() {
        return "Valor do ingresso "
                        + this.valorAdicional
                        + "\n Localização"
                        + this.localizacao
                        + " \n Ingresso Camarote";
    }
}
