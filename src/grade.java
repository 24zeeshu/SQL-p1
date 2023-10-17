
public class grade {

	public static void main(String[] args) {
		int g=-1;
		if((g>100)||(g<0))
		{
			System.out.println("default");
		}
		else if((g>91)&&(g<100))
		{
			System.out.println("grade=A+");
		}
		else if((g>81)&&(g<90))
		{
			System.out.println("grade=A");
		}
		else if((g>71)&&(g<80))
		{
			System.out.println("grade=B+");
		}
		else if((g>61)&&(g<70))
		{
			System.out.println("grade=B");
		}
		else if((g>51)&&(g<60))
		{
			System.out.println("grade=C");
		}
		else if((g>41)&&(g<50))
		{
			System.out.println("grade=D");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
