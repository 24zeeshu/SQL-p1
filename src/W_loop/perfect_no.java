package W_loop;

public class perfect_no {

	public static void main(String[] args) {
		int n=6;
		int i=1;
		int s=0;
		while(i<n)
		{
			if(n%i==0)
			{
				s=s+i;
				
			}
			i++;
			
		}
		if(s==n)
		{
			System.out.println("perfect no");
		}
		else
		{
			System.out.println("not a perfect no");
		}
	}
		

}
