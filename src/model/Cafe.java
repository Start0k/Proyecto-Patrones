package model;

//Prototype
public class Cafe implements Pedido{
    @Override
    public Pedido clonar() {
        return new Cafe(); // Clon superficial
    }
    
    @Override
    public String getDescripcion() {
        return "Cafe espresso";
    }
}
