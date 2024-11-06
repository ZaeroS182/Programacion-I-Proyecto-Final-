package model;

public class Camion extends Vehiculo{
	private double capacidadCarga;
	private ENUMtipoCarga tipoCarga;
	private double longitud;
	private int numeroEjes;
	
	public Camion(String marca, String modelo, String vin, String color, int kilometraje, int year,
			double capacidadCarga, ENUMtipoCarga tipoCarga, double longitud, int numeroEjes) {
		super(marca, modelo, vin, color, kilometraje, year);
		this.capacidadCarga = capacidadCarga;
		this.tipoCarga = tipoCarga;
		this.longitud = longitud;
		this.numeroEjes = numeroEjes;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public ENUMtipoCarga getTipoCarga() {
		return tipoCarga;
	}
	public void setTipoCarga(ENUMtipoCarga tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	
	
	

}
