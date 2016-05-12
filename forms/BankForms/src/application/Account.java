package application;

import java.util.List;

public class Account {
private int AccountNum;
private String password;
private int Balance;
private List<Client> clients;
	public Account(int num,String pass,List<Client> list) {
		this.AccountNum = num;
		this.password = pass;
		this.clients = list;
		this.Balance  = 0;
	}
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

}
