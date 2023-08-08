package Numberpriting;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,s=0,c,d;
		
		System.out.println("Enter nu");
		Scanner R= new Scanner(System.in);
		n=R.nextInt();
		
		c=n;
		while(n>0)
		{d=n%10;
		s=(s*10)+d;
		n=n/10;
		}
		if(c==s)
		{System.out.println("palindrome");}
		else
		{System.out.println("not palindrome");
		}
	
	}

}
