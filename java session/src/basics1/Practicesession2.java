package basics1;

public class Practicesession2 {int age;
String name;
//method/function over loading
	public void print(String name,int age) 
	{
	System.out.println(name+""+ age);
	
	}
	public void print(String name) {
		System.out.println(name);
		
	}
	public void print(int age) {
		System.out.println(age);
	}
	public static void main(String[] args) {
		Practicesession2 S= new Practicesession2();
		S.name="alisg";
		S.age=32;
		S.print(S.name,S.age);
		S.name="sachin";
		S.age=33;
		S.print(S.name,S.age);
		
		S.name="raahi";
		S.age=3;
		S.print(S.name);
		S.print(S.age);
	}

}
