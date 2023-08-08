package basics2;

public class Testabstract extends Abstract {

	public static void main(String[] args) {
		Testabstract t= new Testabstract();
		t.display();
		t.interestRate();
		t.run();
		
	}

	
	public void interestRate() {
		System.out.println("itr method"); //this method is declared in abstarct class and implemented here
		
	}
   
	public void display() {
	System.out.println("Displaying");
}

}
