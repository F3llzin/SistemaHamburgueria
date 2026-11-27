public class ItemPedido {
    private ItemCardapio item;
    private int quantidade;
    private double precoUnitarioRegistrado;

    public ItemPedido(int quantidade, ItemCardapio item) {
        this.quantidade = quantidade;
        this.item = item;
    }

    public ItemCardapio getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitarioRegistrado() {
        return precoUnitarioRegistrado;
    }

    public double calcularSubtotal() {
        return 0;
    }
}
