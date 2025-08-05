package GestionTiendaOnlineJava;

import java.util.ArrayList;

/**
 * Representa una venta realizada a un cliente, con una lista de productos y una fecha asociada.
 * Permite mostrar los productos vendidos, calcular el total y añadir nuevos productos a la venta.
 */

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> lineasDeVenta; // cada venta contiene varios productos
    private String fecha;

    /**
     * Crea una nueva venta para un cliente en una fecha determinada.
     * @param cliente Cliente que realiza la compra
     * @param fecha Fecha de la venta
     */

    public Venta(Cliente cliente, String fecha){
        this.cliente = cliente;
        this.lineasDeVenta = new ArrayList<>();
        this.fecha = fecha;
    }

    /**
     * Muestra por pantalla los datos del cliente, fecha y productos incluidos en la venta.
     */

    public void getVentas(){
        System.out.println("===================================================================================");
        System.out.println(cliente.getCliente());
        System.out.println("Fecha de la venta: " + this.fecha);
        for (Producto p: this.lineasDeVenta){
            System.out.println(p.getProducto());
        }
    }

    /**
     * Devuelve el nombre del cliente asociado a esta venta.
     * @return Nombre del cliente
     */

    public String getClienteName(){
        return this.cliente.getNombre();
    }

    /**
     * Calcula y muestra el total de la venta sumando el precio de todos los productos.
     */

    public void calcularTotal(){
        double total = 0;
        for (Producto p: this.lineasDeVenta){
            total += p.getPrecio();
        }
        System.out.println("El total a pagar es " + total + "€");
    }

    /**
     * Añade un producto a la venta.
     * @param producto Producto a añadir
     */

    public void anadirProducto(Producto producto){
        if (producto != null) {
            this.lineasDeVenta.add(producto);
            System.out.println("Producto " + producto.getModelo() + " añadido al cliente");
        }
    }
}
