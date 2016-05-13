package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;

public class MenuFormController implements Initializable{
	private system sys;
	@FXML
	private BorderPane MenuPane;
	@FXML
	private Button gotoManageAccounts;
	@FXML
	private Button gotoManageClients;
	@FXML
	private Button gotoManageEmployees;
	@FXML
	private SubScene SubSceneForm;

	// Event Listener on Button[#gotoManageAccounts].onAction
	@FXML
	public void DisplayManageAccounts(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ManageAccounts.fxml"));
		Parent root = (Parent)loader.load();
		//Stage stage = (Stage) this.MenuPane.getScene().getWindow();
//		Stage stage = new Stage();
//		Scene scene = new Scene(root,1000,1000);
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		stage.setScene(scene);
//		stage.show();
		this.SubSceneForm.rootProperty().set(root); 

	}
	// Event Listener on Button[#gotoManageClients].onAction
	@FXML
	public void DisplayManageClients(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ManageClients.fxml"));
		Parent root = (Parent)loader.load();
		//Stage stage = (Stage) this.MenuPane.getScene().getWindow();
//		Stage stage = new Stage();		Scene scene = new Scene(root,1000,1000);
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		stage.setScene(scene);
//		stage.show();
		this.SubSceneForm.rootProperty().set(root); 

	}
	// Event Listener on Button[#gotoManageEmployees].onAction
	@FXML
	public void DisplayManageEmployees(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ManageEmployeeForm.fxml"));
		Parent root = (Parent)loader.load();
		//Stage stage = (Stage) this.MenuPane.getScene().getWindow();
		//Stage stage = new Stage();
		this.SubSceneForm.rootProperty().set(root); 
		//Scene scene = new Scene(root,1000,1000);
		//this.SubSceneForm.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//stage.setScene(scene);
		//stage.show();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sys = Context.getInstance().getSystem();
		sys.printhello();
	}
}
