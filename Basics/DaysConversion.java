import java.util.Scanner;
public class DaysConversion {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int days = s.nextInt();
    int hours = days * 24;
    int minutes = hours * 60;
    int seconds = minutes * 60;
    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Seconds: " + seconds);
    s.close();
	}
}
