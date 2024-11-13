import java.util.ArrayList;

import model.Vehiculo;

public class Inventario {
	private ArrayList<Vehiculo> vehiculosEnInventario;
	
	
	public Inventario () {
		this.vehiculosEnInventario = new ArrayList<>();
	}

	public Vehiculo buscarVehiculo(String vin) {
		for (Vehiculo V : vehiculosEnInventario) {
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
		
		vehiculosEnInventario.remove(V);
		return true;
	}
		}
	
	public boolean agregarVehiculo(Vehiculo V) {
		Vehiculo A = buscarVehiculo(V.getVin());
		if (A == null) {
			return false;
			
		}else {
			vehiculosEnInventario.add(V);
			return true;
			
		}
		
			
	}

}
