import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			int fact =1;
			for(int i=1;i<=rem;i++) {
				 fact = fact*i;
			}
			sum+=fact;
			temp/=10;
		}
		if(sum==n) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
		s.close();
	}
}
