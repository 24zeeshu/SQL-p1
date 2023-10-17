package W_loop;
import java.util.*;

public class last_digit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no=");
		int n=sc.nextInt();
		int s=0;
		while(n>0)
		{
			
			int ld=n%10;
			System.out.println(ld);
			n=n/10;
			
		}
		
//		int sp=3;
//		int ep=5;
//		int f=1;
//		while(sp<=ep)
//		{
//			f=f*sp;
//			sp++;
//		}
//		System.out.println(f);
	}

}
