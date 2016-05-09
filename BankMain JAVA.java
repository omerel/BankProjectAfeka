import java.util.*; 

public class BankMain {
 
	public static void main(String[] args) {
		

	}

}

class Bank {
	int accountNum;
	int personID;
}

class Account {
	int accountNum;
	int accountBalance;
	int loanID;
	int saveingID;
	int opID;
}

class Loan {
	int loanId;
	int amount;
	int mounthlyPayment;
	String intrese;
}

class Savings {
	int saveingID;
	int balance;
	int ratio;
}

class Operation {
	int opID;
	String type;
	Date date;        //// Convert string to date
	
					  //SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
					  //String strdate2 = "02-04-2013 11:35:42";
					    //try {
					       // Date newdate = dateformat2.parse(strdate2);
					        //System.out.println(newdate);
					    //} catch (ParseException e) {
					      //  e.printStackTrace();
					    //}
	int amount;
	String description;
}

class Person {
	String name;
	int id;
}

