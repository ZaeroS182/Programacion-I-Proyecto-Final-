package model;

public class Mantenimiento{
	private Vehiculo vehiculo;
	public static int id = 0;
	private int consecutivo;
	private String Caracteristicas;
	private double precio;
	
	public Mantenimiento(Vehiculo vehiculo,String caracteristicas,double precio) {
		id++;
		this.consecutivo = id;
		this.vehiculo=vehiculo;
		this.Caracteristicas=caracteristicas;
		this.precio = precio;
	}
	public String toString () {
		return vehiculo.Referencia() + Caracteristicas + precio;
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
		String newMensaje = "["+mensaje+"]" + "\n";
		this.Caracteristicas += newMensaje;
		
	}
	
	public String getVin () {
		return vehiculo.getVin();
	}

	public int getConsecutivo() {
		return consecutivo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}



}
