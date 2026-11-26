import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status;
    private ModalidadeEntrega entrega;

    public Pedido(int id, Cliente cliente, ModalidadeEntrega entrega) {
        this.id = id;
        this.cliente = cliente;
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    //TODOS OS MÉTODOS TEM QUE SER ALTERADAS E DEVIDAMENTE IMPLEMENTADAS
    public boolean adicionarItem(ItemCardapio item, int quantidade) {
        return false;
    }

    public double calcularSubtotal(){
        return 0;
    }

    public double calcularTotal() {
        return 0;
    }

    public boolean avancarStatus() {
        return false;
    }

    public boolean cancelar() {
        return false;
    }
}
