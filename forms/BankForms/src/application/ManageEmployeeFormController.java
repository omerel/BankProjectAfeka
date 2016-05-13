package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.MenuButton;

public class ManageEmployeeFormController implements Initializable {
	private system sys;
	@FXML
	private BorderPane ManageEmployeesPane;
	@FXML
	private TextField Eid;
	@FXML
	private TextField Ename;
	@FXML
	private TextField Ephone;
	@FXML
	private Button EsubmitAdd;
	@FXML
	private Button plus;
	@FXML
	private MenuButton employeemn;
	@FXML
	private MenuButton jobmn;
	@FXML
	private Button removebtn;	
	@FXML
	private TextField EPASS;
	@FXML
	private ComboBox ComboBoxEmployeeType;
	
	private List<Integer> Phonenumbers = new ArrayList<>();
	private void reset(){
		//reset all texts fields.
	}
	
	@FXML
	public void refreshPaddwordtext(ActionEvent event) {
		if(this.ComboBoxEmployeeType.getValue()=="other")
			this.EPASS.setDisable(true);
		else
			this.EPASS.setDisable(false);
		System.out.println("setting the epass");
	}	
	// Event Listener on Button[#EsubmitAdd].onAction
	@FXML
	public void AddEmployee(ActionEvent event) {
		if(this.ComboBoxEmployeeType.getValue()==null)
			System.out.print("You must choose employee type\n");
		if(!sys.isManager()){
			System.out.println("you must be logged in as a manager to continue!.");
			return;
		}
		try{
			int EID= Integer.parseInt(this.Eid.getText());
			String name = this.Ename.getText();
			String password = this.EPASS.getText();
			this.sys.AddEmployee((String) this.ComboBoxEmployeeType.getValue(), EID, name, null ,password);
			//new employees using the info above.
			//check if Account exists and make Account logged in
			reset();
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#plus].onAction
	@FXML
	public void AddNumber(ActionEvent event) {
		try{	
			int number= Integer.parseInt(this.Ephone.getText());
			this.Phonenumbers.add(number);
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#removebtn].onAction
	@FXML
	public void removeEmployee(ActionEvent event) {
		//get the employee form the list and remove him.
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sys = Context.getInstance().getSystem();
		sys.printhello();
		this.ComboBoxEmployeeType.getItems().addAll("Bank Teller","Personal Banker","Manager","Consoltant","other");
	}
}
