package encapsulation;
class Account{
	public String Name;             //access modifier
	private String password;
	String gender;                 //default access modifier
	protected String  email; 
	public void info() {
	System.out.println(Name);
	System.out.println(gender);
	System.out.println(email);
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String pass) {
		this.password=pass;
	}
}

public class Bank {

	public static void main(String[] args) {
		Account A= new Account();
		A.Name="alisha";
		A.gender="f";
		A.email="alishakhobaragade@gmail.com";
		A.info();
		A.setPassword("acv");
		System.out.println(A.getPassword());
		
	//	A.password="abcd"// cannot acces "private" modifiers inside sub class also,only accessible inside that class and if want to access then using getter n setter method

	}

}
