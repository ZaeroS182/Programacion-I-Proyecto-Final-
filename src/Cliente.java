
public class Cliente {
	private String nombre;
	private String correoElectronico;
	private String numeroTelefonico;
	private String domicilio;
	
	
	public Cliente(String nombre, String correoElectronico, String numeroTelefonico, String domicilio) {

		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.numeroTelefonico = numeroTelefonico;
		this.domicilio = domicilio;
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