package application;
public class Employee extends Person {
private int EmployeeNumber;
private boolean Status;
	public Employee(int id,String name,int EmployeeNum){
		super(id,name);
		this.Status = false;
		this.EmployeeNumber = EmployeeNum;
	}

}
