package patterns;
import model.Pedido;

//Adapter
class PedidoExterno {
    public String getTextoPedido() {
        return "Latte desde app externa";
    }
}
public class AdaptadorPedidoExterno implements Pedido{
    private PedidoExterno externo;

    public AdaptadorPedidoExterno(PedidoExterno externo) {
        this.externo = externo;
    }

    @Override
    public Pedido clonar() {
        return new AdaptadorPedidoExterno(this.externo);
    }

    @Override
    public String getDescripcion() {
        return externo.getTextoPedido();
    }
}
