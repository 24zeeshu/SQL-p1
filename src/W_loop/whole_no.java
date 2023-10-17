package W_loop;

public class whole_no {
	public static void main(String args[])
	{
//		int sp=90;
//		int ep=10;
//		while(sp>=ep)
//		{
//			if(sp%3==0)
//			{
//			System.out.println(sp);
//			}
//		
//			sp--;
//		}
		
		int s=0;
		int f=1;
		int n=53824;
		while(n>0)
		{
			int ld=n%10;
			if(ld%2==0)
			{
				s=s+ld;
			}
			else
			{
				f=f*ld;
			}
			n=n/10;
			
		}
		System.out.println(s);
		System.out.println(f);
		
	}

}
