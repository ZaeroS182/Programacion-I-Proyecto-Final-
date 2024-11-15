package Service;
//git log --all --oneline --decorate --graph


import javax.swing.JOptionPane;


import model.Automovil;
import model.Cliente;
import model.Concesionario;
import ENUM.ENUMtipoCombustible;
import ENUM.ENUMtipoTraccion;
import ENUM.ENUMtipoTransmision;





public class main {
	
	public static Concesionario concesionario = new Concesionario("kia");

	public static void main(String[] args) {
		
		String menuPrincipal = "Por favor indique una opcion: "
				+ "\n1. Clientes"
				+ "\n2. Vehiculos"
				+ "\n3. Ventas"
				+ "\n4. Inventario"
				+ "\n5. Mantenimiento"
				+ "\n0. Salir";
		int indicaMenu;
		
		do {
			indicaMenu = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
			seleccionMenu(indicaMenu);
			
		} while (indicaMenu != 0);

	}
	
	private static void seleccionMenu(int indicaMenu) {
		switch (indicaMenu) {
		case 1: {
			String menuClientes = "Gestion clientes:"
					+ "\n1. Agregar cliente"
					+ "\n2. Buscar cliente"
					+ "\n3. Eliminar cliente"
					+ "\n4. Actualizar cliente"
					+ "\n5. Listar clientes"
					+ "\n0. Volver";
			int indica;
			
			do {
				indica = Integer.parseInt(JOptionPane.showInputDialog(menuClientes));
				menuClientes(indica);
				
			} while (indica != 0);
			break;
		}
		case 2: {
			String menuVehiculos = "Gestion Vehiculos:"
					+ "\n1. Agregar vehiculo"
					+ "\n2. Buscar vehiculo"
					+ "\n3. Eliminar vehiculo"
					+ "\n4. Actualizar vehiculo"
					+ "\n5. Listar vehiculo"
					+ "\n0. Volver";
			int indica;
			
			do {
				indica = Integer.parseInt(JOptionPane.showInputDialog(menuVehiculos));
				menuVehiculos(indica);
				
			} while (indica != 0);
			break;
		}
		case 3: {
			
			break;
			
		}

		default :
			break;

		}
	}
	
	private static void menuClientes(int indicaMenu) {
		switch (indicaMenu) {
		case 1: {
			agregarCliente();
			break;
		}
		case 2: {
			buscarCliente();
			break;
		}
		case 3: {
			eliminarCliente();
			break;
		}
		case 4: {
			actualizarCliente();
			break;
		}
		case 5: {
			listarClientes();
			break;
		}

		default :
			break;

		}

	}
	
	
	private static void menuVehiculos(int indica) {
		switch (indica) {
		case 1: {
			agregarVehiculoInv();			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + indica);
		}

		
	}


	/************************
	 * 			CLIENTES
	 *************************/
	
