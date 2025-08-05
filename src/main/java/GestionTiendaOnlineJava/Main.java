package GestionTiendaOnlineJava;

import  GestionTiendaOnlineJava.FuncionesMenu;
import GestionTiendaOnlineJava.Tienda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Datos de ejemplo precarcados en el main, para que la tienda no comience de zero*/
        Tienda t = new Tienda();

        // Creamos 10 clientes
        Cliente c1 = new Cliente("Ana Pérez", "12345678A", "600111111", "ana@example.com");
        Cliente c2 = new Cliente("Luis Gómez", "23456789B", "600222222", "luis@example.com");
        Cliente c3 = new Cliente("María López", "34567890C", "600333333", "maria@example.com");
        Cliente c4 = new Cliente("Carlos Ruiz", "45678901D", "600444444", "carlos@example.com");
        Cliente c5 = new Cliente("Elena Sánchez", "56789012E", "600555555", "elena@example.com");
        Cliente c6 = new Cliente("Pedro Díaz", "67890123F", "600666666", "pedro@example.com");
        Cliente c7 = new Cliente("Lucía Torres", "78901234G", "600777777", "lucia@example.com");
        Cliente c8 = new Cliente("Jorge Martínez", "89012345H", "600888888", "jorge@example.com");
        Cliente c9 = new Cliente("Marta Romero", "90123456I", "600999999", "marta@example.com");
        Cliente c10 = new Cliente("David Navarro", "01234567J", "601000000", "david@example.com");

        // Metemos los clientes a la base de datos de Clientes
        t.addDbClientes(c1);
        t.addDbClientes(c2);
        t.addDbClientes(c3);
        t.addDbClientes(c4);
        t.addDbClientes(c5);
        t.addDbClientes(c6);
        t.addDbClientes(c7);
        t.addDbClientes(c8);
        t.addDbClientes(c9);
        t.addDbClientes(c10);

        // Creamos 20 productos
        Producto p1 = new Producto("Electrónica", "TV Samsung 42\"", 399.99);
        Producto p2 = new Producto("Electrónica", "TV LG 55\"", 599.99);
        Producto p3 = new Producto("Electrodoméstico", "Lavadora Bosch", 450.00);
        Producto p4 = new Producto("Electrodoméstico", "Frigorífico LG", 700.00);
        Producto p5 = new Producto("Informática", "Portátil HP", 850.00);
        Producto p6 = new Producto("Informática", "Portátil Dell", 950.00);
        Producto p7 = new Producto("Telefonía", "iPhone 13", 999.00);
        Producto p8 = new Producto("Telefonía", "Samsung Galaxy S22", 899.00);
        Producto p9 = new Producto("Telefonía", "Xiaomi Redmi", 199.00);
        Producto p10 = new Producto("Accesorios", "Auriculares JBL", 79.99);
        Producto p11 = new Producto("Accesorios", "Teclado Logitech", 49.99);
        Producto p12 = new Producto("Accesorios", "Ratón Logitech", 39.99);
        Producto p13 = new Producto("Hogar", "Aspiradora Dyson", 499.99);
        Producto p14 = new Producto("Hogar", "Plancha Philips", 69.99);
        Producto p15 = new Producto("Deporte", "Bicicleta MTB", 299.00);
        Producto p16 = new Producto("Deporte", "Cinta de correr", 750.00);
        Producto p17 = new Producto("Videojuegos", "PlayStation 5", 499.00);
        Producto p18 = new Producto("Videojuegos", "Xbox Series X", 499.00);
        Producto p19 = new Producto("Videojuegos", "Nintendo Switch", 329.00);
        Producto p20 = new Producto("Libros", "Java Programming", 39.99);

        // Metemos los productos a la base de datos de Productos
        t.addDbProductos(p1);
        t.addDbProductos(p2);
        t.addDbProductos(p3);
        t.addDbProductos(p4);
        t.addDbProductos(p5);
        t.addDbProductos(p6);
        t.addDbProductos(p7);
        t.addDbProductos(p8);
        t.addDbProductos(p9);
        t.addDbProductos(p10);
        t.addDbProductos(p11);
        t.addDbProductos(p12);
        t.addDbProductos(p13);
        t.addDbProductos(p14);
        t.addDbProductos(p15);
        t.addDbProductos(p16);
        t.addDbProductos(p17);
        t.addDbProductos(p18);
        t.addDbProductos(p19);
        t.addDbProductos(p20);

        // Crear 5 ventas
        Venta v1 = new Venta(c1, "2025-06-01");
        v1.anadirProducto(p1);
        v1.anadirProducto(p7);

        Venta v2 = new Venta(c3, "2025-06-03");
        v2.anadirProducto(p12);
        v2.anadirProducto(p3);
        v2.anadirProducto(p20);

        Venta v3 = new Venta(c5, "2025-06-07");
        v3.anadirProducto(p20);

        Venta v4 = new Venta(c2, "2025-06-10");
        v4.anadirProducto(p2);
        v4.anadirProducto(p3);
        v4.anadirProducto(p18);

        Venta v5 = new Venta(c9, "2025-06-15");
        v5.anadirProducto(p5);
        v5.anadirProducto(p12);

        // Metemos las ventas a la base de datos de Ventas
        t.addDbVentas(v1);
        t.addDbVentas(v2);
        t.addDbVentas(v3);
        t.addDbVentas(v4);
        t.addDbVentas(v5);

        FuncionesMenu fun = new FuncionesMenu();
        Scanner sc = new Scanner(System.in);
        boolean salir = true;

        do {
            fun.menuPrincipal();
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1 -> {
                    boolean volver = true;
                    sc.nextLine();
                    do {
                        fun.menuGestClientes();
                        eleccion = sc.nextInt();
                        switch (eleccion) {
                            case 1 -> {
                                sc.nextLine();
                                System.out.println("VAMOS A PROCEDER AL ALTA DE CLIENTE");
                                System.out.println("Introduce el nombre: ");
                                String nombre = sc.nextLine();
                                System.out.println("Introduce el DNI: ");
                                String dni = sc.nextLine();
                                System.out.println("Introduce el teléfono: ");
                                String tlf = sc.nextLine();
                                System.out.println("Introduce el email: ");
                                String mail = sc.nextLine();
                                t.altaCliente(nombre,dni,tlf,mail);
                            }
                            case 2 -> {
                                System.out.println("VAMOS A PROCEDER AL DAR DE BAJA UN CLIENTE");
                                t.listarClientes();
                                System.out.println("Introduce el DNI del cliente: ");
                                sc.nextLine();
                                String dni = sc.nextLine();
                                t.darBajaCliente(dni);
                            }
                            case 3 -> {
                                System.out.println("VAMOS A MODIFICAR UN CLIENTE");
                                t.listarClientes();
                                System.out.println("Introduce el DNI del cliente: ");
                                sc.nextLine();
                                String dni = sc.nextLine();
                                t.modificarCliente(dni);
                            }
                            case 4 -> {
                                System.out.println("Introduce el DNI del cliente: ");
                                sc.nextLine();
                                String dni = sc.nextLine();
                                t.getClienteByDni(dni);
                            }
                            case 5 -> volver = false;
                            default -> System.out.println("Este no es una opción válida!");
                        }
                    } while(volver);
                }
                case 2 -> {
                    boolean volver = true;
                    sc.nextLine();
                    do {
                        fun.menuGestProductos();
                        eleccion = sc.nextInt();
                        switch (eleccion) {
                            case 1 -> {
                                sc.nextLine();
                                System.out.println("VAMOS DAR DE ALTA UN PRODUCTO");
                                System.out.println("Introduce su tipo: ");
                                String tipo = sc.nextLine();
                                System.out.println("Introduce su modelo: ");
                                String modelo = sc.nextLine();
                                System.out.println("Introduce su precio: ");
                                double precio = sc.nextDouble();
                                t.altaProducto(tipo, modelo, precio);
                            }
                            case 2 -> {
                                sc.nextLine();
                                System.out.println("VAMOS A DAR DE BAJA UN PRODUCTO");
                                t.listarProductos();
                                System.out.println("¿Cual es el nombre del modelo?");
                                String modelo = sc.nextLine();
                                t.bajaProducto(modelo);
                            }
                            case 3 -> {
                                sc.nextLine();
                                System.out.println("VAMOS A MODIFICAR UN PRODUCTO");
                                t.listarProductos();
                                System.out.println("¿Cual es el nombre del modelo?");
                                String modelo = sc.nextLine();
                                t.modificarProducto(modelo);
                            }
                            case 4 -> t.listarProductos();
                            case 5 -> {
                                sc.nextLine();
                                System.out.println("¿Cual es el nombre del producto?");
                                String nombre = sc.nextLine();
                                t.getProductoByNombre(nombre);
                            }
                            case 6 -> volver = false;
                            default -> System.out.println("Este no es una opción válida!");
                        }
                    } while(volver);
                }
                case 3 -> {
                    boolean volver = true;
                    sc.nextLine();
                    do {
                        fun.menuGestVentas();
                        eleccion = sc.nextInt();
                        switch (eleccion) {
                            case 1 -> {
                                sc.nextLine();
                                boolean exit = true;
                                do {
                                    Cliente cliente = t.seleccionCliente();
                                    if (cliente == null) {
                                        System.out.println("El cliente introducido no está en la besa de datos");
                                    } else {
                                        exit = false;
                                    }
                                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    Venta venta = new Venta(cliente, LocalDate.now().format(formato));
                                    Scanner scanner = new Scanner(System.in);
                                    System.out.println("===MENU DE SELLECCION DE PRODUCTO");
                                    System.out.println("1- Para seleccionar producto");
                                    System.out.println("2- Para salir a menu principal");
                                    int opc = scanner.nextInt();
                                    switch (opc) {
                                        case 1 -> {
                                            while (true) {
                                                Producto producto = t.seleccionProducto();
                                                if (producto == null) {
                                                    System.out.println("Saliendo del menú de selección de producto...");
                                                    break;
                                                }
                                                venta.anadirProducto(producto);
                                                System.out.println("Producto añadido correctamente.");
                                            }
                                        }
                                        case 2 -> exit = false;
                                        default -> System.out.println("La opción introducida no es válida");
                                    }
                                    t.nuevaVenta(venta);
                                } while (exit);
                            }
                            case 2 -> volver = false;
                            default -> System.out.println("Esta no es una opción válida!");
                        }
                    } while(volver);
                }
                case 4 -> {
                    boolean volver = true;
                    sc.nextLine();
                    do {
                        fun.menuMostrarVentas();
                        eleccion = sc.nextInt();
                        switch (eleccion) {
                            case 1 -> t.mostrarTotalVentas();
                            case 2 -> t.mostrarVentasPorCliente();
                            case 3 -> t.mostrarImporteTotalPorCLiente();
                            case 4 -> volver = false;
                            default -> System.out.println("Este no es una opción válida!");
                        }
                    } while(volver);
                }
                case 5 -> salir = false;
                default -> System.out.println("Este no es una opción válida!");
            }
        } while (salir);

    }
}
