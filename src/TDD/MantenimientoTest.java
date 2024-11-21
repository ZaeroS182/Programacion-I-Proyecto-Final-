package TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Mantenimiento;
import model.Vehiculo;

public class MantenimientoTest {

    private Mantenimiento mantenimiento;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        // Inicializar un objeto Vehiculo antes de cada prueba
        vehiculo = new Vehiculo("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020);
        mantenimiento = new Mantenimiento(vehiculo, "Cambio de aceite", 150.0);
    }

    @Test
    public void testConstructor() {
        assertNotNull(mantenimiento);
        assertEquals(5, mantenimiento.getConsecutivo()); // Verificar que el consecutivo se incrementa
        assertEquals("Cambio de aceite", mantenimiento.getCaracteristicas());
        assertEquals(150.0, mantenimiento.getPrecio());
        assertEquals("1234567890", mantenimiento.getVin()); // Verificar que el VIN es correcto
    }

    @Test
    public void testToString() {
        String informacion = mantenimiento.toString();
        assertEquals(informacion , mantenimiento.toString());
    }

    @Test
    public void testAñadirCaracteristicas() {
        mantenimiento.añadirCarac("Revisión de frenos");
        assertEquals("Cambio de aceite[Revisión de frenos]\n", mantenimiento.getCaracteristicas());
    }

    @Test
    public void testSetPrecio() {
        mantenimiento.setPrecio(200.0);
        assertEquals(200.0, mantenimiento.getPrecio());
    }

    @Test
    public void testSetVehiculo() {
        Vehiculo nuevoVehiculo = new Vehiculo("Toyota", "Corolla", "124465", "Rojo", 50000, 2020);
        mantenimiento.setVehiculo(nuevoVehiculo);
        assertEquals("124465", mantenimiento.getVin()); // Verificar que el VIN del nuevo vehículo es correcto
    }
}