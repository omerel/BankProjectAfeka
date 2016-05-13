package application;

public class Context {
private final static Context instance = new Context();
	public  static Context getInstance() {
		return instance;
	}
	
	private system bankSystem = new system(1);
	
	public system getSystem(){
		return this.bankSystem;
	}

}
