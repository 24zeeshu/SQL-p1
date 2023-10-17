package array;

public class max_min {
	public static void main(String args[])
	{
		int arr[]= {10,5,7,6,4,9,11,-8};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}

}
