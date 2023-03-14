public class Estoque {

    private String nome;
    private int QtdAtual;
    private int QtdMinima;

    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.QtdAtual = qtdAtual;
        this.QtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return QtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        QtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return QtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        QtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde){
        QtdAtual = QtdAtual - qtde;

        if (QtdAtual < 1){
            System.out.println("Erro! Não temos produto o suficiente no estoque. Tente Novamente");
        }
    }

    public String mostra(){
        return "Nome do produto: "
                + getNome()
                + "\n Quantidade mínima: "
                + getQtdMinima()
                + "\n Quantidade Atual: "
                + getQtdAtual();
    }

    public boolean precisaRepor(){
        if(QtdAtual <= QtdMinima){
            return true;
        }else {
            return false;
        }
    }


}
