package W_loop;

public class armstrong_no {

	public static void main(String[] args) {
		int c=0;
		int s=0;
		int n=1634;
		int n1=n;
		int n2=n;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			c++;
		}
		while(n1>0)
		{
			int ld=n1%10;
			n1=n1/10;
			int p=(int)Math.pow(ld,c);
			s=s+p;
			
		}
		if(n2==s)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println("not armstrong no");
		}
		

	}

}
