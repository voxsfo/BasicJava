import java.util.Scanner;

public class oper {

	public static void main(String[] args) {
		
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number ");
			
			
			int a=input.nextInt();
			
			if((a%3) == 0 && (a%5) == 0)
			{
				System.out.println("Consultadd JAVA Training");
				
			}
			else if(a%3 == 0)
			{
				System.out.println("Consultadd");
				}
			else if(a%5 == 0)
			{
				System.out.println("JAVA Training");}}
		}
		

