import java.util.Scanner;
public class PrimesSumInRange {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int m = s.nextInt();
      int sum =0;
      for(int i=n;i<=m;i++) {
    	  boolean isprime = true;
    	  for(int j=2;j<i;j++) {
    		  if(i%j==0) {
    			  isprime = false;
    			  break;
    		  }
    	  }
    	  if(isprime) {
    		  sum+=i;
    		// System.out.println(i);
    	  }
      }
      System.out.println(sum);
      s.close();
	}

}
