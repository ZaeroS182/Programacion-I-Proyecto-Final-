package TDD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ENUM.ENUMtipoCombustible;
import ENUM.ENUMtipoFreno;
import ENUM.ENUMtipoManillar;
import ENUM.ENUMtipoTraccion;
import ENUM.ENUMtipoTransmision;
import model.Automovil;
import model.Cliente;
import model.Mantenimiento;
import model.Motocicleta;
import model.Venta;
import model.Ventas;
import model.Vehiculo;

import java.time.LocalDate;

public class VentasTest {

    private Ventas ventas;
    private Venta venta1;
    private Venta venta2;

    @BeforeEach
    public void setUp() {
        ventas = new Ventas();
        Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        Cliente cliente2 = new Cliente("Natalia Suarez","natalia.suarez@example.com","312154846","Calle 456","C002");
        Vehiculo vehiculo1 = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        Vehiculo vehiculo2 = new Motocicleta("Yamaha", "YZF-R3", "1HGCM82633A123456", "Azul", 15000, 2021,
                ENUMtipoManillar.DEPORTIVO, 2, ENUMtipoFreno.DISCO, 321.0);
        venta1 = new Venta(cliente1, vehiculo1, 15000.00);
        venta2 = new Venta(cliente2, vehiculo2, 8000.00);
    }

    @Test
    public void testAgregarVenta() {
        assertTrue(ventas.agregarVenta(venta1));
        assertFalse(ventas.agregarVenta(venta1)); // No se debe agregar de nuevo
    }

    @Test
    public void testBuscarVentaPorId() {
        ventas.agregarVenta(venta1);
        ventas.agregarVenta(venta2);
        
        assertEquals(venta1, ventas.buscarVenta("C001"));
        assertNull(ventas.buscarVenta("3")); // Venta no existente
    }

    @Test
    public void testBuscarVentaPorVin() {
        ventas.agregarVenta(venta1);
        assertEquals(venta1, ventas.BuscarVenta("1234567890"));
        assertNull(ventas.BuscarVenta("VIN999")); // VIN no existente
    }

    @Test
    public void testBuscarVentaPorConsecutivo() {
        ventas.agregarVenta(venta1);
        assertEquals(venta1, ventas.bucarVenta(1));
        assertNull(ventas.bucarVenta(3)); // Consecutivo no existente
    }

	
	@Test
	public void testEliminarVentaPorConsecutivo() {
		Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
		Vehiculo vehiculo1 = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
		venta1 = new Venta(cliente1, vehiculo1, 15000.00);
	    ventas.agregarVenta(venta1);
	   
	    String resultado = ventas.eliminarVenta(venta1.getConsecutivo());
	    assertEquals("Venta Eliminada Exitosamente", resultado);
	
	    // Intentar eliminar la misma venta de nuevo
	    assertEquals("Venta no encontrada", ventas.eliminarVenta(1));
	}
	
	@Test
	public void testEliminarVentaPorVin() {
		Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
		Vehiculo vehiculo1 = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
		venta1 = new Venta(cliente1, vehiculo1, 15000.00);
	    ventas.agregarVenta(venta1);
	
	
	    String resultado = ventas.eliminarVenta("1234567890");
	    assertEquals("Venta Eliminada Exitosamente", resultado);
	
	    // Intentar eliminar la misma venta de nuevo
	    assertEquals("Venta no encontrada", ventas.eliminarVenta("1234"));
	}
	
	    
    
    @Test
    public void testHistorialCliente() {
        ventas.agregarVenta(venta1);
        ventas.agregarVenta(venta2);
      
        String historial = ventas.historialCliente("C001");
        assertTrue(historial.contains("C001")); // Verifica que el historial contenga la venta
        assertFalse(historial.contains("abc")); // Verifica que no contenga la otra venta
    }

    @Test
    public void testHistorialVentasPorTipo() {
        ventas.agregarVenta(venta1);
        ventas.agregarVenta(venta2);
        
        String historialMotocicleta = ventas.historialVentas(2);
        assertTrue(historialMotocicleta.contains("2")); // Verifica que contenga la venta de motocicleta
        assertFalse(historialMotocicleta.contains("abc")); // Verifica que no contenga la venta de automóvil
    }
    
    
    @Test
    public void testBuscarMantenimientos() {
        // Crear un mantenimiento y agregarlo a la lista
    	Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020);
        Mantenimiento mantenimiento1 = new Mantenimiento(vehiculo, "Cambio de aceite", 150.0);
        ventas.agregarMantenimiento(mantenimiento1);

        // Buscar el mantenimiento por VIN
        Mantenimiento encontrado = ventas.BuscarMantenimientos("1234567890");
        assertNotNull(encontrado);
        assertEquals("Cambio de aceite", encontrado.getCaracteristicas()); // 

        // Intentar buscar un VIN que no existe
        assertNull(ventas.BuscarMantenimientos("9999"));
    }
    
    @Test
    public void testAgregarMantenimiento() {
        // Crear un mantenimiento
    	Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020); 
        Mantenimiento mantenimiento1 = new Mantenimiento(vehiculo, "Cambio de aceite", 150.0);

        // Agregar el mantenimiento
        assertTrue(ventas.agregarMantenimiento(mantenimiento1)); // Debería ser true al agregar

        // Verificar que el mantenimiento se haya agregado correctamente
        Mantenimiento encontrado = ventas.BuscarMantenimientos("1234567890");
        assertNotNull(encontrado);
        assertEquals("Cambio de aceite", encontrado.getCaracteristicas());
    }

    @Test
    public void testHistorialMantenimiento() {
        // Crear y agregar mantenimientos
    	
    	Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020); 
    	Vehiculo vehiculo2 = new Vehiculo("Toyota", "Corolla", "124535", "Rojo", 50000, 2020); 
    	Vehiculo vehiculo3 = new Vehiculo("Toyota", "Corolla", "453656", "Rojo", 50000, 2020); 
    	Mantenimiento mantenimiento1 = new Mantenimiento(vehiculo, "Cambio de aceite", 150.0);
    	Mantenimiento mantenimiento2 = new Mantenimiento(vehiculo2, "Revisión general", 150.0);
    	Mantenimiento mantenimiento3 = new Mantenimiento(vehiculo3, "Cambio de aceite", 150.0);
        
        ventas.agregarMantenimiento(mantenimiento1);
        ventas.agregarMantenimiento(mantenimiento2);
        ventas.agregarMantenimiento(mantenimiento3);

        // Obtener el historial de mantenimientos para un VIN
        String historial = ventas.historialMantenimiento("1234");
        assertTrue(historial.contains("Cambio de aceite")); // Debería contener el primer mantenimiento
        assertTrue(historial.contains("Revisión general")); // Debería contener el segundo mantenimiento
        assertFalse(historial.contains("Cambio de frenos")); // No debería contener el mantenimiento de otro VIN
    }

    
}