public class EntregaDelivery implements ModalidadeEntrega{
    private double taxaPadrao;
    private double valorMinimoIsencao;

    public EntregaDelivery() {}

    @Override
    public double calcularTaxa(double subtotal) {return 0;}

    @Override
    public String getDescricao() {return "ff";}
}
