package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Inventario;
import model.Vehiculo;

public class InventarioTest {
    private Inventario inventario;
    private Vehiculo vehiculo1;
    private Vehiculo vehiculo2;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto Inventario antes de cada prueba
        inventario = new Inventario();
        vehiculo1 = new Vehiculo("Toyota", "Corolla", "1HGCM82633A123456", "Rojo", 50000, 2020);
        vehiculo2 = new Vehiculo("Honda", "Civic", "1HGCM82633A654321", "Azul", 30000, 2021);
    }

    @Test
    public void testAgregarVehiculo() {
        assertTrue(inventario.agregarVehiculo(vehiculo1));
        assertTrue(inventario.agregarVehiculo(vehiculo2));
        assertFalse(inventario.agregarVehiculo(vehiculo1)); // Debería fallar porque ya está agregado
    }

    @Test
    public void testBuscarVehiculo() {
        inventario.agregarVehiculo(vehiculo1);
        inventario.agregarVehiculo(vehiculo2);

        assertEquals(vehiculo1, inventario.buscarVehiculo("1HGCM82633A123456"));
        assertEquals(vehiculo2, inventario.buscarVehiculo("1HGCM82633A654321"));
        assertNull(inventario.buscarVehiculo("VIN_NO_VALIDO")); // VIN no válido
    }

    @Test
    public void testEliminarVehiculo() {
        inventario.agregarVehiculo(vehiculo1);
        inventario.agregarVehiculo(vehiculo2);

        assertTrue(inventario.eliminarVehiculo("1HGCM82633A123456")); // Debería eliminar
        assertFalse(inventario.eliminarVehiculo("VIN_NO_VALIDO")); // VIN no válido
        assertNull(inventario.buscarVehiculo("1HGCM82633A123456")); // Verifica que fue eliminado
    }

    @Test
    public void testListarVehiculos() {
        inventario.agregarVehiculo(vehiculo1);
        inventario.agregarVehiculo(vehiculo2);

        String informacion = vehiculo1.Referencia() + "\n" + vehiculo2.Referencia() + "\n";
        assertEquals(informacion, inventario.listarVehiculos());
    }
}