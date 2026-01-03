import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         if(n%2!=0 || n>=6 && n<=20){
             System.out.println("Weird");
         }
         else {
        	 System.out.println("Not Weird");
         }
         s.close();
	}
}
