package hands_on_practice;
import java.util.Scanner;
public class PalindromeAlphabets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * i; j++) {

                if (j <= i)
                    System.out.print((char) ('A' + j) + " ");
                else
                    System.out.print((char) ('A' + 2 * i - j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