	private static void agregarCliente() {
		String mensaje = "La ID ya pertenece a un cliente registrado";
		String id = JOptionPane.showInputDialog("Ingrese el ID del cliente a agregar: ");
		Boolean existeId = concesionario.buscarId(id);
		if(existeId != true) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
			String correo = JOptionPane.showInputDialog("Ingrese el correo del cliente:");
			String telefono = JOptionPane.showInputDialog("Ingrese el numero telefonico del cliente:");
			String domicilio = JOptionPane.showInputDialog("Ingrese el domicilio del cliente:");
			Cliente c = new Cliente(nombre, correo, telefono, domicilio, id);
			concesionario.agregarCliente(c);
			mensaje = "Cliente agregado";

		}
		JOptionPane.showMessageDialog(null, mensaje);

		
	}
	
	private static void buscarCliente() {
		String mensaje = "La ID no pertenece a un cliente registrado";
		String id = JOptionPane.showInputDialog("Ingrese el ID del cliente a buscar: ");
		Cliente c = concesionario.buscarCliente(id);
		if(c != null) {
			mensaje = c.toString();
		}
		JOptionPane.showMessageDialog(null, mensaje);

	}
	
	private static void eliminarCliente() {
		String mensaje = "La ID no pertenece a un cliente registrado";
		String id = JOptionPane.showInputDialog("Ingrese el ID del cliente a eliminar: ");
		Cliente c = concesionario.buscarCliente(id);
		if(c != null) {
			concesionario.eliminarCliente(c);
			mensaje = "Cliente eliminado";
		}
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
	
	private static void actualizarCliente() {
		String mensaje = "La ID no pertenece a un cliente registrado";
		String id = JOptionPane.showInputDialog("Ingrese el ID del cliente a actualizar: ");
		Cliente c = concesionario.buscarCliente(id);
		if(c != null) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente:");
			String correo = JOptionPane.showInputDialog("Ingrese el nuevo correo del cliente:");
			String telefono = JOptionPane.showInputDialog("Ingrese el nuevo numero telefonico del cliente:");
			String domicilio = JOptionPane.showInputDialog("Ingrese el nuevo domicilio del cliente:");
			String nuevaId = JOptionPane.showInputDialog("Ingrese la nueva ID del cliente:");
			c.setNombre(nombre);
			c.setCorreoElectronico(correo);
			c.setNumeroTelefonico(telefono);
			c.setDomicilio(domicilio);
			c.setId(nuevaId);
			mensaje = "Cliente actualizado";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	
	}
		
	private static void listarClientes() {
		JOptionPane.showMessageDialog(null, concesionario.listarClientes());
		
	}

	/****************************
	 * 		VEHICULOS INVENTARIO
	 **************************/
	private static void agregarVehiculoInv() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo a agregar: ");
		boolean existe =  concesionario.existeVin(vin);
		if (existe == false) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
			String modelo = JOptionPane.showInputDialog("Ingrese l modelo del vehiculo: ");
			String color = JOptionPane.showInputDialog("Indique el color del vehiculo: ");
			int km = Integer.parseInt(JOptionPane.showInputDialog("Indique el kilometraje del vehiculo: "));
			int year = Integer.parseInt(JOptionPane.showInputDialog("Indique el año del vehiculo: "));
			int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de vehiculo: "
					+ "\n1. Automovil"
					+ "\n2. Motocicleta"
					+ "\n3. Camion")) ;
			if (seleccion == 1) {
				
				ENUMtipoTransmision transmision = null;
				ENUMtipoCombustible combustible = null;
				ENUMtipoTraccion traccion = null;	
	
				int tipoTransmision = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de transmision: "
						+ "\n1. Manual"
						+ "\n2. Automatica"
						+ "\n3. CVT"
						+ "\n4. Doble Embrague")) ;
				int tipoCombustible = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de combustible: "
						+ "\n1. Gasolina"
						+ "\n2. Diesel"
						+ "\n3. Biodiesel"
						+ "\n4. Etanol"
						+ "\n5. GNC")) ;
				int tipoTraccion = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de traccion: "
						+ "\n1. Delantera"
						+ "\n2. Trasera"
						+ "\n3. Integral")) ;
				int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo numero de puertas: "));
				if(tipoTransmision == 1) {
					transmision = ENUMtipoTransmision.MANUAL;
				} else if (tipoTransmision == 2) {
					transmision = ENUMtipoTransmision.AUTOMATICA;
				} else if (tipoTransmision == 3) {
					transmision = ENUMtipoTransmision.CVT;
				} else if (tipoTransmision == 4) {
					transmision = ENUMtipoTransmision.DOBLE_EMBRAGUE;
				}
				if (tipoCombustible == 1) {
					combustible = ENUMtipoCombustible.GASOLINA;
				} else if (tipoCombustible == 2) {
					combustible = ENUMtipoCombustible.DIESEL;
				} else if (tipoCombustible == 3) {
					combustible = ENUMtipoCombustible.BIODIESEL;
				} else if (tipoCombustible == 4) {
					combustible = ENUMtipoCombustible.ETANOL;
				} else if  (tipoCombustible == 5) {
					combustible = ENUMtipoCombustible.GNC;
				}
				if (tipoTraccion == 1) {
					traccion = ENUMtipoTraccion.DELANTERA;
				} else if (tipoTraccion == 2) {
					traccion = ENUMtipoTraccion.TRASERA;
				} else if (tipoTraccion == 3) {
					traccion = ENUMtipoTraccion.INTEGRAL;
				}
			
				Automovil automovil = new Automovil(marca, modelo, vin, color, km, year, numeroPuertas, transmision, combustible, traccion);
				JOptionPane.showMessageDialog(null, concesionario.agregarVehiculoInv(automovil));
				
				
				
			} 
			

			
		}

		
	}


}
