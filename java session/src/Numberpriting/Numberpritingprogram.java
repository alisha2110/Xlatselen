package Numberpriting;
import java.util.Scanner;
public class Numberpritingprogram {

	public static void main(String[] args) {
		
		Scanner S= new Scanner(System.in);
		System.out.println("Enter no of rows");
		int Row=S.nextInt();
		
		for (int i=1;i<=Row;i++) {
			for(int j=1;j<=i;j++) 
			{System.out.print(j);
		}
			System.out.println();
	}

}
}
