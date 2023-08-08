package polymorphism;

public class Overloading {

	public static void main(String[] args) {
		Overloading O= new Overloading();
		O.add (5,10);
		O.add(10,5,3);
		O.add("Alisha", "jaiswal");
		O.add(50,50,2);
	}
public void add(int a, int b) {
	int sum;
	sum=a+b;
	System.out.println(sum);
}
public void add(int a,int b,int c) {
int sum;
sum=a+b+c;
System.out.println(sum);
}
public void add(String a,String b) {
	String sum=a+b;
	System.out.println( sum);
}
}
