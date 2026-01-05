import java.util.Scanner;
public class OrderOfNUmbers {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      String str = n+"";
      boolean ascending = true,descending = true;
      for(int i=0;i<str.length()-1;i++) {
    	  if(str.charAt(i)>str.charAt(i+1)) {
    		  ascending = false;
    	  }
    	  if(str.charAt(i)<str.charAt(i+1)) {
    		  descending = false;
    	  }
      }
      if(ascending) {
    	  System.out.println("ascending order.");
      }
      else if(descending) {
    	  System.out.println("descending order.");
      }
      else {
    	  System.out.println("not in order.");
      }
      s.close();
	}
}
