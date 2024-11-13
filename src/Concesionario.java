

import java.util.ArrayList;

import model.Automovil;
import model.Camion;
import model.ENUMtipoCombustible;
import model.ENUMtipoTraccion;
import model.ENUMtipoTransmision;
import model.Motocicleta;
import model.Vehiculo;

public class Concesionario {
	private String nombre;
	private ArrayList<Cliente> listaClientes;
	private Inventario inventario;
	private Mantenimiento mantenimiento;
	
	public Concesionario (String nombre) {
		this.nombre = nombre;
		this.listaClientes = new ArrayList<>();
		this.inventario = new Inventario();
		this.mantenimiento = new Mantenimiento();	
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	
	// Metodos del inventario y gestion de vehiculos en el mismo.
	public String agregarVehiculoInv (Vehiculo V) {
		boolean estado = inventario.agregarVehiculo(V);
		String mensaje = "";
		if (estado == true) {
			mensaje = "vehiculo agregado correctamente";
		}else {
			mensaje = "vehiculo no agregado(ya existe)";
		}
		return mensaje;
	}
    
	public String EliminarVehiculoInv(String vin) {
		boolean estado = inventario.eliminarVehiculo(vin);
		String mensaje = "";
		if ( estado == true) {
			mensaje = "Vehiculo eliminado correctamente";
			
		}else {
			mensaje = "vehiculo no encontrado";
		}
		return mensaje;
	}
	
	public String buscarVehiculoInv(String vin) {
		Vehiculo v = inventario.buscarVehiculo(vin);
		String mensaje = "";
		if (v == null) {
			mensaje = "vehiculo no encontrado";
			
		}else if (v instanceof Motocicleta){
			
			Motocicleta m = (Motocicleta) v;
			mensaje = m.toString() + v.toString();
			
		}else if (v instanceof Automovil) {
			
			Automovil a = (Automovil) v;
			mensaje = a.toString() + v.toString();
			
		}else if (v instanceof Camion) {
			Camion c = (Camion) v;
			mensaje = c.toString() + v.toString();
		}
		
		return mensaje;
		
	}
	public String tipoVehiculo ( String vin) {
		return "";
	}
	
	public String ActualizarVehiculo (String marca, String modelo, String vin, String color, int kilometraje, int year,
			int numeroPuertas, ENUMtipoTransmision tipoTrasnmision, ENUMtipoCombustible tipoCombustible,
			ENUMtipoTraccion tipoTraccion) {
		Vehiculo v = inventario.buscarVehiculo(vin);
		Automovil a = (Automovil) v;
		String mensaje = "";
		
		
		
		return mensaje;
		
		
	}
	

}
