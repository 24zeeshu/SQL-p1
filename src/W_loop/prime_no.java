package W_loop;

public class prime_no {

	public static void main(String[] args) {
		int i=1;
		int n=7;
		int c=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				c++;
			}
			
			i++;
				
			
		}
		System.out.println(c);
		if(c==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not a prime no");
		}

	}

}
