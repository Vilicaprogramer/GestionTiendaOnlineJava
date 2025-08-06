package GestionTiendaOnlineJava;

import GestionTiendaOnlineJava.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("ModeloX", "Electrónica", 199.99);
    }

    @Test
    void testGetModelo() {
        assertEquals("ModeloX", producto.getModelo());
    }

    @Test
    void testGetTipo() {
        assertEquals("Electrónica", producto.getTipo());
    }

    @Test
    void testGetPrecio() {
        assertEquals(199.99, producto.getPrecio(), 0.001);
    }

    @Test
    void testModificarModelo() {
        String nuevoModelo = "ModeloY";
        assertEquals(nuevoModelo, producto.modificarModelo(nuevoModelo));
        assertEquals(nuevoModelo, producto.getModelo());
    }

    @Test
    void testModificarTipo() {
        String nuevoTipo = "Hogar";
        assertEquals(nuevoTipo, producto.modificarTipo(nuevoTipo));
        assertEquals(nuevoTipo, producto.getTipo());
    }

    @Test
    void testModificarPrecio() {
        double nuevoPrecio = 249.99;
        assertEquals(nuevoPrecio, producto.modificarPrecio(nuevoPrecio), 0.001);
        assertEquals(nuevoPrecio, producto.getPrecio(), 0.001);
    }

    @Test
    void testGetProducto() {
        String descripcion = producto.getProducto();
        assertNotNull(descripcion);
        assertTrue(descripcion.contains("ModeloX"));
        assertTrue(descripcion.contains("Electrónica"));
        assertTrue(descripcion.contains("199.99"));
    }

    @Test
    void testModificarPrecioNegativo() {
        double precioNegativo = -50.0;
        double resultado = producto.modificarPrecio(precioNegativo);
        assertEquals(precioNegativo, resultado); // Ajusta si tu lógica lanza excepciones o corrige internamente
    }
}

