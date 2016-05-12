package application;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private int ID;
	private String name;
	private List<Integer> PhoneNumber;

public Person(int id,String name)
{
	this.ID = id;
	this.name = name;
	this.PhoneNumber  = new ArrayList<Integer>();
}
public int getId(){
	return this.ID;
}
public List<Integer> getPhoneNumber(){
	return this.PhoneNumber;
}
public String getName(){
	return this.name;
}
public void addPhoneNumber(int newPhone){
	this.PhoneNumber.add(newPhone);
}
}

