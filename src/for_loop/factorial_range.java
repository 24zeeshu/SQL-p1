package for_loop;

public class factorial_range {
	public static void main(String args[])
	{
		for(int n=1;(n<=5);n++)
		{
			int f=1;
			for(int i=1;(i<=n);i++)
			{
				f=f*i;
			}
			
			System.out.println(f);
		}
	}

}
