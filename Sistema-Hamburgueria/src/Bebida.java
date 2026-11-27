public class Bebida extends ItemCardapio{
    private int volumeMl;
    private boolean gelada;

    public Bebida(int id, String nome, double precoBase, int volumeMl, boolean gelada) {
        super(id, nome, precoBase);
        this.volumeMl = volumeMl;
        this.gelada = gelada;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }
}
