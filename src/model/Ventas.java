package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;



public class Ventas {
	private ArrayList<Venta> ventas;
	private ArrayList<Mantenimiento> registroMantenimientos;
	public Ventas() {
		this.ventas = new ArrayList<>();
		this.registroMantenimientos = new ArrayList<>();
	}

	public Venta buscarVenta(String id) {
		for (Venta v : ventas) {
			if (v.getId().equals(id)) {
				return v;
			}
		}
		return null;

	}

	public Venta BuscarVenta(String vin) {
		for (Venta v : ventas) {
			if (v.getVin().equals(vin)) {
				return v;

			}
		}
		return null;
	}

	public Venta bucarVenta(int c) {
		for (Venta v : ventas) {
			if (v.getConsecutivo() == c) {
				return v;
			}
		}
		return null;

	}

	public Venta bucarVenta(Date fecha) {
		for (Venta v : ventas) {
			if (v.getFecha().equals(fecha))
				;
			{
				return v;
			}
		}
		return null;

	}

	public boolean agregarVenta(Venta venta) {
		Venta v = BuscarVenta(venta.getVin());
		if (v == null) {
			ventas.add(venta);
			return true;
		}
		return false;
	}

	public String historialCliente(String id) {
		String mensaje = "";
		for (Venta v : ventas) {
			if (v.getId().equals(id)) {
				mensaje += v.toString() + "\n";
			}
		}
		return mensaje;
	}

	public String historialVentas(int valor) {
		switch (valor) {
		case 1: {
			String mensaje = "";
			for (Venta v : ventas) {
				Vehiculo c = v.getVehiculo();
				if (c instanceof Motocicleta) {
					mensaje += v.toString() + "\n";
					return mensaje;
				}
			}
		}
		case 2: {
			String mensaje = "";
			for (Venta v : ventas) {
				Vehiculo c = v.getVehiculo();
				if (c instanceof Automovil) {
					mensaje += v.toString() + "\n";
					return mensaje;


				}
			}
		}
		case 3: {
			String mensaje = "";
			for (Venta v : ventas) {
				Vehiculo c = v.getVehiculo();
				if (c instanceof Camion) {
					mensaje += v.toString() + "\n";
					return mensaje;

		
						}
		
					}
				}
			}
		return "";
		
		
		}
	


	
	public String historialVentas(LocalDate fecha) {

		String mensaje = "";
		for (Venta v : ventas) {
			if (v.getFecha().equals(fecha)) {
				mensaje += v.toString() + "\n";
			}
		}
		return mensaje;

	}
	
	public String eliminarVenta (int consecutivo) {
		for (Venta v : ventas) {
			if (v.getConsecutivo() == consecutivo) {
				ventas.remove(v);
				return  "Venta Eliminada Exitosamente";
			}
		}
		return "Venta no encontrada";
	}
	public String eliminarVenta (String vin) {
		for (Venta v : ventas) {
			if (v.getVin().equals(vin)) {
				ventas.remove(v);
				return  "Venta Eliminada Exitosamente";
			}
		}
		return "Venta no encontrada";
	}
	
	//metodos de mantenimiento
	
	public Mantenimiento BuscarMantenimientos (String vin) {
		for (Mantenimiento m : registroMantenimientos) {
			if (m.getVin().equals(vin)) {
				return m;

			}
		}
		return null;
	}
	
	
	public void agregarMantenimiento(Mantenimiento m) {
			registroMantenimientos.add(m);

	}
	
	public String historialMantenimiento (String vin) {
		String mensaje = "";
		for (Mantenimiento m : registroMantenimientos) {
			if (m.getVin().equals(vin)) {
				mensaje += m.toString() + "\n";

			}
		}
		return mensaje;	
	}
	

}
