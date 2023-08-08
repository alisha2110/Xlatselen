package basics1;

import java.util.Scanner;

public class doublescanner {

	public static void main(String[] args) {
		double j,k,add;
		Scanner sum = new Scanner (System.in);
		System.out.println("enter first no: ");
		j = sum.nextDouble();
		System.out.println("enter sec no:");
		k = sum.nextDouble();
		add=j+k;
		System.out.println("addition of two num is: " +add);
		
	}

}
