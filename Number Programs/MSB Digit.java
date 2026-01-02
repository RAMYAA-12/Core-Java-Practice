import java.util.Scanner;
public class MSBDigit {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while(n>=10) {
    	n/=10;
    }
    System.out.println("MSB digit of the given number:"+n);
    s.close();
	}
}
