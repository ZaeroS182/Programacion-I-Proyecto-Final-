package TDD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ENUM.ENUMtipoFreno;
import ENUM.ENUMtipoManillar;
import model.Motocicleta;

public class MotocicletaTest {
    private Motocicleta motocicleta;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto Motocicleta antes de cada prueba
        motocicleta = new Motocicleta("Yamaha", "YZF-R3", "1HGCM82633A123456", "Azul", 15000, 2021,
                ENUMtipoManillar.DEPORTIVO, 2, ENUMtipoFreno.DISCO, 321.0);
    }

    @Test
    public void testConstructor() {
        assertEquals("Yamaha", motocicleta.getMarca());
        assertEquals("YZF-R3", motocicleta.getModelo());
        assertEquals("1HGCM82633A123456", motocicleta.getVin());
        assertEquals("Azul", motocicleta.getColor());
        assertEquals(15000, motocicleta.getKilometraje());
        assertEquals(2021, motocicleta.getYear());
        assertEquals(ENUMtipoManillar.DEPORTIVO, motocicleta.getTipoManillar());
        assertEquals(2, motocicleta.getNumeroRuedas());
        assertEquals(ENUMtipoFreno.DISCO, motocicleta.getTipoFreno());
        assertEquals(321.0, motocicleta.getCilindrada());
    }

    @Test
    public void testSettersAndGetters() {
        motocicleta.setTipoManillar(ENUMtipoManillar.CRUZADO);
        motocicleta.setNumeroRuedas(3);
        motocicleta.setTipoFreno(ENUMtipoFreno.ABS);
        motocicleta.setCilindrada(400.0);

        assertEquals(ENUMtipoManillar.CRUZADO, motocicleta.getTipoManillar());
        assertEquals(3, motocicleta.getNumeroRuedas());
        assertEquals(ENUMtipoFreno.ABS, motocicleta.getTipoFreno());
        assertEquals(400.0, motocicleta.getCilindrada());
    }

    @Test
    public void testToString() {
        String informacion = "Motocicleta [tipoManillar=DEPORTIVO, numeroRuedas=2, tipoFreno=DISCO, cilindrada=321.0]";
        assertEquals(informacion, motocicleta.toString());
    }
}