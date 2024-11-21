package TDD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Mantenimientos;
import model.Vehiculo;

public class MantenimientosTest {

    private Mantenimientos mantenimientos;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        // Inicializar la clase Mantenimientos antes de cada prueba
        mantenimientos = new Mantenimientos();
        vehiculo = new Vehiculo("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020); 
    }

    @Test
    public void testAgregarVehiculo() {
        // Agregar un vehículo
        assertTrue(mantenimientos.agregarVehiculo(vehiculo)); // Debería ser true al agregar

        // Intentar agregar el mismo vehículo nuevamente
        assertFalse(mantenimientos.agregarVehiculo(vehiculo)); // Debería ser false ya que ya existe
    }

    @Test
    public void testBuscarVehiculo() {
        // Agregar un vehículo
        mantenimientos.agregarVehiculo(vehiculo);

        // Buscar el vehículo por VIN
        Vehiculo encontrado = mantenimientos.buscarVehiculo("1234567890");
        assertNotNull(encontrado);
        assertEquals("1234567890", encontrado.getVin()); // Verificar que el VIN es correcto

        // Intentar buscar un vehículo que no existe
        assertNull(mantenimientos.buscarVehiculo("9999"));
    }

    @Test
    public void testEliminarVehiculo() {
        // Agregar un vehículo
        mantenimientos.agregarVehiculo(vehiculo);

        // Eliminar el vehículo
        assertTrue(mantenimientos.eliminarVehiculo("1234567890")); // Debería ser true al eliminar

        // Intentar eliminar un vehículo que no existe
        assertFalse(mantenimientos.eliminarVehiculo("9999")); // Debería ser false
    }

    @Test
    public void testListarVehiculos() {
        // Agregar vehículos
        Vehiculo vehiculo2 = new Vehiculo("Toyota", "Corolla", "3825456", "Azul", 50000, 2020);
        mantenimientos.agregarVehiculo(vehiculo);
        mantenimientos.agregarVehiculo(vehiculo2);

        // Listar vehículos
        String listado = mantenimientos.listarVehiculos();
        assertTrue(listado.contains("1234")); // Debería contener el VIN del primer vehículo
        assertTrue(listado.contains("5678")); // Debería contener el VIN del segundo vehículo
    }

    @Test
    public void testListarVehiculosVacio() {
        // Listar vehículos cuando no hay ninguno
        String listado = mantenimientos.listarVehiculos();
        assertEquals("", listado); // Debería ser vacío
    }
}