package GestionTiendaOnlineJava;

/**
 * Representa un cliente de la tienda online.
 * Contiene información básica como nombre, DNI, teléfono y correo electrónico.
 */

public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;
    private String email;

    /**
     * Crea un nuevo cliente.
     * @param nombre Nombre del cliente
     * @param dni DNI del cliente
     * @param telefono Teléfono del cliente
     * @param email Correo electrónico del cliente
     */

    public Cliente (String nombre, String dni, String telefono, String email){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;

    }

    /**
     * Devuelve el nombre del cliente.
     * @return Nombre
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el DNI del cliente.
     * @return DNI
     */
    public String getDni(){
        return this.dni;
    }

    /**
     * Modifica el nombre del cliente.
     * @param nombre Nuevo nombre
     * @return Nombre actualizado
     */
    public String modificarNombre(String nombre){
        return this.nombre = nombre;
    }

    /**
     * Modifica el DNI del cliente.
     * @param dni Nuevo DNI
     * @return DNI actualizado
     */
    public String modificarDni(String dni){
        return this.dni = dni;
    }

    /**
     * Modifica el teléfono del cliente.
     * @param telefono Nuevo teléfono
     * @return Teléfono actualizado
     */
    public String modificarTelefono(String telefono){
        return this.telefono = telefono;
    }

    /**
     * Modifica el email del cliente.
     * @param email Nuevo correo
     * @return Email actualizado
     */
    public String modificarEmail(String email){
        return this.email = email;
    }

    /**
     * Devuelve la información del cliente como texto.
     * @return Datos del cliente
     */
    public String getCliente(){
        return "Nombre: " + this.nombre + " DNI: " + this.dni + " Telefono: " + this.telefono + " Email: " + this.email;
    }


}
