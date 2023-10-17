package W_loop;

public class Special_no {

	public static void main(String[] args) {
		int s=0;
		int n=145;
		int n1=n;
		
		
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			int f=1;
			int i=1;
			while(i<=ld)
			{
				f=f*i;
				i++;
			}	
			
			
		
		
			s=s+f;
		}
		if(n1==s)
		{
			System.out.println("special no");
		}
		else
		{
			System.out.println("not a special no");
		}

	}

}
