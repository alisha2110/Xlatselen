package basics1;

import java.util.Scanner;

public class floatscanner {

	public static void main(String[] args) {
	float s,l,add;
	Scanner sum = new Scanner (System.in);
	System.out.println("Enter first nu:");
	s = sum.nextFloat();
	System.out.println("Enter sec no:");
	l = sum.nextFloat();
	add=s+l;
	System.out.println("addtion of two no is: " +add);
	
	}

}
