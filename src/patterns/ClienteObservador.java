package patterns;


//observer
public class ClienteObservador implements Observer{
    private String nombre;

    public ClienteObservador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + ": " + mensaje);
    }
    
}
