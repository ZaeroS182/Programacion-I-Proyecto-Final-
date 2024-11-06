import java.util.ArrayList;

import model.Vehiculo;

public class Inventario {
	private ArrayList<Vehiculo> vehiculosEnInventario;
	
	
	public Inventario () {
		this.vehiculosEnInventario = new ArrayList<>();
	}


	public ArrayList<Vehiculo> getVehiculosEnInventario() {
		return vehiculosEnInventario;
	}
	


}
