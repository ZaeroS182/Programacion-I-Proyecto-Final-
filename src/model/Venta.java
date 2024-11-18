package model;
public class Venta {
	private Cliente cliente ;
	private Vehiculo vehiculo;
	private String tipoServicio;
	
	public Venta(Cliente cliente, Vehiculo vehiculo, String tipoServicio) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.tipoServicio = tipoServicio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	
	public String getId () {
		return cliente.getId();
	}
	
	public String getVin () {
		return vehiculo.getVin();
	}
	
}
