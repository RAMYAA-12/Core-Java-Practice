import java.util.Scanner;
public class SteelClassify {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("h:");
	int h = s.nextInt();
	System.out.print("c:");
	float c = s.nextFloat();
	System.out.print("ts:");
	int ts = s.nextInt();
	boolean hardness = h>60;
	boolean carbon = c>0.8;
	boolean tensile_strength = ts>5700;
	 if (hardness && carbon && tensile_strength)
         System.out.println("Class A");
     else if (hardness && carbon)
         System.out.println("Class B");
     else if (hardness && tensile_strength)
         System.out.println("Class C");
     else if (carbon && tensile_strength)
         System.out.println("Class D");
     else if (hardness || carbon || tensile_strength)
         System.out.println("Class E");
     else
         System.out.println("Class F");
	s.close();
	}

}
