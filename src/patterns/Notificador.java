package patterns;
import java.util.ArrayList;
import java.util.List;

//observer
public class Notificador {
    private List<Observer> observadores = new ArrayList<>();
    
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }
    
    public void notificar(String mensaje) {
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }
    
}
