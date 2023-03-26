package br.com.newton.poo.folhapagamento;

public class FProdutivdade extends Funcionario{

    public double valor;
    public int producao;

    public FProdutivdade(double valor, int producao) {
        this.valor = valor;
        this.producao = producao;
    }

    public FProdutivdade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public void calcularProventos(){
        this.salario = this.salario + (valor * this.salario/100);
    };

}
