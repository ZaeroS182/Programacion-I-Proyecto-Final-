package model;




import java.time.*;

public class Venta {
	private Cliente cliente ;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private double precio;
	public static int id=0;
	private int consecutivo;

	
	@Override
	public String toString() {
		return "Venta [cliente: " + cliente.getNombre() + "id :" + cliente.getId()+ ", vehiculo=" + vehiculo.getVin() + vehiculo.getMarca() + ", fecha=" + fecha + ", precio=" + precio
				+ ", consecutivo=" + consecutivo + "]";
	}

	public Venta(Cliente cliente,Vehiculo vehiculo,double precio) {
		this.vehiculo = vehiculo;
		this.precio=precio;
		this.fecha = LocalDate.now ();
		++id;
		this.cliente = cliente;
		this.consecutivo = id;
		
	}

	public int getConsecutivo() {
		return consecutivo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getId () {
		return cliente.getId();
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getVin () {
		return vehiculo.getVin();
	}
	

}
