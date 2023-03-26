package br.com.newton.poo.folhapagamento;

public class FComissionado extends Funcionario{

   public double percentual;
   public double vendas;

    public FComissionado(double percentual, double vendas) {
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void calcularProventos(){
        this.salario = this.salario + ((this.salario * this.percentual/100) * vendas);
    };

}
