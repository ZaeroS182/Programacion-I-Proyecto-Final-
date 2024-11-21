package TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Cliente;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto Cliente antes de cada prueba
        cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
    }

    @Test
    public void testConstructor() {
        assertEquals("Juan Perez", cliente.getNombre());
        assertEquals("juan.perez@example.com", cliente.getCorreoElectronico());
        assertEquals("1234567890", cliente.getNumeroTelefonico());
        assertEquals("Calle 123", cliente.getDomicilio());
        assertEquals("C001", cliente.getId());
    }

    @Test
    public void testSettersAndGetters() {
        cliente.setNombre("Maria Lopez");
        cliente.setCorreoElectronico("maria.lopez@example.com");
        cliente.setNumeroTelefonico("0987654321");
        cliente.setDomicilio("Calle 742");
        cliente.setId("C002");

        assertEquals("Maria Lopez", cliente.getNombre());
        assertEquals("maria.lopez@example.com", cliente.getCorreoElectronico());
        assertEquals("0987654321", cliente.getNumeroTelefonico());
        assertEquals("Calle 742", cliente.getDomicilio());
        assertEquals("C002", cliente.getId());
    }

    @Test
    public void testToString() {
        String informacion = "Cliente [nombre=Juan Perez, correoElectronico=juan.perez@example.com, numeroTelefonico=1234567890, domicilio=Calle 123, id=C001]";
        assertEquals(informacion, cliente.toString());
    }
}