
public class Revision {
	//Constructor body// it get called implicitly when we create object of class
Revision(){
	System.out.println("mellon");
}
Revision(String S)
{System.out.println(S);}

//Method/function
public void Alisha() {
System.out.println("Jaiswal");
}

public int Sachin()
{System.out.println("jaiswal2");
return 8;
}

public String Raahi() 
{System.out.println("RPS");
return "RPS";
}


public int grapes(int a,int b) 
{int sum=a+b;

System.out.println(sum);
return sum;
}
public int Banana(int c)
{System.out.println("good");
return 8;
}
	public static void main(String[] args) {
		Revision R= new Revision();  //1.Revision R= new Revision("Swati")swati will get printed bcoz in the constructor we declared string data type and we have to pass string(swati) inside object
		                             // 2.to call the constructor we dont need to define anything explicitly it will get executed automatically
		R.Alisha();                  // function alisha get called 
		R.Sachin();                 // function Sachin get called
	    R.Raahi();
	    int i=R.grapes(5, 10);
	    int b= R.Banana(8);
	}

}
