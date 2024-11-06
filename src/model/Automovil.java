package model;

public class Automovil extends Vehiculo{
	
	private int numeroPuertas;
	private ENUMtipoTransmision tipoTrasnmision;
	private ENUMtipoCombustible tipoCombustible;
	private ENUMtipoTraccion tipoTraccion;
	
	
	public Automovil(String marca, String modelo, String vin, String color, int kilometraje, int year,
			int numeroPuertas, ENUMtipoTransmision tipoTrasnmision, ENUMtipoCombustible tipoCombustible,
			ENUMtipoTraccion tipoTraccion) {
		super(marca, modelo, vin, color, kilometraje, year);
		this.numeroPuertas = numeroPuertas;
		this.tipoTrasnmision = tipoTrasnmision;
		this.tipoCombustible = tipoCombustible;
		this.tipoTraccion = tipoTraccion;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	public ENUMtipoTransmision getTipoTrasnmision() {
		return tipoTrasnmision;
	}


	public void setTipoTrasnmision(ENUMtipoTransmision tipoTrasnmision) {
		this.tipoTrasnmision = tipoTrasnmision;
	}


	public ENUMtipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}


	public void setTipoCombustible(ENUMtipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}


	public ENUMtipoTraccion getTipoTraccion() {
		return tipoTraccion;
	}


	public void setTipoTraccion(ENUMtipoTraccion tipoTraccion) {
		this.tipoTraccion = tipoTraccion;
	}
	
	
	
	
	
	
	
	
	
	

}
