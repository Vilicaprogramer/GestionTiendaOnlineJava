package GestionTiendaOnlineJava;

import GestionTiendaOnlineJava.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Juan Pérez", "12345678A", "600123456", "juan@email.com");
    }

    @Test
    void testGetNombre() {
        assertEquals("Juan Pérez", cliente.getNombre());
    }

    @Test
    void testGetDni() {
        assertEquals("12345678A", cliente.getDni());
    }

    @Test
    void testModificarNombre() {
        String nuevoNombre = "Ana García";
        String resultado = cliente.modificarNombre(nuevoNombre);
        assertEquals(nuevoNombre, resultado);
        assertEquals(nuevoNombre, cliente.getNombre());
    }

    @Test
    void testModificarDni() {
        String nuevoDni = "87654321B";
        String resultado = cliente.modificarDni(nuevoDni);
        assertEquals(nuevoDni, resultado);
        assertEquals(nuevoDni, cliente.getDni());
    }

    @Test
    void testModificarTelefono() {
        String nuevoTelefono = "611223344";
        String resultado = cliente.modificarTelefono(nuevoTelefono);
        assertEquals(nuevoTelefono, resultado);
    }

    @Test
    void testModificarEmail() {
        String nuevoEmail = "ana@correo.com";
        String resultado = cliente.modificarEmail(nuevoEmail);
        assertEquals(nuevoEmail, resultado);
    }

    @Test
    void testGetCliente() {
        String texto = cliente.getCliente();
        assertTrue(texto.contains("Juan Pérez"));
        assertTrue(texto.contains("12345678A"));
        assertTrue(texto.contains("600123456"));
        assertTrue(texto.contains("juan@email.com"));
    }
}

