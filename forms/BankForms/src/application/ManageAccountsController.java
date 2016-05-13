package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ManageAccountsController  implements Initializable {
	private system sys;
	@FXML
	private TextField Anum;
	@FXML
	private TextField Apass;
	@FXML
	private ImageView Photo;
	@FXML
	private Button loginbtn;
	@FXML
	private Button delbtn;
	@FXML
	private Label errWithdraw;
	@FXML
	private TextField withdrawA;
	@FXML
	private TextField WithdrawCon;
	@FXML
	private Button Withdrawbtn;
	@FXML
	private Button transbtn;
	@FXML
	private TextField transAmount;
	@FXML
	private TextField tranCon;
	@FXML
	private TextField transAccount;
	@FXML
	private Label errtransfer;
	@FXML
	private TextField AccountID;
	@FXML
	private TextField Balance;
	@FXML
	private Button printbtn;
	@FXML
	private Button depositbtn;
	@FXML
	private TextField DepositAmount;
	@FXML
	private TextField DepositCon;
	@FXML
	private TextField IDTXT;
	@FXML
	private TextField NUMTXT;
	@FXML
	private TextField PASSTXT;
	@FXML
	private Button SubmitClient;
	@FXML
	private Button btnPlus;
	@FXML
	private BorderPane MAccountsPane;
	
	
	private Account Account;
	private List<Client> clients = new ArrayList<>();;
	private boolean loggedFlag = false;
	private void reset(){
		
	}
	
	// Event Listener on Button[#loginbtn].onAction
	@FXML
	public void loginAccount(ActionEvent event) {
		try{
			int AccountID = Integer.parseInt(this.Anum.getText());
			String password = this.Apass.getText();
			loggedFlag = true;
			//check if Account exists and make Account logged in
			reset();
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	
	// Event Listener on Button[#delbtn].onAction
	@FXML
	public void DeleteAccount(ActionEvent event) {
		if(this.loggedFlag){
			//delete the Account
			reset();
			this.loggedFlag = false;
		}
	}
	// Event Listener on Button[#Withdrawbtn].onAction
	@FXML
	public void WithdrawMoney(ActionEvent event) {
		try{
			int ammount= Integer.parseInt(this.withdrawA.getText());
			int confirm= Integer.parseInt(this.WithdrawCon.getText());
			if(ammount==confirm){
				//withdraw money from the logged in account.
			}
			//check if Account exists and make Account logged in
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#transbtn].onAction
	@FXML
	public void MakeTransfer(ActionEvent event) {
		try{
			int ammount= Integer.parseInt(this.transAmount.getText());
			int confirm= Integer.parseInt(this.tranCon.getText());
			int account = Integer.parseInt(this.transAccount.getText());
			
			if(ammount==confirm){
				//check if other account exists.
				
				//withdraw money from the logged in account.
			}
			//check if Account exists and make Account logged in
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#printbtn].onAction
	@FXML
	public void printBalance(ActionEvent event) {
		this.AccountID.setText(Account.getID());
		this.Balance.setText(Account.getBalance());		
	}
	// Event Listener on Button[#depositbtn].onAction
	@FXML
	public void Deposit(ActionEvent event) {
		try{
			int ammount= Integer.parseInt(this.DepositAmount.getText());
			int confirm= Integer.parseInt(this.DepositCon.getText());
			if(ammount==confirm){
				//search for that  account in the database.
				//deposit money to the logged in account.
			}
			//check if Account exists and make Account logged in
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#SubmitClient].onAction
	@FXML
	public void newClientAccount(ActionEvent event) {
		//get the arraylist you made
		try{
			int confirm= Integer.parseInt(this.WithdrawCon.getText());
			String password = this.PASSTXT.getText();
			
			//check if Account exists and make Account logged in
		}catch(Exception e )
		{
			System.out.println("an Exception has Occured!!");
			reset();
		}
	}
	// Event Listener on Button[#btnPlus].onAction
	@FXML
	public void AddClientToAccount(ActionEvent event) {
		int accountID= Integer.parseInt(this.IDTXT.getText());
		Client c = null;
		if(c!=null)
		this.clients.add(c);
		//search for the client in the database
		//if he exists.
		// make a List<Cliens> and add to it
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sys = Context.getInstance().getSystem();
		sys.printhello();
	}
}
