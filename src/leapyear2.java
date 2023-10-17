
public class leapyear2 {

	public static void main(String[] args) {
		int y=1900;
		if(((y%100==0)&&(y%400==0))||((y%100!=0)&&(y%4==0)))
		{
			System.out.println("ly");
		}
		else
		{
			System.out.println("nly");
		}

	}

}
