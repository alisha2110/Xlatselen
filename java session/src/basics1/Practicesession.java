package basics1;
class pen{ 

	
String type;
String colour ;
public void write() 
{System.out.println("rewdo");
}
public void read() 
{System.out.println(this.colour);
System.out.println(this.type);
}
}



class Student{
String name;
int age;

public void printinfo() 
{System.out.println(this.name);
System.out.println(this.age);
}
}


public class Practicesession {

	public static void main(String[] args) {
		pen p=new pen();
		pen p2=new pen();
		p2.colour="pink";
		p2.type="ball";
		p2.read();
		
		p.colour="blue";
		p.type="gel";
		p.read();
		p.write();
		
		Student S= new Student();
		S.name="alisha";
		S.age=32;
		S.printinfo();
		
		Student S2=new Student();
		S2.name="manali";
		S2.age=21;
		S2.printinfo();
		
	}

}
