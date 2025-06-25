package model;

//Prototype
public class Latte implements Pedido{
    @Override
    public Pedido clonar() {
        return new Latte();
    }

    @Override
    public String getDescripcion() {
        return "Latte clasico";
    }
    
}
