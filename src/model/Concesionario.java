package model;


import java.util.ArrayList;

public class Concesionario {
	private String nombre;
	private ArrayList<Cliente> listaClientes;
	private Inventario inventario;
	private Mantenimiento mantenimiento;
	
	public Concesionario (String nombre, Inventario inventario, Mantenimiento mantenimiento) {
		this.nombre = nombre;
		this.listaClientes = new ArrayList<>();
		this.inventario = inventario;
		this.mantenimiento = mantenimiento;		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	
	

	

}
