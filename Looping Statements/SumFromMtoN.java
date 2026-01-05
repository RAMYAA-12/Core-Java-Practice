import java.util.Scanner;
public class SumFromMtoN {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int m = s.nextInt();
	int n = s.nextInt();
	int sum=0;
    for(int i=m;i<=n;i++) {
    	sum+=i;
    }
    System.out.println("Sum from "+m+" to "+n+":"+sum);
    s.close();
	}
}
