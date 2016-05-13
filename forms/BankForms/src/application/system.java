package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

//here is the main system that we directly connect to the database!!.
public class system {
private List<Employee> allEmloyees;
private List<Client> allClients;
private List<Account> allAccounts;
private boolean ManagerFlag;
private int bankID;
	public system(int bankID) {
		this.bankID = bankID;
		this.allAccounts = new ArrayList<>();
		this.allClients = new ArrayList<>();
		this.allEmloyees  = new ArrayList<>();
		this.ManagerFlag = false;
	}
	public void printhello(){
		System.out.println("hello, from system, id  = "+this.bankID);
	}
	private void print(String s){
		System.out.println(s);
	}
	private void ManageClientsForm(Client c,int whatToDo){//1-add , 2- remove , 3- update.
		print("Manage Clinets Form");
	}
	private void ManageEmployeesForm(Employee e, int whatToDo){//1-add , 2- remove , 3- update.
		print("Manage Employees Form");
		//display form
	}
	private void ManageManagersForm(){
		print("Manage Managers Form");
	}
	private void ManageAccountsForm(){
		print("Manage Accounts Form");
	}
	public boolean AddClient(int ID,String name,Image photo){
		Client c = null;
		//Add the client to the database and check if there are no errors (id matches others ... etc).
		this.ManageClientsForm(c,1);
		return true;
	}
	public boolean RemoveClient(int ID,String name,Image photo){
		Client c = null;
		//Add the client to the database and check if there are no errors (id matches others ... etc).
		this.ManageClientsForm(c,2);
		return true;
	}
	public boolean AddEmployee(String type,int ID,String name,Image photo,String password){
		Employee e = null;
		//Add the client to the database and check if there are no errors (id matches others ... etc).
		this.ManageEmployeesForm(e, 1);
		return true;
	}
	public boolean RemoveEmployee(String type,int ID,String name,Image photo){
		Employee e = null;
		//Add the client to the database and check if there are no errors (id matches others ... etc).
		this.ManageEmployeesForm(e, 2);
		return true;
	}
	
	public boolean isManager(){
		return this.ManagerFlag;
	}
	public void setManager(){
		this.ManagerFlag = true;
	}	
	public boolean CheckNomalLogin(int ID, String passWord){
		//check if the info is correct.
		return true;
	}
	public boolean CheckManagerLogin(int ID, String passWord){
		//check if the info is correct.
		//if the manager is loggen in then the flag is set to true;
		// only when the manager flag is true we can access the manage employees page.
		return true;
	}	
	
	
}
