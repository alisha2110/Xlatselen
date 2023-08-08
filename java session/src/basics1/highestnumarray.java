package basics1;

public class highestnumarray {

	public static void main(String[] args) {
		int arr[]= {5,8,3,9};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{if(arr[i]>max)
		{max=arr[i];
		}
		}
		System.out.println(max);
	}

}
