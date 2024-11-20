package Service;
//git log --all --oneline --decorate --graph
//


import java.time.LocalDate;
import java.util.Date;

import javax.swing.JOptionPane;


import model.Automovil;
import model.Camion;
import model.Cliente;
import model.Concesionario;
import model.Mantenimientos;
import model.Motocicleta;
import model.Vehiculo;
import model.Venta;
import ENUM.ENUMtipoCarga;
import ENUM.ENUMtipoCombustible;
import ENUM.ENUMtipoFreno;
import ENUM.ENUMtipoManillar;
import ENUM.ENUMtipoTraccion;
import ENUM.ENUMtipoTransmision;
import ENUM.ENUMtipoVehiculo;


public class main {
	
	public static Concesionario concesionario = new Concesionario("kia");
	
	public static void quemarClientes() {
		Cliente c1 = new Cliente("Jorge", "jojo@gmail.com", "311", "Av 111", "1");
		Cliente c2 = new Cliente("Luis", "luis@gmail.com", "322", "Av 222", "2");
		Cliente c3 = new Cliente("Buba", "buba@gmail.com", "333", "Av 333", "3");
		Cliente c4 = new Cliente("Tristo", "tristo@gmail.com", "344", "Av 444", "4");
		Cliente c5 = new Cliente("Negro", "negro@gmail.com", "355", "Av 555", "5");
		
		concesionario.agregarCliente(c1);
		concesionario.agregarCliente(c2);
		concesionario.agregarCliente(c3);
		concesionario.agregarCliente(c4);
		concesionario.agregarCliente(c5);
		
	}

