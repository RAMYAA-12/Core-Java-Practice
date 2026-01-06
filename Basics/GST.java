import java.util.Scanner;
public class GST {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the price of the product: ");
		float price = s.nextFloat();
		float sgst = price*0.09f;
		float cgst = price*0.09f;
		float total = price+cgst+sgst;
		System.out.println("SGST: "+sgst);
		System.out.println("CGST: "+cgst);
		System.out.println("Total price: "+total);
  s.close();
	}
}
