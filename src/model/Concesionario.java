package model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import ENUM.ENUMtipoCarga;
import ENUM.ENUMtipoCombustible;
import ENUM.ENUMtipoFreno;
import ENUM.ENUMtipoManillar;
import ENUM.ENUMtipoTraccion;
import ENUM.ENUMtipoTransmision;
import ENUM.ENUMtipoVehiculo;

public class Concesionario {
	private String nombre;
	private ArrayList<Cliente> listaClientes;
	private Inventario inventario;
	private Mantenimientos mantenimiento;
	private Ventas ventas;
	
	public Concesionario (String nombre) {
		this.nombre = nombre;
		this.listaClientes = new ArrayList<>();
		this.inventario = new Inventario();
		this.mantenimiento = new Mantenimientos();	
		this.ventas = new Ventas ();
		
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

	public Mantenimientos getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimientos mantenimiento) {
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
    
	public String eliminarVehiculoInv(String vin) {
		boolean estado = inventario.eliminarVehiculo(vin);
		String mensaje = "";
		if ( estado == true) {
			mensaje = "Vehiculo eliminado correctamente";
			
		}else {
			mensaje = "vehiculo no encontrado";
		}
		return mensaje;
	}
	
	public boolean existeVin(String vin) {
		Vehiculo v = inventario.buscarVehiculo(vin);
		if(v == null) {
			return false;
		}

		return true;
	}
	public Vehiculo getVehiculoInv(String vin) {
		return inventario.buscarVehiculo(vin);
	}
	
	public String buscarVehiculoInv(String vin) {
		Vehiculo v = getVehiculoInv(vin);
		String mensaje = "";
		if (v == null) {
			mensaje = "vehiculo no encontrado";
			
		}else if (v instanceof Motocicleta){
			
			Motocicleta m = (Motocicleta) v;
			mensaje = m.toString() + v.tString();
			
		}else if (v instanceof Automovil) {
			
			Automovil a = (Automovil) v;
			mensaje = a.toString() + v.tString();
			
		}else if (v instanceof Camion) {
			Camion c = (Camion) v;
			mensaje = c.toString() + v.tString();
		}
		
		return mensaje;
		
	}

	public ENUMtipoVehiculo tipoVehiculo ( String vin) {
		Vehiculo v = inventario.buscarVehiculo(vin);
		if (v instanceof Automovil) {
			return ENUMtipoVehiculo.AUTOMOVIL;
		} else if(v instanceof Motocicleta) {
			return ENUMtipoVehiculo.MOTOCICLETA;
		} else if (v instanceof Camion) {
			return ENUMtipoVehiculo.CAMION;
		}
		return null;
		
		
	}


	
	public String actualizarVehiculo (String marca, String modelo, String vin, String color, int kilometraje, int year,
			int numeroPuertas, ENUMtipoTransmision tipoTrasnmision, ENUMtipoCombustible tipoCombustible,
			ENUMtipoTraccion tipoTraccion, String nuevoVin) {
		
		Vehiculo v = inventario.buscarVehiculo(vin);
		Automovil a = (Automovil) v;
		
		a.setColor(color);
		a.setKilometraje(kilometraje);
		a.setMarca(marca);
		a.setModelo(modelo);
		a.setNumeroPuertas(numeroPuertas);
		a.setTipoCombustible(tipoCombustible);
		a.setTipoTraccion(tipoTraccion);
		a.setTipoTrasnmision(tipoTrasnmision);
		a.setVin(nuevoVin);
		a.setYear(year);
		String mensaje = "vehiculo actualizado";
		
		
		return mensaje;	
	}
	
	public String actualizarVehiculo (String marca, String modelo, String vin, String color, int kilometraje, int year,
			double capacidadCarga, ENUMtipoCarga tipoCarga, double longitud, int numeroEjes, String nuevoVin) {
		
		Vehiculo v = inventario.buscarVehiculo(vin);
		Camion c = (Camion) v;
		c.setCapacidadCarga(capacidadCarga);
		c.setColor(color);
		c.setKilometraje(kilometraje);
		c.setLongitud(longitud);
		c.setMarca(marca);
		c.setModelo(modelo);
		c.setNumeroEjes(numeroEjes);
		c.setTipoCarga(tipoCarga);
		c.setVin(nuevoVin);
		c.setYear(year);
		String mensaje = "vehiculo actualizado";
		return mensaje;
	}
	public String actualizarVehiculo (String marca, String modelo, String vin, String color, int kilometraje, int year,
			ENUMtipoManillar tipoManillar, int numeroRuedas, ENUMtipoFreno tipoFreno, double cilindrada, String nuevoVin) {
		Vehiculo v = inventario.buscarVehiculo(vin);
		Motocicleta m = (Motocicleta) v;
		m.setCilindrada(cilindrada);
		m.setColor(color);
		m.setKilometraje(kilometraje);
		m.setMarca(marca);
		m.setModelo(modelo);
		m.setNumeroRuedas(numeroRuedas);
		m.setTipoFreno(tipoFreno);
		m.setTipoManillar(tipoManillar);
		m.setVin(nuevoVin);
		m.setCilindrada(cilindrada);
		String mensaje = "vehiculo actualizado";
		return mensaje;
	}
	
	public String listarVehiculosInv () {
		return inventario.listarVehiculos();
	}



	// metodos para la gestion de clientes

	public Boolean buscarId(String id) {
		for(Cliente c : this.listaClientes) {
			if(id.equalsIgnoreCase(c.getId())) {
				return true;
			}
			
		}
		return false;

	}

	public void agregarCliente(Cliente c) {
		this.listaClientes.add(c);

	}

	public Cliente buscarCliente(String id) {
		for(Cliente c: this.listaClientes) {
			if(id.equals(c.getId())) {
				return c;
			}
		}

		return null;
	}

	public void eliminarCliente(Cliente c) {
		this.listaClientes.remove(c);

	}

	public String listarClientes() {
		String lista = "";
		int contador = 1;
		for (Cliente cliente : this.listaClientes) {
			lista += contador + ". " + cliente.getNombre() + "\n";
			contador++;
		}
		return lista;

	}
	
	// metodos Ventas
	
	public String agregarVenta (Venta venta) {
		boolean v = ventas.agregarVenta(venta);
		if (v== true) {
			inventario.eliminarVehiculo(venta.getVin());
			return "Venta exitosa";
		}
	
		return "";
		
	}
	
	public String historialCliente (String id) {
		return ventas.historialCliente(id);
				
	}
	
	public String getVentasTipoV (int valor) {
		return ventas.historialVentas(valor);
	}
	

	public String getVentasFecha (LocalDate fecha) {

		return ventas.historialVentas(fecha);
	}
	
}
	
