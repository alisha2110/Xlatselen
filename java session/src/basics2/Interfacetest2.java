package basics2;

public class Interfacetest2 implements Interfacetest{

	public static void main(String[] args) {
		Interfacetest2 t = new Interfacetest2();
		t.getinterestrate();
		Interfacetest.message();
	}

	public int getinterestrate() 
	{
		System.out.println("Inside interest rate fx");
		return 7;
	}

}
