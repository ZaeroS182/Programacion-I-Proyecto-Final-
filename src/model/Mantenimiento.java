package model;
import java.util.ArrayList;

public class Mantenimiento {
	private ArrayList<Vehiculo> vehiculosEnMantenimiento;
	
	public Mantenimiento() {
		this.vehiculosEnMantenimiento = new ArrayList<>();
	}
	
	public ArrayList<Vehiculo> getVehiculosEnMantenimiento(){
		return vehiculosEnMantenimiento;
	}

}