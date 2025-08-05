package GestionNegocio2;

public class Producto {
    private String tipo;
    private String modelo;
    private double precio;

    public Producto(String tipo, String modelo, double precio){
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String modificarModelo(String modelo){
        return this.modelo = modelo;
    }

    public String modificarTipo(String tipo){
        return this.tipo = tipo;
    }

    public double modificarPrecio(double precio){
        return this.precio = precio;
    }

    public String getProducto(){
        return "Tipo: " + this.tipo + " Modelo: " + this.modelo + " Precio: " + this.precio;
    }
}
