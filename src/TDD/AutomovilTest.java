package TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ENUM.ENUMtipoCombustible;
import ENUM.ENUMtipoTraccion;
import ENUM.ENUMtipoTransmision;
import model.Automovil;

public class AutomovilTest {
    private Automovil automovil;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto Automovil antes de cada prueba
        automovil = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
    }

    @Test
    public void testConstructor() {
        assertEquals("Toyota", automovil.getMarca());
        assertEquals("Corolla", automovil.getModelo());
        assertEquals("1234567890", automovil.getVin());
        assertEquals("Rojo", automovil.getColor());
        assertEquals(50000, automovil.getKilometraje());
        assertEquals(2020, automovil.getYear());
        assertEquals(4, automovil.getNumeroPuertas());
        assertEquals(ENUMtipoTransmision.AUTOMATICA, automovil.getTipoTrasnmision());
        assertEquals(ENUMtipoCombustible.GASOLINA, automovil.getTipoCombustible());
        assertEquals(ENUMtipoTraccion.DELANTERA, automovil.getTipoTraccion());
    }

    @Test
    public void testSettersAndGetters() {
        automovil.setNumeroPuertas(2);
        automovil.setTipoTrasnmision(ENUMtipoTransmision.MANUAL);
        automovil.setTipoCombustible(ENUMtipoCombustible.DIESEL);
        automovil.setTipoTraccion(ENUMtipoTraccion.TRASERA);

        assertEquals(2, automovil.getNumeroPuertas());
        assertEquals(ENUMtipoTransmision.MANUAL, automovil.getTipoTrasnmision());
        assertEquals(ENUMtipoCombustible.DIESEL, automovil.getTipoCombustible());
        assertEquals(ENUMtipoTraccion.TRASERA, automovil.getTipoTraccion());
    }

    @Test
    public void testToString() {
        String informacion = "Automovil [numeroPuertas=4, tipoTrasnmision=AUTOMATICA, tipoCombustible=GASOLINA, tipoTraccion=DELANTERA]";
        assertEquals(informacion, automovil.toString());
    }
}