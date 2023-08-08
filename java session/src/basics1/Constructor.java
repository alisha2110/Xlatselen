package basics1;

public class Constructor {
int a;
String str;


public Constructor(int i, String S) {
	a=i;
	str = S;
	
}


	public static void main(String[] args) {
		Constructor con = new Constructor(5,"alisha");
		System.out.println(con.a);
		System.out.println(con.str);
		Constructor con1 = new Constructor(10,"raahi");
		System.out.println(con1.a);
		System.out.println(con1.str);
		
	}
}
