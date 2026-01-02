import java.util.Scanner;
public class LastDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int lastDigit = n%10;
		System.out.println("Unit digit:"+lastDigit);
		s.close();
	}

}