	public static void main (String[] args) {
		
		quemarClientes();
		
		String menuPrincipal = "Por favor indique una opcion: "
				+ "\n1. Clientes"
				+ "\n2. Vehiculos en Inventario"
				+ "\n3. Ventas"
				+ "\n4. Vehiculos en Mantenimiento"
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
			String menuVehiculos = "Gestion Vehiculos en Inventario:"
					+ "\n1. Agregar vehiculo"
					+ "\n2. Buscar vehiculo"
					+ "\n3. Eliminar vehiculo"
					+ "\n4. Actualizar vehiculo"
					+ "\n5. Listar vehiculos"
					+ "\n0. Volver";
			int indica;
			
			do {
				indica = Integer.parseInt(JOptionPane.showInputDialog(menuVehiculos));
				menuVehiculos(indica);
				
			} while (indica != 0);
			break;
		}
		case 3: {
			String menuVentas = "Gestion de Ventas:"
					+ "\n1. Registrar venta"
					+ "\n2. Buscar venta"
					+ "\n3. Modificar venta"
					+ "\n4. Eliminar venta"
					+ "\n5. Listar ventas"
					+ "\n0. Volver";
			int indica;
			
			do {
				indica = Integer.parseInt(JOptionPane.showInputDialog(menuVentas));
				menuVentas(indica);
			} while (indica != 0);
			break;
			
		}
		case 4: {
			String menuMantenimientos = "Gestion de Mantenimientos:"
					+ "\n1. Registrar Vehiculo en Mantenimiento"
					+ "\n2. Registrar mantenimiento a un vehiculo"
					+ "\n3. Buscar mantenimiento"
					+ "\n4. Modificar mantenimiento"
					+ "\n5. Eliminar mantenimiento"
					+ "\n0. Volver";
			int indica;
			
			do {
				indica = Integer.parseInt(JOptionPane.showInputDialog(menuMantenimientos));
				menuMantenimientos(indica);
			} while (indica != 0);
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
		case 2: {
			buscarVehiculoInv();
			break;
		}
		case 3: {
			eliminarVehiculoInv();
			break;
		}
		case 4: {
			actualizarVehiculoInv();
			break;
		}
		case 5: {
			listarVehiculosInv();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + indica);
		}

		
	}
	
	private static void menuVentas(int indica) {
		switch (indica) {
		case 1: {
			registrarVenta();			
			break;
		}
		case 2: {
			buscarVenta();
			break;
		}
		case 3: {
			modificarVenta();
			break;
		}
		case 4: {
			eliminarVenta();
			break;
		}

		default:
			break;
		}
		
	}
	
	private static void menuMantenimientos(int indica) {
		switch (indica) {
		
		case 1: {
			registrarVehiculoMant();
			break;
		}
		
		case 2: {
			registrarMantenimiento();			
			break;
		}
		case 3: {
			buscarMantenimiento();
			break;
		}
		case 4: {
			modificarMantenimiento();
			break;
		}
		case 5: {
			eliminarMantenimiento();
			break;
		}

		default:
			break;
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
		if (existe == true) {
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
				
			} else if (seleccion == 2) {
				ENUMtipoFreno tipoFreno = null;
				ENUMtipoManillar tipoManillar = null;
				int freno = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de freno: "
						+ "\n1. Tambor"
						+ "\n2. Disco"
						+ "\n3. EBD"
						+ "\n4. ABS")) ;
				if(freno == 1) {
					tipoFreno = ENUMtipoFreno.TAMBOR;
				} else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.DISCO;
				}else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.EBD;
				} else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.ABS;
				}
				
				int manillar = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de manillar: "
						+ "\n1. Tubo"
						+ "\n2. Clip On"
						+ "\n3. Cruzado"
						+ "\n4. Deportivo")) ;
				if(manillar == 1) {
					tipoManillar = ENUMtipoManillar.TUBO;
				} else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.CLIP_ON;
				}else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.CRUZADO;
				} else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.DEPORTIVO;
				}
				int ruedas = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de ruedas: "));
				double cilindrada = Double.parseDouble(JOptionPane.showInputDialog("Indique la cilindrada: "));
				Motocicleta motocicleta = new Motocicleta(marca, modelo, vin, color, km, year, tipoManillar, ruedas, tipoFreno, cilindrada);
				JOptionPane.showMessageDialog(null, concesionario.agregarVehiculoInv(motocicleta));
				
			} else if (seleccion == 3) {
				ENUMtipoCarga tipoCarga = null;
				int carga = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de carga: "
						+ "\n1. Rigido"
						+ "\n2. Articulado"
						+ "\n3. Lona"));
				if (carga == 1) {
					tipoCarga = ENUMtipoCarga.RIGIDO;
				} else if(carga == 2) {
					tipoCarga = ENUMtipoCarga.ARTICULADO;
				} else if  (carga == 3) {
					tipoCarga = ENUMtipoCarga.LONA;
				}
				double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Indique la capacidad de carga (Toneladas): "));
				double longitud = Double.parseDouble(JOptionPane.showInputDialog("Indique la longitud(Metros): "));
				int ejes = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de ejes: "));
				Camion camion = new Camion(marca, modelo, vin, color, km, year, capacidadCarga, tipoCarga, longitud, ejes);
				JOptionPane.showMessageDialog(null, concesionario.agregarVehiculoInv(camion));
			}
			

			
		}

		
	}

	private static void buscarVehiculoInv() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo que desea buscar: ");
		JOptionPane.showMessageDialog(null, concesionario.buscarVehiculoInv(vin));
		
	}
	
	private static void eliminarVehiculoInv() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo que desea buscar: ");
		JOptionPane.showMessageDialog(null, concesionario.eliminarVehiculoInv(vin));
	}
	
	private static void actualizarVehiculoInv() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo que desea buscar: ");
		boolean existe =  concesionario.existeVin(vin);
		if (existe == false) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca a actualizar: ");
			String modelo = JOptionPane.showInputDialog("Ingrese l modeloa actualizar: ");
			String color = JOptionPane.showInputDialog("Indique el color a actualizar: ");
			String nuevoVin = JOptionPane.showInputDialog("Indique el nuevo VIN del vehiculo a actualizar: ");
			int km = Integer.parseInt(JOptionPane.showInputDialog("Indique el kilometraje a actualizar: "));
			int year = Integer.parseInt(JOptionPane.showInputDialog("Indique el año a actualizar: "));
			
			ENUMtipoVehiculo tipoVehiculo = concesionario.tipoVehiculo(vin);
			if (tipoVehiculo == ENUMtipoVehiculo.AUTOMOVIL ) {
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
				JOptionPane.showMessageDialog(null, concesionario.actualizarVehiculo(marca, modelo, vin, color, km, year, numeroPuertas, transmision, combustible, traccion, nuevoVin));
				
				
				
			} else if (tipoVehiculo == ENUMtipoVehiculo.MOTOCICLETA) {
				ENUMtipoFreno tipoFreno = null;
				ENUMtipoManillar tipoManillar = null;
				int freno = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de freno: "
						+ "\n1. Tambor"
						+ "\n2. Disco"
						+ "\n3. EBD"
						+ "\n4. ABS")) ;
				if(freno == 1) {
					tipoFreno = ENUMtipoFreno.TAMBOR;
				} else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.DISCO;
				}else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.EBD;
				} else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.ABS;
				}
				
				int manillar = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de manillar: "
						+ "\n1. Tubo"
						+ "\n2. Clip On"
						+ "\n3. Cruzado"
						+ "\n4. Deportivo")) ;
				if(manillar == 1) {
					tipoManillar = ENUMtipoManillar.TUBO;
				} else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.CLIP_ON;
				}else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.CRUZADO;
				} else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.DEPORTIVO;
				}
				int ruedas = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de ruedas: "));
				double cilindrada = Double.parseDouble(JOptionPane.showInputDialog("Indique la cilindrada: "));
				JOptionPane.showMessageDialog(null, concesionario.actualizarVehiculo(marca, modelo, vin, color, km, year, tipoManillar, ruedas, tipoFreno, cilindrada, nuevoVin));
				
				
				
			} else if (tipoVehiculo == ENUMtipoVehiculo.CAMION) {
				ENUMtipoCarga tipoCarga = null;
				int carga = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de carga: "
						+ "\n1. Rigido"
						+ "\n2. Articulado"
						+ "\n3. Lona"));
				if (carga == 1) {
					tipoCarga = ENUMtipoCarga.RIGIDO;
				} else if(carga == 2) {
					tipoCarga = ENUMtipoCarga.ARTICULADO;
				} else if  (carga == 3) {
					tipoCarga = ENUMtipoCarga.LONA;
				}
				double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Indique la capacidad de carga (Toneladas): "));
				double longitud = Double.parseDouble(JOptionPane.showInputDialog("Indique la longitud(Metros): "));
				int ejes = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de ejes: "));
				JOptionPane.showMessageDialog(null, concesionario.actualizarVehiculo(marca, modelo, vin, color, km, year, capacidadCarga, tipoCarga, longitud, ejes, nuevoVin));
				
			}
			
			
		} else {
			JOptionPane.showMessageDialog(null, "El VIN no corresponde a un vehiculo en Inventario");

		}
		
	}
	
	private static void listarVehiculosInv() {
		JOptionPane.showMessageDialog(null, concesionario.listarVehiculosInv());
		
	}
	
	/************************************
	 *			VENTAS
	 *************************************/
	
	private static void registrarVenta() {
		Cliente c = concesionario.buscarCliente(JOptionPane.showInputDialog("Ingrese el ID del cliente: "));
		if(c == null) {
			JOptionPane.showMessageDialog(null, "El cliente no pertenece a la base de datos");
		} else {
			Vehiculo v = concesionario.getVehiculoInv(JOptionPane.showInputDialog("Ingrese el VIN del vehiculo a vender: "));
			if(v == null) {
				JOptionPane.showMessageDialog(null, "El VIN no corresponde a un vehiculo en inventario");
				
			} else {
				Double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta: "));
				Venta venta =  new Venta(c, v, precio);
				JOptionPane.showMessageDialog(null, concesionario.agregarVenta(venta));
					
			}
						
		}
		
		
	}

	private static void buscarVenta() {
		String menu = "Seleccion el criterio de busqueda: "
				+ "\n1. Tipo de vehiculo"
				+ "\n2. ID del cliente"
				+ "\n3. Fecha"
				+ "\n4. Volver";
		int select;
		do { 
			select = Integer.parseInt(JOptionPane.showInputDialog(menu));
			selectBuscarVenta(select);

		} while (select != 0);

	}

	private static void selectBuscarVenta(int select) {
		switch (select) {
		case 1: {
			buscarTipoV();
			break;
		}
		case 2: {
			buscarId();
			break;
		}
		case 3: {
			buscarFecha();
			break;
		}
		default:
			break;
		}

		
	}


	private static void buscarTipoV() {
		String menu = "Seleccion el tipo de vehiculo: "
				+ "\n1. Motocicleta"
				+ "\n2. Automovil"
				+ "\n3. Camion"
				+ "\n4. Volver";
		int select;
		do { 
			select = Integer.parseInt(JOptionPane.showInputDialog(menu));
			tipoV(select);

		} while (select != 0);
	}

	private static void tipoV(int select) {
		switch (select) {
		case 1: {
			concesionario.getVentasTipoV(1);
			break;
		}
		case 2: {
			concesionario.getVentasTipoV(2);
			break;
		}
		case 3: {
			concesionario.getVentasTipoV(3);
			break;
		}
		default:
			break;
		}
		
	}
	
	private static void buscarId() {
		String id = JOptionPane.showInputDialog("Ingrese la ID del cliente: ");
		String mensaje = concesionario.historialCliente(id);
		if (mensaje.isEmpty()) {
			JOptionPane.showMessageDialog(null, "La ID no tiene historial de ventas registradas.");
		} else {
			JOptionPane.showMessageDialog(null, mensaje);
		}
		

		
		
		
	}
	
	private static void buscarFecha() {
		String fecha = JOptionPane.showInputDialog("Ingrese la fecha: (Ej: 19-08-2019");
		LocalDate fechaa = LocalDate.parse(fecha);
		String mensaje = concesionario.getVentasFecha(fechaa);
		if (mensaje.isEmpty()) {
			JOptionPane.showMessageDialog(null, "La fecha no tiene historial de ventas registradas.");
		} else {
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
		
	}

	private static void modificarVenta() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo: ");
		int consecutivo = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de consecutivo: "));
		String venta = concesionario.buscarVenta(vin, consecutivo);
		

		
	}

	private static void eliminarVenta() {
		

		
	}


	
	/********************************
	 * 			MANTENIMIENTOS
	 ********************************/
	
	private static void registrarVehiculoMant() {
		String vin = JOptionPane.showInputDialog("Ingrese el vin del vehiculo a registrar: ");
		Vehiculo v = concesionario.getMantenimiento().buscarVehiculo(vin);
		if (v != null) {
			JOptionPane.showMessageDialog(null, "El vehiculo ya esta registrado en Mantenimiento");
		} else {
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
				concesionario.getMantenimiento().agregarVehiculo(automovil);
				JOptionPane.showMessageDialog(null, "Automovil agregado exitosamente");
				
			} else if (seleccion == 2) {
				ENUMtipoFreno tipoFreno = null;
				ENUMtipoManillar tipoManillar = null;
				int freno = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de freno: "
						+ "\n1. Tambor"
						+ "\n2. Disco"
						+ "\n3. EBD"
						+ "\n4. ABS")) ;
				if(freno == 1) {
					tipoFreno = ENUMtipoFreno.TAMBOR;
				} else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.DISCO;
				}else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.EBD;
				} else if (freno == 2) {
					tipoFreno = ENUMtipoFreno.ABS;
				}
				
				int manillar = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de manillar: "
						+ "\n1. Tubo"
						+ "\n2. Clip On"
						+ "\n3. Cruzado"
						+ "\n4. Deportivo")) ;
				if(manillar == 1) {
					tipoManillar = ENUMtipoManillar.TUBO;
				} else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.CLIP_ON;
				}else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.CRUZADO;
				} else if (manillar == 2) {
					tipoManillar = ENUMtipoManillar.DEPORTIVO;
				}
				int ruedas = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de ruedas: "));
				double cilindrada = Double.parseDouble(JOptionPane.showInputDialog("Indique la cilindrada: "));
				Motocicleta motocicleta = new Motocicleta(marca, modelo, vin, color, km, year, tipoManillar, ruedas, tipoFreno, cilindrada);
				concesionario.getMantenimiento().agregarVehiculo(motocicleta);
				JOptionPane.showMessageDialog(null, "Motocicleta agregada exitosamente");
				
			} else if (seleccion == 3) {
				ENUMtipoCarga tipoCarga = null;
				int carga = Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de carga: "
						+ "\n1. Rigido"
						+ "\n2. Articulado"
						+ "\n3. Lona"));
				if (carga == 1) {
					tipoCarga = ENUMtipoCarga.RIGIDO;
				} else if(carga == 2) {
					tipoCarga = ENUMtipoCarga.ARTICULADO;
				} else if  (carga == 3) {
					tipoCarga = ENUMtipoCarga.LONA;
				}
				double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Indique la capacidad de carga (Toneladas): "));
				double longitud = Double.parseDouble(JOptionPane.showInputDialog("Indique la longitud(Metros): "));
				int ejes = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de ejes: "));
				Camion camion = new Camion(marca, modelo, vin, color, km, year, capacidadCarga, tipoCarga, longitud, ejes);
				concesionario.getMantenimiento().agregarVehiculo(camion);
				JOptionPane.showMessageDialog(null, "Camion agregado exitosamente");
			}
			
		}
		
	}
	

	private static void registrarMantenimiento() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo: ");
		Vehiculo v = concesionario.getMantenimiento().buscarVehiculo(vin);
		if(v != null) {
			System.out.println("si esta agregando el vehiculo a la lista de mantenimiento");
			
			

		} else {
			
			registrarVehiculoMant();
		}


		
	}

	private static void buscarMantenimiento() {
		// TODO Auto-generated method stub
		
	}

	private static void modificarMantenimiento() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarMantenimiento() {
		// TODO Auto-generated method stub
		
	}

}
