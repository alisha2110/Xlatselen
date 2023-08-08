package basics1;//multilevel inheritance
class Shape{
	public void area() {
System.out.println("dipaly area");}

}
	class Triangle extends Shape{
		public void area(int l,int h) {
			System.out.println(1/2*l*h);
		}
		
	}
	
	class square extends Triangle{
		
		public void area(int l,int h) {System.out.println("1/2*l*h");
}
	}
public class Practicessession3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
