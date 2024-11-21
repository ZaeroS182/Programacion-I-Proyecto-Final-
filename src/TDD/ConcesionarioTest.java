package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ENUM.ENUMtipoCarga;
import ENUM.ENUMtipoCombustible;
import ENUM.ENUMtipoFreno;
import ENUM.ENUMtipoManillar;
import ENUM.ENUMtipoTraccion;
import ENUM.ENUMtipoTransmision;
import ENUM.ENUMtipoVehiculo;
import model.Automovil;
import model.Camion;
import model.Cliente;
import model.Concesionario;
import model.Motocicleta;
import model.Vehiculo;
import model.Venta;

public class ConcesionarioTest {

    private Concesionario concesionario;

    @BeforeEach
    public void setUp() {
        // Inicializar el concesionario antes de cada prueba
        concesionario = new Concesionario("Concesionario de Prueba");
    }

    // Pruebas para vehículos
    @Test
    public void testAgregarVehiculoInv() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        String resultado = concesionario.agregarVehiculoInv(vehiculo);
        assertEquals("vehiculo agregado correctamente", resultado);

        // Intentar agregar el mismo vehículo
        String resultadoDuplicado = concesionario.agregarVehiculoInv(vehiculo);
        assertEquals("vehiculo no agregado(ya existe)", resultadoDuplicado);
    }

    @Test
    public void testEliminarVehiculoInv() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoInv(vehiculo);

        String resultado = concesionario.eliminarVehiculoInv("1234567890");
        assertEquals("Vehiculo eliminado correctamente", resultado);

        // Intentar eliminar un vehículo que no existe
        String resultadoNoEncontrado = concesionario.eliminarVehiculoInv("5678");
        assertEquals("vehiculo no encontrado", resultadoNoEncontrado);
    }

    @Test
    public void testBuscarVehiculoInv() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoInv(vehiculo);

        String resultado = concesionario.buscarVehiculoInv("1234567890");
        assertTrue(resultado.contains("Toyota")); // Verifica que el vehículo se encuentre
    }

    @Test
    public void testActualizarVehiculo() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoInv(vehiculo);

        String resultado = concesionario.actualizarVehiculo("Toyota", "Corolla", "1234567890", "Azul", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA,"123546");
        assertEquals("vehiculo actualizado", resultado);

        String buscarResultado = concesionario.buscarVehiculoInv("123546");
        assertTrue(buscarResultado.contains("Azul")); // Verifica que el color se haya actualizado
    }

    @Test
    public void testExisteVin() {
        // Crear un vehículo y agregarlo al inventario
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoInv(vehiculo);

        // Verificar que el VIN existe
        assertTrue(concesionario.existeVin("1234567890"));

        // Verificar que un VIN que no existe devuelve false
        assertFalse(concesionario.existeVin("5678"));
    }
    
    @Test
    public void testGetVehiculoInv() {
        // Crear un vehículo y agregarlo al inventario
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoInv(vehiculo);

        // Verificar que el vehículo se puede obtener por su VIN
        Vehiculo encontrado = concesionario.getVehiculoInv("1234567890");
        assertNotNull(encontrado);
        assertEquals("Toyota", encontrado.getMarca());
        assertEquals("Corolla", encontrado.getModelo());

        // Verificar que un VIN que no existe devuelve null
        Vehiculo noEncontrado = concesionario.getVehiculoInv("5678");
        assertNull(noEncontrado);
    }

    @Test
    public void testTipoVehiculo() {
        // Crear diferentes tipos de vehículos
        Vehiculo automovil = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        Vehiculo motocicleta = new Motocicleta("Yamaha", "YZF-R3", "3254645", "Azul", 15000, 2021,
                ENUMtipoManillar.DEPORTIVO, 2, ENUMtipoFreno.DISCO, 321.0);
        Vehiculo camion = new Camion("Volvo", "FH", "1HGCM82633A123456", "Blanco", 120000, 2020,
                20000.0, ENUMtipoCarga.RIGIDO, 12.5, 4);

        // Agregar vehículos al inventario
        concesionario.agregarVehiculoInv(automovil);
        concesionario.agregarVehiculoInv(motocicleta);
        concesionario.agregarVehiculoInv(camion);

        // Verificar que el tipo de vehículo sea correcto
        assertEquals(ENUMtipoVehiculo.AUTOMOVIL, concesionario.tipoVehiculo("1234567890"));
        assertEquals(ENUMtipoVehiculo.MOTOCICLETA, concesionario.tipoVehiculo("3254645"));
        assertEquals(ENUMtipoVehiculo.CAMION, concesionario.tipoVehiculo("1HGCM82633A123456"));

        // Verificar que un VIN que no existe devuelve null
        assertNull(concesionario.tipoVehiculo("0000"));
    }
    
    // Pruebas para clientes
    @Test
    public void testAgregarCliente() {
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        concesionario.agregarCliente(cliente);

        Cliente encontrado = concesionario.buscarCliente("C001");
        assertNotNull(encontrado);
        assertEquals("Juan Perez", encontrado.getNombre());
    }

    @Test
    public void testEliminarCliente() {
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        concesionario.agregarCliente(cliente);

        concesionario.eliminarCliente(cliente);
        Cliente encontrado = concesionario.buscarCliente("C001");
        assertNull(encontrado);
    }

    @Test
    public void testListarClientes() {
        Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        Cliente cliente2 = new Cliente("Natalia Suarez","natalia.suarez@example.com","312154846","Calle 456","C002");
        concesionario.agregarCliente(cliente1);
        concesionario.agregarCliente(cliente2);

        String lista = concesionario.listarClientes();
        assertTrue(lista.contains("Juan Perez"));
        assertTrue(lista.contains("Natalia Suarez"));
    }

    @Test
    public void testBuscarId() {
    	Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        Cliente cliente2 = new Cliente("Natalia Suarez","natalia.suarez@example.com","312154846","Calle 456","C002");
        concesionario.agregarCliente(cliente1);
        concesionario.agregarCliente(cliente2);
    	
        // Verificar que se puede encontrar un ID existente
        assertTrue(concesionario.buscarId("C001"));
        assertTrue(concesionario.buscarId("C002"));

        // Verificar que no se puede encontrar un ID inexistente
        assertFalse(concesionario.buscarId("789"));
        assertFalse(concesionario.buscarId("abc"));
    }

    @Test
    public void testBuscarCliente() {
    	Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        concesionario.agregarCliente(cliente1);
        
        // Verificar que se puede encontrar un cliente existente
        Cliente encontrado = concesionario.buscarCliente("C001");
        assertNotNull(encontrado);
        assertEquals("Juan Perez", encontrado.getNombre());


        // Verificar que no se puede encontrar un cliente inexistente
        assertNull(concesionario.buscarCliente("789"));
    }
    
    // Pruebas para mantenimientos
    @Test
    public void testAgregarVehiculoMant() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        String resultado = concesionario.agregarVehiculoMant(vehiculo);
        assertEquals("vehiculo agregado correctamente", resultado);

 // Intentar agregar el mismo vehículo
        String resultadoDuplicado = concesionario.agregarVehiculoMant(vehiculo);
        assertEquals("vehiculo no agregado(ya existe)", resultadoDuplicado);
    }

    @Test
    public void testEliminarVehiculoMant() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoMant(vehiculo);

        String resultado = concesionario.eliminarVehiculoMant("1234567890");
        assertEquals("Vehiculo eliminado correctamente", resultado);

        // Intentar eliminar un vehículo que no existe
        String resultadoNoEncontrado = concesionario.eliminarVehiculoMant("5678");
        assertEquals("vehiculo no encontrado", resultadoNoEncontrado);
    }

    @Test
    public void testBuscarVehiculoMant() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoMant(vehiculo);

        String resultado = concesionario.buscarVehiculoMant("1234567890");
        assertTrue(resultado.contains("Toyota")); // Verifica que el vehículo se encuentre
    }

    @Test
    public void testActualizarVehiculoMant() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoMant(vehiculo);

        String resultado = concesionario.actualizarVehiculoMant("Toyota", "Corolla", "1234567890", "Azul", 12000, 2021, 4, 
                ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA,"1234567890");
        assertEquals("vehiculo actualizado", resultado);

        String buscarResultado = concesionario.buscarVehiculoMant("1234567890");
        assertTrue(buscarResultado.contains("Azul")); // Verifica que el color se haya actualizado
    }

    // Pruebas para ventas
    @Test
    public void testAgregarVenta() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
       
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        concesionario.agregarVehiculoInv(vehiculo);
        Venta venta = new Venta(cliente, vehiculo, 200000);

        String resultado = concesionario.agregarVenta(venta);
        assertEquals("Venta exitosa", resultado);
    }

    @Test
    public void testEliminarVenta() {
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        concesionario.agregarVehiculoInv(vehiculo);
        Venta venta = new Venta(cliente, vehiculo, 200000);
        concesionario.agregarVenta(venta);
        
        String resultado = concesionario.eliminarVenta("1234567890", 2);
        System.out.println(venta.getConsecutivo());
        assertEquals("Venta Eliminada Exitosamente", resultado);
    }

    @Test
    public void testHistorialCliente() {
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@example.com", "1234567890", "Calle 123", "C001");
        concesionario.agregarCliente(cliente);
        Vehiculo vehiculo = new Automovil("Toyota", "Corolla", "1234567890", "Rojo", 50000, 2020,
                4, ENUMtipoTransmision.AUTOMATICA, ENUMtipoCombustible.GASOLINA, ENUMtipoTraccion.DELANTERA);
        concesionario.agregarVehiculoInv(vehiculo);
        Venta venta = new Venta(cliente, vehiculo, 200000);
        concesionario.agregarVenta(venta);
        System.out.println(venta.getId());
        String historial = concesionario.historialCliente("C001");
        assertTrue(historial.contains("Toyota")); // Verifica que el historial contenga el vehículo vendido
    }
}