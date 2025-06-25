package patterns;
import model.Pedido;

//Singleton
public class Cafeteria {
    private static Cafeteria instancia;
    
    private Cafeteria() { }
    
    public static Cafeteria getInstancia() {
        if (instancia == null) {
            instancia = new Cafeteria();
        }
        return instancia;
    }
    public void preparar(Pedido pedido) {
    System.out.println("Preparando: " + pedido.getDescripcion());

    try {
        Thread.sleep(2000); // espera 2 segundos
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }

    System.out.println(pedido.getDescripcion() + " listo!");
    try {
        Thread.sleep(2000); // espera 2 segundos
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}
    
}
