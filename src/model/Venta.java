package model;
public class Venta {
	private Cliente cliente ;
	public static int id=0;
	private int consecutivo;

	
	public Venta(Cliente cliente) {
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
}
