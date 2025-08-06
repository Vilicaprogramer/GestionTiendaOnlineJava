package GestionTiendaOnlineJava;

import GestionTiendaOnlineJava.FuncionesMenu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class FuncionesMenuTest {

    @Test
    void testMenuPrincipal() {
        assertDoesNotThrow(FuncionesMenu::menuPrincipal);
    }

    @Test
    void testMenuGestClientes() {
        assertDoesNotThrow(FuncionesMenu::menuGestClientes);
    }

    @Test
    void testMenuGestProductos() {
        assertDoesNotThrow(FuncionesMenu::menuGestProductos);
    }

    @Test
    void testMenuGestVentas() {
        assertDoesNotThrow(FuncionesMenu::menuGestVentas);
    }

    @Test
    void testMenuMostrarVentas() {
        assertDoesNotThrow(FuncionesMenu::menuMostrarVentas);
    }
}

