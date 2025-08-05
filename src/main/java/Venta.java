package GestionNegocio2;

import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> lineasDeVenta; // cada venta contiene varios productos
    private String fecha;

    public Venta(Cliente cliente, String fecha){
        this.cliente = cliente;
        this.lineasDeVenta = new ArrayList<>();
        this.fecha = fecha;
    }


    public void getVentas(){
        System.out.println("===================================================================================");
        System.out.println(cliente.getCliente());
        System.out.println("Fecha de la venta: " + this.fecha);
        for (Producto p: this.lineasDeVenta){
            System.out.println(p.getProducto());
        }
    }

    public String getClienteName(){
        return this.cliente.getNombre();
    }

    public void calcularTotal(){
        double total = 0;
        for (Producto p: this.lineasDeVenta){
            total += p.getPrecio();
        }
        System.out.println("El total a pagar es " + total + "€");
    }

    public void anadirProducto(Producto producto){
        if (producto != null) {
            this.lineasDeVenta.add(producto);
            System.out.println("Producto " + producto.getModelo() + " añadido al cliente");
        }
    }
}
