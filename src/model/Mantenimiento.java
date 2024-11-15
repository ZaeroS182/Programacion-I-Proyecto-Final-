package model;
import java.util.ArrayList;

public class Mantenimiento {
	private ArrayList<Vehiculo> vehiculosEnMantenimiento;
	
	public Mantenimiento() {
		this.vehiculosEnMantenimiento = new ArrayList<>();
	}
		
	public Vehiculo buscarVehiculo(String vin) {
		for (Vehiculo V : vehiculosEnMantenimiento) {
			if (V.getVin().equals(vin)) {
				
				return V;
			}
		}
		return null;
	}
	
	public boolean eliminarVehiculo(String vin) {
		Vehiculo V = buscarVehiculo(vin);
		
		if (V == null) {
			return false;
		}else {
		
			vehiculosEnMantenimiento.remove(V);
		return true;
	}
		}
	
	public boolean agregarVehiculo(Vehiculo V) {
		Vehiculo A = buscarVehiculo(V.getVin());
		if (A == null) {
			vehiculosEnMantenimiento.add(V);
			return true;
			
		}else {
			return false;
		}
		
	}

}