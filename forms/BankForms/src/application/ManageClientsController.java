package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;

import javafx.scene.image.ImageView;

import javafx.scene.layout.BorderPane;

public class ManageClientsController implements Initializable{
	private system sys;
	@FXML
	private BorderPane ManageClientsPane;
	@FXML
	private ImageView AddPhoto;
	@FXML
	private Button AddClient;
	@FXML
	private TextField AddName;
	@FXML
	private TextField AddID;
	@FXML
	private Button RemoveBTN;
	@FXML
	private TextField RemoveName;
	@FXML
	private TextField RemoveID;
	@FXML
	private ImageView RemovePhoto;
	@FXML
	private TextArea brodcast;
	@FXML
	private Button brodBTN;

	// Event Listener on Button[#AddClient].onAction
	private void reset(){
		
	}
	@FXML
	public void AddClient(ActionEvent event) {
		try{
			int ID = Integer.parseInt(this.AddID.getText());
			String name = this.AddName.getText();
			//search in the system and add if success.
			this.sys.RemoveClient(ID, name, null);
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#RemoveBTN].onAction
	@FXML
	public void RemoveClient(ActionEvent event) {
		try{
			int ID = Integer.parseInt(this.RemoveID.getText());
			String name = this.RemoveName.getText();
			this.sys.RemoveClient(ID, name, null);
			//search in the system and remove if success.
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sys = Context.getInstance().getSystem();
		sys.printhello();
	}
}
