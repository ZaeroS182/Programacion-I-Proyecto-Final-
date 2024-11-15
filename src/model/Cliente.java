package model;

public class Cliente {
	private String nombre;
	private String correoElectronico;
	private String numeroTelefonico;
	private String domicilio;
	private String id;
	
	public Cliente(String nombre, String correoElectronico, String numeroTelefonico, String domicilio, String id) {

		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.numeroTelefonico = numeroTelefonico;
		this.domicilio = domicilio;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", numeroTelefonico="
				+ numeroTelefonico + ", domicilio=" + domicilio + ", id=" + id + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreoElectronico() {
		return correoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}


	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	

}