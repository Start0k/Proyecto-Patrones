package app;
import patterns.*;
import model.*;
import java.util.Scanner;


public class main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafeteria cafeteria = Cafeteria.getInstancia();
        Notificador notificador = new Notificador();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        ClienteObservador cliente = new ClienteObservador(nombre);
        notificador.agregarObservador(cliente);

        Pedido ultimoPedido = null;

        boolean salir = false;
        while (!salir) {
            System.out.println("\nBienvenido a la cafeteria");
            System.out.println("1. Pedir Cafe");
            System.out.println("2. Pedir Latte");
            System.out.println("3. Clonar ultimo pedido");
            System.out.println("4. Pedir desde app externa");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            Pedido pedido = null;

            switch (opcion) {
                case 1:
                    pedido = new Cafe();
                    break;
                case 2:
                    pedido = new Latte();
                    break;
                case 3:
                    if (ultimoPedido != null) {
                        pedido = ultimoPedido.clonar();
                        System.out.println("Pedido clonado exitosamente.");
                    } else {
                        System.out.println("Aun no hay pedidos recientes.");
                        try {
                        Thread.sleep(2000); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        }
                    }
                    break;
                case 4:
                    PedidoExterno externo = new PedidoExterno();
                    pedido = new AdaptadorPedidoExterno(externo);
                    break;
                case 5:
                    salir = true;
                    continue;
                default:
                    System.out.println("Opcion invalida.");
                    continue;
            }

            if (pedido != null) {
                cafeteria.preparar(pedido);
                notificador.notificar("Tu " + pedido.getDescripcion() + " esta listo para el retiro");
                try {
                    Thread.sleep(2000); // espera 2 segundos
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                ultimoPedido = pedido;
            }
        }

        System.out.println("Gracias por visitar la cafeteria!");
        scanner.close();
    }
    
}
