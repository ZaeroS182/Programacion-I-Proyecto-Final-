package model;

public class Vehiculo implements InterfaceVehiculo{
	private String marca;
	private String modelo;
	private String vin;
	private String color;
	private int kilometraje;
	private int year;
	
	public Vehiculo(String marca, String modelo, String vin, String color, int kilometraje, int year) {
		this.marca = marca;
		this.modelo = modelo;
		this.vin = vin;
		this.color = color;
		this.kilometraje = kilometraje;
		this.year = year;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	


}
