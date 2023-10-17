package userDefined_function;

public class prime_even {
		public static void main(String args[])
	{
		for(int m=1;m<=20;m++)
		{
			print_prime(m);
		}

		
	}
	public static void print_prime(int m)
	{
		int c=0;
		for(int i=1;i<=m;i++)
		{
			if(m%i==0)
				{
					c++;
					
				}
		}	
		if(c==2)
			{
				System.out.println(m);
			}	
		

	}

}
