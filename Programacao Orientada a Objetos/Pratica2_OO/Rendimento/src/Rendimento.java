public class Rendimento {

    private double investimentoInicial;
    private double taxaRendimento;
    private int numeroMeses;

    private double rendimentoTotal;

    public Rendimento(double rendimentoTotal) {
        this.rendimentoTotal = rendimentoTotal;
    }

    public Rendimento() {
    }

    public Rendimento(double investimentoInicial, double taxaRendimento, int numeroMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numeroMeses = numeroMeses;
    }

    public double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) {
        this.numeroMeses = numeroMeses;
    }

    public double getRendimentoTotal() {
        return rendimentoTotal;
    }

    public void setRendimentoTotal(double rendimentoTotal) {
        this.rendimentoTotal = rendimentoTotal;
    }

    public void calcularRendimento(){
        rendimentoTotal = investimentoInicial + (taxaRendimento * numeroMeses);
    }

    public String mostrarRendimento(){
        return "Investimento inicial: "
                + getInvestimentoInicial()
                + "\n Taxa de rendimento: "
                + getTaxaRendimento()
                + "\n Numero de meses: "
                + getNumeroMeses()
                + "\n Rendimento total: "
                + getRendimentoTotal();
    }



}
