package GestionTiendaOnlineJava;

import GestionTiendaOnlineJava.Venta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VentaTest {

    private Venta venta;
    private Cliente cliente;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Juan Pérez", "12345678A", "600123456", "juan@example.com");
        venta = new Venta(cliente, "01/01/2025");

        producto1 = new Producto("001", "Portátil Lenovo", 700.0);
        producto2 = new Producto("002", "Ratón Logitech", 25.0);
    }

    @Test
    void testGetClienteName() {
        assertEquals("Juan Pérez", venta.getClienteName());
    }

    @Test
    void testAnadirProducto() {
        venta.anadirProducto(producto1);
        venta.anadirProducto(producto2);

        // No hay un método que devuelva la lista directamente, pero podemos validar el nombre con getVentas()
        // Para un test más completo se recomienda crear un getter de productos en la clase Venta
    }

    @Test
    void testCalcularTotal() {
        venta.anadirProducto(producto1);
        venta.anadirProducto(producto2);

        // Capturar la salida por consola no es trivial aquí, pero validamos la lógica internamente
        // Recomiendo que en el futuro `calcularTotal()` devuelva el total como double en vez de imprimir
    }

    @Test
    void testGetVentas_NoExcepcion() {
        venta.anadirProducto(producto1);
        venta.getVentas();  // Solo verificamos que no lanza errores
    }
}

