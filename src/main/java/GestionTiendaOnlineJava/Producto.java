package GestionTiendaOnlineJava;

/**
 * Representa un producto dentro de la tienda online.
 * Contiene información sobre el tipo, modelo y precio del producto.
 * @author Vicente Limones
 * @version 1.0
 */

public class Producto {
    private String tipo;
    private String modelo;
    private double precio;

    /**
     * Crea un nuevo producto con los datos indicados.
     * @param tipo Tipo de producto (ej. electrónico, ropa...)
     * @param modelo Modelo del producto
     * @param precio Precio del producto
     */

    public Producto(String tipo, String modelo, double precio){
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * Devuelve el modelo del producto.
     * @return Modelo
     */

    public String getModelo(){
        return this.modelo;
    }

    /**
     * Devuelve el tipo del producto.
     * @return Tipo
     */

    public String getTipo(){
        return this.tipo;
    }

    /**
     * Devuelve el precio del producto.
     * @return Precio
     */

    public double getPrecio(){
        return this.precio;
    }

    /**
     * Modifica el modelo del producto.
     * @param modelo Nuevo modelo
     * @return Modelo actualizado
     */

    public String modificarModelo(String modelo){
        return this.modelo = modelo;
    }

    /**
     * Modifica el tipo del producto.
     * @param tipo Nuevo tipo
     * @return Tipo actualizado
     */

    public String modificarTipo(String tipo){
        return this.tipo = tipo;
    }

    /**
     * Modifica el precio del producto.
     * @param precio Nuevo precio
     * @return Precio actualizado
     */

    public double modificarPrecio(double precio){
        return this.precio = precio;
    }

    /**
     * Devuelve la información completa del producto como texto.
     * @return Descripción del producto
     */

    public String getProducto(){
        return "Tipo: " + this.tipo + " Modelo: " + this.modelo + " Precio: " + this.precio;
    }
}
