package TDD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Cliente;
import model.Vehiculo;
import model.Venta;

import java.time.LocalDate;

public class VentaTest {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Venta venta;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto Cliente y Vehiculo antes de cada prueba
        cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle Falsa 123", "C001");
        vehiculo = new Vehiculo("Toyota", "Corolla", "1HGCM82633A123456", "Rojo", 50000, 2020);
        venta = new Venta(cliente, vehiculo, 20000.00);
    }

    @Test
    public void testConstructor() {
        assertEquals(cliente, venta.getCliente());
        assertEquals(vehiculo, venta.getVehiculo());
        assertEquals(20000.00, venta.getPrecio());
        assertEquals(LocalDate.now(), venta.getFecha());
        assertEquals(cliente.getId(), venta.getId());
    }

    @Test
    public void testGetConsecutivo() {
        // Verifica que el consecutivo se asigna correctamente
        int consecutivoInicial = venta.getConsecutivo();
        Venta otraVenta = new Venta(cliente, vehiculo, 25000.00);
        assertNotEquals(consecutivoInicial, otraVenta.getConsecutivo());
    }

    @Test
    public void testSettersAndGetters() {
        Cliente nuevoCliente = new Cliente("Maria Lopez", "maria.lopez@example.com", "0987654321", "Avenida Siempre Viva 742", "C002");
        Vehiculo nuevoVehiculo = new Vehiculo("Honda", "Civic", "1HGCM82633A654321", "Azul", 30000, 2021);

        venta.setCliente(nuevoCliente);
        venta.setVehiculo(nuevoVehiculo);
        venta.setPrecio(22000.00);

        assertEquals(nuevoCliente, venta.getCliente());
        assertEquals(nuevoVehiculo, venta.getVehiculo());
        assertEquals(22000.00, venta.getPrecio());
    }

    @Test
    public void testToString() {
        String informacion = "Venta [cliente: Juan Perezid :C001, vehiculo=1HGCM82633A123456Toyota, fecha=" + venta.getFecha() + ", precio=20000.0, consecutivo=" + venta.getConsecutivo() + "]";
        assertEquals(informacion, venta.toString());
    }
}