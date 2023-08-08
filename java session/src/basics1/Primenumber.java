package basics1;

public class Primenumber {

	public static void main(String[] args) {
		/*int num=4;
		Boolean flag=true;
		for (int i=2;i<num/2;i++)
		{if(num%i==0) {
			flag=false;
		}
		}
		if (flag==false)
		{System.out.println("not a prime");}
		
		else
		{System.out.println("prime number");}*/
		
		
		int num=2;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if (num%i==0) 
		{count++;}
		}
		if (count==2) 
		{System.out.println("prime no");}
		else 
		{ System.out.println("not prime");}
	}
	

}
