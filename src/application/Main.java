/*package application;


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
		
		GridPane addVehiculo = new GridPane();
		addVehiculo.getStylesheets().add(css);
		
		Label marca = new Label("Marca");
		Label modelo = new Label("Modelo");
		Label vin = new Label("VIN");
		Label color = new Label("Color");
		Label kilometraje = new Label("Kilometraje");
		Label year = new Label("Año");
		
		TextField marcaInput = new TextField();
		TextField modeloInput = new TextField();
		TextField vinInput = new TextField();
		TextField colorInput = new TextField();
		TextField kilometrajeInput = new TextField();
		TextField yearInput = new TextField();
		
		
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
		GridPane.setConstraints(chooseVehiculo, 1,6);
		addVehiculo.getChildren().addAll(marca,marcaInput,modelo,modeloInput,vin,vinInput,color,colorInput,kilometraje,kilometrajeInput,year,yearInput,chooseVehiculo);
		Scene sceneAgregarVehiculo = new Scene(addVehiculo,400,400);
		
		
		Button agregarVehiculo = new Button("Agregar Vehiculo");
		Button eliminarVehiculo = new Button("Eliminar Vehiculo");
		Button buscarVehiculo = new Button("Buscar Vehiculo");
		Button actualizarVehiculo = new Button("Actualizar informacion vehiculo");
		Button volverVehiculos = new Button ("Volver al Menu Principal");
		
		
		//Gestion de Clientes
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
			
		//VBox
		VBox vboxGestionClientes = new VBox();
		vboxGestionClientes.getStylesheets().add(css);
		vboxGestionClientes.getChildren().addAll(agregarCliente, eliminarCliente, buscarCliente, actualizarCliente, volverClientes);
		//Scene
		Scene Clientes = new Scene(vboxGestionClientes, 400, 400);
		gestionClientes.setOnAction(e -> window.setScene(Clientes));
				
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


		
		//window.setFullScreen(true);
		window.setScene(MenuPrincipal);
		window.show();
		
	}

	@Override
	public void handle(ActionEvent arg0) {

		
	}
	
	//metodos de vehiculos


	

}*/
