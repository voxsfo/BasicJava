import java.util.Scanner;

public class breakcontinue {
	
	public static void main(String[] args){
		  int x;
		  Scanner s = new Scanner(System.in);

		  for(;;){
		    
		    x = s.nextInt();
		    if(x>0) {
		    System.out.println("Good going");
		    continue;
		    }
		    else if (x<0){
		    	System.out.println("It’s Over");

		      break;
		    }
		  }
		}
		
	

}
