import java.util.Scanner;

public class userinputaddsub {

	public static void main(String[] args) {
		System.out.println("For Addtion press 1\nFor Subraction press 2");
		System.out.println("For Division press 3\nFor Multipliaction press 4");
		System.out.println("For Average press 5");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num1 =sc.nextInt();
		int num2 = sc.nextInt();
		if(a==1) {
			System.out.println(+(num1+num2));
			if(num1+num2<0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}
			
		}
		else if (a==2) {
			System.out.println(+(num1-num2));
			if(num1-num2<0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}
		}
		else if(a==3){
			System.out.println(+(num1/num2));
			if(num1/num2<0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}
			
		}
		else if(a==4){
			System.out.println(+(num1*num2));
			if(num1*num2<0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}
			}
		else if(a==5){
			
			System.out.println(+(num1+num2)/2);
			if((num1+num2)/2<0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}	
		}
		
			else if(a>5) {
				System.out.println("Select Valid Option");
			}

	}

	}
