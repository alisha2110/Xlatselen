package basics1;

public class foreachloop {

	public static void main(String[] args) {
		//for each-generally it is used to iterate over an array
		 int arr[]= {3,5,6,7,9};
		 int sum=0;
		 for (int n: arr)
		 {sum=sum+n;	}
System.out.println(sum);
	}
}
