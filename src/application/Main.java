package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.ENUMtipoVehiculo;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Main extends Application implements EventHandler<ActionEvent>{
	
	
	

	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Joluoc-Cars");
		Image icon = new Image("icon.png");
		window.getIcons().add(icon);
		String css = this.getClass().getResource("application.css").toExternalForm();
		Button botonMenuPrincipal = new Button("Volver al Menu Principal");
		Label label = new Label("Bienvenido al software Joluoc-Cars\nPensado en gestionar concesionarios");

		//Gestion de Vehiculos 
		Button gestionVehiculos = new Button("Gestion de Vehiculos");
		//Ventana seleccion tipo de vehiculo
		ChoiceBox<ENUMtipoVehiculo> chooseVehiculo = new ChoiceBox<>();
		chooseVehiculo.getItems().setAll(ENUMtipoVehiculo.values());
		
		//Panel donde se piden los datos para agregar un vehiculo
		GridPane addVehiculo = new GridPane();
		addVehiculo.getStylesheets().add(css);
		
		Label marca = new Label("Marca");
		Label modelo = new Label("Modelo");
		Label vin = new Label("VIN");
		Label color = new Label("Color");
		Label kilometraje = new Label("Kilometraje");
		Label year = new Label("Año");
		Label tipoVehiculo = new Label("Tipo Vehiculo");
		
		TextField marcaInput = new TextField();
		TextField modeloInput = new TextField();
		TextField vinInput = new TextField();
		TextField colorInput = new TextField();
		TextField kilometrajeInput = new TextField();
		TextField yearInput = new TextField();
		
		Button backAgregarVehiculo =  new Button("Volver");
		
		Button forwardAgregarVehiculo =  new Button("Continuar");
		GridPane.setConstraints(marca, 0, 0);
		GridPane.setConstraints(marcaInput, 1,0);
		GridPane.setConstraints(modelo, 0,1);
		GridPane.setConstraints(modeloInput, 1,1);
		GridPane.setConstraints(vin, 0, 2);
		GridPane.setConstraints(vinInput, 1,2);
		GridPane.setConstraints(color, 0, 3);
		GridPane.setConstraints(colorInput, 1,3);
		GridPane.setConstraints(kilometraje, 0, 4);
		GridPane.setConstraints(kilometrajeInput, 1,4);
		GridPane.setConstraints(year, 0, 5);
		GridPane.setConstraints(yearInput, 1,5);
		GridPane.setConstraints(tipoVehiculo, 0, 6);
		GridPane.setConstraints(chooseVehiculo, 1,6);
		GridPane.setConstraints(backAgregarVehiculo, 0, 7);
		GridPane.setConstraints(forwardAgregarVehiculo, 1, 7);
		addVehiculo.getChildren().addAll(marca,marcaInput,modelo,modeloInput,vin,vinInput,color,colorInput,kilometraje,kilometrajeInput,year,yearInput,tipoVehiculo, chooseVehiculo, backAgregarVehiculo,forwardAgregarVehiculo);
		Scene sceneAgregarVehiculo = new Scene(addVehiculo,400,400);

		

		Button agregarVehiculo = new Button("Agregar Vehiculo");
		
		
		Button backRemoveVehiculo =  new Button("Volver");
		Button forwardRemoveVehiculo =  new Button("Eliminar");
		GridPane removeVehiculo = new GridPane();
		Label vinRemove = new Label("VIN");
		TextField vinInputRemove = new TextField();
		GridPane.setConstraints(vinRemove, 0, 0);
		GridPane.setConstraints(vinInputRemove, 1,0);
		GridPane.setConstraints(backRemoveVehiculo, 0, 1);
		GridPane.setConstraints(forwardRemoveVehiculo, 1, 1);
		removeVehiculo.getStylesheets().add(css);
		removeVehiculo.getChildren().addAll(vinRemove,vinInputRemove,backRemoveVehiculo,forwardRemoveVehiculo);
		Scene sceneRemoveVehiculo = new Scene(removeVehiculo,400,400);
		
		
		Button backBuscarVehiculo =  new Button("Volver");
		Button forwardBuscarVehiculo =  new Button("Buscar");
		GridPane buscaVehiculo = new GridPane();
		Label vinBuscar = new Label("VIN");
		TextField vinInputBuscar = new TextField();
		GridPane.setConstraints(vinBuscar, 0, 0);
		GridPane.setConstraints(vinInputBuscar, 1,0);
		GridPane.setConstraints(backBuscarVehiculo, 0, 1);
		GridPane.setConstraints(forwardBuscarVehiculo, 1, 1);
		buscaVehiculo.getStylesheets().add(css);
		buscaVehiculo.getChildren().addAll(vinBuscar,vinInputBuscar,backBuscarVehiculo,forwardBuscarVehiculo);
		Scene sceneBuscarVehiculo = new Scene(buscaVehiculo,400,400);
		
		Button backActualizarVehiculo =  new Button("Volver");
		Button forwardActualizarVehiculo =  new Button("Actualizar");
		GridPane ActualizarVehiculo = new GridPane();
		Label vinActualizar = new Label("VIN");
		TextField vinInputActualizar = new TextField();
		GridPane.setConstraints(vinActualizar, 0, 0);
		GridPane.setConstraints(vinInputActualizar, 1,0);
		GridPane.setConstraints(backActualizarVehiculo, 0, 1);
		GridPane.setConstraints(forwardActualizarVehiculo, 1, 1);
		ActualizarVehiculo.getStylesheets().add(css);
		ActualizarVehiculo.getChildren().addAll(vinActualizar,vinInputActualizar,backActualizarVehiculo,forwardActualizarVehiculo);
		Scene sceneActualizarVehiculo = new Scene(ActualizarVehiculo,400,400);
		
		Button eliminarVehiculo = new Button("Eliminar Vehiculo");
		Button buscarVehiculo = new Button("Buscar Vehiculo");
		Button actualizarVehiculo = new Button("Actualizar informacion vehiculo");
		Button volverVehiculos = new Button ("Volver al Menu Principal");
		
		
		//Gestion de Clientes
		
		GridPane addCliente = new GridPane();
		addCliente.getStylesheets().add(css);
		
		Label nombre = new Label("Nombre");
		Label correo = new Label("Correo");
		Label telefono = new Label("Telefono");
		Label domicilio = new Label("Domicilio");
		Label id = new Label("Cedula");

		
		TextField nombreTextField = new TextField();
		TextField correoTextField = new TextField();
		TextField telefonoTextField = new TextField();
		TextField domicilioTextField = new TextField();
		TextField idTextField = new TextField();
		
		Button backAgregarCliente =  new Button("Volver");
		Button forwardAgregarCliente =  new Button("Agregar");
		GridPane.setConstraints(nombre, 0, 0);
		GridPane.setConstraints(nombreTextField, 1,0);
		GridPane.setConstraints(correo, 0,1);
		GridPane.setConstraints(correoTextField, 1,1);
		GridPane.setConstraints(telefono, 0, 2);
		GridPane.setConstraints(telefonoTextField, 1,2);
		GridPane.setConstraints(domicilio, 0, 3);
		GridPane.setConstraints(domicilioTextField, 1,3);
		GridPane.setConstraints(id, 0, 4);
		GridPane.setConstraints(idTextField, 1,4);
		GridPane.setConstraints(backAgregarCliente, 0, 5);
		GridPane.setConstraints(forwardAgregarCliente, 1,5);
		addCliente.getChildren().addAll(nombre, nombreTextField,correo,correoTextField,telefono,telefonoTextField,domicilio,domicilioTextField,id,idTextField,backAgregarCliente,forwardAgregarCliente);
		Scene sceneAgregarCliente = new Scene(addCliente,400,400);
		

		GridPane removeCliente = new GridPane();
		Label idRemove = new Label("Cedula");
		TextField idInputRemove = new TextField();
		Button backRemoveCliente =  new Button("Volver");
		Button forwardRemoveCliente =  new Button("Eliminar");
		GridPane.setConstraints(idRemove, 0, 0);
		GridPane.setConstraints(idInputRemove, 1,0);
		GridPane.setConstraints(backRemoveCliente, 0, 1);
		GridPane.setConstraints(forwardRemoveCliente, 1, 1);
		removeCliente.getStylesheets().add(css);
		removeCliente.getChildren().addAll(idRemove,idInputRemove,backRemoveCliente,forwardRemoveCliente);
		Scene sceneRemoveCliente = new Scene(removeCliente,400,400);
		
		GridPane buscaCliente = new GridPane();
		Label idBuscar = new Label("Cedula");
		TextField idInputBuscar = new TextField();
		Button backBuscarCliente =  new Button("Volver");
		Button forwardBuscarCliente =  new Button("Buscar");
		GridPane.setConstraints(idBuscar, 0, 0);
		GridPane.setConstraints(idInputBuscar, 1,0);
		GridPane.setConstraints(backBuscarCliente, 0, 1);
		GridPane.setConstraints(forwardBuscarCliente, 1, 1);
		buscaCliente.getStylesheets().add(css);
		buscaCliente.getChildren().addAll(idBuscar,idInputBuscar,backBuscarCliente,forwardBuscarCliente);
		Scene sceneBuscarCliente = new Scene(buscaCliente,400,400);
		
		GridPane actualizaCliente = new GridPane();
		Label idActualizar = new Label("Cedula");
		TextField idInputActualizar = new TextField();
		Button backActualizarCliente =  new Button("Volver");
		Button forwardActualizarCliente =  new Button("Actualizar");
		GridPane.setConstraints(idActualizar, 0, 0);
		GridPane.setConstraints(idInputActualizar, 1,0);
		GridPane.setConstraints(backActualizarCliente, 0, 1);
		GridPane.setConstraints(forwardActualizarCliente, 1, 1);
		actualizaCliente.getStylesheets().add(css);
		actualizaCliente.getChildren().addAll(idActualizar,idInputActualizar,backActualizarCliente,forwardActualizarCliente);
		Scene sceneActualizarCliente = new Scene(actualizaCliente,400,400);
		
		
		Button gestionClientes = new Button("Gestion de Clientes");
		Button agregarCliente = new Button("Agregar Cliente");
		Button eliminarCliente = new Button("Eliminar Cliente");
		Button buscarCliente = new Button("Buscar Cliente");
		Button actualizarCliente = new Button("Actualizar informacion Cliente");
		Button volverClientes = new Button ("Volver al Menu Principal");
		//Gestion de Ventas
		Button gestionVentas = new Button("Gestion Ventas");	
		Button registrarVenta = new Button("Registrar Venta");
		Button consultarVenta = new Button("Consultar Venta");
		Button volverVentas = new Button ("Volver al Menu Principal");
		//Gestion de Inventario
		Button gestionInventario = new Button("Gestion Inventario");
		Button registrarVehiculo = new Button("Registrar Vehículo en el Inventario");
		Button eliminarVehiculoInventario = new Button("Eliminar Vehículo del Inventario");
		Button volverInventario = new Button ("Volver al Menu Principal");
		Button actualizarInventario = new Button("Actualizar Inventario");
		//Gestion de Mantenimiento 
		Button gestionMantenimiento = new Button("Gestion vehiculos de mantenimiento");
		Button registrarMantenimiento = new Button("Registrar Mantenimiento");
		Button consultarMantenimiento = new Button("Consultar Mantenimiento");
				
		//VBox
		VBox vboxVehiculos = new VBox();
		vboxVehiculos.getStylesheets().add(css);
		vboxVehiculos.getChildren().addAll(agregarVehiculo,eliminarVehiculo,buscarVehiculo,actualizarVehiculo, volverVehiculos);
		//Scene
		Scene Vehiculos = new Scene(vboxVehiculos, 400, 400);
		gestionVehiculos.setOnAction(e -> window.setScene(Vehiculos));
		backAgregarVehiculo.setOnAction(e-> window.setScene(Vehiculos));
		backRemoveVehiculo.setOnAction(e-> window.setScene(Vehiculos));
		backBuscarVehiculo.setOnAction(e-> window.setScene(Vehiculos));
		backActualizarVehiculo.setOnAction(e-> window.setScene(Vehiculos));
		
		
		
		//VBox
		VBox vboxGestionClientes = new VBox();
		vboxGestionClientes.getStylesheets().add(css);
		vboxGestionClientes.getChildren().addAll(agregarCliente, eliminarCliente, buscarCliente, actualizarCliente, volverClientes);
		//Scene
		Scene Clientes = new Scene(vboxGestionClientes, 400, 400);
		gestionClientes.setOnAction(e -> window.setScene(Clientes));
		backAgregarCliente.setOnAction(e-> window.setScene(Clientes));
		backRemoveCliente.setOnAction(e-> window.setScene(Clientes));
		backBuscarCliente.setOnAction(e-> window.setScene(Clientes));
		backActualizarCliente.setOnAction(e-> window.setScene(Clientes));
		

				
		//VBox
		VBox vboxGestionVentas = new VBox();
		vboxGestionVentas.getStylesheets().add(css);
		vboxGestionVentas.getChildren().addAll(registrarVenta, consultarVenta, volverVentas);
		Scene Ventas = new Scene(vboxGestionVentas, 400, 400);
		gestionVentas.setOnAction(e -> window.setScene(Ventas));
		
		//VBox
		VBox vboxInventario = new VBox();
		vboxInventario.getStylesheets().add(css);
		vboxInventario.getChildren().addAll(registrarVehiculo,eliminarVehiculoInventario,actualizarInventario, volverInventario);
		Scene Inventario = new Scene(vboxInventario, 400, 400);
		gestionInventario.setOnAction(e -> window.setScene(Inventario));
	
		//VBox
		VBox vboxMantenimiento = new VBox();
		vboxMantenimiento.getStylesheets().add(css);
		vboxMantenimiento.getChildren().addAll(registrarMantenimiento,consultarMantenimiento, botonMenuPrincipal);
		Scene mantenimiento = new Scene(vboxMantenimiento,400,400);
		gestionMantenimiento.setOnAction(e -> window.setScene(mantenimiento));

		VBox vboxMenuPrincipal  = new VBox();
		vboxMenuPrincipal.getChildren().addAll(label, gestionVehiculos, gestionClientes, gestionVentas, gestionInventario, gestionMantenimiento);
		vboxMenuPrincipal.getStylesheets().add(css);
		Scene MenuPrincipal = new Scene(vboxMenuPrincipal, 400, 400);
		volverVehiculos.setOnAction(e-> window.setScene(MenuPrincipal));
		volverClientes.setOnAction(e-> window.setScene(MenuPrincipal));
		volverVentas.setOnAction(e-> window.setScene(MenuPrincipal));
		volverInventario.setOnAction(e-> window.setScene(MenuPrincipal));
		botonMenuPrincipal.setOnAction(e -> window.setScene(MenuPrincipal));
		label.setLabelFor(vboxMenuPrincipal);
		
		agregarVehiculo.setOnAction(e-> window.setScene(sceneAgregarVehiculo));
		eliminarVehiculo.setOnAction(e-> window.setScene(sceneRemoveVehiculo));
		buscarVehiculo.setOnAction(e-> window.setScene(sceneBuscarVehiculo));
		actualizarVehiculo.setOnAction(e-> window.setScene(sceneActualizarVehiculo));
		
		agregarCliente.setOnAction(e-> window.setScene(sceneAgregarCliente));
		eliminarCliente.setOnAction(e-> window.setScene(sceneRemoveCliente));
		buscarCliente.setOnAction(e-> window.setScene(sceneBuscarCliente));
		actualizarCliente.setOnAction(e-> window.setScene(sceneActualizarCliente));
		


		
		//window.setFullScreen(true);
		window.setScene(MenuPrincipal);
		window.show();
		
	}

	@Override
	public void handle(ActionEvent arg0) {

		
	}
	
	


	

}
