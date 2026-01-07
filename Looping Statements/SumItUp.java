import java.util.Scanner;
public class SumItUp {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      while(num>9) {
    	  int sum=0;
    	  while(num>0) {
    	  int rem = num%10;
    	   sum +=rem; 
    	   num/=10;
      }
    	  num = sum;
      }
      System.out.println((num==1)? " Magic":"Not magic");
      s.close();
	}
}
