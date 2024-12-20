package model;

import ENUM.ENUMtipoFreno;
import ENUM.ENUMtipoManillar;

public class Motocicleta extends Vehiculo{
	private ENUMtipoManillar tipoManillar;
	private int numeroRuedas;
	private ENUMtipoFreno tipoFreno;
	private double cilindrada;
	
	public Motocicleta(String marca, String modelo, String vin, String color, int kilometraje, int year,
			ENUMtipoManillar tipoManillar, int numeroRuedas, ENUMtipoFreno tipoFreno, double cilindrada) {
		super(marca, modelo, vin, color, kilometraje, year);
		this.tipoManillar = tipoManillar;
		this.numeroRuedas = numeroRuedas;
		this.tipoFreno = tipoFreno;
		this.cilindrada = cilindrada;
	}
	

	
	@Override
	public String toString() {
		return "\nMotocicleta tipoManillar: " + tipoManillar 
				+ "\nNumero de ruedas: " + numeroRuedas 
				+ "\nTipo de freno: " + tipoFreno 
				+ "\nCilindrada: " + cilindrada + "cc";
	}



	public ENUMtipoManillar getTipoManillar() {
		return tipoManillar;
	}

	public void setTipoManillar(ENUMtipoManillar tipoManillar) {
		this.tipoManillar = tipoManillar;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public ENUMtipoFreno getTipoFreno() {
		return tipoFreno;
	}

	public void setTipoFreno(ENUMtipoFreno tipoFreno) {
		this.tipoFreno = tipoFreno;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	

}
