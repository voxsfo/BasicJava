import java.util.Scanner;

public class scanz {

	public static void main(String[] args) {
		
			System.out.println("Enter the values \n");
			
			Scanner inputnumber = new Scanner(System.in);
			
			int a = inputnumber.nextInt();
			
			int b = inputnumber.nextInt();
			
			if (a>10 || b>10)
			{
				System.out.println("Enter number between 1-10");
			}
			
			else
			{
				int z = a+b;
				System.out.println("Final value is  "+(z+30));
			}
			

	}

}
