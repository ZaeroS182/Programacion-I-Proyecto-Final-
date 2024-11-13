package model;
import java.util.ArrayList;

public class Inventario {
	private ArrayList<Vehiculo> vehiculosEnInventario;
	
	
	public Inventario () {
		this.vehiculosEnInventario = new ArrayList<>();
	}


	public ArrayList<Vehiculo> getVehiculosEnInventario() {
		return vehiculosEnInventario;
	}
	


}
