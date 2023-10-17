package W_loop;
import java.util.*;

public class user_input {
	public static void main (String args[])
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the starting range=");
//		int sp=sc.nextInt();
//		System.out.println("enter the ending range=");
//		int ep=sc.nextInt();
//		while(sp<=ep)
//		{
//			if(sp%2==0&&sp%3==0)
//			{
//				System.out.println(sp);
//			}
//			sp++;
//		}
		int sp=30;
		int ep=40;
		int s=0;
		while(sp<=ep)
		{
			if(sp%2==0)
			{
				s=s+sp;
			}
			sp++;
		
			
		}
		System.out.println(s);
		
	}

}
