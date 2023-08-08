package basics1;
import java.util.Scanner;
public class LMP {

	public static void main(String[] args) {
		int a,b;
		Scanner S= new Scanner(System.in);
		
		System.out.println("Enter value of a");
		a=S.nextInt();
		
		System.out.println("Enter value of b");
		b=S.nextInt();
		if (a>b)
		{System.out.println("a is greater");}
		else
		{System.out.println("a is not greater");}	
		if (a==b)
		{System.out.println(" equal");}
		else
		{System.out.println("not equal");}
		if(a>=b)
		{System.out.println("greater");}
		else
		{System.out.println("not greater");}
			
		}

	}


