public interface ModalidadeEntrega {

    public default double calcularTaxa(double subtotal) {return 0;}
    public default String getDescricao() {return "ff";}

}
