package W_loop;

import java.util.Scanner;

public class sum_lastdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no=");
		int n=sc.nextInt();
		int s=0;
		while(n>0)
		{

			int ld=n%10;
			s=s+ld;
			n=n/10;
		}
		System.out.println(s);


	}

}
