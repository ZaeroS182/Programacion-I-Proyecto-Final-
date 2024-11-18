package model;

public class ventaMantenimiento extends Venta{
	private Mantenimiento mantenimiento;
	private double precio;
	
	public ventaMantenimiento(Cliente cliente, Mantenimiento mantenimiento, double precio) {
		super(cliente);
		this.mantenimiento = mantenimiento;
		this.precio = precio;
	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getVin () {
		Vehiculo v = mantenimiento.getVehiculo();
		return v.getVin();
	}

}
