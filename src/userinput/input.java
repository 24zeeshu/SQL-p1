package userinput;
import java.util.Scanner;

public class input {
	public static void main(String args[])
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the age");
//		int a=sc.nextInt();
//	
//		System.out.println("enter the name");
//		String n=sc.next();
//		
//		System.out.println("I am "+ a +" year old");
//		
//		System.out.println("I am "+n);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no between 1-7 to corresponding day");
		int day=sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
		default:
			System.out.println("wrong choice");
		}
	}

}
