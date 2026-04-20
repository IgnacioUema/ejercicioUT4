package javarefactorizacion;

/**
 * Clase principal que ejecuta el programa.
 * 
 * Se encarga de crear un cliente, un pedido
 * y mostrar la factura correspondiente por consola.
 * 
 * @author Nacho
 */
public class Factura {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear cliente
        Ticket Juan = new Ticket("Juan");

        // Crear pedido
        Pedido uno = new Pedido("Patatas");
        uno.setCantidad(15);
        uno.setPrecio(20.0);

        // Imprimir factura
        Juan.imprimirFactura(
                Juan.getNombreCliente(),
                uno.getNombreProducto(),
                uno.getPrecio(),
                uno.getCantidad(),
                uno.calcularPrecioTotal()
        );
    }
}