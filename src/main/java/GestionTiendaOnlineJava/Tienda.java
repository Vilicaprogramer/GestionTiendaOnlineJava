package GestionTiendaOnlineJava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que representa una tienda online.
 * Permite gestionar clientes, productos y ventas.
 */

public class Tienda {
    private ArrayList<Cliente> dbClientes;
    private ArrayList<Producto> dbProductos;
    private ArrayList<Venta> dbVentas;

    /**
     * Constructor de la clase Tienda. Inicializa las bases de datos de clientes, productos y ventas.
     */

    public Tienda(){
        this.dbClientes = new ArrayList<>();
        this.dbProductos = new ArrayList<>();
        this.dbVentas = new ArrayList<>();
    }

    /**
     * Añade un cliente a la base de datos.
     * @param c Cliente a añadir
     */

    public void addDbClientes(Cliente c){
        this.dbClientes.add(c);
    }

    /**
     * Añade un producto a la base de datos.
     * @param p Producto a añadir
     */

    public void addDbProductos(Producto p){
        this.dbProductos.add(p);
    }

    /**
     * Añade una venta a la base de datos.
     * @param v Venta a añadir
     */

    public void addDbVentas(Venta v){
        this.dbVentas.add(v);
    }

    // Funciones de Cliente en Tienda

    /**
     * Da de alta un nuevo cliente con sus datos personales.
     * @param nombre Nombre del cliente
     * @param dni DNI del cliente
     * @param tlf Teléfono del cliente
     * @param mail Correo electrónico del cliente
     */

    public void altaCliente(String nombre, String dni, String tlf, String mail) {
        Cliente cl = new Cliente(nombre, dni, tlf, mail);
        this.dbClientes.add(cl);
    }

    /**
     * Busca y muestra un cliente por su DNI.
     * @param dni DNI del cliente
     */

    public void getClienteByDni(String dni) {
        boolean clienteEncontrado = false;

        for (Cliente c : this.dbClientes) {
            if (c.getDni().equals(dni)) {
                System.out.println(c.getCliente());
                clienteEncontrado = true;
                break;
            }
        }
        if (!clienteEncontrado) {
            System.out.println("El DNI proporcionado no está en la BBDD");
        }
    }

    /**
     * Elimina un cliente de la base de datos según su DNI.
     * @param dni DNI del cliente a eliminar
     */

    public void darBajaCliente(String dni) {
        boolean clienteEncontrado = false;

        for (Cliente c : this.dbClientes) {
            if (c.getDni().equals(dni)) {
                this.dbClientes.remove(c);
                System.out.println("El cliente " + c.getNombre() + " ha sido eliminado");
                clienteEncontrado = true;
                break;
            }
        }

        if (!clienteEncontrado) {
            System.out.println("No existe ningún cliente con ese DNI");
        }
    }

    /**
     * Muestra todos los clientes registrados.
     */

    public void listarClientes(){
        for (Cliente c: this.dbClientes){
            System.out.println(c.getCliente());
        }
    }

    /**
     * Permite modificar los datos de un cliente mediante un menú interactivo.
     * @param dni DNI del cliente a modificar
     */

    public void modificarCliente(String dni) {
        Scanner sc = new Scanner(System.in);
        for (Cliente c : this.dbClientes) {
            if (c.getDni().equals(dni)) {
                boolean salir = true;
                do {
                    System.out.println(c.getCliente());
                    System.out.println("¿Que campo quieres modificar?\n" +
                            "1- Nombre\n" +
                            "2- DNI\n" +
                            "3- Teléfono\n" +
                            "4- Email\n" +
                            "5- Salir");
                    int respuesta = sc.nextInt();
                    sc.nextLine();
                    switch (respuesta) {
                        case 1 -> {
                            System.out.println("Introduce el nuevo nombre: ");
                            String nombre = sc.nextLine();
                            c.modificarNombre(nombre);
                        }
                        case 2 -> {
                            System.out.println("Introduce el nuevo DNI: ");
                            String dNi = sc.nextLine();
                            c.modificarDni(dNi);
                        }
                        case 3 -> {
                            System.out.println("Introduce el nuevo telefono: ");
                            String telefono = sc.nextLine();
                            c.modificarTelefono(telefono);
                        }
                        case 4 -> {
                            System.out.println("Introduce el nuevo email: ");
                            String email = sc.nextLine();
                            c.modificarEmail(email);
                        }
                        case 5 -> salir = false;
                        default -> System.out.println("El número introducido no es correcto, intentalo de nuevo");
                    }
                } while (salir);

            } else {
                System.out.println("No existe ningún cliente con ese DNI");
            }
        }
    }

    // Funciones de Productos en Tienda

    /**
     * Da de alta un producto en la tienda.
     * @param tipo Tipo de producto
     * @param modelo Modelo del producto
     * @param precio Precio del producto
     */

    public void altaProducto(String tipo, String modelo, double precio) {
        Producto pd = new Producto(tipo, modelo, precio);
        this.dbProductos.add(pd);
    }

    /**
     * Elimina un producto según su modelo.
     * @param modelo Modelo del producto a eliminar
     */

