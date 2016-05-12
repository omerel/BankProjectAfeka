package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class MainFormController {
	@FXML
	private TextField EpassTxt;
	@FXML
	private TextField EidTxt;
	@FXML
	private Button ESubmit;
	@FXML
	private Button resertE;
	@FXML
	private TextField MidTxt;
	@FXML
	private TextField MpassTxt;
	@FXML
	private TextField MpassTxt2;
	@FXML
	private Button Msubmit;
	@FXML
	private Button resetM;
	@FXML
	private Label nameLBL;
	@FXML
	private Label PoneLBL;
	@FXML
	private Label EmailLBL;

	// Event Listener on Button[#ESubmit].onAction
	@FXML
	public void loginE(ActionEvent event) {
	try{
		int EmployeeID = Integer.parseInt(this.EidTxt.getText());
		String password = this.EpassTxt.getText();
		//check if the employee is in the system and goto menu form
		System.out.println("loginE");
	}catch(Exception e )
	{
		System.out.println("an Exception has Occured!!");
		reset(null);
	}
	}
	// Event Listener on Button[#resertE].onAction
	@FXML
	public void reset(ActionEvent event) {
		this.EidTxt.setText("");
		this.EpassTxt.setText("");
		this.MidTxt.setText("");
		this.MpassTxt.setText("");
		this.MpassTxt2.setText("");
		System.out.println("reset");

	}
	// Event Listener on Button[#Msubmit].onAction
	@FXML
	public void loginM(ActionEvent event) {
		try{
		int managerID = Integer.parseInt(this.MidTxt.getText());
		String password = this.MpassTxt.getText();
		String confirm = this.MpassTxt2.getText();
		if(password.equals(confirm)){
			//check if is in the system and display menu form
		}
		System.out.println("loginm");
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset(null);
		}

	}
	// Event Listener on Button[#resetM].onAction

}
