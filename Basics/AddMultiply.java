import java.util.Scanner;
public class AddMultiply {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int answer = (a+b)*c;
		System.out.println("The answer is:"+answer);
		s.close();
	}
}
