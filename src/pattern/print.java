package pattern;

public class print {
	public static void main (String args[])
	{
		int n=5;
		int ctr=0;
		for(int r=1;(r<=n);r++)
		{
			for(int c=1;(c<=n-r+1);c++)
			{
				System.out.print(n-c+1-ctr);
				
			}
			ctr++;
			System.out.println();
			
		}
	}

}
