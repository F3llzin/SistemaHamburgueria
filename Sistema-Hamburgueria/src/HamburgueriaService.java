import java.util.ArrayList;

public class HamburgueriaService {
    private ArrayList<ItemCardapio> cardapio = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    //TODOS OS MÉTODOS TEM QUE SER ALTERADAS E DEVIDAMENTE IMPLEMENTADAS
    public boolean cadastrarItem(ItemCardapio item){
        return false;
    }

    public void buscarItemPorId(int id) {
        //troque o retorno para 'ItemCardapio'
    }

    public boolean removerItem(int id){
        return false;
    }

    public boolean cadastrarCliente(Cliente cliente) {
        return false;
    }

    public void buscarClientePorId(int id) {
        //troque o retorno para 'Cliente'
    }

    public boolean removerCliente(int id) {
        return false;
    }

    public boolean registrarPedido(Pedido pedido) {
        return false;
    }

    public String gerarRelatorioFaturamento() {
        return "ff";
    }
    public String gerarRelatorioPedidosPorStatus() {
        return "ff";
    }
}
