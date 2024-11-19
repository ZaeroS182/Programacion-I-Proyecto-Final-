package model;
import java.util.ArrayList;

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
			vehiculosEnInventario.add(V);
			return true;
		}else {
			return false;
			
			}
			
		}
		
	public String listarVehiculos () {
		String mensaje = "";
		for (Vehiculo v : vehiculosEnInventario) {
			mensaje += v.Referencia() + "\n";
		}
		return mensaje;
	}
			
}


