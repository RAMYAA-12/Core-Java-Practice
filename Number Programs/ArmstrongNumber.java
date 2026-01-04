import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n= s.nextInt();
       int count=0;
       int temp=n;
       int sum=0;
       while(temp>0) {
    	   temp=temp/10;
    	   count++;
       }
       int temp2=n;
       while(temp2>0) {
    	  int digit=temp2%10;
    	  int power = 1;
          for (int i = 1; i <= count; i++) {
              power *= digit;
          }

    	   sum += power;
    	  temp2/=10;
       }
       if(sum==n) {
       System.out.println("Armstrong number");}
       else {
    	   System.out.println("Not an Armstrong number");
       }
       s.close();
	}
}
