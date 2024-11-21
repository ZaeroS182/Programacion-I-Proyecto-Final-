package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Vehiculo;

public class VehiculoTest {

	private Vehiculo vehiculo;
	
	@BeforeEach
    public void setUp() {
        // Inicializa un objeto Vehiculo antes de cada prueba
        vehiculo = new Vehiculo("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020);
    }

    @Test
    public void testConstructor() {
        assertEquals("Toyota", vehiculo.getMarca());
        assertEquals("Corolla", vehiculo.getModelo());
        assertEquals("1234567890", vehiculo.getVin());
        assertEquals("Rojo", vehiculo.getColor());
        assertEquals(50000, vehiculo.getKilometraje());
        assertEquals(2020, vehiculo.getYear());
    }

    @Test
    public void testSettersAndGetters() {
        vehiculo.setMarca("Honda");
        vehiculo.setModelo("Civic");
        vehiculo.setVin("0987654321");
        vehiculo.setColor("Azul");
        vehiculo.setKilometraje(30000);
        vehiculo.setYear(2021);

        assertEquals("Honda", vehiculo.getMarca());
        assertEquals("Civic", vehiculo.getModelo());
        assertEquals("0987654321", vehiculo.getVin());
        assertEquals("Azul", vehiculo.getColor());
        assertEquals(30000, vehiculo.getKilometraje());
        assertEquals(2021, vehiculo.getYear());
    }

    @Test
    public void testTString() {
        String informacion = "Vehiculo [marca=Toyota, modelo=Corolla, vin=1234567890, color=Rojo, kilometraje=50000, year=2020]";
        assertEquals(informacion, vehiculo.tString());
    }

    @Test
    public void testReferencia() {
        String informacion = "[ marca: Toyota modelo: Corolla año: 2020 vin: 1234567890 ]";
        assertEquals(informacion, vehiculo.Referencia());
    }
}


