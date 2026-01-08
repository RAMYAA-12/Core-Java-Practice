package patterns;
import java.util.Scanner;
public class InvertedRightTriangle{
	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     int n = s.nextInt();
     for(int i=n;i>=1;i--) {
    	 for(int space = n-i; space>0;space--) {
    		 System.out.print(' ');
    	 }
    	 for(int j=1;j<=i;j++) {
    		 System.out.print("*");
    	 }
    	 System.out.println(" ");
     }
     s.close();
	}
}
