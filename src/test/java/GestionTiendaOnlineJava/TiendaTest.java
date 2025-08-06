package GestionTiendaOnlineJava;

import GestionTiendaOnlineJava.Tienda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TiendaTest {

    private Tienda tienda;
    private Cliente cliente;
    private Producto producto;
    private Venta venta;

    @BeforeEach
    void setUp() {
        tienda = new Tienda();
        cliente = new Cliente("Ana López", "98765432B", "600987654", "ana@example.com");
        producto = new Producto("Tablet", "Samsung Galaxy Tab", 300.0);
        venta = new Venta(cliente, "03/08/2025");
        venta.anadirProducto(producto);
    }

    @Test
    void testAddDbClientes() {
        tienda.addDbClientes(cliente);
        // Se comprueba indirectamente con búsqueda
        tienda.getClienteByDni("98765432B");
    }

    @Test
    void testAltaClienteYBusqueda() {
        tienda.altaCliente("Luis Pérez", "55555555Z", "612345678", "luis@example.com");
        tienda.getClienteByDni("55555555Z");
    }

    @Test
    void testAddDbProductos() {
        tienda.addDbProductos(producto);
        tienda.getProductoByNombre("Samsung Galaxy Tab");
    }

    @Test
    void testAltaProductoYBusqueda() {
        tienda.altaProducto("Smartphone", "iPhone 15", 1200.0);
        tienda.getProductoByNombre("iPhone 15");
    }

    @Test
    void testAddDbVentas() {
        tienda.addDbVentas(venta);
        tienda.mostrarTotalVentas(); // Validamos que no lanza errores
    }

    @Test
    void testNuevaVenta() {
        tienda.nuevaVenta(venta);
        tienda.mostrarTotalVentas(); // Solo confirmación de flujo correcto
    }
}
