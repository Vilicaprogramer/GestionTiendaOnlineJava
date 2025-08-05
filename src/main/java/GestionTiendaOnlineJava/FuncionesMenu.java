package GestionTiendaOnlineJava;

/**
 * Clase utilitaria para mostrar los distintos menús de la aplicación.
 * Contiene métodos estáticos que imprimen los menús en consola.
 */

public class FuncionesMenu {
    /**
     * Muestra el menú principal.
     */
    public static void menuPrincipal() {
        System.out.println("===MENÚ PRINCIPAL===");
        System.out.println("1. Gestión de clientes");
        System.out.println("2. Gestión de pedidos");
        System.out.println("3. Realizar venta");
        System.out.println("4. Mostrar ventas");
        System.out.println("5. Salir");
        System.out.println("¿Qué quieres hacer? \n Escribe el número: ");
    }

    /**
     * Muestra el menú de gestión de clientes.
     */
    public static void menuGestClientes() {
        System.out.println("===GESTIÓN DE CLIENTES===");
        System.out.println("1. Alta de cliente");
        System.out.println("2. Baja de cliente");
        System.out.println("3. Modificación de cliente");
        System.out.println("4. Buscar por DNI");
        System.out.println("5. Salir Menu Principal");
        System.out.println("¿Qué quieres hacer? \n Escribe el número: ");
    }

    /**
     * Muestra el menú de gestión de productos.
     */
    public static void menuGestProductos() {
        System.out.println("===GESTIÓN DE PRODUCTOS===");
        System.out.println("1. Alta de producto");
        System.out.println("2. Baja de producto");
        System.out.println("3. Modificación de producto");
        System.out.println("4. Listado de catálogo");
        System.out.println("5. Búsqueda por nombre de producto");
        System.out.println("6. Salir Menu Principal");
        System.out.println("¿Qué quieres hacer? \n Escribe el número: ");
    }

    /**
     * Muestra el menú para gestionar ventas.
     */
    public static void menuGestVentas() {
        System.out.println("===GESTIÓN DE VENTAS===");
        System.out.println("1. Crear una nueva venta");
        System.out.println("2. Salir Menu Principal");
        System.out.println("¿Qué quieres hacer? \n Escribe el número: ");
    }

    /**
     * Muestra el menú para consultar ventas realizadas.
     */
    public static void menuMostrarVentas() {
        System.out.println("===MOSTRAR VENTAS===");
        System.out.println("1. Mostrar todas las ventas realizadas");
        System.out.println("2. Mostrar ventas por cliente");
        System.out.println("3. Mostrar importe total de cada venta");
        System.out.println("4. Salir Menu Principal");
        System.out.println("¿Qué quieres hacer? \n Escribe el número: ");
    }
}
