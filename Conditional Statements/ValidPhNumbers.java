import java.util.Scanner;
public class ValidPhNumber {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
	  System.out.print("Enter the phone number:");
      long ph_no = s.nextLong();
      if(ph_no>=6000000000l && ph_no<=9999999999l) {
    	  System.out.print("Valid number:"+ph_no);
      }
      else {
    	  System.out.print("Please enter a valid phone number!!");
      }
      s.close();
	}

}
