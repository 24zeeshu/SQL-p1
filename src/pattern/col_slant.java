package pattern;

public class col_slant {
	public static void main (String args[])
	{
		
		int n=4;
		for(int r=1;(r<=n);r++)
		{
			for(int c=1;(c<=n-r+1);c++)
			{
				
				
				if(c%2!=0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
				
				
				
				
			}
			System.out.println();
			
		}
	}


}
