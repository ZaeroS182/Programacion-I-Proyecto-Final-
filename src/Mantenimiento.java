import java.util.ArrayList;

import model.Vehiculo;

public class Mantenimiento {
	private ArrayList<Vehiculo> vehiculosEnMantenimiento;
	
	public Mantenimiento() {
		this.vehiculosEnMantenimiento = new ArrayList<>();
	}
	
	public ArrayList<Vehiculo> getVehiculosEnMantenimiento(){
		return vehiculosEnMantenimiento;
	}

}