import java.util.Scanner;
public class Fraction {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double add = a+b;
		double fraction = add - (int)add;
		System.out.println("The added fraction of two numbers:"+fraction);
s.close();
	}
}
