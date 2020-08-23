import java.util.Scanner;

public class floatingnum {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		float num = sc.nextFloat();
		
		if (num==0)
		{
			System.out.println("ZERO");
		}
		else if (num>0 && num<1000000)
		{
			System.out.println("Positive");
		}
			    
		else if(num>1000000) 
		 {
				System.out.println("Large"+Math.abs(num));
		 }
		
		else if(num<0 && num<1) 
		{
			System.out.println("Small "+Math.abs(num));
		}
	}}


