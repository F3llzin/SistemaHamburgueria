public class RetiradaBalcao implements ModalidadeEntrega{

    @Override
    public double calcularTaxa(double subtotal) {return 0;}

    @Override
    public String getDescricao() {return "ff";}
}
