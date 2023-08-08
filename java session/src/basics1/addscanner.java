package basics1;

import java.util.Scanner;

public class addscanner {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter first number:");
		a = add.nextInt();
		System.out.println("Enter second number:");
		b = add.nextInt();
		sum=a+b;
		System.out.println("Sum of two numbers is:" +sum);
		
	}

}
