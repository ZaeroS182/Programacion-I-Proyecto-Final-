package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;



public class Ventas {
	private ArrayList<Venta> ventas;

	public Ventas() {
		this.ventas = new ArrayList<>();
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
	
<<<<<<< HEAD

	public String historialVentas(LocalDate fecha) {
=======
	@SuppressWarnings("unlikely-arg-type")
	public String historialVentas(Date fecha) {
>>>>>>> 59c95ce7ac8461b7ad46d5d9e698ea56d2a2b4fb
		String mensaje = "";
		for (Venta v : ventas) {
			if (v.getFecha().equals(fecha)) {
				mensaje += v.toString() + "\n";
			}
		}
		return mensaje;

	}
}
