package for_loop;

public class prime_no1 {

	public static void main(String[] args) {
		
		
		
		
		for(int n=11;n<=20;n++)
		{
			int c=0;
			for(int i=1;(i<n);i++)
			{
				if(n%i==0)
				{
					c++;
					
				}
			}
			if(c==0)
			{
				System.out.println(n);
			}	
		}
		

	}
	
}
