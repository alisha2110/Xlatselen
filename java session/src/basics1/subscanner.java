package basics1;

import java.util.Scanner;

public class subscanner {

	public static void main(String[] args) {
		int c,d,sub;
		Scanner M = new Scanner(System.in);
		System.out.println("Enter first number ");
		c = M.nextInt();
		System.out.println ("Enter second number ");
		d = M.nextInt();
		sub=c-d;
		System.out.println("Subtraction of two number is " +sub);
		
		

	}

}
