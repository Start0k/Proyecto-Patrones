package model;

//Prototype
public interface Pedido extends Cloneable {
    Pedido clonar();
    String getDescripcion();
    
}
