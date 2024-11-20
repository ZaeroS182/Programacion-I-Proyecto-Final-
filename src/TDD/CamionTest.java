package TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ENUM.ENUMtipoCarga;
import model.Camion;

public class CamionTest {
    private Camion camion;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto Camion antes de cada prueba
        camion = new Camion("Volvo", "FH", "1HGCM82633A123456", "Blanco", 120000, 2020,
                20000.0, ENUMtipoCarga.RIGIDO, 12.5, 4);
    }

    @Test
    public void testConstructor() {
        assertEquals("Volvo", camion.getMarca());
        assertEquals("FH", camion.getModelo());
        assertEquals("1HGCM82633A123456", camion.getVin());
        assertEquals("Blanco", camion.getColor());
        assertEquals(120000, camion.getKilometraje());
        assertEquals(2020, camion.getYear());
        assertEquals(20000.0, camion.getCapacidadCarga());
        assertEquals(ENUMtipoCarga.RIGIDO, camion.getTipoCarga());
        assertEquals(12.5, camion.getLongitud());
        assertEquals(4, camion.getNumeroEjes());
    }

    @Test
    public void testSettersAndGetters() {
        camion.setCapacidadCarga(25000.0);
        camion.setTipoCarga(ENUMtipoCarga.ARTICULADO);
        camion.setLongitud(14.0);
        camion.setNumeroEjes(6);

        assertEquals(25000.0, camion.getCapacidadCarga());
        assertEquals(ENUMtipoCarga.ARTICULADO, camion.getTipoCarga());
        assertEquals(14.0, camion.getLongitud());
        assertEquals(6, camion.getNumeroEjes());
    }

    @Test
    public void testToString() {
        String informacion = "Camion [capacidadCarga=20000.0, tipoCarga=RIGIDO, longitud=12.5, numeroEjes=4]";
        assertEquals(informacion, camion.toString());
    }
}