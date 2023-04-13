import java.util.ArrayList;

public class Pedido {

    public Cliente cliente;
    public Massa massa;
    public ArrayList<Ingrediente> ingredientes;

    public Pedido(Cliente cliente, Massa massa, ArrayList<Ingrediente> ingredientes) {
        this.cliente = cliente;
        this.massa = massa;
        this.ingredientes = ingredientes;
    }

    public double calcularValorPedido() {
        double valorTotal = massa.getValor();
        valorTotal += ingredientes.size() * 2.0;
        return valorTotal;
    }



}
