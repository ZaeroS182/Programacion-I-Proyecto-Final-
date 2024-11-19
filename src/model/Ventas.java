package model;

import java.util.ArrayList;

public class Ventas {
	private ArrayList <Venta> ventas;


	public Ventas() {
		this.ventas = new ArrayList <>();
	}
	
	public Venta buscarVenta (String id) {
		for (Venta v : ventas) {
			if (v.getId().equals(id)) {
				return v;
			}
		}
		return null;
		
	}
	/*
	public Venta BuscarVenta (String vin) {
		for (Venta v : ventas) {
			if (v instanceof ventaVehiculo) {
				
				if (v.getVin().equals(vin)
				return v;
			}
		}
		return null;
	}
	
	
	public boolean agregarVenta (Venta venta) {
		Venta v = BuscarVenta (venta.getVin());
		if (v == null ) {
			ventas.add(venta);
			return true;
		}
		return false;
	}

	
	
*/
}
