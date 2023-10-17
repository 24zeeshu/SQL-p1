package W_loop;

public class reverse_no {
	public static void main(String args[])
	{
		int m=1234;
		
		
		while(m>0)
		{
		  int ld=m%10;
		   m=m/10;
		}
		
		System.out.println(m);
	}

}
