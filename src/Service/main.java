package Service;
//git log --all --oneline --decorate --graph
//


import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Automovil;
import model.Camion;
import model.Cliente;
import model.Concesionario;
import model.Mantenimiento;
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
	
	public static void quemarDatos() {
		Cliente c1 = new Cliente("Jorge", "jojo@gmail.com", "3112458795", "Calle 13 # 24-07", "1");
		Cliente c2 = new Cliente("Luis", "luis@gmail.com", "3227845785", "Cra 12  05-17", "2");
		Cliente c3 = new Cliente("Buba", "buba@gmail.com", "3158746978", "Av centenario #8-16", "3");
		Cliente c4 = new Cliente("Tristo", "tristo@gmail.com", "3105542310", "Calle 18 # 3-7", "4");
		Cliente c5 = new Cliente("Negro", "negro@gmail.com", "3130126578", "Av Camello # 23-10", "5");
		Cliente c6 = new Cliente("Santiago", "santiago@gmail.com", "3112458795", "Calle 6 #8-40", "6");
		Cliente c7 = new Cliente("Edwin", "edwin@gmail.com", "3227845785", "Cra 5# 5-25", "7");
		Cliente c8 = new Cliente("Jhonnatan", "jhonnatan@gmail.com", "3158746978", "Calle 9N #6-26", "8");
		Cliente c9 = new Cliente("Belen", "belen@gmail.com", "3105542310", "Av Bolivar #8-40", "9");
		Cliente c10 = new Cliente("Alustriel", "Alustriel@gmail.com", "3130126578", "Calle 12 #9-17", "10");
		Cliente c11 = new Cliente("Humberto", "humberto@gmail.com", "3112458795", "Av 11 # 08-17", "11");
		Cliente c12 = new Cliente("Marleny", "marleny@gmail.com", "3227845785", "Cra 18 # 16-32", "12");
		Cliente c13 = new Cliente("Jean", "jean@gmail.com", "3158746978", "Calle 4 # 4-26", "13");
		Cliente c14 = new Cliente("Louis", "louis@gmail.com", "3105542310", "Av 12 #8-28", "14");
		Cliente c15 = new Cliente("Natalia", "natalia@gmail.com", "3130126578", "Calle 9 # 11-30", "15");
		Cliente c16 = new Cliente("Valentina", "valentina@gmail.com", "3112458795", "Av sur #70-80", "16");
		Cliente c17 = new Cliente("Pedro", "pedro@gmail.com", "3227845785", "Av 2da # 9-36", "17");
		Cliente c18 = new Cliente("Fatima", "fatima@gmail.com", "3158746978", "Av 8 #5-18", "18");
		Cliente c19 = new Cliente("Teresa", "teresa@gmail.com", "3105542310", "Cra 4ta #24-7", "19");
		Cliente c20 = new Cliente("Adiela", "adiela@gmail.com", "3130126578", "Calle 1ra # 7-23", "20");
		
		concesionario.agregarCliente(c1);
		concesionario.agregarCliente(c2);
		concesionario.agregarCliente(c3);
		concesionario.agregarCliente(c4);
		concesionario.agregarCliente(c5);
		concesionario.agregarCliente(c6);
		concesionario.agregarCliente(c7);
		concesionario.agregarCliente(c8);
		concesionario.agregarCliente(c9);
		concesionario.agregarCliente(c10);
		concesionario.agregarCliente(c11);
		concesionario.agregarCliente(c12);
		concesionario.agregarCliente(c13);
		concesionario.agregarCliente(c14);
		concesionario.agregarCliente(c15);
		concesionario.agregarCliente(c16);
		concesionario.agregarCliente(c17);
		concesionario.agregarCliente(c18);
		concesionario.agregarCliente(c19);
		concesionario.agregarCliente(c20);
		
		/*************
		 * Creacion Motos
		 ***************/
		
		ENUMtipoManillar clipOn = ENUMtipoManillar.CLIP_ON;
		ENUMtipoManillar cruzado = ENUMtipoManillar.CRUZADO;
		ENUMtipoManillar deportivo = ENUMtipoManillar.DEPORTIVO;
		ENUMtipoManillar tubo = ENUMtipoManillar.TUBO;
		ENUMtipoFreno abs = ENUMtipoFreno.ABS;
		ENUMtipoFreno disco = ENUMtipoFreno.DISCO;
		ENUMtipoFreno ebd = ENUMtipoFreno.EBD;
		ENUMtipoFreno tambor = ENUMtipoFreno.TAMBOR;

		Motocicleta m1 = new Motocicleta("AKT", "NKD 125", "1", "Negro", 50, 2023, clipOn, 2, abs, 124);
		Motocicleta m2 = new Motocicleta("Pulsar", "NS 200", "2", "Blanco", 5201, 2016, clipOn, 2, disco, 199);
		Motocicleta m3 = new Motocicleta("Kawasaki", "Ninja 300", "3", "Verde", 0, 2017, clipOn, 2, ebd, 299);
		Motocicleta m4 = new Motocicleta("Suzuki", "GSXR 600", "4", "Azul", 78450, 2012, clipOn, 2, tambor, 600);
		Motocicleta m5 = new Motocicleta("Honda", "XRE 300", "5", "Naranja", 24698, 2019, cruzado, 2, abs, 311);
		Motocicleta m6 = new Motocicleta("Royal Enfield", "Himalayan", "6", "Arena", 8794, 2015, cruzado, 2, disco, 199);
		Motocicleta m7 = new Motocicleta("KTM", "Duke 400", "7", "Azul claro", 89784, 2008, cruzado, 2, ebd, 400);
		Motocicleta m8 = new Motocicleta("Husqvarna", "Nuda 900", "8", "Gris", 0, 2025, cruzado, 2, tambor, 750);
		Motocicleta m9 = new Motocicleta("Ducati", "Diavel", "9", "Negro", 50, 2024, deportivo, 2, abs, 900);
		Motocicleta m10 = new Motocicleta("Suzuki", "Burgman", "10", "Blanco", 5201, 2022, tubo, 2, disco, 125);
		
		concesionario.agregarVehiculoInv(m1);
		concesionario.agregarVehiculoInv(m2);
		concesionario.agregarVehiculoInv(m3);
		concesionario.agregarVehiculoInv(m4);
		concesionario.agregarVehiculoInv(m5);
		concesionario.agregarVehiculoInv(m6);
		concesionario.agregarVehiculoInv(m7);
		concesionario.agregarVehiculoInv(m8);
		concesionario.agregarVehiculoInv(m9);
		concesionario.agregarVehiculoInv(m10);

		/*************
		 * Creacion Automoviles
		 ***************/
		
		ENUMtipoTransmision automatica = ENUMtipoTransmision.AUTOMATICA;
		ENUMtipoTransmision manual = ENUMtipoTransmision.MANUAL;
		ENUMtipoTransmision cvt = ENUMtipoTransmision.CVT;
		ENUMtipoTransmision dobleEmbrague = ENUMtipoTransmision.DOBLE_EMBRAGUE;
		ENUMtipoCombustible biodiesel = ENUMtipoCombustible.BIODIESEL;
		ENUMtipoCombustible diesel = ENUMtipoCombustible.DIESEL;
		ENUMtipoCombustible etanol = ENUMtipoCombustible.ETANOL;
		ENUMtipoCombustible gasolina = ENUMtipoCombustible.GASOLINA;
		ENUMtipoCombustible gnc = ENUMtipoCombustible.GNC;
		ENUMtipoTraccion delantera = ENUMtipoTraccion.DELANTERA;
		ENUMtipoTraccion trasera = ENUMtipoTraccion.TRASERA;
		ENUMtipoTraccion integral = ENUMtipoTraccion.INTEGRAL;
		
		Automovil a1 = new Automovil("Ford", "Fiesta", "11", "Blanco", 32100, 2014, 5, automatica, biodiesel, delantera);
		Automovil a2 = new Automovil("Chevrolent", "Optra", "12", "Gris", 64578, 2006, 5, manual, diesel, trasera);
		Automovil a3 = new Automovil("Kia", "Picanto", "13", "Gris Oscuro", 39874, 2018, 5, cvt, etanol, integral);
		Automovil a4 = new Automovil("Renault", "Logan", "14", "Nieve", 0, 2024, 5, dobleEmbrague, gasolina, trasera);
		Automovil a5 = new Automovil("Suzuki", "Vitara", "15", "Rojo", 10800, 2021, 5, dobleEmbrague, gnc, trasera);
		
		concesionario.agregarVehiculoInv(a1);
		concesionario.agregarVehiculoInv(a2);
		concesionario.agregarVehiculoInv(a3);
		concesionario.agregarVehiculoInv(a4);
		concesionario.agregarVehiculoInv(a5);
		
		/*************
		 * Creacion Camiones
		 ***************/
		ENUMtipoCarga articulado = ENUMtipoCarga.ARTICULADO;
		ENUMtipoCarga lona = ENUMtipoCarga.LONA;
		ENUMtipoCarga rigido = ENUMtipoCarga.RIGIDO;

		Camion ca1 = new Camion("Chevrolet", "NP 500", "16", "Azul", 287954, 2017, 8000, articulado, 10, 6);
		Camion ca2 = new Camion("Isuzu", "Dr 4500", "17", "Blanco", 87450, 2022, 7874, lona, 12, 4);
		Camion ca3 = new Camion("Iveco", "IVX 9", "18", "Plata", 367821, 2015, 9600, rigido, 14, 8);
		
		concesionario.agregarVehiculoInv(ca1);
		concesionario.agregarVehiculoInv(ca2);
		concesionario.agregarVehiculoInv(ca3);
		
		/*****************************
		 * Creacion Ventas
		 *****************************/
		
		Venta v1 = new Venta(c2, m6, 26000000);
		Venta v2 = new Venta(c15, m8, 12000000);
		Venta v3 = new Venta(c3, m9, 7200000);
		Venta v4 = new Venta(c19, a4, 115000000);
		Venta v5 = new Venta(c8, a1, 34000000);
		Venta v6 = new Venta(c11, ca2, 456000000);
		
		concesionario.agregarVenta(v1);
		concesionario.agregarVenta(v2);
		concesionario.agregarVenta(v3);
		concesionario.agregarVenta(v4);
		concesionario.agregarVenta(v5);
		concesionario.agregarVenta(v6);
		
	}
	
	//Menu Principal

	public static void main (String[] args) {
		
		quemarDatos();
		
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
	// Sub-Menu
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
					+ "\n3. Buscar Vehiculo en Mantenimiento"
					+ "\n4. Eliminar Vehiculo en Mantenimiento"
					+ "\n5. Modificar vehiculo en mantenimiento"
					+ "\n6. Listar vehiculos en mantenimiento"
					+ "\n7. Listar historial de mantenimiento de vehiculo"
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
			break;
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
			eliminarMantenimiento();
			break;
		}
		case 5: {
			modificarMantenimiento();
			break;
		}
		case 6: {
			listarVehiculosMant();
		}
		case 7: {
			listarHistorialMant();
		}

		default:
			break;
		}

	}



	

	

	/************************
	 * METODOS SUB-MENU	CLIENTES
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
	 *METODOS SUB-MENU VEHICULOS INVENTARIO
	 **************************/
	private static void agregarVehiculoInv() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo a agregar: ");
		boolean existe =  concesionario.existeVin(vin);
		if (existe != true) {
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
	 *		METODOS SUB-MENU VENTAS
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
				+ "\n0. Volver";
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
		String fecha = JOptionPane.showInputDialog("Ingrese la fecha: (Ej: 2019-11-23");
		LocalDate fechaa = LocalDate.parse(fecha);
		String mensaje = concesionario.getVentasFecha(fechaa);
		if (mensaje.isEmpty()) {
			JOptionPane.showMessageDialog(null, "La fecha no tiene historial de ventas registradas.");
		} else {
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
		
	}

	
	/********************************
	 * 			MANTENIMIENTOS
	 ********************************/
	
	private static void registrarVehiculoMant() {

		String vin = JOptionPane.showInputDialog("Ingrese el vin del vehiculo a registrar: ");
		Vehiculo v = concesionario.getVehiculoMant(vin);
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
				concesionario.agregarVehiculoMant(automovil);
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
				concesionario.agregarVehiculoMant(motocicleta);
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
				concesionario.agregarVehiculoMant(camion);
				JOptionPane.showMessageDialog(null, "Camion agregado exitosamente");
			}
			
		}
		
	}
	

	

	private static void buscarMantenimiento() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo que desea buscar: ");
		JOptionPane.showMessageDialog(null, concesionario.buscarVehiculoMant(vin));
		
	}

	private static void modificarMantenimiento() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo que desea buscar: ");
		boolean existe =  concesionario.existeVinMant(vin);
		if (existe == false) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca a actualizar: ");
			String modelo = JOptionPane.showInputDialog("Ingrese l modeloa actualizar: ");
			String color = JOptionPane.showInputDialog("Indique el color a actualizar: ");
			String nuevoVin = JOptionPane.showInputDialog("Indique el nuevo VIN del vehiculo a actualizar: ");
			int km = Integer.parseInt(JOptionPane.showInputDialog("Indique el kilometraje a actualizar: "));
			int year = Integer.parseInt(JOptionPane.showInputDialog("Indique el año a actualizar: "));
			
			ENUMtipoVehiculo tipoVehiculo = concesionario.tipoVehiculoMant(vin);
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
				JOptionPane.showMessageDialog(null, concesionario.actualizarVehiculoMant(marca, modelo, vin, color, km, year, numeroPuertas, transmision, combustible, traccion, nuevoVin));
				
				
				
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
				JOptionPane.showMessageDialog(null, concesionario.actualizarVehiculoMant(marca, modelo, vin, color, km, year, tipoManillar, ruedas, tipoFreno, cilindrada, nuevoVin));
				
				
				
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
				JOptionPane.showMessageDialog(null, concesionario.actualizarVehiculoMant(marca, modelo, vin, color, km, year, capacidadCarga, tipoCarga, longitud, ejes, nuevoVin));
			}
		}
		
	}

	private static void eliminarMantenimiento() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo que desea buscar: ");
		JOptionPane.showMessageDialog(null, concesionario.eliminarVehiculoMant(vin));
		
	}
	
	private static void listarVehiculosMant() {
		JOptionPane.showMessageDialog(null, concesionario.listarVehiculosMant());
		
	}
	private static void registrarMantenimiento() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo: ");
		Vehiculo v = concesionario.getVehiculoMant(vin);
		if(v == null) {
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los detalles del mantenimiento"));
			String registro = JOptionPane.showInputDialog("Ingrese los detalles del mantenimiento");
			Mantenimiento m = new Mantenimiento (v,registro,precio);
			JOptionPane.showMessageDialog(null, concesionario.registrarMantenimiento(m));

		} else {
			JOptionPane.showMessageDialog(null, "Vehiculo en mantenimiento no encontrado");
			
		}


		
	}
	
	private static void listarHistorialMant() {
		String vin = JOptionPane.showInputDialog("Ingrese el VIN del vehiculo: ");
		JOptionPane.showMessageDialog(null,"Historial de mantenimiento para el vehiculo\n" + concesionario.historialMantenimiento(vin));
	}

}
