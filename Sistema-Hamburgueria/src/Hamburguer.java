public class Hamburguer extends ItemCardapio{
    private String pontoCarne;
    private int qtdAdicionais;

    public Hamburguer(int id, String nome, double precoBase, String pontoCarne, int qtdAdicionais) {
        super(id, nome, precoBase);
        this.pontoCarne = pontoCarne;
        this.qtdAdicionais = qtdAdicionais;
    }

    public String getPontoCarne() {
        return pontoCarne;
    }

    public void setPontoCarne(String pontoCarne) {
        this.pontoCarne = pontoCarne;
    }

    public int getQtdAdicionais() {
        return qtdAdicionais;
    }

    public void setQtdAdicionais(int qtdAdicionais) {
        this.qtdAdicionais = qtdAdicionais;
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }
}
