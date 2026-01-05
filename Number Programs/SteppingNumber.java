import java.util.Scanner;
public class SteppingNumber {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      boolean stepping = true;
      int n = s.nextInt();
      int num1 = n%10;
      n/=10;
      while(n>0) {
    	  int num2 = n%10;
    	  int sub = num1 - num2;
    	  if(sub != -1 && sub !=1) {
    		  stepping = false;
    		  break;
    	  }
    	  n/=10;
    	  num1=num2;
      }
      if(stepping) {
      System.out.println("Stepping Number.");
      }
      else {
          System.out.println("Not a Stepping Number.");
      }
      s.close();
	}
}
