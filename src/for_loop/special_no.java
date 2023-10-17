package for_loop;

public class special_no {

	public static void main(String[] args) {
		int s=0;
		int n=145;
		int n1=n;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			int f=1;
			for(int i=1;i<=ld;i++)
			{
				f=f*i;
			}
			s=s+f;
		}
		if(s==n1)
		{
			System.out.println("prime no");
		}
		else 
		{
			System.out.println("not a prime no");
		}

	}

}
