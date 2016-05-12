package application;

public class system {

	public system() {
		
	}
	private void print(String s){
		System.out.println(s);
	}
	private void ManageClientsForm(){
		print("Manage Clinets Form");
	}
	private void ManageEmployeesForm(){
		print("Manage Employees Form");
		//display form
		print("1-add.\n2-remove.\n3-update.\n");
	}
	private void ManageManagersForm(){
		print("Manage Managers Form");
	}
	private void ManageAccountsForm(){
		print("Manage Accounts Form");
	}
}
