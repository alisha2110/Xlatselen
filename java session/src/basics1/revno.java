n!package basics1;
import java.util.Scanner;
public class revno {

	public static void main(String[] args) {
	/*	int n=321;
		int rnum=0;
		
		while (n!=0)
		{int r=n%10;
		rnum=rnum*10+r;
		n=n/10;
		}
		System.out.println("reverse number is" +rnum);*/
		
	int n;
		 
	int rev=0;
	int digit;
		System.out.println("Enter any no:");
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		 
		 while( n>0)
			{digit=n%10;
			 rev=rev*10+digit;
			n=n/10;
			}
		 System.out.println("rev of no is"+ rev );
			 
				 
	}

}
 
		 
 