    public void bajaProducto(String modelo) {
        boolean productoEncontrado = false;

        for (Producto p: this.dbProductos){
            if (p.getModelo().equals(modelo)){
                this.dbProductos.remove(p);
                productoEncontrado = true;
                break;
            }
        }
        if (!productoEncontrado) {
            System.out.println("No existe ningún producto con ese modelo");
        }
    }

    /**
     * Permite modificar los datos de un producto existente.
     * @param modelo Modelo del producto a modificar
     */

    public void modificarProducto(String modelo) {
        Scanner sc = new Scanner(System.in);
        for (Producto p: this.dbProductos){
            if (p.getModelo().equals(modelo)){
                boolean salir = true;
                System.out.println(p.getProducto());
                System.out.println("Que quieres modificar del produceto:\n" +
                        "1- Tipo\n" +
                        "2- Modelo\n" +
                        "3- Precio\n" +
                        "4- Salir");
                int opcion = sc.nextInt();
                switch (opcion){
                    case 1 -> {
                        System.out.println("Introduce el nuevo Tipo: ");
                        String tipo = sc.nextLine();
                        p.modificarTipo(tipo);
                    }
                    case 2 -> {
                        System.out.println("Introduce el nuevo Modelo: ");
                        String model = sc.nextLine();
                        p.modificarModelo(model);
                    }
                    case 3 -> {
                        System.out.println("Introduce el nuevo Precio: ");
                        double precio = sc.nextDouble();
                        p.modificarPrecio(precio);
                    }
                    case 4 -> salir = false;
                    default -> System.out.println("El número introducido no es correcto, intentalo de nuevo");
                } while (salir);
            }
        }
    }


    public void listarProductos(){
        for (Producto p: this.dbProductos){
            System.out.println(p.getProducto());
        }
    }

    /**
     * Busca y muestra un producto por su modelo.
     * @param nombre Modelo del producto
     */

    public void getProductoByNombre(String nombre){
        boolean productoEncontrado = false;

        for (Producto p: this.dbProductos) {
            if (p.getModelo().equals(nombre)) {
                System.out.println(p.getProducto());
                productoEncontrado = true;
                break;
            }
        }
        if (!productoEncontrado) {
            System.out.println("No existe ningún producto con ese modelo");
        }
    }


    //Funciones de Gestión de ventas

    /**
     * Muestra la lista de clientes y permite al usuario seleccionar uno por nombre.
     * @return Cliente seleccionado o null si no se encuentra
     */

    public Cliente seleccionCliente(){
        Scanner sc = new Scanner(System.in);
        String cliente;
        System.out.println("===SELECCIONA UN CLIENTE DE LA LISTA===");
        listarClientes();
        System.out.println("\nEscribe el nombre del cliente: ");
        cliente = sc.nextLine();
        Cliente cl = null;
        for (Cliente c : this.dbClientes) {
            if (c.getNombre().equals(cliente)) {
                cl = c;
           }
        }
        return cl;
    }

    /**
     * Muestra la lista de productos y permite seleccionar uno por modelo.
     * @return Producto seleccionado o null si no se encuentra
     */

    public Producto seleccionProducto() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===SELECCIONA UN PRODUCTO DE LA LISTA===");
            listarProductos();
            System.out.println("\nEscribe un modelo de la lista (o escribe 'salir' para terminar):");

            String entrada = sc.nextLine().trim(); // .trim() elimina espacios sobrantes

            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Selección cancelada por el usuario.");
                return null;
            }

            for (Producto p : this.dbProductos) {
                if (p.getModelo().equalsIgnoreCase(entrada)) {
                    return p;
                }
            }

            System.out.println("El modelo ingresado no está en la base de datos.");
        }
    }

    /**
     * Añade una nueva venta a la base de datos.
     * @param v Venta a registrar
     */

    public void nuevaVenta(Venta v){
        this.dbVentas.add(v);
    }

    //Funciones de Mostrar ventas

    /**
     * Muestra todas las ventas realizadas en la tienda.
     */

    public void mostrarTotalVentas(){
        for (Venta v: this.dbVentas){
            v.getVentas();
        }
    }

    /**
     * Solicita el nombre de un cliente e imprime todas sus ventas.
     */

    public void mostrarVentasPorCliente(){
        Scanner sc = new Scanner(System.in);
        String nombreCliente;
        System.out.println("===INTRODUCE EL NOMBRE DE UN CLIENTE===");
        nombreCliente = sc.nextLine();
        for (Venta v: this.dbVentas) {
            if (v.getClienteName().equals(nombreCliente)){
                v.getVentas();
            }
        }
    }

    /**
     * Solicita el nombre de un cliente y muestra el importe total de sus compras.
     */

    public void mostrarImporteTotalPorCLiente() {
        Scanner sc = new Scanner(System.in);
        String nombreCliente;
        System.out.println("===INTRODUCE EL NOMBRE DE UN CLIENTE===");
        nombreCliente = sc.nextLine();
        for (Venta v: this.dbVentas) {
            if (v.getClienteName().equals(nombreCliente)){
                v.calcularTotal();
            }
        }
    }



}
