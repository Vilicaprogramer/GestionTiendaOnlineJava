package GestionNegocio2;

public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;
    private String email;

    public Cliente (String nombre, String dni, String telefono, String email){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDni(){
        return this.dni;
    }

    public String modificarNombre(String nombre){
        return this.nombre = nombre;
    }

    public String modificarDni(String dni){
        return this.dni = dni;
    }

    public String modificarTelefono(String telefono){
        return this.telefono = telefono;
    }

    public String modificarEmail(String email){
        return this.email = email;
    }

    public String getCliente(){
        return "Nombre: " + this.nombre + " DNI: " + this.dni + " Telefono: " + this.telefono + " Email: " + this.email;
    }


}
