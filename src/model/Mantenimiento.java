package model;

public class Mantenimiento extends Venta{
	private Vehiculo vehiculo;
	private String Caracteristicas;
	
	public Mantenimiento(Cliente cliente,Vehiculo vehiculo,String caracteristicas) {
		super(cliente);
		this.vehiculo=vehiculo;
		this.Caracteristicas=caracteristicas;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getCaracteristicas() {
		return Caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		Caracteristicas = caracteristicas;
	}

	public void añadirCarac (String mensaje) {
		String newMensaje = "["+mensaje+"]";
		this.Caracteristicas += newMensaje;
		
	}

}
