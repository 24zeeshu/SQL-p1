package W_loop;

public class count_digit {
	public static void main(String args[])
	{
		int c=0;
		int n=12356;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			c++;
		}
		System.out.println(c);
	}

}
