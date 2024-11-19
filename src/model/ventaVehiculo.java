package model;

public class ventaVehiculo extends Venta{
	private Vehiculo vehiculo;
	private double precio;

	public ventaVehiculo(Cliente cliente,Vehiculo vehiculo,double precio) {
		super(cliente);
		this.vehiculo = vehiculo;
		this.precio = precio;
		
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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
