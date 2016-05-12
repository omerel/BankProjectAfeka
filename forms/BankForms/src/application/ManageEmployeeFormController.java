package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;

import javafx.scene.control.MenuButton;

public class ManageEmployeeFormController {
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

	private List<Integer> Phonenumbers = new ArrayList<>();
	private void reset(){
		//reset all texts fields.
	}
	// Event Listener on Button[#EsubmitAdd].onAction
	@FXML
	public void AddEmployee(ActionEvent event) {
		try{
			int EID= Integer.parseInt(this.Eid.getText());
			String name = this.Ename.getText();
			String password = this.EPASS.getText();
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
}
