import java.util.Scanner;
public class ReducedFraction {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      String str = n+"";
      while(str.length()>1) {
    	  String next = "";
    	  for(int i=0;i<str.length()-1;i++) {
    		  int a = str.charAt(i)-'0';
    		  int b = str.charAt(i+1)-'0';
    		  int diff;
    		  if(a>b) {
    			  diff = a-b;
    		  }
    		  else {
    			  diff = b-a;
    		  }
    		  next+=diff;
    	  }
    	  str = next;
      }
      System.out.println(str);
      s.close();
	}
}
