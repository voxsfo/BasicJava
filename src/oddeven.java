import java.util.Scanner;

public class oddeven {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		if ( num % 2 == 0 )
		{
		 if(num==2 || num<5)
		 
			{
				System.out.println("OLD");
			}
		
	   else if (num==6 || num<30)
			{
				System.out.println("NEW");
			}
	   else if(num>30) 
		{
			System.out.println("OLD");
		}
		}
       
	    else
		{
			System.out.println("NEW");
		}
     }
	}


